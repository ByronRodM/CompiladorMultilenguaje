package umg.edu.antlr;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Clase responsable de detectar el lenguaje de programación desde el código de entrada
 */
public class LanguageDetector {
    
    public enum Language {
        CPP,
        HTML,
        JAVASCRIPT,
        PASCAL,
        PLSQL,
        PYTHON,
        TSQL,
        UNKNOWN
    }
    
    private static final Map<Pattern, Language> patternMap = new HashMap<>();
    
    static {
        // Patrones de C++
        patternMap.put(Pattern.compile("#include\\s*<.*>|using\\s+namespace\\s+std", Pattern.DOTALL), Language.CPP);
        patternMap.put(Pattern.compile("\\b(class|template|namespace|cout|cin|vector|int|void)\\b.*[{;]", Pattern.DOTALL), Language.CPP);
        
        // Patrones de HTML
        patternMap.put(Pattern.compile("<!DOCTYPE\\s+html>|<html.*?>", Pattern.CASE_INSENSITIVE | Pattern.DOTALL), Language.HTML);
        patternMap.put(Pattern.compile("<(head|body|div|span|p|a|img)\\b", Pattern.CASE_INSENSITIVE | Pattern.DOTALL), Language.HTML);
        
        // Patrones de JavaScript
        patternMap.put(Pattern.compile("\\bfunction\\s+\\w+\\s*\\(|\\bconst\\s+\\w+\\s*=|\\blet\\s+\\w+\\s*=|\\bvar\\s+\\w+\\s*=", Pattern.DOTALL), Language.JAVASCRIPT);
        patternMap.put(Pattern.compile("document\\.getElementById|\\bconsole\\.log\\(", Pattern.DOTALL), Language.JAVASCRIPT);
        
        // Patrones de Pascal
        patternMap.put(Pattern.compile("\\bprogram\\s+\\w+;|\\bbegin\\b.*?\\bend\\b|\\bprocedure\\b|\\bfunction\\b", 
                Pattern.CASE_INSENSITIVE | Pattern.DOTALL), Language.PASCAL);
        patternMap.put(Pattern.compile("\\bvar\\b.*?\\bbegin\\b", Pattern.CASE_INSENSITIVE | Pattern.DOTALL), Language.PASCAL);
        
        // Patrones de PL/SQL
        patternMap.put(Pattern.compile("\\bBEGIN\\b.*?\\bEND;\\b|\\bDECLARE\\b|\\bPROCEDURE\\b|\\bFUNCTION\\b", 
                Pattern.CASE_INSENSITIVE | Pattern.DOTALL), Language.PLSQL);
        patternMap.put(Pattern.compile("\\bCREATE\\s+(OR\\s+REPLACE\\s+)?\\b(PROCEDURE|FUNCTION|PACKAGE|TRIGGER)\\b", 
                Pattern.CASE_INSENSITIVE | Pattern.DOTALL), Language.PLSQL);
        
        // Patrones de Python
        patternMap.put(Pattern.compile("\\bdef\\s+\\w+\\s*\\(.*\\)\\s*:|\\bclass\\s+\\w+\\s*[\\(:]|\\bimport\\s+\\w+|\\bfrom\\s+\\w+\\s+import\\b", 
                Pattern.DOTALL), Language.PYTHON);
        patternMap.put(Pattern.compile("\\bprint\\s*\\(|\\bif\\s+.*?:", Pattern.DOTALL), Language.PYTHON);
        
        // Patrones de T-SQL
        patternMap.put(Pattern.compile("\\bSELECT\\b.*?\\bFROM\\b|\\bINSERT\\s+INTO\\b|\\bUPDATE\\b.*?\\bSET\\b|\\bDELETE\\s+FROM\\b", 
                Pattern.CASE_INSENSITIVE | Pattern.DOTALL), Language.TSQL);
        patternMap.put(Pattern.compile("\\bCREATE\\s+(TABLE|VIEW|PROCEDURE|FUNCTION|TRIGGER)\\b", 
                Pattern.CASE_INSENSITIVE | Pattern.DOTALL), Language.TSQL);
    }
    
    /**
     * Detecta el lenguaje de programación desde el código proporcionado
     * @param code El código fuente a analizar
     * @return El lenguaje detectado o UNKNOWN si no se pudo determinar
     */
    public static Language detectLanguage(String code) {
        if (code == null || code.trim().isEmpty()) {
            return Language.UNKNOWN;
        }
        
        // Verificar cada patrón contra el código
        for (Map.Entry<Pattern, Language> entry : patternMap.entrySet()) {
            if (entry.getKey().matcher(code).find()) {
                return entry.getValue();
            }
        }
        
        return Language.UNKNOWN;
    }
    
    /**
     * Devuelve el nombre del paquete lexer/parser apropiado para el lenguaje detectado
     * @param language El lenguaje detectado
     * @return String que representa el nombre del paquete para el lenguaje
     */
    public static String getPackageName(Language language) {
        return switch (language) {
            case CPP -> "umg.edu.antlr.cpp";
            case HTML -> "umg.edu.antlr.html";
            case JAVASCRIPT -> "umg.edu.antlr.js";
            case PASCAL -> "umg.edu.antlr.pascal";
            case PLSQL -> "umg.edu.antlr.plsql";
            case PYTHON -> "umg.edu.antlr.python";
            case TSQL -> "umg.edu.antlr.tsql";
            default -> "";
        };
    }
} 