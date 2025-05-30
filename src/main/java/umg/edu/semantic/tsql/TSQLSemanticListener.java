package umg.edu.semantic.tsql;

import umg.edu.antlr.tsql.TSQLParserBaseListener;
import umg.edu.error.ErrorTable;
import umg.edu.symboltable.SymbolTable;

/**
 * Listener semántico básico para T-SQL
 * Esta es una implementación de marcador de posición que se basa en acciones a nivel de gramática
 */
public class TSQLSemanticListener extends TSQLParserBaseListener {
    
    private final ErrorTable errorTable;
    private final SymbolTable symbolTable;
    
    public TSQLSemanticListener(ErrorTable errorTable, SymbolTable symbolTable) {
        this.errorTable = errorTable;
        this.symbolTable = symbolTable;
    }
    
    // Nota: El análisis semántico de T-SQL se maneja a través de acciones a nivel de gramática
    // definidas en el archivo .g4. Este listener sirve como marcador de posición para futuras
    // mejoras cuando la estructura de la gramática permita un análisis más sofisticado.
} 