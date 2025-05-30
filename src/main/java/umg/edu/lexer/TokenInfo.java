package umg.edu.lexer;

/**
 * Almacena información sobre tokens del análisis léxico
 */
public class TokenInfo {
    private final int type;
    private final String typeName;
    private final String text;
    private final int line;
    private final int column;
    
    public TokenInfo(int type, String typeName, String text, int line, int column) {
        this.type = type;
        this.typeName = typeName;
        this.text = text;
        this.line = line;
        this.column = column;
    }
    
    public int getType() {
        return type;
    }
    
    public String getTypeName() {
        return typeName;
    }
    
    public String getText() {
        return text;
    }
    
    public int getLine() {
        return line;
    }
    
    public int getColumn() {
        return column;
    }
    
    @Override
    public String toString() {
        return "Token{" +
                "type=" + type +
                ", typeName='" + typeName + '\'' +
                ", text='" + text + '\'' +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
} 