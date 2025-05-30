lexer grammar HTMLLexer;

// HTML structural tokens
DOCTYPE: '<!DOCTYPE' [ \t\r\n]+ 'html' [ \t\r\n]* '>';
OPEN_TAG: '<' TAG_NAME;
CLOSE_TAG: '</' TAG_NAME '>';
SELF_CLOSE_TAG: '<' TAG_NAME ATTRIBUTE* [ \t\r\n]* '/>';

// Common HTML tags
fragment TAG_NAME
    : 'html' | 'head' | 'body' | 'title' | 'meta' | 'link' | 'script' | 'style'
    | 'div' | 'span' | 'p' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6'
    | 'ul' | 'ol' | 'li' | 'table' | 'tr' | 'td' | 'th' | 'thead' | 'tbody'
    | 'form' | 'input' | 'button' | 'select' | 'option' | 'textarea'
    | 'img' | 'a' | 'br' | 'hr' | 'strong' | 'em' | 'code' | 'pre'
    | 'section' | 'article' | 'header' | 'footer' | 'nav' | 'aside'
    | 'iframe' | 'video' | 'audio' | 'canvas'
    | [a-zA-Z][a-zA-Z0-9]*
    ;

// Attributes
ATTRIBUTE: ATTRIBUTE_NAME [ \t\r\n]* '=' [ \t\r\n]* ATTRIBUTE_VALUE;

fragment ATTRIBUTE_NAME
    : 'id' | 'class' | 'style' | 'src' | 'href' | 'alt' | 'title' | 'name'
    | 'type' | 'value' | 'width' | 'height' | 'data-' [a-zA-Z0-9-]+
    | 'onclick' | 'onload' | 'onchange' | 'onsubmit' | 'onfocus' | 'onblur'
    | 'method' | 'action' | 'target' | 'rel' | 'charset' | 'content'
    | 'disabled' | 'readonly' | 'required' | 'checked' | 'selected'
    | [a-zA-Z][a-zA-Z0-9-]*
    ;

fragment ATTRIBUTE_VALUE
    : '"' (~["])* '"'
    | '\'' (~['])* '\''
    | [a-zA-Z0-9./#-]+
    ;

// Text content
TEXT_CONTENT: (~[<>&])+ ;

// HTML entities
HTML_ENTITY: '&' [a-zA-Z][a-zA-Z0-9]* ';'
           | '&#' [0-9]+ ';'
           | '&#x' [0-9a-fA-F]+ ';'
           ;

// Comments
HTML_COMMENT: '<!--' .*? '-->' -> skip;

// CDATA sections
CDATA: '<![CDATA[' .*? ']]>';

// Script and style content
SCRIPT_CONTENT: '<script' .*? '>' .*? '</script>' -> skip;
STYLE_CONTENT: '<style' .*? '>' .*? '</style>' -> skip;

// Special characters
GT: '>';
LT: '<';
AMP: '&';

// Whitespace
WS: [ \t\r\n]+ -> skip; 