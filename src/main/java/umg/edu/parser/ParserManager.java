package umg.edu.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import umg.edu.antlr.LanguageDetector;
import umg.edu.error.CompilationError;
import umg.edu.error.ErrorTable;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Gestiona el análisis sintáctico utilizando el parser ANTLR apropiado
 */
public class ParserManager {
    
    private final ErrorTable errorTable;
    private ParseTree lastParseTree; // Almacenar el último árbol de análisis para visualización
    private Parser lastParser; // Almacenar la última instancia del parser para visualización del árbol
    
    public ParserManager(ErrorTable errorTable) {
        this.errorTable = errorTable;
    }
    
    /**
     * Obtener el último árbol de análisis creado por el parser
     * @return El último árbol de análisis, o null si no se ha realizado análisis
     */
    public ParseTree getLastParseTree() {
        return lastParseTree;
    }
    
    /**
     * Obtener la última instancia del parser utilizada para el análisis
     * @return El último parser, o null si no se ha realizado análisis
     */
    public Parser getLastParser() {
        return lastParser;
    }
    
    /**
     * Realiza análisis sintáctico en el código de entrada
     * @param code El código fuente a analizar
     * @param language El lenguaje de programación detectado
     * @return El árbol de análisis del análisis sintáctico, o null si el análisis falló
     */
    public ParseTree analyze(String code, LanguageDetector.Language language) {
        try {
            // Reiniciar instancias previas
            lastParseTree = null;
            lastParser = null;
            
            // Crear flujo de entrada desde el código
            CharStream input = CharStreams.fromString(code);
            
            // Crear lexer y obtener flujo de tokens (necesitamos tokens para el parser)
            Lexer lexer = createLexer(input, language);
            if (lexer == null) {
                return null;
            }
            
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Crear parser con el flujo de tokens
            Parser parser = createParser(tokens, language);
            if (parser == null) {
                return null;
            }
            
            // Almacenar el parser para uso posterior
            lastParser = parser;
            
            // Remover listener de errores por defecto y agregar listener personalizado
            parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
            parser.addErrorListener(new ParserErrorListener(errorTable));
            
            // Obtener la regla de inicio apropiada e invocarla
            Method startRule = getStartRule(parser, language);
            if (startRule == null) {
                return null;
            }
            
            // Almacenar y devolver el árbol de análisis
            lastParseTree = (ParseTree) startRule.invoke(parser);
            return lastParseTree;
            
        } catch (Exception e) {
            // Agregar un error general si el parser falla catastróficamente
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.SYNTACTIC,
                    "El análisis sintáctico falló: " + e.getMessage(),
                    0, 0, code
            ));
            // Reiniciar el árbol de análisis y parser en caso de error
            lastParseTree = null;
            lastParser = null;
            return null;
        }
    }
    
    /**
     * Crea el Lexer apropiado para el lenguaje detectado
     * @param input El flujo de caracteres que contiene el código
     * @param language El lenguaje detectado
     * @return Una instancia del Lexer ANTLR específica del lenguaje
     */
    private Lexer createLexer(CharStream input, LanguageDetector.Language language) {
        String lexerClassName = "";
        
        switch (language) {
            case CPP -> lexerClassName = "umg.edu.antlr.cpp.CPlusPlusLexer";
            case HTML -> lexerClassName = "umg.edu.antlr.html.HTMLLexer";
            case JAVASCRIPT -> lexerClassName = "umg.edu.antlr.js.JavaScriptLexer";
            case PASCAL -> lexerClassName = "umg.edu.antlr.pascal.PascalLexer";
            case PLSQL -> lexerClassName = "umg.edu.antlr.plsql.PLSQLLexer";
            case PYTHON -> lexerClassName = "umg.edu.antlr.python.PythonLexer";
            case TSQL -> lexerClassName = "umg.edu.antlr.tsql.TSQLLexer";
            case UNKNOWN -> {
                errorTable.addError(new CompilationError(
                        CompilationError.ErrorType.SYNTACTIC,
                        "Lenguaje desconocido, no se puede realizar análisis sintáctico",
                        0, 0, ""
                ));
                return null;
            }
        }
        
        try {
            // Usar reflexión para crear el lexer apropiado
            Class<?> lexerClass = Class.forName(lexerClassName);
            Constructor<?> constructor = lexerClass.getConstructor(CharStream.class);
            return (Lexer) constructor.newInstance(input);
        } catch (ClassNotFoundException e) {
            // Error más amigable cuando no se encuentra la clase (probablemente porque la gramática no está implementada)
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.SYNTACTIC,
                    "El analizador léxico para " + language + " no está implementado todavía",
                    0, 0, ""
            ));
            return null;
        } catch (Exception e) {
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.SYNTACTIC,
                    "Error al crear el lexer para el parser: " + e.getMessage(),
                    0, 0, ""
            ));
            return null;
        }
    }
    
    /**
     * Crea el Parser apropiado para el lenguaje detectado
     * @param tokens El flujo de tokens del lexer
     * @param language El lenguaje detectado
     * @return Una instancia del Parser ANTLR específica del lenguaje
     */
    private Parser createParser(CommonTokenStream tokens, LanguageDetector.Language language) {
        String parserClassName = "";
        
        switch (language) {
            case CPP -> parserClassName = "umg.edu.antlr.cpp.CPlusPlusParser";
            case HTML -> parserClassName = "umg.edu.antlr.html.HTMLParser";
            case JAVASCRIPT -> parserClassName = "umg.edu.antlr.js.JavaScriptParser";
            case PASCAL -> parserClassName = "umg.edu.antlr.pascal.PascalParser";
            case PLSQL -> parserClassName = "umg.edu.antlr.plsql.PLSQLParser";
            case PYTHON -> parserClassName = "umg.edu.antlr.python.PythonParser";
            case TSQL -> parserClassName = "umg.edu.antlr.tsql.TSQLParser";
            case UNKNOWN -> {
                errorTable.addError(new CompilationError(
                        CompilationError.ErrorType.SYNTACTIC,
                        "Lenguaje desconocido, no se puede crear el parser",
                        0, 0, ""
                ));
                return null;
            }
        }
        
        try {
            // Usar reflexión para crear el parser apropiado
            Class<?> parserClass = Class.forName(parserClassName);
            Constructor<?> constructor = parserClass.getConstructor(TokenStream.class);
            return (Parser) constructor.newInstance(tokens);
        } catch (ClassNotFoundException e) {
            // Error más amigable cuando no se encuentra la clase (probablemente porque la gramática no está implementada)
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.SYNTACTIC,
                    "El analizador sintáctico para " + language + " no está implementado todavía",
                    0, 0, ""
            ));
            return null;
        } catch (NoSuchMethodException e) {
            // Error más específico cuando no se encuentra el constructor
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.SYNTACTIC,
                    "El constructor para " + parserClassName + " no está disponible",
                    0, 0, ""
            ));
            return null;
        } catch (Exception e) {
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.SYNTACTIC,
                    "Error al crear el parser: " + e.getMessage(),
                    0, 0, ""
            ));
            return null;
        }
    }
    
    /**
     * Obtiene el método de regla de inicio apropiado para el parser
     * @param parser La instancia del parser
     * @param language El lenguaje detectado
     * @return El objeto Method que representa la regla de inicio
     */
    private Method getStartRule(Parser parser, LanguageDetector.Language language) {
        String startRuleName = "";
        
        switch (language) {
            case CPP -> startRuleName = "program";            // Regla de inicio para C++
            case HTML -> startRuleName = "document";          // Regla de inicio para HTML
            case JAVASCRIPT -> startRuleName = "program";     // Regla de inicio para JavaScript
            case PASCAL -> startRuleName = "program";         // Regla de inicio para Pascal
            case PLSQL -> startRuleName = "plsqlUnit";        // Regla de inicio para PL/SQL
            case PYTHON -> startRuleName = "file_input";      // Regla de inicio para Python
            case TSQL -> startRuleName = "tsql_file";         // Regla de inicio para T-SQL
            case UNKNOWN -> {
                errorTable.addError(new CompilationError(
                        CompilationError.ErrorType.SYNTACTIC,
                        "Lenguaje desconocido, no se puede determinar la regla de inicio",
                        0, 0, ""
                ));
                return null;
            }
        }
        
        try {
            // Encontrar el método que corresponde a la regla de inicio
            return parser.getClass().getMethod(startRuleName);
        } catch (Exception e) {
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.SYNTACTIC,
                    "No se encontró la regla inicial '" + startRuleName + "': " + e.getMessage(),
                    0, 0, ""
            ));
            return null;
        }
    }
    
    /**
     * Listener personalizado de errores para el parser
     */
    private static class ParserErrorListener extends ConsoleErrorListener {
        private final ErrorTable errorTable;
        
        public ParserErrorListener(ErrorTable errorTable) {
            this.errorTable = errorTable;
        }
        
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                int line, int charPositionInLine, String msg, RecognitionException e) {
            
            // Agregar el error sintáctico a nuestra tabla de errores
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.SYNTACTIC,
                    msg,
                    line,
                    charPositionInLine,
                    offendingSymbol != null ? offendingSymbol.toString() : ""
            ));
        }
    }
} 