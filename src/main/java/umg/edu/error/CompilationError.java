package umg.edu.error;

/**
 * Representa un error de compilación
 */
public class CompilationError {
    
    public enum ErrorType {
        LEXICAL,    // Error léxico
        SYNTACTIC,  // Error sintáctico
        SEMANTIC    // Error semántico
    }
    
    private ErrorType type;
    private String message;
    private int line;
    private int column;
    private String code;
    
    public CompilationError(ErrorType type, String message, int line, int column, String code) {
        this.type = type;
        this.message = message;
        this.line = line;
        this.column = column;
        this.code = code;
    }
    
    public ErrorType getType() {
        return type;
    }
    
    public void setType(ErrorType type) {
        this.type = type;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public int getLine() {
        return line;
    }
    
    public void setLine(int line) {
        this.line = line;
    }
    
    public int getColumn() {
        return column;
    }
    
    public void setColumn(int column) {
        this.column = column;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    @Override
    public String toString() {
        return type + " ERROR at line " + line + ":" + column + " - " + message;
    }
} 