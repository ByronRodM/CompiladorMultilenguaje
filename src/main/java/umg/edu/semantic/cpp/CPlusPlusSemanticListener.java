package umg.edu.semantic.cpp;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
import umg.edu.antlr.cpp.CPlusPlusParser;
import umg.edu.antlr.cpp.CPlusPlusParserBaseListener;
import umg.edu.error.CompilationError;
import umg.edu.error.ErrorTable;
import umg.edu.symboltable.Symbol;
import umg.edu.symboltable.SymbolTable;

import java.util.*;

/**
 * Listener semántico para C++ que realiza verificación de tipos y declaración de variables
 */
public class CPlusPlusSemanticListener extends CPlusPlusParserBaseListener {
    
    private final ErrorTable errorTable;
    private final SymbolTable symbolTable;
    
    // Rastrear variables declaradas con sus tipos
    private final Map<String, String> declaredVariables = new HashMap<>();
    
    // Rastrear tipos de expresiones para verificación de tipos
    private final ParseTreeProperty<String> expressionTypes = new ParseTreeProperty<>();
    
    // Ámbito actual (simplificado para esta implementación)
    private String currentScope = "global";
    
    // Reglas de compatibilidad de tipos
    private final Map<String, Set<String>> compatibleTypes = new HashMap<>();
    
    public CPlusPlusSemanticListener(ErrorTable errorTable, SymbolTable symbolTable) {
        this.errorTable = errorTable;
        this.symbolTable = symbolTable;
        initializeTypeCompatibility();
    }
    
    private void initializeTypeCompatibility() {
        // Definir reglas de compatibilidad de tipos
        compatibleTypes.put("int", Set.of("int", "short", "char", "bool"));
        compatibleTypes.put("float", Set.of("float", "int", "short", "char", "bool"));
        compatibleTypes.put("double", Set.of("double", "float", "int", "short", "char", "bool"));
        compatibleTypes.put("char", Set.of("char", "bool"));
        compatibleTypes.put("bool", Set.of("bool"));
        compatibleTypes.put("string", Set.of("string", "char*"));
        compatibleTypes.put("char*", Set.of("char*", "string"));
        
        // Agregar variantes unsigned
        compatibleTypes.put("unsigned", Set.of("unsigned", "int", "short", "char", "bool"));
        compatibleTypes.put("short", Set.of("short", "char", "bool"));
        compatibleTypes.put("long", Set.of("long", "int", "short", "char", "bool"));
    }
    
    @Override
    public void exitVariableDeclarator(CPlusPlusParser.VariableDeclaratorContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        int line = ctx.IDENTIFIER().getSymbol().getLine();
        int column = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();
        
        // Obtener el tipo de la declaración de variable padre
        CPlusPlusParser.VariableDeclarationContext varDecl = 
            (CPlusPlusParser.VariableDeclarationContext) ctx.getParent();
        String varType = getTypeString(varDecl.type());
        
        // Extraer valor inicial si está presente
        String initialValue = null;
        if (ctx.expression() != null) {
            initialValue = extractLiteralValue(ctx.expression());
        }
        
        // Verificar si la variable ya está declarada
        if (declaredVariables.containsKey(varName)) {
            errorTable.addError(new CompilationError(
                CompilationError.ErrorType.SEMANTIC,
                "La variable '" + varName + "' ya está declarada",
                line, column, varName
            ));
        } else {
            // Agregar a nuestro seguimiento
            declaredVariables.put(varName, varType);
            
            // Agregar a la tabla de símbolos con valor
            symbolTable.addSymbol(new Symbol(varName, varType, currentScope, initialValue, line, column));
        }
        
        // Verificar compatibilidad de tipos si hay una asignación
        if (ctx.expression() != null) {
            String expressionType = getExpressionType(ctx.expression());
            if (!isTypeCompatible(varType, expressionType)) {
                errorTable.addError(new CompilationError(
                    CompilationError.ErrorType.SEMANTIC,
                    "No se puede asignar " + expressionType + " a la variable '" + varName + "' de tipo " + varType,
                    line, column, varName
                ));
            }
        }
    }
    
    @Override
    public void exitAssignmentExpression(CPlusPlusParser.AssignmentExpressionContext ctx) {
        if (ctx.unaryExpression() != null && ctx.assignmentExpression() != null) {
            // Manejar asignación: variable = expresión
            if (ctx.unaryExpression().postfixExpression() != null &&
                ctx.unaryExpression().postfixExpression().primaryExpression() != null &&
                ctx.unaryExpression().postfixExpression().primaryExpression().IDENTIFIER() != null) {
                
                String varName = ctx.unaryExpression().postfixExpression().primaryExpression().IDENTIFIER().getText();
                int line = ctx.unaryExpression().postfixExpression().primaryExpression().IDENTIFIER().getSymbol().getLine();
                int column = ctx.unaryExpression().postfixExpression().primaryExpression().IDENTIFIER().getSymbol().getCharPositionInLine();
                
                // Verificar si la variable está declarada
                if (!declaredVariables.containsKey(varName)) {
                    errorTable.addError(new CompilationError(
                        CompilationError.ErrorType.SEMANTIC,
                        "La variable '" + varName + "' no está declarada",
                        line, column, varName
                    ));
                } else {
                    // Verificar compatibilidad de tipos
                    String varType = declaredVariables.get(varName);
                    String expressionType = getAssignmentExpressionType(ctx.assignmentExpression());
                    
                    if (!isTypeCompatible(varType, expressionType)) {
                        errorTable.addError(new CompilationError(
                            CompilationError.ErrorType.SEMANTIC,
                            "No se puede asignar " + expressionType + " a la variable '" + varName + "' de tipo " + varType,
                            line, column, varName
                        ));
                    }
                }
            }
        }
    }
    
    @Override
    public void exitPrimaryExpression(CPlusPlusParser.PrimaryExpressionContext ctx) {
        String expressionType = null;
        
        if (ctx.IDENTIFIER() != null) {
            String varName = ctx.IDENTIFIER().getText();
            int line = ctx.IDENTIFIER().getSymbol().getLine();
            int column = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();
            
            // Manejo especial para literales booleanos (true/false son identificadores en C++ básico)
            if ("true".equals(varName) || "false".equals(varName)) {
                expressionType = "bool";
            } else {
                // Verificar si la variable está declarada
                if (!declaredVariables.containsKey(varName)) {
                    errorTable.addError(new CompilationError(
                        CompilationError.ErrorType.SEMANTIC,
                        "La variable '" + varName + "' no está declarada",
                        line, column, varName
                    ));
                    expressionType = "unknown";
                } else {
                    expressionType = declaredVariables.get(varName);
                }
            }
        } else if (ctx.literal() != null) {
            expressionType = getLiteralType(ctx.literal());
        } else if (ctx.expression() != null) {
            expressionType = getExpressionType(ctx.expression());
        }
        
        if (expressionType != null) {
            expressionTypes.put(ctx, expressionType);
        }
    }
    
    private String getTypeString(CPlusPlusParser.TypeContext ctx) {
        if (ctx.primitiveType() != null) {
            return ctx.primitiveType().getText().toLowerCase();
        } else if (ctx.classType() != null) {
            return ctx.classType().getText();
        }
        return "unknown";
    }
    
    private String getExpressionType(CPlusPlusParser.ExpressionContext ctx) {
        if (ctx == null) return "unknown";
        
        // Delegar a expresión de asignación
        if (ctx.assignmentExpression() != null) {
            return getAssignmentExpressionType(ctx.assignmentExpression());
        }
        
        return "unknown";
    }
    
    private String getAssignmentExpressionType(CPlusPlusParser.AssignmentExpressionContext ctx) {
        if (ctx == null) return "unknown";
        
        // Verificar si ya calculamos el tipo
        String cachedType = expressionTypes.get(ctx);
        if (cachedType != null) return cachedType;
        
        if (ctx.conditionalExpression() != null) {
            return getConditionalExpressionType(ctx.conditionalExpression());
        } else if (ctx.unaryExpression() != null && ctx.assignmentExpression() != null) {
            // Esta es una asignación, devolver el tipo del lado derecho
            return getAssignmentExpressionType(ctx.assignmentExpression());
        }
        
        return "unknown";
    }
    
    private String getConditionalExpressionType(CPlusPlusParser.ConditionalExpressionContext ctx) {
        if (ctx == null) return "unknown";
        
        if (ctx.logicalOrExpression() != null) {
            return getLogicalOrExpressionType(ctx.logicalOrExpression());
        }
        
        return "unknown";
    }
    
    private String getLogicalOrExpressionType(CPlusPlusParser.LogicalOrExpressionContext ctx) {
        if (ctx == null) return "unknown";
        
        // Para operaciones lógicas, devolver bool, pero para expresiones simples, devolver el tipo del operando
        if (ctx.logicalAndExpression() != null && !ctx.logicalAndExpression().isEmpty()) {
            if (ctx.logicalAndExpression().size() > 1) {
                // Múltiples operandos con OR - esto es una expresión booleana
                return "bool";
            } else {
                // Un solo operando - delegar para obtener su tipo
                return getLogicalAndExpressionType(ctx.logicalAndExpression(0));
            }
        }
        
        return "unknown";
    }
    
    private String getLogicalAndExpressionType(CPlusPlusParser.LogicalAndExpressionContext ctx) {
        if (ctx == null) return "unknown";
        
        // Para operaciones lógicas, devolver bool, pero para expresiones simples, devolver el tipo del operando
        if (ctx.equalityExpression() != null && !ctx.equalityExpression().isEmpty()) {
            if (ctx.equalityExpression().size() > 1) {
                // Múltiples operandos con AND - esto es una expresión booleana
                return "bool";
            } else {
                // Un solo operando - delegar para obtener su tipo
                return getEqualityExpressionType(ctx.equalityExpression(0));
            }
        }
        
        return "unknown";
    }
    
    private String getEqualityExpressionType(CPlusPlusParser.EqualityExpressionContext ctx) {
        if (ctx == null) return "unknown";
        
        // Para operaciones de igualdad, devolver bool, pero para expresiones simples, devolver el tipo del operando
        if (ctx.relationalExpression() != null && !ctx.relationalExpression().isEmpty()) {
            if (ctx.relationalExpression().size() > 1) {
                // Múltiples operandos con igualdad - esto es una expresión booleana
                return "bool";
            } else {
                // Un solo operando - continuar por la cadena
                return getRelationalExpressionType(ctx.relationalExpression(0));
            }
        }
        
        return "unknown";
    }
    
    private String getRelationalExpressionType(CPlusPlusParser.RelationalExpressionContext ctx) {
        if (ctx == null) return "unknown";
        
        // Para operaciones relacionales, devolver bool, pero para expresiones simples, devolver el tipo del operando
        if (ctx.shiftExpression() != null && !ctx.shiftExpression().isEmpty()) {
            if (ctx.shiftExpression().size() > 1) {
                // Múltiples operandos con operadores relacionales - esto es una expresión booleana
                return "bool";
            } else {
                // Un solo operando - continuar por la cadena
                return getShiftExpressionType(ctx.shiftExpression(0));
            }
        }
        
        return "unknown";
    }
    
    private String getShiftExpressionType(CPlusPlusParser.ShiftExpressionContext ctx) {
        if (ctx == null) return "unknown";
        
        // Para operaciones de desplazamiento, generalmente devolver int, pero para expresiones simples, devolver el tipo del operando
        if (ctx.additiveExpression() != null && !ctx.additiveExpression().isEmpty()) {
            if (ctx.additiveExpression().size() > 1) {
                // Múltiples operandos con desplazamiento - usualmente resulta en int
                return "int";
            } else {
                // Un solo operando - continuar por la cadena
                return getAdditiveExpressionType(ctx.additiveExpression(0));
            }
        }
        
        return "unknown";
    }
    
    private String getAdditiveExpressionType(CPlusPlusParser.AdditiveExpressionContext ctx) {
        if (ctx == null) return "unknown";
        
        // Para operaciones aritméticas, devolver el tipo promovido
        if (ctx.multiplicativeExpression() != null && !ctx.multiplicativeExpression().isEmpty()) {
            if (ctx.multiplicativeExpression().size() > 1) {
                // Múltiples operandos - necesita determinar el tipo promovido
                // Por simplicidad, devolver el tipo del primer operando
                return getMultiplicativeExpressionType(ctx.multiplicativeExpression(0));
            } else {
                // Un solo operando - continuar por la cadena
                return getMultiplicativeExpressionType(ctx.multiplicativeExpression(0));
            }
        }
        
        return "unknown";
    }
    
    private String getMultiplicativeExpressionType(CPlusPlusParser.MultiplicativeExpressionContext ctx) {
        if (ctx == null) return "unknown";
        
        // Para operaciones aritméticas, devolver el tipo promovido
        if (ctx.unaryExpression() != null && !ctx.unaryExpression().isEmpty()) {
            // Por simplicidad, devolver el tipo del primer operando
            return getUnaryExpressionType(ctx.unaryExpression(0));
        }
        
        return "unknown";
    }
    
    private String getUnaryExpressionType(CPlusPlusParser.UnaryExpressionContext ctx) {
        if (ctx == null) return "unknown";
        
        if (ctx.postfixExpression() != null) {
            return getPostfixExpressionType(ctx.postfixExpression());
        } else if (ctx.unaryExpression() != null) {
            // Las operaciones unarias generalmente preservan el tipo
            return getUnaryExpressionType(ctx.unaryExpression());
        }
        
        return "unknown";
    }
    
    private String getPostfixExpressionType(CPlusPlusParser.PostfixExpressionContext ctx) {
        if (ctx == null) return "unknown";
        
        if (ctx.primaryExpression() != null) {
            return getPrimaryExpressionType(ctx.primaryExpression());
        }
        
        return "unknown";
    }
    
    private String getPrimaryExpressionType(CPlusPlusParser.PrimaryExpressionContext ctx) {
        if (ctx == null) return "unknown";
        
        // Verificar si ya calculamos el tipo
        String cachedType = expressionTypes.get(ctx);
        if (cachedType != null) return cachedType;
        
        if (ctx.IDENTIFIER() != null) {
            String varName = ctx.IDENTIFIER().getText();
            
            // Manejo especial para literales booleanos
            if ("true".equals(varName) || "false".equals(varName)) {
                return "bool";
            } else if (declaredVariables.containsKey(varName)) {
                return declaredVariables.get(varName);
            } else {
                return "unknown"; // Será capturado por la verificación de errores en exitPrimaryExpression
            }
        } else if (ctx.literal() != null) {
            return getLiteralType(ctx.literal());
        } else if (ctx.expression() != null) {
            return getExpressionType(ctx.expression());
        }
        
        return "unknown";
    }
    
    private String getLiteralType(CPlusPlusParser.LiteralContext ctx) {
        if (ctx.STRING_LITERAL() != null) {
            return "string";
        } else if (ctx.CHARACTER_LITERAL() != null) {
            return "char";
        } else if (ctx.FLOAT_LITERAL() != null) {
            return "float";
        } else if (ctx.INTEGER_LITERAL() != null) {
            return "int";
        }
        return "unknown";
    }
    
    private boolean isTypeCompatible(String targetType, String sourceType) {
        if (targetType == null || sourceType == null) return false;
        if (targetType.equals(sourceType)) return true;
        
        Set<String> compatible = compatibleTypes.get(targetType);
        return compatible != null && compatible.contains(sourceType);
    }
    
    /**
     * Extraer el valor literal de una expresión simple
     */
    private String extractLiteralValue(CPlusPlusParser.ExpressionContext ctx) {
        if (ctx == null) return null;
        
        // Navegar por la estructura de la expresión para encontrar literales
        if (ctx.assignmentExpression() != null) {
            return extractLiteralFromAssignment(ctx.assignmentExpression());
        }
        
        return null;
    }
    
    private String extractLiteralFromAssignment(CPlusPlusParser.AssignmentExpressionContext ctx) {
        if (ctx == null) return null;
        
        if (ctx.conditionalExpression() != null) {
            return extractLiteralFromConditional(ctx.conditionalExpression());
        } else if (ctx.unaryExpression() != null && ctx.assignmentExpression() != null) {
            // Para asignaciones, tomar el valor del lado derecho
            return extractLiteralFromAssignment(ctx.assignmentExpression());
        }
        
        return null;
    }
    
    private String extractLiteralFromConditional(CPlusPlusParser.ConditionalExpressionContext ctx) {
        if (ctx == null) return null;
        
        if (ctx.logicalOrExpression() != null) {
            return extractLiteralFromLogicalOr(ctx.logicalOrExpression());
        }
        
        return null;
    }
    
    private String extractLiteralFromLogicalOr(CPlusPlusParser.LogicalOrExpressionContext ctx) {
        if (ctx == null) return null;
        
        if (ctx.logicalAndExpression() != null && !ctx.logicalAndExpression().isEmpty()) {
            return extractLiteralFromLogicalAnd(ctx.logicalAndExpression(0));
        }
        
        return null;
    }
    
    private String extractLiteralFromLogicalAnd(CPlusPlusParser.LogicalAndExpressionContext ctx) {
        if (ctx == null) return null;
        
        if (ctx.equalityExpression() != null && !ctx.equalityExpression().isEmpty()) {
            return extractLiteralFromEquality(ctx.equalityExpression(0));
        }
        
        return null;
    }
    
    private String extractLiteralFromEquality(CPlusPlusParser.EqualityExpressionContext ctx) {
        if (ctx == null) return null;
        
        if (ctx.relationalExpression() != null && !ctx.relationalExpression().isEmpty()) {
            return extractLiteralFromRelational(ctx.relationalExpression(0));
        }
        
        return null;
    }
    
    private String extractLiteralFromRelational(CPlusPlusParser.RelationalExpressionContext ctx) {
        if (ctx == null) return null;
        
        if (ctx.shiftExpression() != null && !ctx.shiftExpression().isEmpty()) {
            return extractLiteralFromShift(ctx.shiftExpression(0));
        }
        
        return null;
    }
    
    private String extractLiteralFromShift(CPlusPlusParser.ShiftExpressionContext ctx) {
        if (ctx == null) return null;
        
        if (ctx.additiveExpression() != null && !ctx.additiveExpression().isEmpty()) {
            return extractLiteralFromAdditive(ctx.additiveExpression(0));
        }
        
        return null;
    }
    
    private String extractLiteralFromAdditive(CPlusPlusParser.AdditiveExpressionContext ctx) {
        if (ctx == null) return null;
        
        if (ctx.multiplicativeExpression() != null && !ctx.multiplicativeExpression().isEmpty()) {
            if (ctx.multiplicativeExpression().size() == 1) {
                // Expresión simple
                return extractLiteralFromMultiplicative(ctx.multiplicativeExpression(0));
            } else {
                // Expresión compleja - mostrar la expresión completa
                return ctx.getText();
            }
        }
        
        return null;
    }
    
    private String extractLiteralFromMultiplicative(CPlusPlusParser.MultiplicativeExpressionContext ctx) {
        if (ctx == null) return null;
        
        if (ctx.unaryExpression() != null && !ctx.unaryExpression().isEmpty()) {
            if (ctx.unaryExpression().size() == 1) {
                // Expresión simple
                return extractLiteralFromUnary(ctx.unaryExpression(0));
            } else {
                // Expresión compleja
                return ctx.getText();
            }
        }
        
        return null;
    }
    
    private String extractLiteralFromUnary(CPlusPlusParser.UnaryExpressionContext ctx) {
        if (ctx == null) return null;
        
        if (ctx.postfixExpression() != null) {
            return extractLiteralFromPostfix(ctx.postfixExpression());
        }
        
        return null;
    }
    
    private String extractLiteralFromPostfix(CPlusPlusParser.PostfixExpressionContext ctx) {
        if (ctx == null) return null;
        
        if (ctx.primaryExpression() != null) {
            return extractLiteralFromPrimary(ctx.primaryExpression());
        }
        
        return null;
    }
    
    private String extractLiteralFromPrimary(CPlusPlusParser.PrimaryExpressionContext ctx) {
        if (ctx == null) return null;
        
        if (ctx.literal() != null) {
            // Es un literal directo
            return ctx.literal().getText();
        } else if (ctx.IDENTIFIER() != null) {
            // Es un identificador (variable)
            String varName = ctx.IDENTIFIER().getText();
            if ("true".equals(varName) || "false".equals(varName)) {
                return varName;
            }
            return varName; // Mostrar el nombre de la variable
        } else if (ctx.expression() != null) {
            // Expresión entre paréntesis
            return extractLiteralValue(ctx.expression());
        }
        
        return null;
    }
} 