/*
 * generated by Xtext 2.12.0
 */
package org.xtext.trabalho.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.trabalho.services.MALGrammarAccess;

@SuppressWarnings("all")
public class MALSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MALGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ColumnType_BATKeyword_1_0_or_BatKeyword_1_1;
	protected AbstractElementAlias match_ColumnType_TypeName_ColonKeyword_2_0_or___ColonKeyword_0___BATKeyword_1_0_or_BatKeyword_1_1___LeftSquareBracketKeyword_2_ColonKeyword_3__;
	protected AbstractElementAlias match_ColumnType___ColonKeyword_0___BATKeyword_1_0_or_BatKeyword_1_1___LeftSquareBracketKeyword_2_ColonKeyword_3__q;
	protected AbstractElementAlias match_Definition_ADDRESSKeyword_0_3_0_or_AddressKeyword_0_3_1;
	protected AbstractElementAlias match_Definition_ADDRESSKeyword_1_3_0_or_AddressKeyword_1_3_1;
	protected AbstractElementAlias match_Definition_COMMANDKeyword_0_1_0_or_CommandKeyword_0_1_1;
	protected AbstractElementAlias match_Definition_ENDKeyword_2_4_0_or_EndKeyword_2_4_1;
	protected AbstractElementAlias match_Definition_ENDKeyword_3_3_0_or_EndKeyword_3_3_1;
	protected AbstractElementAlias match_Definition_FACTORYKeyword_3_0_0_or_FactoryKeyword_3_0_1;
	protected AbstractElementAlias match_Definition_FUNCTIONKeyword_2_1_0_or_FunctionKeyword_2_1_1;
	protected AbstractElementAlias match_Definition_PATTERNKeyword_1_1_0_or_PatternKeyword_1_1_1;
	protected AbstractElementAlias match_Definition___INLINEKeyword_2_0_0_0_or_InlineKeyword_2_0_0_1_or_UNSAFEKeyword_2_0_1_0_or_UnsafeKeyword_2_0_1_1__q;
	protected AbstractElementAlias match_Definition___UNSAFEKeyword_0_0_0_or_UnsafeKeyword_0_0_1__q;
	protected AbstractElementAlias match_Definition___UNSAFEKeyword_1_0_0_or_UnsafeKeyword_1_0_1__q;
	protected AbstractElementAlias match_Factor_Literal_constantParserRuleCall_0_1_or_NILKeyword_1_1;
	protected AbstractElementAlias match_Helpinfo_COMMENTKeyword_0_0_or_CommentKeyword_0_1;
	protected AbstractElementAlias match_IncludeStmt_INCLUDEKeyword_0_0_0_or_IncludeKeyword_0_0_1;
	protected AbstractElementAlias match_IncludeStmt_INCLUDEKeyword_1_0_0_or_IncludeKeyword_1_0_1;
	protected AbstractElementAlias match_ModuleStmt_ATOMKeyword_1_0_0_or_AtomKeyword_1_0_1;
	protected AbstractElementAlias match_ModuleStmt_MODULEKeyword_0_0_0_or_ModuleKeyword_0_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MALGrammarAccess) access;
		match_ColumnType_BATKeyword_1_0_or_BatKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getBATKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getBatKeyword_1_1()));
		match_ColumnType_TypeName_ColonKeyword_2_0_or___ColonKeyword_0___BATKeyword_1_0_or_BatKeyword_1_1___LeftSquareBracketKeyword_2_ColonKeyword_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getColonKeyword_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getBATKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getBatKeyword_1_1())), new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getLeftSquareBracketKeyword_2()), new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getColonKeyword_3())), new TokenAlias(false, false, grammarAccess.getTypeNameAccess().getColonKeyword_2_0()));
		match_ColumnType___ColonKeyword_0___BATKeyword_1_0_or_BatKeyword_1_1___LeftSquareBracketKeyword_2_ColonKeyword_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getColonKeyword_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getBATKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getBatKeyword_1_1())), new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getLeftSquareBracketKeyword_2()), new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getColonKeyword_3()));
		match_Definition_ADDRESSKeyword_0_3_0_or_AddressKeyword_0_3_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getADDRESSKeyword_0_3_0()), new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getAddressKeyword_0_3_1()));
		match_Definition_ADDRESSKeyword_1_3_0_or_AddressKeyword_1_3_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getADDRESSKeyword_1_3_0()), new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getAddressKeyword_1_3_1()));
		match_Definition_COMMANDKeyword_0_1_0_or_CommandKeyword_0_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getCOMMANDKeyword_0_1_0()), new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getCommandKeyword_0_1_1()));
		match_Definition_ENDKeyword_2_4_0_or_EndKeyword_2_4_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getENDKeyword_2_4_0()), new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getEndKeyword_2_4_1()));
		match_Definition_ENDKeyword_3_3_0_or_EndKeyword_3_3_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getENDKeyword_3_3_0()), new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getEndKeyword_3_3_1()));
		match_Definition_FACTORYKeyword_3_0_0_or_FactoryKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getFACTORYKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getFactoryKeyword_3_0_1()));
		match_Definition_FUNCTIONKeyword_2_1_0_or_FunctionKeyword_2_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getFUNCTIONKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getFunctionKeyword_2_1_1()));
		match_Definition_PATTERNKeyword_1_1_0_or_PatternKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getPATTERNKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getPatternKeyword_1_1_1()));
		match_Definition___INLINEKeyword_2_0_0_0_or_InlineKeyword_2_0_0_1_or_UNSAFEKeyword_2_0_1_0_or_UnsafeKeyword_2_0_1_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getINLINEKeyword_2_0_0_0()), new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getInlineKeyword_2_0_0_1()), new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getUNSAFEKeyword_2_0_1_0()), new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getUnsafeKeyword_2_0_1_1()));
		match_Definition___UNSAFEKeyword_0_0_0_or_UnsafeKeyword_0_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getUNSAFEKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getUnsafeKeyword_0_0_1()));
		match_Definition___UNSAFEKeyword_1_0_0_or_UnsafeKeyword_1_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getUNSAFEKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getUnsafeKeyword_1_0_1()));
		match_Factor_Literal_constantParserRuleCall_0_1_or_NILKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFactorAccess().getLiteral_constantParserRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getFactorAccess().getNILKeyword_1_1()));
		match_Helpinfo_COMMENTKeyword_0_0_or_CommentKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getHelpinfoAccess().getCOMMENTKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getHelpinfoAccess().getCommentKeyword_0_1()));
		match_IncludeStmt_INCLUDEKeyword_0_0_0_or_IncludeKeyword_0_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIncludeStmtAccess().getINCLUDEKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getIncludeStmtAccess().getIncludeKeyword_0_0_1()));
		match_IncludeStmt_INCLUDEKeyword_1_0_0_or_IncludeKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIncludeStmtAccess().getINCLUDEKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getIncludeStmtAccess().getIncludeKeyword_1_0_1()));
		match_ModuleStmt_ATOMKeyword_1_0_0_or_AtomKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getModuleStmtAccess().getATOMKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getModuleStmtAccess().getAtomKeyword_1_0_1()));
		match_ModuleStmt_MODULEKeyword_0_0_0_or_ModuleKeyword_0_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getModuleStmtAccess().getMODULEKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getModuleStmtAccess().getModuleKeyword_0_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getFlowRule())
			return getFlowToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLiteral_constantRule())
			return getLiteral_constantToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Flow:
	 * 	('RETURN' | 'return' ) | ('BARRIER' | 'barrier') | ('CATCH' | 'catch') | ('LEAVE' | 'leave') | ('REDO' | 'redo') | ('RAISE' | 'raise')
	 * ;
	 */
	protected String getFlowToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "RETURN";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * Literal_constant:
	 * 	BIT | Bte | CHR | WRD | INT | OID | FLT | STR   ;
	 */
	protected String getLiteral_constantToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "0";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ColumnType_BATKeyword_1_0_or_BatKeyword_1_1.equals(syntax))
				emit_ColumnType_BATKeyword_1_0_or_BatKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ColumnType_TypeName_ColonKeyword_2_0_or___ColonKeyword_0___BATKeyword_1_0_or_BatKeyword_1_1___LeftSquareBracketKeyword_2_ColonKeyword_3__.equals(syntax))
				emit_ColumnType_TypeName_ColonKeyword_2_0_or___ColonKeyword_0___BATKeyword_1_0_or_BatKeyword_1_1___LeftSquareBracketKeyword_2_ColonKeyword_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ColumnType___ColonKeyword_0___BATKeyword_1_0_or_BatKeyword_1_1___LeftSquareBracketKeyword_2_ColonKeyword_3__q.equals(syntax))
				emit_ColumnType___ColonKeyword_0___BATKeyword_1_0_or_BatKeyword_1_1___LeftSquareBracketKeyword_2_ColonKeyword_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Definition_ADDRESSKeyword_0_3_0_or_AddressKeyword_0_3_1.equals(syntax))
				emit_Definition_ADDRESSKeyword_0_3_0_or_AddressKeyword_0_3_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Definition_ADDRESSKeyword_1_3_0_or_AddressKeyword_1_3_1.equals(syntax))
				emit_Definition_ADDRESSKeyword_1_3_0_or_AddressKeyword_1_3_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Definition_COMMANDKeyword_0_1_0_or_CommandKeyword_0_1_1.equals(syntax))
				emit_Definition_COMMANDKeyword_0_1_0_or_CommandKeyword_0_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Definition_ENDKeyword_2_4_0_or_EndKeyword_2_4_1.equals(syntax))
				emit_Definition_ENDKeyword_2_4_0_or_EndKeyword_2_4_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Definition_ENDKeyword_3_3_0_or_EndKeyword_3_3_1.equals(syntax))
				emit_Definition_ENDKeyword_3_3_0_or_EndKeyword_3_3_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Definition_FACTORYKeyword_3_0_0_or_FactoryKeyword_3_0_1.equals(syntax))
				emit_Definition_FACTORYKeyword_3_0_0_or_FactoryKeyword_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Definition_FUNCTIONKeyword_2_1_0_or_FunctionKeyword_2_1_1.equals(syntax))
				emit_Definition_FUNCTIONKeyword_2_1_0_or_FunctionKeyword_2_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Definition_PATTERNKeyword_1_1_0_or_PatternKeyword_1_1_1.equals(syntax))
				emit_Definition_PATTERNKeyword_1_1_0_or_PatternKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Definition___INLINEKeyword_2_0_0_0_or_InlineKeyword_2_0_0_1_or_UNSAFEKeyword_2_0_1_0_or_UnsafeKeyword_2_0_1_1__q.equals(syntax))
				emit_Definition___INLINEKeyword_2_0_0_0_or_InlineKeyword_2_0_0_1_or_UNSAFEKeyword_2_0_1_0_or_UnsafeKeyword_2_0_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Definition___UNSAFEKeyword_0_0_0_or_UnsafeKeyword_0_0_1__q.equals(syntax))
				emit_Definition___UNSAFEKeyword_0_0_0_or_UnsafeKeyword_0_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Definition___UNSAFEKeyword_1_0_0_or_UnsafeKeyword_1_0_1__q.equals(syntax))
				emit_Definition___UNSAFEKeyword_1_0_0_or_UnsafeKeyword_1_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Factor_Literal_constantParserRuleCall_0_1_or_NILKeyword_1_1.equals(syntax))
				emit_Factor_Literal_constantParserRuleCall_0_1_or_NILKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Helpinfo_COMMENTKeyword_0_0_or_CommentKeyword_0_1.equals(syntax))
				emit_Helpinfo_COMMENTKeyword_0_0_or_CommentKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IncludeStmt_INCLUDEKeyword_0_0_0_or_IncludeKeyword_0_0_1.equals(syntax))
				emit_IncludeStmt_INCLUDEKeyword_0_0_0_or_IncludeKeyword_0_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IncludeStmt_INCLUDEKeyword_1_0_0_or_IncludeKeyword_1_0_1.equals(syntax))
				emit_IncludeStmt_INCLUDEKeyword_1_0_0_or_IncludeKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ModuleStmt_ATOMKeyword_1_0_0_or_AtomKeyword_1_0_1.equals(syntax))
				emit_ModuleStmt_ATOMKeyword_1_0_0_or_AtomKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ModuleStmt_MODULEKeyword_0_0_0_or_ModuleKeyword_0_0_1.equals(syntax))
				emit_ModuleStmt_MODULEKeyword_0_0_0_or_ModuleKeyword_0_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'BAT' | 'bat'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ':' (ambiguity) '[' ':' ':' identifier=ID
	 *     (rule start) ':' (ambiguity) '[' ':' type='any'
	 */
	protected void emit_ColumnType_BATKeyword_1_0_or_BatKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':' | (':' ('BAT' | 'bat') '[' ':')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) type='any'
	 */
	protected void emit_ColumnType_TypeName_ColonKeyword_2_0_or___ColonKeyword_0___BATKeyword_1_0_or_BatKeyword_1_1___LeftSquareBracketKeyword_2_ColonKeyword_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (':' ('BAT' | 'bat') '[' ':')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ':' identifier=ID
	 */
	protected void emit_ColumnType___ColonKeyword_0___BATKeyword_1_0_or_BatKeyword_1_1___LeftSquareBracketKeyword_2_ColonKeyword_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'address' | 'ADDRESS'
	 *
	 * This ambiguous syntax occurs at:
	 *     header=Header (ambiguity) identifier=ID
	 */
	protected void emit_Definition_ADDRESSKeyword_0_3_0_or_AddressKeyword_0_3_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'address' | 'ADDRESS'
	 *
	 * This ambiguous syntax occurs at:
	 *     header=Header (ambiguity) identifier=ID
	 */
	protected void emit_Definition_ADDRESSKeyword_1_3_0_or_AddressKeyword_1_3_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'command' | 'COMMAND'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('UNSAFE' | 'unsafe')? (ambiguity) header=Header
	 */
	protected void emit_Definition_COMMANDKeyword_0_1_0_or_CommandKeyword_0_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'END' | 'end'
	 *
	 * This ambiguous syntax occurs at:
	 *     header=Header (ambiguity) function_name=Name
	 *     statements+=Statement (ambiguity) function_name=Name
	 */
	protected void emit_Definition_ENDKeyword_2_4_0_or_EndKeyword_2_4_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'END' | 'end'
	 *
	 * This ambiguous syntax occurs at:
	 *     header=Header (ambiguity) factory_name=Name
	 *     statements+=Statement (ambiguity) factory_name=Name
	 */
	protected void emit_Definition_ENDKeyword_3_3_0_or_EndKeyword_3_3_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'factory' | 'FACTORY'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) header=Header
	 */
	protected void emit_Definition_FACTORYKeyword_3_0_0_or_FactoryKeyword_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'FUNCTION' | 'function'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('INLINE' | 'inline' | 'UNSAFE' | 'unsafe')? (ambiguity) header=Header
	 */
	protected void emit_Definition_FUNCTIONKeyword_2_1_0_or_FunctionKeyword_2_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'PATTERN' | 'pattern'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('UNSAFE' | 'unsafe')? (ambiguity) header=Header
	 */
	protected void emit_Definition_PATTERNKeyword_1_1_0_or_PatternKeyword_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('INLINE' | 'inline' | 'UNSAFE' | 'unsafe')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ('FUNCTION' | 'function') header=Header
	 */
	protected void emit_Definition___INLINEKeyword_2_0_0_0_or_InlineKeyword_2_0_0_1_or_UNSAFEKeyword_2_0_1_0_or_UnsafeKeyword_2_0_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('UNSAFE' | 'unsafe')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ('COMMAND' | 'command') header=Header
	 *     (rule start) (ambiguity) ('command' | 'COMMAND') header=Header
	 */
	protected void emit_Definition___UNSAFEKeyword_0_0_0_or_UnsafeKeyword_0_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('UNSAFE' | 'unsafe')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ('PATTERN' | 'pattern') header=Header
	 */
	protected void emit_Definition___UNSAFEKeyword_1_0_0_or_UnsafeKeyword_1_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'NIL' | Literal_constant
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ',' factor1+=Factor
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Factor_Literal_constantParserRuleCall_0_1_or_NILKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'COMMENT' | 'comment'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) string_literal=STRING
	 */
	protected void emit_Helpinfo_COMMENTKeyword_0_0_or_CommentKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'include' | 'INCLUDE'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) identifier=ID
	 */
	protected void emit_IncludeStmt_INCLUDEKeyword_0_0_0_or_IncludeKeyword_0_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'INCLUDE' | 'include'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) string_literal=STRING
	 */
	protected void emit_IncludeStmt_INCLUDEKeyword_1_0_0_or_IncludeKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'atom' | 'ATOM'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ident=ID
	 */
	protected void emit_ModuleStmt_ATOMKeyword_1_0_0_or_AtomKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'module' | 'MODULE'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ident=ID
	 */
	protected void emit_ModuleStmt_MODULEKeyword_0_0_0_or_ModuleKeyword_0_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
