parser grammar HTMLParser;

options {
    tokenVocab = HTMLLexer;
}

@header {
    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;
}

@members {
    private SymbolTable symbolTable = new SymbolTable();
    private ErrorTable errorTable = new ErrorTable();
    private Stack<String> tagStack = new Stack<>();
    
    public SymbolTable getSymbolTable() { return symbolTable; }
    public ErrorTable getErrorTable() { return errorTable; }
    
    private void addSymbol(String name, String type, int line, int column) {
        Symbol symbol = new Symbol(name, type, "global", null, line, column);
        symbolTable.addSymbol(symbol);
    }
    
    private void addError(String message, int line, int column, String type) {
        CompilationError.ErrorType errorType = CompilationError.ErrorType.SEMANTIC;
        if ("LEXICAL".equals(type)) {
            errorType = CompilationError.ErrorType.LEXICAL;
        } else if ("SYNTACTIC".equals(type)) {
            errorType = CompilationError.ErrorType.SYNTACTIC;
        }
        CompilationError error = new CompilationError(errorType, message, line, column, "");
        errorTable.addError(error);
    }
    
    private void pushTag(String tagName, int line, int column) {
        tagStack.push(tagName);
        addSymbol(tagName, "html_tag", line, column);
    }
    
    private void popTag(String tagName, int line, int column) {
        if (tagStack.isEmpty()) {
            addError("Closing tag without opening tag: " + tagName, line, column, "SEMANTIC");
        } else {
            String openTag = tagStack.pop();
            if (!openTag.equals(tagName)) {
                addError("Mismatched tag: expected " + openTag + " but found " + tagName, line, column, "SEMANTIC");
            }
        }
    }
}

// HTML document structure
document: DOCTYPE? htmlElement EOF;

htmlElement
    : OPEN_TAG attribute* GT htmlContent* CLOSE_TAG
    {
        // Extract tag name from OPEN_TAG and CLOSE_TAG for validation
        String openTagName = $OPEN_TAG.getText().substring(1); // Remove '<'
        String closeTagName = $CLOSE_TAG.getText().substring(2, $CLOSE_TAG.getText().length()-1); // Remove '</' and '>'
        
        if (!openTagName.equals(closeTagName)) {
            addError("Mismatched tags: " + openTagName + " and " + closeTagName, 
                    $CLOSE_TAG.getLine(), $CLOSE_TAG.getCharPositionInLine(), "SEMANTIC");
        } else {
            addSymbol(openTagName, "html_element", $OPEN_TAG.getLine(), $OPEN_TAG.getCharPositionInLine());
        }
    }
    ;

htmlContent
    : element
    | textContent
    | htmlEntity
    | cdata
    ;

element
    : normalElement
    | selfClosingElement
    ;

normalElement
    : OPEN_TAG attribute* GT content* CLOSE_TAG
    {
        String openTagName = $OPEN_TAG.getText().substring(1);
        String closeTagName = $CLOSE_TAG.getText().substring(2, $CLOSE_TAG.getText().length()-1);
        
        if (!openTagName.equals(closeTagName)) {
            addError("Mismatched tags: " + openTagName + " and " + closeTagName, 
                    $CLOSE_TAG.getLine(), $CLOSE_TAG.getCharPositionInLine(), "SEMANTIC");
        } else {
            addSymbol(openTagName, "html_element", $OPEN_TAG.getLine(), $OPEN_TAG.getCharPositionInLine());
        }
    }
    ;

selfClosingElement
    : SELF_CLOSE_TAG
    {
        // Extract tag name from self-closing tag
        String tagContent = $SELF_CLOSE_TAG.getText();
        String tagName = tagContent.substring(1, tagContent.indexOf(' ') > 0 ? 
                        tagContent.indexOf(' ') : tagContent.indexOf('/'));
        addSymbol(tagName, "html_self_closing", $SELF_CLOSE_TAG.getLine(), $SELF_CLOSE_TAG.getCharPositionInLine());
    }
    ;

content
    : element
    | textContent
    | htmlEntity
    | cdata
    ;

textContent
    : TEXT_CONTENT
    ;

htmlEntity
    : HTML_ENTITY
    {
        addSymbol($HTML_ENTITY.getText(), "html_entity", $HTML_ENTITY.getLine(), $HTML_ENTITY.getCharPositionInLine());
    }
    ;

cdata
    : CDATA
    {
        addSymbol("CDATA", "html_cdata", $CDATA.getLine(), $CDATA.getCharPositionInLine());
    }
    ;

attribute
    : ATTRIBUTE
    {
        // Parse attribute name and value
        String attrText = $ATTRIBUTE.getText();
        String attrName = attrText.substring(0, attrText.indexOf('='));
        addSymbol(attrName.trim(), "html_attribute", $ATTRIBUTE.getLine(), $ATTRIBUTE.getCharPositionInLine());
    }
    ; 