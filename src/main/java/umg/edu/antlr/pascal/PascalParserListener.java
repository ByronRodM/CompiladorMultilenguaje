// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/pascal/PascalParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.pascal;

    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalParser}.
 */
public interface PascalParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#programBlock}.
	 * @param ctx the parse tree
	 */
	void enterProgramBlock(PascalParser.ProgramBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#programBlock}.
	 * @param ctx the parse tree
	 */
	void exitProgramBlock(PascalParser.ProgramBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#declarationPart}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationPart(PascalParser.DeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#declarationPart}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationPart(PascalParser.DeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#labelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLabelDeclaration(PascalParser.LabelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#labelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLabelDeclaration(PascalParser.LabelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#labelList}.
	 * @param ctx the parse tree
	 */
	void enterLabelList(PascalParser.LabelListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#labelList}.
	 * @param ctx the parse tree
	 */
	void exitLabelList(PascalParser.LabelListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(PascalParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(PascalParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(PascalParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(PascalParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(PascalParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(PascalParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(PascalParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(PascalParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableGroup}.
	 * @param ctx the parse tree
	 */
	void enterVariableGroup(PascalParser.VariableGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableGroup}.
	 * @param ctx the parse tree
	 */
	void exitVariableGroup(PascalParser.VariableGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(PascalParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(PascalParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureHeading}.
	 * @param ctx the parse tree
	 */
	void enterProcedureHeading(PascalParser.ProcedureHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureHeading}.
	 * @param ctx the parse tree
	 */
	void exitProcedureHeading(PascalParser.ProcedureHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#functionHeading}.
	 * @param ctx the parse tree
	 */
	void enterFunctionHeading(PascalParser.FunctionHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#functionHeading}.
	 * @param ctx the parse tree
	 */
	void exitFunctionHeading(PascalParser.FunctionHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(PascalParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(PascalParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(PascalParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(PascalParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(PascalParser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(PascalParser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(PascalParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(PascalParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(PascalParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(PascalParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(PascalParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(PascalParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureBody}.
	 * @param ctx the parse tree
	 */
	void enterProcedureBody(PascalParser.ProcedureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureBody}.
	 * @param ctx the parse tree
	 */
	void exitProcedureBody(PascalParser.ProcedureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(PascalParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(PascalParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PascalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PascalParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(PascalParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(PascalParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#ordinalType}.
	 * @param ctx the parse tree
	 */
	void enterOrdinalType(PascalParser.OrdinalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#ordinalType}.
	 * @param ctx the parse tree
	 */
	void exitOrdinalType(PascalParser.OrdinalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#enumType}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(PascalParser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#enumType}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(PascalParser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeType(PascalParser.SubrangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeType(PascalParser.SubrangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#realType}.
	 * @param ctx the parse tree
	 */
	void enterRealType(PascalParser.RealTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#realType}.
	 * @param ctx the parse tree
	 */
	void exitRealType(PascalParser.RealTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(PascalParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(PascalParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(PascalParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(PascalParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(PascalParser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(PascalParser.ComponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(PascalParser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(PascalParser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(PascalParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(PascalParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void enterFixedPart(PascalParser.FixedPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void exitFixedPart(PascalParser.FixedPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void enterRecordSection(PascalParser.RecordSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void exitRecordSection(PascalParser.RecordSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variantPart}.
	 * @param ctx the parse tree
	 */
	void enterVariantPart(PascalParser.VariantPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variantPart}.
	 * @param ctx the parse tree
	 */
	void exitVariantPart(PascalParser.VariantPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(PascalParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(PascalParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(PascalParser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(PascalParser.VariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseLabelList}.
	 * @param ctx the parse tree
	 */
	void enterCaseLabelList(PascalParser.CaseLabelListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseLabelList}.
	 * @param ctx the parse tree
	 */
	void exitCaseLabelList(PascalParser.CaseLabelListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseLabel}.
	 * @param ctx the parse tree
	 */
	void enterCaseLabel(PascalParser.CaseLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseLabel}.
	 * @param ctx the parse tree
	 */
	void exitCaseLabel(PascalParser.CaseLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(PascalParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(PascalParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#fileType}.
	 * @param ctx the parse tree
	 */
	void enterFileType(PascalParser.FileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#fileType}.
	 * @param ctx the parse tree
	 */
	void exitFileType(PascalParser.FileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(PascalParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(PascalParser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#statementPart}.
	 * @param ctx the parse tree
	 */
	void enterStatementPart(PascalParser.StatementPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#statementPart}.
	 * @param ctx the parse tree
	 */
	void exitStatementPart(PascalParser.StatementPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PascalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PascalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PascalParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PascalParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PascalParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PascalParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PascalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PascalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCall(PascalParser.ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCall(PascalParser.ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void enterActualParameterList(PascalParser.ActualParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void exitActualParameterList(PascalParser.ActualParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(PascalParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(PascalParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(PascalParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(PascalParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(PascalParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(PascalParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(PascalParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(PascalParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(PascalParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(PascalParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(PascalParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(PascalParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void enterCaseListElement(PascalParser.CaseListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void exitCaseListElement(PascalParser.CaseListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#repetitiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetitiveStatement(PascalParser.RepetitiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#repetitiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetitiveStatement(PascalParser.RepetitiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PascalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PascalParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(PascalParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(PascalParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PascalParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PascalParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(PascalParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(PascalParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(PascalParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(PascalParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(PascalParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(PascalParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(PascalParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(PascalParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void enterRecordVariableList(PascalParser.RecordVariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void exitRecordVariableList(PascalParser.RecordVariableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(PascalParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(PascalParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(PascalParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(PascalParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#addingOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddingOperator(PascalParser.AddingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#addingOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddingOperator(PascalParser.AddingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PascalParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PascalParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#multiplyingOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingOperator(PascalParser.MultiplyingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#multiplyingOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingOperator(PascalParser.MultiplyingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PascalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PascalParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PascalParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PascalParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(PascalParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(PascalParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(PascalParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(PascalParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PascalParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PascalParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PascalParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PascalParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(PascalParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(PascalParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(PascalParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(PascalParser.UnsignedNumberContext ctx);
}