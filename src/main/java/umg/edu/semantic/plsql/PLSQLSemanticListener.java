package umg.edu.semantic.plsql;

import umg.edu.antlr.plsql.PLSQLParserBaseListener;
import umg.edu.error.ErrorTable;
import umg.edu.symboltable.SymbolTable;

/**
 * Listener semántico básico para PL/SQL
 * Esta es una implementación de marcador de posición que se basa en acciones a nivel de gramática
 */
public class PLSQLSemanticListener extends PLSQLParserBaseListener {
    
    private final ErrorTable errorTable;
    private final SymbolTable symbolTable;
    
    public PLSQLSemanticListener(ErrorTable errorTable, SymbolTable symbolTable) {
        this.errorTable = errorTable;
        this.symbolTable = symbolTable;
    }
    
    // Nota: El análisis semántico de PL/SQL se maneja a través de acciones a nivel de gramática
    // definidas en el archivo .g4. Este listener sirve como marcador de posición para futuras
    // mejoras cuando la estructura de la gramática permita un análisis más sofisticado.
} 