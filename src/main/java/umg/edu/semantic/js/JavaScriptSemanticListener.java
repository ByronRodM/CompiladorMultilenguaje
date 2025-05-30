package umg.edu.semantic.js;

import umg.edu.antlr.js.JavaScriptParserBaseListener;
import umg.edu.error.ErrorTable;
import umg.edu.symboltable.SymbolTable;

import java.util.HashSet;
import java.util.Set;

/**
 * Listener semántico básico para JavaScript
 * Esta es una implementación simplificada que se basa en acciones a nivel de gramática
 */
public class JavaScriptSemanticListener extends JavaScriptParserBaseListener {
    
    private final ErrorTable errorTable;
    private final SymbolTable symbolTable;
    
    // Objetos y funciones incorporados que siempre están disponibles
    private final Set<String> builtins = new HashSet<>();
    
    public JavaScriptSemanticListener(ErrorTable errorTable, SymbolTable symbolTable) {
        this.errorTable = errorTable;
        this.symbolTable = symbolTable;
        initializeBuiltins();
    }
    
    private void initializeBuiltins() {
        // Funciones incorporadas de JavaScript - para referencia futura
        builtins.add("console");
        builtins.add("document");
        builtins.add("window");
        builtins.add("alert");
        builtins.add("Math");
        builtins.add("Date");
        builtins.add("Array");
        builtins.add("Object");
        builtins.add("String");
        builtins.add("Number");
        builtins.add("Boolean");
    }
    
    // Nota: El análisis semántico de JavaScript se maneja a través de acciones a nivel de gramática
    // definidas en el archivo .g4. Este listener sirve como marcador de posición para futuras
    // mejoras cuando la estructura de la gramática permita un análisis más sofisticado.
} 