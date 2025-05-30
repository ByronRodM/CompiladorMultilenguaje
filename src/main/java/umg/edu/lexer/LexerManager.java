package umg.edu.lexer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

import umg.edu.antlr.LanguageDetector;
import umg.edu.error.CompilationError;
import umg.edu.error.ErrorTable;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona el análisis léxico utilizando el lexer ANTLR apropiado
 */
public class LexerManager {
    
    private final ErrorTable errorTable;
    
    public LexerManager(ErrorTable errorTable) {
        this.errorTable = errorTable;
    }
    
    /**
     * Realiza el análisis léxico del código de entrada
     * @param code El código fuente a analizar
     * @param language El lenguaje de programación detectado
     * @return Una lista de tokens del análisis léxico
     */
    public List<TokenInfo> analyze(String code, LanguageDetector.Language language) {
        List<TokenInfo> tokenInfoList = new ArrayList<>();
        
        try {
            // Crear flujo de entrada desde el código
            CharStream input = CharStreams.fromString(code);
            
            // Obtener el lexer apropiado para el lenguaje
            Lexer lexer = createLexer(input, language);
            if (lexer == null) {
                // Manejar el caso cuando no se pudo crear el lexer
                // Devolvemos una lista vacía de tokens y los errores se reportarán en createLexer
                return tokenInfoList;
            }
            
            // Remover el listener de errores por defecto y agregar uno personalizado
            lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
            lexer.addErrorListener(new LexerErrorListener(errorTable));
            
            // Obtener todos los tokens del lexer
            List<? extends Token> allTokens = lexer.getAllTokens();
            
            // Convertir tokens ANTLR a nuestros objetos TokenInfo
            for (Token token : allTokens) {
                String tokenType = lexer.getVocabulary().getDisplayName(token.getType());
                
                // Omitir espacios en blanco, saltos de línea y otros tokens del canal oculto
                if (token.getChannel() == Token.HIDDEN_CHANNEL ||
                    tokenType.equalsIgnoreCase("NEWLINE") ||
                    tokenType.equalsIgnoreCase("WS") ||
                    tokenType.equalsIgnoreCase("WHITESPACE") ||
                    tokenType.contains("COMMENT")) {
                    continue;
                }
                
                TokenInfo tokenInfo = new TokenInfo(
                        token.getType(),
                        tokenType,
                        token.getText(),
                        token.getLine(),
                        token.getCharPositionInLine()
                );
                tokenInfoList.add(tokenInfo);
            }
            
            // Reiniciar el lexer para posible reutilización
            lexer.reset();
        } catch (Exception e) {
            // Agregar un error general si el lexer falla catastróficamente
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.LEXICAL,
                    "Error en análisis léxico: " + e.getMessage(),
                    0, 0, code
            ));
        }
        
        return tokenInfoList;
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
                        CompilationError.ErrorType.LEXICAL,
                        "Lenguaje desconocido, no se puede realizar análisis léxico",
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
            // Error más amigable cuando no se encuentra la clase
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.LEXICAL,
                    "El analizador léxico para " + language + " no está implementado todavía",
                    0, 0, ""
            ));
            return null;
        } catch (NoSuchMethodException e) {
            // Error más específico cuando no se encuentra el constructor
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.LEXICAL,
                    "El constructor para " + lexerClassName + " no está disponible",
                    0, 0, ""
            ));
            return null;
        } catch (Exception e) {
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.LEXICAL,
                    "Error al crear el lexer: " + e.getMessage(),
                    0, 0, ""
            ));
            return null;
        }
    }
    
    /**
     * Listener personalizado de errores para el lexer
     */
    private static class LexerErrorListener extends ConsoleErrorListener {
        private final ErrorTable errorTable;
        
        public LexerErrorListener(ErrorTable errorTable) {
            this.errorTable = errorTable;
        }
        
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                int line, int charPositionInLine, String msg, RecognitionException e) {
            
            // Agregar el error léxico a nuestra tabla de errores
            errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.LEXICAL,
                    msg,
                    line,
                    charPositionInLine,
                    offendingSymbol != null ? offendingSymbol.toString() : ""
            ));
        }
    }
} 