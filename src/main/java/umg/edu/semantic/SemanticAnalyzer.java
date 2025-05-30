package umg.edu.semantic;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import umg.edu.antlr.LanguageDetector;
import umg.edu.error.CompilationError;
import umg.edu.error.ErrorTable;
import umg.edu.symboltable.Symbol;
import umg.edu.symboltable.SymbolTable;

import java.lang.reflect.Constructor;

/**
 * Realiza análisis semántico en el árbol de análisis sintáctico
 */
public class SemanticAnalyzer {
    
    private final ErrorTable errorTable;
    private final SymbolTable symbolTable;
    
    public SemanticAnalyzer(ErrorTable errorTable, SymbolTable symbolTable) {
        this.errorTable = errorTable;
        this.symbolTable = symbolTable;
    }
    
    /**
     * Realiza análisis semántico en el árbol de análisis sintáctico
     * @param parseTree El árbol de análisis sintáctico del análisis sintáctico
     * @param language El lenguaje de programación detectado
     * @return true si el análisis fue exitoso, false en caso contrario
     */
    public boolean analyze(ParseTree parseTree, LanguageDetector.Language language) {
        if (parseTree == null) {
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.SEMANTIC,
                    "No se puede realizar análisis semántico en un árbol de análisis nulo",
                    0, 0, ""
            ));
            return false;
        }
        
        try {
            // Debug: mostrar qué lenguaje se está analizando
            System.out.println("DEBUG: Iniciando análisis semántico para: " + language);
            System.out.println("DEBUG: Parse tree: " + parseTree.getClass().getSimpleName());
            
            // Crear el listener apropiado para el lenguaje
            Object listener = createSemanticListener(language);
            if (listener == null) {
                System.out.println("DEBUG: No se pudo crear listener para " + language);
                return false;
            }
            
            System.out.println("DEBUG: Listener creado: " + listener.getClass().getSimpleName());
            
            // Recorrer el árbol de análisis con el listener
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk((org.antlr.v4.runtime.tree.ParseTreeListener) listener, parseTree);
            
            // Debug: verificar si se agregaron símbolos
            System.out.println("DEBUG: Símbolos en tabla después del análisis: " + symbolTable.size());
            
            return true;
            
        } catch (Exception e) {
            System.out.println("DEBUG: Error en análisis semántico: " + e.getMessage());
            e.printStackTrace();
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.SEMANTIC,
                    "El análisis semántico falló: " + e.getMessage(),
                    0, 0, ""
            ));
            return false;
        }
    }
    
    /**
     * Analiza comandos SQL para operaciones CRUD para simular ejecución
     * @param code El código fuente
     * @param language El lenguaje detectado
     * @return Una cadena describiendo la ejecución simulada, o vacía si no es aplicable
     */
    public String simulateExecution(String code, LanguageDetector.Language language) {
        // Coincidencia de patrones simple para comandos SQL (simulación básica)
        if (language == LanguageDetector.Language.TSQL || language == LanguageDetector.Language.PLSQL) {
            String upperCode = code.toUpperCase();
            
            if (upperCode.contains("CREATE TABLE") || upperCode.contains("CREATE VIEW")) {
                // Extraer el nombre del patrón "CREATE TABLE name"
                String[] parts = code.split("(?i)CREATE\\s+(TABLE|VIEW)\\s+");
                if (parts.length > 1) {
                    String name = parts[1].split("\\s+")[0].replaceAll("[\\(\\);,]", "");
                    return "Se creó " + (upperCode.contains("TABLE") ? "la tabla " : "la vista ") + name;
                }
                return "Se creó un objeto en la base de datos";
            }
            
            if (upperCode.contains("INSERT INTO")) {
                // Extraer el nombre de la tabla del patrón "INSERT INTO table"
                String[] parts = code.split("(?i)INSERT\\s+INTO\\s+");
                if (parts.length > 1) {
                    String name = parts[1].split("\\s+")[0].replaceAll("[\\(\\);,]", "");
                    return "Se insertaron datos en la tabla " + name;
                }
                return "Se insertaron datos en la base de datos";
            }
            
            if (upperCode.contains("UPDATE")) {
                // Extraer el nombre de la tabla del patrón "UPDATE table"
                String[] parts = code.split("(?i)UPDATE\\s+");
                if (parts.length > 1) {
                    String name = parts[1].split("\\s+")[0].replaceAll("[\\(\\);,]", "");
                    return "Se actualizaron datos en la tabla " + name;
                }
                return "Se actualizaron datos en la base de datos";
            }
            
            if (upperCode.contains("DELETE FROM")) {
                // Extraer el nombre de la tabla del patrón "DELETE FROM table"
                String[] parts = code.split("(?i)DELETE\\s+FROM\\s+");
                if (parts.length > 1) {
                    String name = parts[1].split("\\s+")[0].replaceAll("[\\(\\);,]", "");
                    return "Se eliminaron datos de la tabla " + name;
                }
                return "Se eliminaron datos de la base de datos";
            }
            
            if (upperCode.contains("SELECT")) {
                return "Se consultaron datos de la base de datos";
            }
        }
        
        return "";
    }
    
    /**
     * Crea un listener semántico para el lenguaje especificado
     * @param language El lenguaje detectado
     * @return Un listener semántico específico del lenguaje
     */
    private Object createSemanticListener(LanguageDetector.Language language) {
        String listenerClassName = "";
        
        switch (language) {
            case CPP -> listenerClassName = "umg.edu.semantic.cpp.CPlusPlusSemanticListener";
            case HTML -> listenerClassName = "umg.edu.semantic.html.HTMLSemanticListener";
            case JAVASCRIPT -> listenerClassName = "umg.edu.semantic.js.JavaScriptSemanticListener";
            case PASCAL -> listenerClassName = "umg.edu.semantic.pascal.PascalSemanticListener";
            case PLSQL -> listenerClassName = "umg.edu.semantic.plsql.PLSQLSemanticListener";
            case PYTHON -> listenerClassName = "umg.edu.semantic.python.PythonSemanticListener";
            case TSQL -> listenerClassName = "umg.edu.semantic.tsql.TSQLSemanticListener";
            case UNKNOWN -> {
                errorTable.addError(new CompilationError(
                        CompilationError.ErrorType.SEMANTIC,
                        "Lenguaje desconocido, no se puede realizar análisis semántico",
                        0, 0, ""
                ));
                return null;
            }
        }
        
        try {
            // En lugar de fallar cuando el listener específico no existe,
            // usaremos un listener semántico predeterminado que hace procesamiento mínimo
            try {
                Class<?> listenerClass = Class.forName(listenerClassName);
                Constructor<?> constructor = listenerClass.getConstructor(ErrorTable.class, SymbolTable.class);
                return constructor.newInstance(errorTable, symbolTable);
            } catch (ClassNotFoundException e) {
                // Crear un listener predeterminado si el específico no está implementado aún
                return new DefaultSemanticListener(errorTable, symbolTable);
            }
        } catch (Exception e) {
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.SEMANTIC,
                    "Error al crear el listener semántico: " + e.getMessage(),
                    0, 0, ""
            ));
            return null;
        }
    }
    
    /**
     * Listener semántico predeterminado que puede usarse cuando los listeners específicos del lenguaje
     * no están implementados aún
     */
    private class DefaultSemanticListener implements org.antlr.v4.runtime.tree.ParseTreeListener {
        private final ErrorTable errorTable;
        private final SymbolTable symbolTable;
        
        public DefaultSemanticListener(ErrorTable errorTable, SymbolTable symbolTable) {
            this.errorTable = errorTable;
            this.symbolTable = symbolTable;
        }
        
        @Override
        public void enterEveryRule(org.antlr.v4.runtime.ParserRuleContext ctx) {
            // La implementación predeterminada hace procesamiento mínimo
        }
        
        @Override
        public void exitEveryRule(org.antlr.v4.runtime.ParserRuleContext ctx) {
            // La implementación predeterminada hace procesamiento mínimo
        }
        
        @Override
        public void visitTerminal(org.antlr.v4.runtime.tree.TerminalNode node) {
            // La implementación predeterminada hace procesamiento mínimo
        }
        
        @Override
        public void visitErrorNode(org.antlr.v4.runtime.tree.ErrorNode node) {
            // Reportar nodos de error como errores semánticos
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.SEMANTIC,
                    "Nodo de error encontrado: " + node.getText(),
                    node.getSymbol().getLine(),
                    node.getSymbol().getCharPositionInLine(),
                    node.getText()
            ));
        }
    }
} 