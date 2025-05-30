package umg.edu.symboltable;

/**
 * Representa un símbolo en la tabla de símbolos
 */
public class Symbol {
    private String name;
    private String type;
    private String scope;
    private String value;
    private int line;
    private int column;
    
    public Symbol(String name, String type, String scope, String value, int line, int column) {
        this.name = name;
        this.type = type;
        this.scope = scope;
        this.value = value;
        this.line = line;
        this.column = column;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getScope() {
        return scope;
    }
    
    public void setScope(String scope) {
        this.scope = scope;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
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
    
    @Override
    public String toString() {
        return "Symbol{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", scope='" + scope + '\'' +
                ", value='" + value + '\'' +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
} 