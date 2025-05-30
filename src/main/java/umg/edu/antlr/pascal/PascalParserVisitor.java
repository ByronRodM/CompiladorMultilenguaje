// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/pascal/PascalParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.pascal;

    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PascalParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PascalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#programBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramBlock(PascalParser.ProgramBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#declarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationPart(PascalParser.DeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#labelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDeclaration(PascalParser.LabelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#labelList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelList(PascalParser.LabelListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(PascalParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(PascalParser.ConstantDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(PascalParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(PascalParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variableGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableGroup(PascalParser.VariableGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(PascalParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procedureHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureHeading(PascalParser.ProcedureHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#functionHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionHeading(PascalParser.FunctionHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#resultType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultType(PascalParser.ResultTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(PascalParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterSection(PascalParser.FormalParameterSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(PascalParser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#parameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterType(PascalParser.ParameterTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(PascalParser.IndexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procedureBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureBody(PascalParser.ProcedureBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(PascalParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PascalParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(PascalParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#ordinalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinalType(PascalParser.OrdinalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#enumType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumType(PascalParser.EnumTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#subrangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrangeType(PascalParser.SubrangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#realType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealType(PascalParser.RealTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#structuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredType(PascalParser.StructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(PascalParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#componentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentType(PascalParser.ComponentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#recordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(PascalParser.RecordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#fieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldList(PascalParser.FieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#fixedPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedPart(PascalParser.FixedPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#recordSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordSection(PascalParser.RecordSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variantPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariantPart(PascalParser.VariantPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(PascalParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant(PascalParser.VariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#caseLabelList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseLabelList(PascalParser.CaseLabelListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#caseLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseLabel(PascalParser.CaseLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#setType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetType(PascalParser.SetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#fileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileType(PascalParser.FileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#pointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(PascalParser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#statementPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementPart(PascalParser.StatementPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PascalParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PascalParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(PascalParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(PascalParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PascalParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCall(PascalParser.ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#actualParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameterList(PascalParser.ActualParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(PascalParser.ActualParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(PascalParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredStatement(PascalParser.StructuredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(PascalParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(PascalParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(PascalParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#caseListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseListElement(PascalParser.CaseListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#repetitiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetitiveStatement(PascalParser.RepetitiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PascalParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(PascalParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PascalParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#forList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForList(PascalParser.ForListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#initialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialValue(PascalParser.InitialValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(PascalParser.FinalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#withStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStatement(PascalParser.WithStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#recordVariableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordVariableList(PascalParser.RecordVariableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(PascalParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(PascalParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#addingOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddingOperator(PascalParser.AddingOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PascalParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#multiplyingOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingOperator(PascalParser.MultiplyingOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PascalParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PascalParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(PascalParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(PascalParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(PascalParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(PascalParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(PascalParser.UnsignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(PascalParser.UnsignedNumberContext ctx);
}