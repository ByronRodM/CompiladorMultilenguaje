package umg.edu.semantic.html;

import umg.edu.antlr.html.HTMLParserBaseListener;
import umg.edu.error.ErrorTable;
import umg.edu.symboltable.SymbolTable;

/**
 * Listener semántico básico para HTML
 * HTML es un lenguaje de marcado que no requiere análisis semántico complejo
 */
public class HTMLSemanticListener extends HTMLParserBaseListener {
    
    private final ErrorTable errorTable;
    private final SymbolTable symbolTable;
    
    public HTMLSemanticListener(ErrorTable errorTable, SymbolTable symbolTable) {
        this.errorTable = errorTable;
        this.symbolTable = symbolTable;
    }
    
    // Nota: El análisis semántico de HTML es mínimo ya que es un lenguaje de marcado
    // La validación básica se maneja a nivel de análisis sintáctico
} 