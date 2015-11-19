package org.xtext.example.mydsl.generator;

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.example.mydsl.myDsl.Class_declaration
import org.xtext.example.mydsl.myDsl.Expression
import org.xtext.example.mydsl.myDsl.Field_declaration
import org.xtext.example.mydsl.myDsl.Interface_declaration
import org.xtext.example.mydsl.myDsl.Method_declaration
import org.xtext.example.mydsl.myDsl.Statement
import org.xtext.example.mydsl.myDsl.Statement_block
import org.xtext.example.mydsl.myDsl.Variable_declaration
import org.xtext.example.mydsl.myDsl.Variable_declarator
import org.xtext.example.mydsl.myDsl.While_Statement

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator implements IGenerator {

	Integer variables = 1;
	Integer address = 0;

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		variables = 1;
		address = 0;
		for (e : resource.allContents.toIterable.filter(Class_declaration)) {
			fsa.generateFile(e.className.toString() + ".txt", e.compileClass)
		}
		for (e : resource.allContents.toIterable.filter(Interface_declaration)) {
			fsa.generateFile(e.interfaceName.toString() + ".txt", e.compileInterface)
		}
	}

	def compileClass(Class_declaration cd) '''
		«address»: LD SP, 1000
		«nextAddress»
		«FOR f : cd.fieldsDeclaration»
			«f.compileField»
		«ENDFOR»
	'''

	def compileInterface(Interface_declaration cd) '''
		«address»LD SP, 1000
		«nextAddress»
		«FOR f : cd.fieldsDeclaration»
			«f.compileField»
		«ENDFOR»
	'''

	def compileField(Field_declaration declaration) '''
		«IF declaration.variableDeclaration instanceof Variable_declaration»
			«(declaration.variableDeclaration as Variable_declaration).compileVariable»
		«ELSEIF declaration.methodName instanceof Method_declaration»
			«(declaration.methodName as Method_declaration).compileMethod»
		«ENDIF»		
	'''

	def compileMethod(Method_declaration declaration) '''
		«IF declaration.statementMethod != null»
			«declaration.nameMethod»:
			«compileStatementBlock(declaration.statementMethod)»
		«ENDIF»
		
	'''

	def compileStatementBlock(Statement_block block) '''
		«IF block.statments != null»
			«compileStatements(block.statments)»
		«ENDIF»
	'''

	def compileStatements(EList<Statement> listStatements) '''
		«FOR actualStatment : listStatements»
			«compileStatement(actualStatment)»
		«ENDFOR»
	'''

	def compileStatement(Statement statement) '''
		«IF statement.variableDeclaration != null»
			«compileVariable(statement.variableDeclaration)»
		«ELSEIF statement.variableDeclaration != null && statement.variableDeclaration.nameVariable != null»
			«compileDeclarator(statement.variableDeclaration.nameVariable)»
		«ELSEIF statement.whileStatement != null»
			«compileWhileStatement(statement.whileStatement)»
		«ELSEIF statement.ret != null»
			«compileReturnStatement(statement.ret)»
		«ELSEIF statement.expressionStatement != null && statement.expressionStatement.size > 0»
			«FOR exp : statement.expressionStatement»
				«compileExpression(exp)»
			«ENDFOR»
		«ELSEIF statement.statementBlock != null»
			«compileStatementBlock(statement.statementBlock)»
		«ENDIF»
	'''

	def compileReturnStatement(String statement) '''
		«address»: BR *0(SP)
		«nextAddress»
	'''

	def compileWhileStatement(While_Statement whileStatement) '''
		#StartWHILE:
		«IF whileStatement.expression != null»
			«generateSimpleLogical(whileStatement.expression)»
		«ENDIF»
		«IF whileStatement.whileStatement != null»
			«compileStatement(whileStatement.whileStatement)»
		«ENDIF»
		«address.toString()»: BR #StartWHILE
		«nextAddress»
		
		#EndWHILE:
	'''

	def compileExpression(Expression expression) '''
		«IF expression.literalExpression != null»	
			«IF expression.aux.aux == null && expression.aux.exp1 == null»
				«IF expression.literalExpression.string != null»
					«generateStringExpression(expression)»
				«ENDIF»
			«ELSE»
				«IF expression.aux.testingSign != null»
					«generateTestingExpression(expression)»
				«ELSE»				
					«generateIntLiteralExpression(expression)»
				«ENDIF»
			«ENDIF»
			«ELSEIF expression.logicalExpression != null»
			«generateSimpleLogicalExpression(expression,"")»
			«ELSEIF expression.numericExpression3 != null»
			«generateNumericExpression(expression)»
		«ELSEIF expression.name != null»
			«IF expression.aux != null»
				«address.toString()»: ADD SP, SP, #methodSize
				«nextAddress»
				«address.toString()»: ST *SP, «address+16»
				«nextAddress»
				«address»: BR «expression.name»
				«nextAddress»
				«address.toString()»: SUB SP, SP, #methodSize
				«nextAddress»
			«ELSE»
				«address.toString()»: LD R«variables.toString», *«expression.name»
				«increment»
				«nextAddress»
				«IF expression.aux.sgin != null»
					«IF expression.aux.sgin.equals("++")»
						«address.toString()»: ADD R«variables.toString», #1
						«nextAddress»
					«ELSE»
						«address.toString()»: SUB R«variables.toString», #1
						«nextAddress»
					«ENDIF»
					«address.toString()»: ST «expression.name», R«variables.toString»
					«nextAddress»
				«ELSE»
					«address.toString()»: LD R«variables.toString()», #«expression.aux.exp1.literalExpression.exp1»
					«increment»
					«nextAddress»
					«IF expression.aux.testingSign.equals("<")»
						«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
						«nextAddress»
						«address.toString()»: BGTZ R«new Integer(variables).toString()», #EndWHILE
						«nextAddress»
					«ELSEIF expression.aux.testingSign.equals(">")»
						«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
						«nextAddress»
						«address.toString()»: BGTZ R«new Integer(variables).toString()», #EndWHILE
						«nextAddress»
					«ELSEIF expression.aux.testingSign.equals(">=")»
						«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
						«nextAddress»
						«address.toString()»: BGEZ R«new Integer(variables).toString()», #EndWHILE
						«nextAddress»
					«ELSEIF expression.aux.testingSign.equals("<=")»
						«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
						«nextAddress»
						«address.toString()»: BGEZ R«new Integer(variables).toString()», #EndWHILE
						«nextAddress»
					«ELSEIF expression.aux.testingSign.equals("==")»
						«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
						«nextAddress»
						«increment»
						«address.toString()»: CMP R«new Integer(variables).toString()», #EndWHILE
						«nextAddress»
					«ELSEIF expression.aux.testingSign.equals("!=")»
						«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
						«nextAddress»
						«increment»
						«address.toString()»: CMP R«new Integer(variables).toString()», #EndWHILE
						«nextAddress»
					«ENDIF»
				«ENDIF»
			«ENDIF»	
		«ENDIF»
	'''

	def generateNumericExpression(Expression expression) '''
		«IF expression.numericExpression3 != null»
			«address.toString()»: LD R«variables.toString», «expression.numericExpression3.expression.name»
			«nextAddress»
			«IF expression.numericExpression3.sinal_numeric.equals("++")»
				«address.toString()»: ADD R«variables.toString», R«variables.toString», #1
				«nextAddress»
			«ELSEIF expression.numericExpression3.sinal_numeric.equals("--")»
				«address.toString()»: SUB R«variables.toString», R«variables.toString», #1
				«nextAddress»
			«ENDIF»
			«increment»
		«ENDIF»
	'''

	def compileVariable(Variable_declaration declaration) '''
		«IF declaration.nameVariable != null»
			«compileDeclarator(declaration.nameVariable)»
		«ENDIF»
		
	'''

	def compileDeclarator(Variable_declarator declarator) '''
		«IF declarator.vari != null»
			«IF declarator.vari.expression.literalExpression != null»	
				«IF declarator.vari.expression.aux.aux == null && declarator.vari.expression.aux.exp1 == null»
					«IF declarator.vari.expression.literalExpression.string != null»
						«generateString(declarator)»
					«ELSE»
						«address.toString()»: ST «declarator.nameVariable», #«declarator.vari.expression.literalExpression.exp1»
						«nextAddress»
					«ENDIF»
				«ELSE»
					«IF declarator.vari.expression.aux.testingSign != null»
						«generateTesting(declarator)»
					«ELSE»				
						«generateIntLiteral(declarator)»
					«ENDIF»
				«ENDIF»
			«ELSEIF declarator.vari.expression.logicalExpression != null»
				«generateSimpleLogical(declarator)»
			«ENDIF»
		«ENDIF»
	'''

	def void increment() {
		variables++;
	}

	def void nextAddress() {
		address = address + 8;
	}



	

	def generateString(Variable_declarator declarator) '''
		«address.toString()»: LD R«variables.toString()», "«declarator.vari.expression.literalExpression.string»"
		«increment»
		«nextAddress»
		«address.toString()»: ST «declarator.nameVariable», R«new Integer(variables-1).toString()»
		«nextAddress»
	'''

	def generateStringExpression(
		Expression expression
	) '''
		«address.toString()»: LD R«variables.toString()», "«expression.literalExpression.string»"
		«increment»
		«nextAddress»
	'''

	def generateSimpleLogical(Variable_declarator declarator) '''
		«IF declarator.vari.expression.logicalExpression != null && declarator.vari.expression.logicalExpression.^true != null»
			«address.toString()»: LD R«variables.toString()», TRUE
			«increment»
			«nextAddress»			
		«ELSEIF declarator.vari.expression.logicalExpression != null && declarator.vari.expression.logicalExpression.^false != null»
			«address.toString()»: LD R«variables.toString()», FALSE
			«increment»
			«nextAddress»
		«ENDIF»
		«IF declarator.vari.expression.logicalExpression.expression != null»
			«generateSimpleLogicalExpression(declarator.vari.expression.logicalExpression.expression, "")»
		«ELSEIF declarator.vari.expression.aux.logicExp != null»
			«generateSimpleLogicalExpression(declarator.vari.expression.aux.logicExp, declarator.vari.expression.aux.logicOp)»
		«ENDIF»
		«address.toString()»: ST «declarator.nameVariable», R«new Integer(variables-1).toString()»
		«nextAddress»
		
	'''
	
	def generateSimpleLogical(Expression declarator) '''
		«IF declarator.logicalExpression != null && declarator.logicalExpression.^true != null»
			«address.toString()»: LD R«variables.toString()», TRUE
			«increment»
			«nextAddress»			
		«ELSEIF declarator.logicalExpression != null && declarator.logicalExpression.^false != null»
			«address.toString()»: LD R«variables.toString()», FALSE
			«increment»
			«nextAddress»
		«ENDIF»
		«IF declarator.logicalExpression.expression != null»
			«generateSimpleLogicalExpression(declarator.logicalExpression.expression, "")»
		«ELSEIF declarator.aux.logicExp != null»
			«generateSimpleLogicalExpression(declarator.aux.logicExp, declarator.aux.logicOp)»
		«ENDIF»
		«address.toString()»: BRF R«(variables-1).toString()», #EndWHILE
		«nextAddress»
		
		
	'''

	def generateSimpleLogicalExpression(Expression expression, String op) '''
		«IF expression.logicalExpression != null && expression.logicalExpression.^true != null»
			«IF op.equals("&&")»
				«address.toString()»: AND R«(variables-1).toString()», TRUE
			«ELSE»
				«address.toString()»: OR R«(variables-1).toString()», TRUE
			«ENDIF»			
			«nextAddress»
		«ELSEIF expression.logicalExpression != null && expression.logicalExpression.^false != null»
			«IF op.equals("&&")»
				«address.toString()»: AND R«(variables-1).toString()», FALSE
			«ELSE»
				«address.toString()»: OR R«(variables-1).toString()», FALSE
			«ENDIF»			
			«nextAddress»
		«ENDIF»
		«IF expression.logicalExpression.expression != null»
			«generateSimpleLogicalExpression(expression.logicalExpression.expression, op)»
		«ENDIF»
		«IF expression.aux.logicExp != null»
			«generateSimpleLogicalExpression(expression.aux.logicExp, expression.aux.logicOp)»
		«ENDIF»
	'''

	def generateIntLiteral(Variable_declarator declarator) '''
		«address.toString()»: LD R«variables.toString()», #«declarator.vari.expression.literalExpression.exp1»
		«increment»
		«nextAddress»
		«address.toString()»: LD R«variables.toString()», #«declarator.vari.expression.aux.exp2.literalExpression.exp1»
		«increment»
		«nextAddress»
		«IF declarator.vari.expression.aux.numericSign.equals("+")»
			«address.toString()»: ADD R«new Integer(variables-2).toString()», R«new Integer(variables-1).toString()» , R«new Integer(variables-2).toString()»
			«nextAddress»
		«ELSEIF declarator.vari.expression.aux.numericSign.equals("*")»
			«address.toString()»: MUL R«new Integer(variables-2).toString()», R«new Integer(variables-1).toString()» , R«new Integer(variables-2).toString()»
			«nextAddress»
		«ELSEIF declarator.vari.expression.aux.numericSign.equals("/")»
			«address.toString()»: DIV R«new Integer(variables-2).toString()», R«new Integer(variables-1).toString()» , R«new Integer(variables-2).toString()»
			«nextAddress»
		«ELSEIF declarator.vari.expression.aux.numericSign.equals("-")»
			«address.toString()»: SUB R«new Integer(variables-2).toString()», R«new Integer(variables-1).toString()» , R«new Integer(variables-2).toString()»
			«nextAddress»
		«ENDIF»
		«address.toString()»: ST «declarator.nameVariable», R«new Integer(variables-2).toString()»
		«nextAddress»
		«increment»
	'''

	def generateIntLiteralExpression(Expression expression) '''
		«address.toString()»: LD R«variables.toString()», #«expression.literalExpression.exp1»
		«increment»
		«nextAddress»
		«address.toString()»: LD R«variables.toString()», #«expression.aux.exp2.literalExpression.exp1»
		«increment»
		«nextAddress»
		«IF expression.aux.numericSign.equals("+")»
			«address.toString()»: ADD R«new Integer(variables-2).toString()», R«new Integer(variables-1).toString()» , R«new Integer(variables-2).toString()»
			«nextAddress»
		«ELSEIF expression.aux.numericSign.equals("*")»
			«address.toString()»: MUL R«new Integer(variables-2).toString()», R«new Integer(variables-1).toString()» , R«new Integer(variables-2).toString()»
			«nextAddress»
		«ELSEIF expression.aux.numericSign.equals("/")»
			«address.toString()»: DIV R«new Integer(variables-2).toString()», R«new Integer(variables-1).toString()» , R«new Integer(variables-2).toString()»
			«nextAddress»
		«ELSEIF expression.aux.numericSign.equals("-")»
			«address.toString()»: SUB R«new Integer(variables-2).toString()», R«new Integer(variables-1).toString()» , R«new Integer(variables-2).toString()»
			«nextAddress»
		«ENDIF»
		«increment»
	'''

	def generateTesting(Variable_declarator declarator) '''
		«address.toString()»: LD R«variables.toString()», #«declarator.vari.expression.literalExpression.exp1»
		«increment»
		«nextAddress»
		«address.toString()»: LD R«variables.toString()», #«declarator.vari.expression.aux.exp1.literalExpression.exp1»
		«increment»
		«nextAddress»
		«IF declarator.vari.expression.aux.testingSign.equals("<")»
			«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
			«nextAddress»
			«increment»
			«address.toString()»: BGTZ R«new Integer(variables).toString()», «address+24»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», FALSE
			«nextAddress»
			«address.toString()»: BR «address + 16»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», TRUE
			«nextAddress»
		«ELSEIF declarator.vari.expression.aux.testingSign.equals(">")»
			«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
			«nextAddress»
			«increment»
			«address.toString()»: BGTZ R«new Integer(variables).toString()», «address+24»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», TRUE
			«nextAddress»
			«address.toString()»: BR «address + 16»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», FALSE
			«nextAddress»
		«ELSEIF declarator.vari.expression.aux.testingSign.equals(">=")»
			«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
			«nextAddress»
			«increment»
			«address.toString()»: BGEZ R«new Integer(variables).toString()», «address+24»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», TRUE
			«nextAddress»
			«address.toString()»: BR «address + 16»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», FALSE
			«nextAddress»
		«ELSEIF declarator.vari.expression.aux.testingSign.equals("<=")»
			«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
			«nextAddress»
			«increment»
			«address.toString()»: BGEZ R«new Integer(variables).toString()», «address+24»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», FALSE
			«nextAddress»
			«address.toString()»: BR «address + 16»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», TRUE
			«nextAddress»
		«ELSEIF declarator.vari.expression.aux.testingSign.equals("==")»
			«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
			«nextAddress»
			«increment»
			«address.toString()»: CMP R«new Integer(variables).toString()», «address+24»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», FALSE
			«nextAddress»
			«address.toString()»: BR «address + 16»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», TRUE
			«nextAddress»
		«ELSEIF declarator.vari.expression.aux.testingSign.equals("!=")»
			«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
			«nextAddress»
			«increment»
			«address.toString()»: CMP R«new Integer(variables).toString()», «address+24»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», TRUE
			«nextAddress»
			«address.toString()»: BR «address + 16»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», FALSE
			«nextAddress»
		«ENDIF»
		«address.toString()»: ST «declarator.nameVariable», R«new Integer(variables-2).toString()»
		«nextAddress»
	'''

	def generateTestingExpression(Expression expression) '''
		«address.toString()»: LD R«variables.toString()», #«expression.literalExpression.exp1»
		«increment»
		«nextAddress»
		«address.toString()»: LD R«variables.toString()», #«expression.aux.exp1.literalExpression.exp1»
		«increment»
		«nextAddress»
		«IF expression.aux.testingSign.equals("<")»
			«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
			«nextAddress»
			«increment»
			«address.toString()»: BGTZ R«new Integer(variables).toString()», «address+24»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», FALSE
			«nextAddress»
			«address.toString()»: BR «address + 16»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», TRUE
			«nextAddress»
		«ELSEIF expression.aux.testingSign.equals(">")»
			«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
			«nextAddress»
			«increment»
			«address.toString()»: BGTZ R«new Integer(variables).toString()», «address+24»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», TRUE
			«nextAddress»
			«address.toString()»: BR «address + 16»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», FALSE
			«nextAddress»
		«ELSEIF expression.aux.testingSign.equals(">=")»
			«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
			«nextAddress»
			«increment»
			«address.toString()»: BGEZ R«new Integer(variables).toString()», «address+24»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», TRUE
			«nextAddress»
			«address.toString()»: BR «address + 16»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», FALSE
			«nextAddress»
		«ELSEIF expression.aux.testingSign.equals("<=")»
			«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
			«nextAddress»
			«increment»
			«address.toString()»: BGEZ R«new Integer(variables).toString()», «address+24»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», FALSE
			«nextAddress»
			«address.toString()»: BR «address + 16»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», TRUE
			«nextAddress»
		«ELSEIF expression.aux.testingSign.equals("==")»
			«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
			«nextAddress»
			«increment»
			«address.toString()»: CMP R«new Integer(variables).toString()», «address+24»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», FALSE
			«nextAddress»
			«address.toString()»: BR «address + 16»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», TRUE
			«nextAddress»
		«ELSEIF expression.aux.testingSign.equals("!=")»
			«address.toString()»: SUB R«new Integer(variables).toString()», R«new Integer(variables-2).toString()» , R«new Integer(variables-1).toString()»
			«nextAddress»
			«increment»
			«address.toString()»: CMP R«new Integer(variables).toString()», «address+24»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», TRUE
			«nextAddress»
			«address.toString()»: BR «address + 16»
			«nextAddress»
			«address.toString()»: LD R«new Integer(variables-2).toString()», FALSE
			«nextAddress»
		«ENDIF»
	'''

}
