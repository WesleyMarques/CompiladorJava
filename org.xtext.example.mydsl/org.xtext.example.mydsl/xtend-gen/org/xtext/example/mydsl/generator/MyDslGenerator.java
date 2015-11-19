package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl.myDsl.Class_declaration;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.Expression_aux;
import org.xtext.example.mydsl.myDsl.Field_declaration;
import org.xtext.example.mydsl.myDsl.Interface_declaration;
import org.xtext.example.mydsl.myDsl.Literal_Expression;
import org.xtext.example.mydsl.myDsl.Logical_Expression_NR;
import org.xtext.example.mydsl.myDsl.Method_declaration;
import org.xtext.example.mydsl.myDsl.Numeric_Expression_NR;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.Statement_block;
import org.xtext.example.mydsl.myDsl.Variable_declaration;
import org.xtext.example.mydsl.myDsl.Variable_declarator;
import org.xtext.example.mydsl.myDsl.Variable_initializer;
import org.xtext.example.mydsl.myDsl.While_Statement;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator implements IGenerator {
  private Integer variables = Integer.valueOf(1);
  
  private Integer address = Integer.valueOf(0);
  
  private Integer labelIndex = Integer.valueOf(0);
  
  private String Labels = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    this.variables = Integer.valueOf(1);
    this.address = Integer.valueOf(0);
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Class_declaration> _filter = Iterables.<Class_declaration>filter(_iterable, Class_declaration.class);
    for (final Class_declaration e : _filter) {
      String _className = e.getClassName();
      String _string = _className.toString();
      String _plus = (_string + ".txt");
      CharSequence _compileClass = this.compileClass(e);
      fsa.generateFile(_plus, _compileClass);
    }
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
    Iterable<Interface_declaration> _filter_1 = Iterables.<Interface_declaration>filter(_iterable_1, Interface_declaration.class);
    for (final Interface_declaration e_1 : _filter_1) {
      String _interfaceName = e_1.getInterfaceName();
      String _string_1 = _interfaceName.toString();
      String _plus_1 = (_string_1 + ".txt");
      CharSequence _compileInterface = this.compileInterface(e_1);
      fsa.generateFile(_plus_1, _compileInterface);
    }
  }
  
  public CharSequence compileClass(final Class_declaration cd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.address, "");
    _builder.append(": LD SP, 1000");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    {
      EList<Field_declaration> _fieldsDeclaration = cd.getFieldsDeclaration();
      for(final Field_declaration f : _fieldsDeclaration) {
        CharSequence _compileField = this.compileField(f);
        _builder.append(_compileField, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compileInterface(final Interface_declaration cd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.address, "");
    _builder.append("LD SP, 1000");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    {
      EList<Field_declaration> _fieldsDeclaration = cd.getFieldsDeclaration();
      for(final Field_declaration f : _fieldsDeclaration) {
      }
    }
    return _builder;
  }
  
  public CharSequence compileField(final Field_declaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Variable_declaration _variableDeclaration = declaration.getVariableDeclaration();
      if ((_variableDeclaration instanceof Variable_declaration)) {
        Variable_declaration _variableDeclaration_1 = declaration.getVariableDeclaration();
        CharSequence _compileVariable = this.compileVariable(((Variable_declaration) _variableDeclaration_1));
        _builder.append(_compileVariable, "");
        _builder.newLineIfNotEmpty();
      } else {
        Method_declaration _methodName = declaration.getMethodName();
        if ((_methodName instanceof Method_declaration)) {
          Method_declaration _methodName_1 = declaration.getMethodName();
          CharSequence _compileMethod = this.compileMethod(((Method_declaration) _methodName_1));
          _builder.append(_compileMethod, "");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compileMethod(final Method_declaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Statement_block _statementMethod = declaration.getStatementMethod();
      boolean _notEquals = (!Objects.equal(_statementMethod, null));
      if (_notEquals) {
        String _nameMethod = declaration.getNameMethod();
        _builder.append(_nameMethod, "");
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        Statement_block _statementMethod_1 = declaration.getStatementMethod();
        CharSequence _compileStatementBlock = this.compileStatementBlock(_statementMethod_1);
        _builder.append(_compileStatementBlock, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileStatementBlock(final Statement_block block) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Statement> _statments = block.getStatments();
      boolean _notEquals = (!Objects.equal(_statments, null));
      if (_notEquals) {
        EList<Statement> _statments_1 = block.getStatments();
        CharSequence _compileStatements = this.compileStatements(_statments_1);
        _builder.append(_compileStatements, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compileStatements(final EList<Statement> listStatements) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Statement actualStatment : listStatements) {
        CharSequence _compileStatement = this.compileStatement(actualStatment);
        _builder.append(_compileStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compileStatement(final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Variable_declaration _variableDeclaration = statement.getVariableDeclaration();
      boolean _notEquals = (!Objects.equal(_variableDeclaration, null));
      if (_notEquals) {
        Variable_declaration _variableDeclaration_1 = statement.getVariableDeclaration();
        CharSequence _compileVariable = this.compileVariable(_variableDeclaration_1);
        _builder.append(_compileVariable, "");
        _builder.newLineIfNotEmpty();
      } else {
        boolean _and = false;
        Variable_declaration _variableDeclaration_2 = statement.getVariableDeclaration();
        boolean _notEquals_1 = (!Objects.equal(_variableDeclaration_2, null));
        if (!_notEquals_1) {
          _and = false;
        } else {
          Variable_declaration _variableDeclaration_3 = statement.getVariableDeclaration();
          Variable_declarator _nameVariable = _variableDeclaration_3.getNameVariable();
          boolean _notEquals_2 = (!Objects.equal(_nameVariable, null));
          _and = _notEquals_2;
        }
        if (_and) {
          Variable_declaration _variableDeclaration_4 = statement.getVariableDeclaration();
          Variable_declarator _nameVariable_1 = _variableDeclaration_4.getNameVariable();
          CharSequence _compileDeclarator = this.compileDeclarator(_nameVariable_1);
          _builder.append(_compileDeclarator, "");
          _builder.newLineIfNotEmpty();
        } else {
          While_Statement _whileStatement = statement.getWhileStatement();
          boolean _notEquals_3 = (!Objects.equal(_whileStatement, null));
          if (_notEquals_3) {
            While_Statement _whileStatement_1 = statement.getWhileStatement();
            CharSequence _compileWhileStatement = this.compileWhileStatement(_whileStatement_1);
            _builder.append(_compileWhileStatement, "");
            _builder.newLineIfNotEmpty();
          } else {
            String _ret = statement.getRet();
            boolean _notEquals_4 = (!Objects.equal(_ret, null));
            if (_notEquals_4) {
              String _ret_1 = statement.getRet();
              CharSequence _compileReturnStatement = this.compileReturnStatement(_ret_1);
              _builder.append(_compileReturnStatement, "");
              _builder.newLineIfNotEmpty();
            } else {
              boolean _and_1 = false;
              EList<Expression> _expressionStatement = statement.getExpressionStatement();
              boolean _notEquals_5 = (!Objects.equal(_expressionStatement, null));
              if (!_notEquals_5) {
                _and_1 = false;
              } else {
                EList<Expression> _expressionStatement_1 = statement.getExpressionStatement();
                int _size = _expressionStatement_1.size();
                boolean _greaterThan = (_size > 0);
                _and_1 = _greaterThan;
              }
              if (_and_1) {
                {
                  EList<Expression> _expressionStatement_2 = statement.getExpressionStatement();
                  for(final Expression exp : _expressionStatement_2) {
                    CharSequence _compileExpression = this.compileExpression(exp);
                    _builder.append(_compileExpression, "");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                Statement_block _statementBlock = statement.getStatementBlock();
                boolean _notEquals_6 = (!Objects.equal(_statementBlock, null));
                if (_notEquals_6) {
                  Statement_block _statementBlock_1 = statement.getStatementBlock();
                  Object _compileStatementBlock = this.compileStatementBlock(_statementBlock_1);
                  _builder.append(_compileStatementBlock, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compileReturnStatement(final String statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.address, "");
    _builder.append(": BR *0(SP)");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileWhileStatement(final While_Statement whileStatement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#StartWHILE:");
    _builder.newLine();
    {
      Expression _expression = whileStatement.getExpression();
      boolean _notEquals = (!Objects.equal(_expression, null));
      if (_notEquals) {
        Expression _expression_1 = whileStatement.getExpression();
        CharSequence _generateSimpleLogical = this.generateSimpleLogical(_expression_1);
        _builder.append(_generateSimpleLogical, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Statement _whileStatement = whileStatement.getWhileStatement();
      boolean _notEquals_1 = (!Objects.equal(_whileStatement, null));
      if (_notEquals_1) {
        Statement _whileStatement_1 = whileStatement.getWhileStatement();
        Object _compileStatement = this.compileStatement(_whileStatement_1);
        _builder.append(_compileStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("#EndWHILE:");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileExpression(final Expression expression) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Literal_Expression _literalExpression = expression.getLiteralExpression();
      boolean _notEquals = (!Objects.equal(_literalExpression, null));
      if (_notEquals) {
        {
          boolean _and = false;
          Expression_aux _aux = expression.getAux();
          Expression_aux _aux_1 = _aux.getAux();
          boolean _equals = Objects.equal(_aux_1, null);
          if (!_equals) {
            _and = false;
          } else {
            Expression_aux _aux_2 = expression.getAux();
            Expression _exp1 = _aux_2.getExp1();
            boolean _equals_1 = Objects.equal(_exp1, null);
            _and = _equals_1;
          }
          if (_and) {
            {
              Literal_Expression _literalExpression_1 = expression.getLiteralExpression();
              String _string = _literalExpression_1.getString();
              boolean _notEquals_1 = (!Objects.equal(_string, null));
              if (_notEquals_1) {
                CharSequence _generateStringExpression = this.generateStringExpression(expression);
                _builder.append(_generateStringExpression, "");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            {
              Expression_aux _aux_3 = expression.getAux();
              String _testingSign = _aux_3.getTestingSign();
              boolean _notEquals_2 = (!Objects.equal(_testingSign, null));
              if (_notEquals_2) {
                CharSequence _generateTestingExpression = this.generateTestingExpression(expression);
                _builder.append(_generateTestingExpression, "");
                _builder.newLineIfNotEmpty();
              } else {
                CharSequence _generateIntLiteralExpression = this.generateIntLiteralExpression(expression);
                _builder.append(_generateIntLiteralExpression, "");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      } else {
        Logical_Expression_NR _logicalExpression = expression.getLogicalExpression();
        boolean _notEquals_3 = (!Objects.equal(_logicalExpression, null));
        if (_notEquals_3) {
          CharSequence _generateSimpleLogicalExpression = this.generateSimpleLogicalExpression(expression, "");
          _builder.append(_generateSimpleLogicalExpression, "");
          _builder.newLineIfNotEmpty();
        } else {
          Numeric_Expression_NR _numericExpression3 = expression.getNumericExpression3();
          boolean _notEquals_4 = (!Objects.equal(_numericExpression3, null));
          if (_notEquals_4) {
            CharSequence _generateNumericExpression = this.generateNumericExpression(expression);
            _builder.append(_generateNumericExpression, "");
            _builder.newLineIfNotEmpty();
          } else {
            String _name = expression.getName();
            boolean _notEquals_5 = (!Objects.equal(_name, null));
            if (_notEquals_5) {
              {
                Expression_aux _aux_4 = expression.getAux();
                boolean _notEquals_6 = (!Objects.equal(_aux_4, null));
                if (_notEquals_6) {
                  String _string_1 = this.address.toString();
                  _builder.append(_string_1, "");
                  _builder.append(": ADD SP, SP, #methodSize");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  String _string_2 = this.address.toString();
                  _builder.append(_string_2, "");
                  _builder.append(": ST *SP, ");
                  _builder.append(((this.address).intValue() + 16), "");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  _builder.append(this.address, "");
                  _builder.append(": BR ");
                  String _name_1 = expression.getName();
                  _builder.append(_name_1, "");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  String _string_3 = this.address.toString();
                  _builder.append(_string_3, "");
                  _builder.append(": SUB SP, SP, #methodSize");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                } else {
                  String _string_4 = this.address.toString();
                  _builder.append(_string_4, "");
                  _builder.append(": LD R");
                  String _string_5 = this.variables.toString();
                  _builder.append(_string_5, "");
                  _builder.append(", *");
                  String _name_2 = expression.getName();
                  _builder.append(_name_2, "");
                  _builder.newLineIfNotEmpty();
                  this.increment();
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  {
                    Expression_aux _aux_5 = expression.getAux();
                    String _sgin = _aux_5.getSgin();
                    boolean _notEquals_7 = (!Objects.equal(_sgin, null));
                    if (_notEquals_7) {
                      {
                        Expression_aux _aux_6 = expression.getAux();
                        String _sgin_1 = _aux_6.getSgin();
                        boolean _equals_2 = _sgin_1.equals("++");
                        if (_equals_2) {
                          String _string_6 = this.address.toString();
                          _builder.append(_string_6, "");
                          _builder.append(": ADD R");
                          String _string_7 = this.variables.toString();
                          _builder.append(_string_7, "");
                          _builder.append(", #1");
                          _builder.newLineIfNotEmpty();
                          this.nextAddress();
                          _builder.newLineIfNotEmpty();
                        } else {
                          String _string_8 = this.address.toString();
                          _builder.append(_string_8, "");
                          _builder.append(": SUB R");
                          String _string_9 = this.variables.toString();
                          _builder.append(_string_9, "");
                          _builder.append(", #1");
                          _builder.newLineIfNotEmpty();
                          this.nextAddress();
                          _builder.newLineIfNotEmpty();
                        }
                      }
                      String _string_10 = this.address.toString();
                      _builder.append(_string_10, "");
                      _builder.append(": ST ");
                      String _name_3 = expression.getName();
                      _builder.append(_name_3, "");
                      _builder.append(", R");
                      String _string_11 = this.variables.toString();
                      _builder.append(_string_11, "");
                      _builder.newLineIfNotEmpty();
                      this.nextAddress();
                      _builder.newLineIfNotEmpty();
                    } else {
                      String _string_12 = this.address.toString();
                      _builder.append(_string_12, "");
                      _builder.append(": LD R");
                      String _string_13 = this.variables.toString();
                      _builder.append(_string_13, "");
                      _builder.append(", #");
                      Expression_aux _aux_7 = expression.getAux();
                      Expression _exp1_1 = _aux_7.getExp1();
                      Literal_Expression _literalExpression_2 = _exp1_1.getLiteralExpression();
                      int _exp1_2 = _literalExpression_2.getExp1();
                      _builder.append(_exp1_2, "");
                      _builder.newLineIfNotEmpty();
                      this.increment();
                      _builder.newLineIfNotEmpty();
                      this.nextAddress();
                      _builder.newLineIfNotEmpty();
                      {
                        Expression_aux _aux_8 = expression.getAux();
                        String _testingSign_1 = _aux_8.getTestingSign();
                        boolean _equals_3 = _testingSign_1.equals("<");
                        if (_equals_3) {
                          String _string_14 = this.address.toString();
                          _builder.append(_string_14, "");
                          _builder.append(": SUB R");
                          Integer _integer = new Integer((this.variables).intValue());
                          String _string_15 = _integer.toString();
                          _builder.append(_string_15, "");
                          _builder.append(", R");
                          Integer _integer_1 = new Integer(((this.variables).intValue() - 2));
                          String _string_16 = _integer_1.toString();
                          _builder.append(_string_16, "");
                          _builder.append(" , R");
                          Integer _integer_2 = new Integer(((this.variables).intValue() - 1));
                          String _string_17 = _integer_2.toString();
                          _builder.append(_string_17, "");
                          _builder.newLineIfNotEmpty();
                          this.nextAddress();
                          _builder.newLineIfNotEmpty();
                          String _string_18 = this.address.toString();
                          _builder.append(_string_18, "");
                          _builder.append(": BGTZ R");
                          Integer _integer_3 = new Integer((this.variables).intValue());
                          String _string_19 = _integer_3.toString();
                          _builder.append(_string_19, "");
                          _builder.append(", #ENDWHILE");
                          _builder.newLineIfNotEmpty();
                          this.nextAddress();
                          _builder.newLineIfNotEmpty();
                        } else {
                          Expression_aux _aux_9 = expression.getAux();
                          String _testingSign_2 = _aux_9.getTestingSign();
                          boolean _equals_4 = _testingSign_2.equals(">");
                          if (_equals_4) {
                            String _string_20 = this.address.toString();
                            _builder.append(_string_20, "");
                            _builder.append(": SUB R");
                            Integer _integer_4 = new Integer((this.variables).intValue());
                            String _string_21 = _integer_4.toString();
                            _builder.append(_string_21, "");
                            _builder.append(", R");
                            Integer _integer_5 = new Integer(((this.variables).intValue() - 2));
                            String _string_22 = _integer_5.toString();
                            _builder.append(_string_22, "");
                            _builder.append(" , R");
                            Integer _integer_6 = new Integer(((this.variables).intValue() - 1));
                            String _string_23 = _integer_6.toString();
                            _builder.append(_string_23, "");
                            _builder.newLineIfNotEmpty();
                            this.nextAddress();
                            _builder.newLineIfNotEmpty();
                            String _string_24 = this.address.toString();
                            _builder.append(_string_24, "");
                            _builder.append(": BGTZ R");
                            Integer _integer_7 = new Integer((this.variables).intValue());
                            String _string_25 = _integer_7.toString();
                            _builder.append(_string_25, "");
                            _builder.append(", #ENDWHILE");
                            _builder.newLineIfNotEmpty();
                            this.nextAddress();
                            _builder.newLineIfNotEmpty();
                          } else {
                            Expression_aux _aux_10 = expression.getAux();
                            String _testingSign_3 = _aux_10.getTestingSign();
                            boolean _equals_5 = _testingSign_3.equals(">=");
                            if (_equals_5) {
                              String _string_26 = this.address.toString();
                              _builder.append(_string_26, "");
                              _builder.append(": SUB R");
                              Integer _integer_8 = new Integer((this.variables).intValue());
                              String _string_27 = _integer_8.toString();
                              _builder.append(_string_27, "");
                              _builder.append(", R");
                              Integer _integer_9 = new Integer(((this.variables).intValue() - 2));
                              String _string_28 = _integer_9.toString();
                              _builder.append(_string_28, "");
                              _builder.append(" , R");
                              Integer _integer_10 = new Integer(((this.variables).intValue() - 1));
                              String _string_29 = _integer_10.toString();
                              _builder.append(_string_29, "");
                              _builder.newLineIfNotEmpty();
                              this.nextAddress();
                              _builder.newLineIfNotEmpty();
                              String _string_30 = this.address.toString();
                              _builder.append(_string_30, "");
                              _builder.append(": BGEZ R");
                              Integer _integer_11 = new Integer((this.variables).intValue());
                              String _string_31 = _integer_11.toString();
                              _builder.append(_string_31, "");
                              _builder.append(", #ENDWHILE");
                              _builder.newLineIfNotEmpty();
                              this.nextAddress();
                              _builder.newLineIfNotEmpty();
                            } else {
                              Expression_aux _aux_11 = expression.getAux();
                              String _testingSign_4 = _aux_11.getTestingSign();
                              boolean _equals_6 = _testingSign_4.equals("<=");
                              if (_equals_6) {
                                String _string_32 = this.address.toString();
                                _builder.append(_string_32, "");
                                _builder.append(": SUB R");
                                Integer _integer_12 = new Integer((this.variables).intValue());
                                String _string_33 = _integer_12.toString();
                                _builder.append(_string_33, "");
                                _builder.append(", R");
                                Integer _integer_13 = new Integer(((this.variables).intValue() - 2));
                                String _string_34 = _integer_13.toString();
                                _builder.append(_string_34, "");
                                _builder.append(" , R");
                                Integer _integer_14 = new Integer(((this.variables).intValue() - 1));
                                String _string_35 = _integer_14.toString();
                                _builder.append(_string_35, "");
                                _builder.newLineIfNotEmpty();
                                this.nextAddress();
                                _builder.newLineIfNotEmpty();
                                String _string_36 = this.address.toString();
                                _builder.append(_string_36, "");
                                _builder.append(": BGEZ R");
                                Integer _integer_15 = new Integer((this.variables).intValue());
                                String _string_37 = _integer_15.toString();
                                _builder.append(_string_37, "");
                                _builder.append(", #ENDWHILE");
                                _builder.newLineIfNotEmpty();
                                this.nextAddress();
                                _builder.newLineIfNotEmpty();
                              } else {
                                Expression_aux _aux_12 = expression.getAux();
                                String _testingSign_5 = _aux_12.getTestingSign();
                                boolean _equals_7 = _testingSign_5.equals("==");
                                if (_equals_7) {
                                  String _string_38 = this.address.toString();
                                  _builder.append(_string_38, "");
                                  _builder.append(": SUB R");
                                  Integer _integer_16 = new Integer((this.variables).intValue());
                                  String _string_39 = _integer_16.toString();
                                  _builder.append(_string_39, "");
                                  _builder.append(", R");
                                  Integer _integer_17 = new Integer(((this.variables).intValue() - 2));
                                  String _string_40 = _integer_17.toString();
                                  _builder.append(_string_40, "");
                                  _builder.append(" , R");
                                  Integer _integer_18 = new Integer(((this.variables).intValue() - 1));
                                  String _string_41 = _integer_18.toString();
                                  _builder.append(_string_41, "");
                                  _builder.newLineIfNotEmpty();
                                  this.nextAddress();
                                  _builder.newLineIfNotEmpty();
                                  this.increment();
                                  _builder.newLineIfNotEmpty();
                                  String _string_42 = this.address.toString();
                                  _builder.append(_string_42, "");
                                  _builder.append(": CMP R");
                                  Integer _integer_19 = new Integer((this.variables).intValue());
                                  String _string_43 = _integer_19.toString();
                                  _builder.append(_string_43, "");
                                  _builder.append(", #ENDWHILE");
                                  _builder.newLineIfNotEmpty();
                                  this.nextAddress();
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  Expression_aux _aux_13 = expression.getAux();
                                  String _testingSign_6 = _aux_13.getTestingSign();
                                  boolean _equals_8 = _testingSign_6.equals("!=");
                                  if (_equals_8) {
                                    String _string_44 = this.address.toString();
                                    _builder.append(_string_44, "");
                                    _builder.append(": SUB R");
                                    Integer _integer_20 = new Integer((this.variables).intValue());
                                    String _string_45 = _integer_20.toString();
                                    _builder.append(_string_45, "");
                                    _builder.append(", R");
                                    Integer _integer_21 = new Integer(((this.variables).intValue() - 2));
                                    String _string_46 = _integer_21.toString();
                                    _builder.append(_string_46, "");
                                    _builder.append(" , R");
                                    Integer _integer_22 = new Integer(((this.variables).intValue() - 1));
                                    String _string_47 = _integer_22.toString();
                                    _builder.append(_string_47, "");
                                    _builder.newLineIfNotEmpty();
                                    this.nextAddress();
                                    _builder.newLineIfNotEmpty();
                                    this.increment();
                                    _builder.newLineIfNotEmpty();
                                    String _string_48 = this.address.toString();
                                    _builder.append(_string_48, "");
                                    _builder.append(": CMP R");
                                    Integer _integer_23 = new Integer((this.variables).intValue());
                                    String _string_49 = _integer_23.toString();
                                    _builder.append(_string_49, "");
                                    _builder.append(", #ENDWHILE");
                                    _builder.newLineIfNotEmpty();
                                    this.nextAddress();
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence generateNumericExpression(final Expression expression) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Numeric_Expression_NR _numericExpression3 = expression.getNumericExpression3();
      boolean _notEquals = (!Objects.equal(_numericExpression3, null));
      if (_notEquals) {
        String _string = this.address.toString();
        _builder.append(_string, "");
        _builder.append(": LD R");
        String _string_1 = this.variables.toString();
        _builder.append(_string_1, "");
        _builder.append(", ");
        Numeric_Expression_NR _numericExpression3_1 = expression.getNumericExpression3();
        Expression _expression = _numericExpression3_1.getExpression();
        String _name = _expression.getName();
        _builder.append(_name, "");
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
        {
          Numeric_Expression_NR _numericExpression3_2 = expression.getNumericExpression3();
          String _sinal_numeric = _numericExpression3_2.getSinal_numeric();
          boolean _equals = _sinal_numeric.equals("++");
          if (_equals) {
            String _string_2 = this.address.toString();
            _builder.append(_string_2, "");
            _builder.append(": ADD R");
            String _string_3 = this.variables.toString();
            _builder.append(_string_3, "");
            _builder.append(", R");
            String _string_4 = this.variables.toString();
            _builder.append(_string_4, "");
            _builder.append(", #1");
            _builder.newLineIfNotEmpty();
            this.nextAddress();
            _builder.newLineIfNotEmpty();
          } else {
            Numeric_Expression_NR _numericExpression3_3 = expression.getNumericExpression3();
            String _sinal_numeric_1 = _numericExpression3_3.getSinal_numeric();
            boolean _equals_1 = _sinal_numeric_1.equals("--");
            if (_equals_1) {
              String _string_5 = this.address.toString();
              _builder.append(_string_5, "");
              _builder.append(": SUB R");
              String _string_6 = this.variables.toString();
              _builder.append(_string_6, "");
              _builder.append(", R");
              String _string_7 = this.variables.toString();
              _builder.append(_string_7, "");
              _builder.append(", #1");
              _builder.newLineIfNotEmpty();
              this.nextAddress();
              _builder.newLineIfNotEmpty();
            }
          }
        }
        this.increment();
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compileVariable(final Variable_declaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Variable_declarator _nameVariable = declaration.getNameVariable();
      boolean _notEquals = (!Objects.equal(_nameVariable, null));
      if (_notEquals) {
        Variable_declarator _nameVariable_1 = declaration.getNameVariable();
        CharSequence _compileDeclarator = this.compileDeclarator(_nameVariable_1);
        _builder.append(_compileDeclarator, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileDeclarator(final Variable_declarator declarator) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Variable_initializer _vari = declarator.getVari();
      boolean _notEquals = (!Objects.equal(_vari, null));
      if (_notEquals) {
        {
          Variable_initializer _vari_1 = declarator.getVari();
          Expression _expression = _vari_1.getExpression();
          Literal_Expression _literalExpression = _expression.getLiteralExpression();
          boolean _notEquals_1 = (!Objects.equal(_literalExpression, null));
          if (_notEquals_1) {
            {
              boolean _and = false;
              Variable_initializer _vari_2 = declarator.getVari();
              Expression _expression_1 = _vari_2.getExpression();
              Expression_aux _aux = _expression_1.getAux();
              Expression_aux _aux_1 = _aux.getAux();
              boolean _equals = Objects.equal(_aux_1, null);
              if (!_equals) {
                _and = false;
              } else {
                Variable_initializer _vari_3 = declarator.getVari();
                Expression _expression_2 = _vari_3.getExpression();
                Expression_aux _aux_2 = _expression_2.getAux();
                Expression _exp1 = _aux_2.getExp1();
                boolean _equals_1 = Objects.equal(_exp1, null);
                _and = _equals_1;
              }
              if (_and) {
                {
                  Variable_initializer _vari_4 = declarator.getVari();
                  Expression _expression_3 = _vari_4.getExpression();
                  Literal_Expression _literalExpression_1 = _expression_3.getLiteralExpression();
                  String _string = _literalExpression_1.getString();
                  boolean _notEquals_2 = (!Objects.equal(_string, null));
                  if (_notEquals_2) {
                    CharSequence _generateString = this.generateString(declarator);
                    _builder.append(_generateString, "");
                    _builder.newLineIfNotEmpty();
                  } else {
                    String _string_1 = this.address.toString();
                    _builder.append(_string_1, "");
                    _builder.append(": ST ");
                    String _nameVariable = declarator.getNameVariable();
                    _builder.append(_nameVariable, "");
                    _builder.append(", #");
                    Variable_initializer _vari_5 = declarator.getVari();
                    Expression _expression_4 = _vari_5.getExpression();
                    Literal_Expression _literalExpression_2 = _expression_4.getLiteralExpression();
                    int _exp1_1 = _literalExpression_2.getExp1();
                    _builder.append(_exp1_1, "");
                    _builder.newLineIfNotEmpty();
                    this.nextAddress();
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                {
                  Variable_initializer _vari_6 = declarator.getVari();
                  Expression _expression_5 = _vari_6.getExpression();
                  Expression_aux _aux_3 = _expression_5.getAux();
                  String _testingSign = _aux_3.getTestingSign();
                  boolean _notEquals_3 = (!Objects.equal(_testingSign, null));
                  if (_notEquals_3) {
                    CharSequence _generateTesting = this.generateTesting(declarator);
                    _builder.append(_generateTesting, "");
                    _builder.newLineIfNotEmpty();
                  } else {
                    CharSequence _generateIntLiteral = this.generateIntLiteral(declarator);
                    _builder.append(_generateIntLiteral, "");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          } else {
            Variable_initializer _vari_7 = declarator.getVari();
            Expression _expression_6 = _vari_7.getExpression();
            Logical_Expression_NR _logicalExpression = _expression_6.getLogicalExpression();
            boolean _notEquals_4 = (!Objects.equal(_logicalExpression, null));
            if (_notEquals_4) {
              CharSequence _generateSimpleLogical = this.generateSimpleLogical(declarator);
              _builder.append(_generateSimpleLogical, "");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public void increment() {
    this.variables++;
  }
  
  public void nextAddress() {
    this.address = Integer.valueOf(((this.address).intValue() + 8));
  }
  
  public void nextLabel() {
    this.labelIndex++;
  }
  
  public char getLabel(final int index) {
    return this.Labels.charAt(index);
  }
  
  public CharSequence generateString(final Variable_declarator declarator) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = this.address.toString();
    _builder.append(_string, "");
    _builder.append(": LD R");
    String _string_1 = this.variables.toString();
    _builder.append(_string_1, "");
    _builder.append(", \"");
    Variable_initializer _vari = declarator.getVari();
    Expression _expression = _vari.getExpression();
    Literal_Expression _literalExpression = _expression.getLiteralExpression();
    String _string_2 = _literalExpression.getString();
    _builder.append(_string_2, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    this.increment();
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    String _string_3 = this.address.toString();
    _builder.append(_string_3, "");
    _builder.append(": ST ");
    String _nameVariable = declarator.getNameVariable();
    _builder.append(_nameVariable, "");
    _builder.append(", R");
    Integer _integer = new Integer(((this.variables).intValue() - 1));
    String _string_4 = _integer.toString();
    _builder.append(_string_4, "");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateStringExpression(final Expression expression) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = this.address.toString();
    _builder.append(_string, "");
    _builder.append(": LD R");
    String _string_1 = this.variables.toString();
    _builder.append(_string_1, "");
    _builder.append(", \"");
    Literal_Expression _literalExpression = expression.getLiteralExpression();
    String _string_2 = _literalExpression.getString();
    _builder.append(_string_2, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    this.increment();
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateSimpleLogical(final Variable_declarator declarator) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      Variable_initializer _vari = declarator.getVari();
      Expression _expression = _vari.getExpression();
      Logical_Expression_NR _logicalExpression = _expression.getLogicalExpression();
      boolean _notEquals = (!Objects.equal(_logicalExpression, null));
      if (!_notEquals) {
        _and = false;
      } else {
        Variable_initializer _vari_1 = declarator.getVari();
        Expression _expression_1 = _vari_1.getExpression();
        Logical_Expression_NR _logicalExpression_1 = _expression_1.getLogicalExpression();
        String _true = _logicalExpression_1.getTrue();
        boolean _notEquals_1 = (!Objects.equal(_true, null));
        _and = _notEquals_1;
      }
      if (_and) {
        String _string = this.address.toString();
        _builder.append(_string, "");
        _builder.append(": LD R");
        String _string_1 = this.variables.toString();
        _builder.append(_string_1, "");
        _builder.append(", TRUE");
        _builder.newLineIfNotEmpty();
        this.increment();
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.append("\t\t\t");
        _builder.newLineIfNotEmpty();
      } else {
        boolean _and_1 = false;
        Variable_initializer _vari_2 = declarator.getVari();
        Expression _expression_2 = _vari_2.getExpression();
        Logical_Expression_NR _logicalExpression_2 = _expression_2.getLogicalExpression();
        boolean _notEquals_2 = (!Objects.equal(_logicalExpression_2, null));
        if (!_notEquals_2) {
          _and_1 = false;
        } else {
          Variable_initializer _vari_3 = declarator.getVari();
          Expression _expression_3 = _vari_3.getExpression();
          Logical_Expression_NR _logicalExpression_3 = _expression_3.getLogicalExpression();
          String _false = _logicalExpression_3.getFalse();
          boolean _notEquals_3 = (!Objects.equal(_false, null));
          _and_1 = _notEquals_3;
        }
        if (_and_1) {
          String _string_2 = this.address.toString();
          _builder.append(_string_2, "");
          _builder.append(": LD R");
          String _string_3 = this.variables.toString();
          _builder.append(_string_3, "");
          _builder.append(", FALSE");
          _builder.newLineIfNotEmpty();
          this.increment();
          _builder.newLineIfNotEmpty();
          this.nextAddress();
          _builder.newLineIfNotEmpty();
        }
      }
    }
    {
      Variable_initializer _vari_4 = declarator.getVari();
      Expression _expression_4 = _vari_4.getExpression();
      Logical_Expression_NR _logicalExpression_4 = _expression_4.getLogicalExpression();
      Expression _expression_5 = _logicalExpression_4.getExpression();
      boolean _notEquals_4 = (!Objects.equal(_expression_5, null));
      if (_notEquals_4) {
        Variable_initializer _vari_5 = declarator.getVari();
        Expression _expression_6 = _vari_5.getExpression();
        Logical_Expression_NR _logicalExpression_5 = _expression_6.getLogicalExpression();
        Expression _expression_7 = _logicalExpression_5.getExpression();
        CharSequence _generateSimpleLogicalExpression = this.generateSimpleLogicalExpression(_expression_7, "");
        _builder.append(_generateSimpleLogicalExpression, "");
        _builder.newLineIfNotEmpty();
      } else {
        Variable_initializer _vari_6 = declarator.getVari();
        Expression _expression_8 = _vari_6.getExpression();
        Expression_aux _aux = _expression_8.getAux();
        boolean _notEquals_5 = (!Objects.equal(_aux, null));
        if (_notEquals_5) {
          Variable_initializer _vari_7 = declarator.getVari();
          Expression _expression_9 = _vari_7.getExpression();
          Expression_aux _aux_1 = _expression_9.getAux();
          Expression _logicExp = _aux_1.getLogicExp();
          Variable_initializer _vari_8 = declarator.getVari();
          Expression _expression_10 = _vari_8.getExpression();
          Expression_aux _aux_2 = _expression_10.getAux();
          String _logicOp = _aux_2.getLogicOp();
          CharSequence _generateSimpleLogicalExpression_1 = this.generateSimpleLogicalExpression(_logicExp, _logicOp);
          _builder.append(_generateSimpleLogicalExpression_1, "");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    String _string_4 = this.address.toString();
    _builder.append(_string_4, "");
    _builder.append(": ST ");
    String _nameVariable = declarator.getNameVariable();
    _builder.append(_nameVariable, "");
    _builder.append(", R");
    Integer _integer = new Integer(((this.variables).intValue() - 1));
    String _string_5 = _integer.toString();
    _builder.append(_string_5, "");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateSimpleLogical(final Expression declarator) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      Logical_Expression_NR _logicalExpression = declarator.getLogicalExpression();
      boolean _notEquals = (!Objects.equal(_logicalExpression, null));
      if (!_notEquals) {
        _and = false;
      } else {
        Logical_Expression_NR _logicalExpression_1 = declarator.getLogicalExpression();
        String _true = _logicalExpression_1.getTrue();
        boolean _notEquals_1 = (!Objects.equal(_true, null));
        _and = _notEquals_1;
      }
      if (_and) {
        String _string = this.address.toString();
        _builder.append(_string, "");
        _builder.append(": LD R");
        String _string_1 = this.variables.toString();
        _builder.append(_string_1, "");
        _builder.append(", TRUE");
        _builder.newLineIfNotEmpty();
        this.increment();
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.append("\t\t\t");
        _builder.newLineIfNotEmpty();
      } else {
        boolean _and_1 = false;
        Logical_Expression_NR _logicalExpression_2 = declarator.getLogicalExpression();
        boolean _notEquals_2 = (!Objects.equal(_logicalExpression_2, null));
        if (!_notEquals_2) {
          _and_1 = false;
        } else {
          Logical_Expression_NR _logicalExpression_3 = declarator.getLogicalExpression();
          String _false = _logicalExpression_3.getFalse();
          boolean _notEquals_3 = (!Objects.equal(_false, null));
          _and_1 = _notEquals_3;
        }
        if (_and_1) {
          String _string_2 = this.address.toString();
          _builder.append(_string_2, "");
          _builder.append(": LD R");
          String _string_3 = this.variables.toString();
          _builder.append(_string_3, "");
          _builder.append(", FALSE");
          _builder.newLineIfNotEmpty();
          this.increment();
          _builder.newLineIfNotEmpty();
          this.nextAddress();
          _builder.newLineIfNotEmpty();
        }
      }
    }
    {
      Logical_Expression_NR _logicalExpression_4 = declarator.getLogicalExpression();
      Expression _expression = _logicalExpression_4.getExpression();
      boolean _notEquals_4 = (!Objects.equal(_expression, null));
      if (_notEquals_4) {
        Logical_Expression_NR _logicalExpression_5 = declarator.getLogicalExpression();
        Expression _expression_1 = _logicalExpression_5.getExpression();
        CharSequence _generateSimpleLogicalExpression = this.generateSimpleLogicalExpression(_expression_1, "");
        _builder.append(_generateSimpleLogicalExpression, "");
        _builder.newLineIfNotEmpty();
      } else {
        Expression_aux _aux = declarator.getAux();
        Expression _logicExp = _aux.getLogicExp();
        boolean _notEquals_5 = (!Objects.equal(_logicExp, null));
        if (_notEquals_5) {
          Expression_aux _aux_1 = declarator.getAux();
          Expression _logicExp_1 = _aux_1.getLogicExp();
          Expression_aux _aux_2 = declarator.getAux();
          String _logicOp = _aux_2.getLogicOp();
          CharSequence _generateSimpleLogicalExpression_1 = this.generateSimpleLogicalExpression(_logicExp_1, _logicOp);
          _builder.append(_generateSimpleLogicalExpression_1, "");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    String _string_4 = this.address.toString();
    _builder.append(_string_4, "");
    _builder.append(": BRF R");
    String _string_5 = Integer.valueOf(((this.variables).intValue() - 1)).toString();
    _builder.append(_string_5, "");
    _builder.append(", #");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateSimpleLogicalExpression(final Expression expression, final String op) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      Logical_Expression_NR _logicalExpression = expression.getLogicalExpression();
      boolean _notEquals = (!Objects.equal(_logicalExpression, null));
      if (!_notEquals) {
        _and = false;
      } else {
        Logical_Expression_NR _logicalExpression_1 = expression.getLogicalExpression();
        String _true = _logicalExpression_1.getTrue();
        boolean _notEquals_1 = (!Objects.equal(_true, null));
        _and = _notEquals_1;
      }
      if (_and) {
        {
          boolean _equals = op.equals("&&");
          if (_equals) {
            String _string = this.address.toString();
            _builder.append(_string, "");
            _builder.append(": AND R");
            String _string_1 = Integer.valueOf(((this.variables).intValue() - 1)).toString();
            _builder.append(_string_1, "");
            _builder.append(", TRUE");
            _builder.newLineIfNotEmpty();
          } else {
            String _string_2 = this.address.toString();
            _builder.append(_string_2, "");
            _builder.append(": OR R");
            String _string_3 = Integer.valueOf(((this.variables).intValue() - 1)).toString();
            _builder.append(_string_3, "");
            _builder.append(", TRUE");
            _builder.newLineIfNotEmpty();
          }
        }
        this.nextAddress();
        _builder.newLineIfNotEmpty();
      } else {
        boolean _and_1 = false;
        Logical_Expression_NR _logicalExpression_2 = expression.getLogicalExpression();
        boolean _notEquals_2 = (!Objects.equal(_logicalExpression_2, null));
        if (!_notEquals_2) {
          _and_1 = false;
        } else {
          Logical_Expression_NR _logicalExpression_3 = expression.getLogicalExpression();
          String _false = _logicalExpression_3.getFalse();
          boolean _notEquals_3 = (!Objects.equal(_false, null));
          _and_1 = _notEquals_3;
        }
        if (_and_1) {
          {
            boolean _equals_1 = op.equals("&&");
            if (_equals_1) {
              String _string_4 = this.address.toString();
              _builder.append(_string_4, "");
              _builder.append(": AND R");
              String _string_5 = Integer.valueOf(((this.variables).intValue() - 1)).toString();
              _builder.append(_string_5, "");
              _builder.append(", FALSE");
              _builder.newLineIfNotEmpty();
            } else {
              String _string_6 = this.address.toString();
              _builder.append(_string_6, "");
              _builder.append(": OR R");
              String _string_7 = Integer.valueOf(((this.variables).intValue() - 1)).toString();
              _builder.append(_string_7, "");
              _builder.append(", FALSE");
              _builder.newLineIfNotEmpty();
            }
          }
          this.nextAddress();
          _builder.newLineIfNotEmpty();
        }
      }
    }
    {
      Logical_Expression_NR _logicalExpression_4 = expression.getLogicalExpression();
      Expression _expression = _logicalExpression_4.getExpression();
      boolean _notEquals_4 = (!Objects.equal(_expression, null));
      if (_notEquals_4) {
        Logical_Expression_NR _logicalExpression_5 = expression.getLogicalExpression();
        Expression _expression_1 = _logicalExpression_5.getExpression();
        Object _generateSimpleLogicalExpression = this.generateSimpleLogicalExpression(_expression_1, op);
        _builder.append(_generateSimpleLogicalExpression, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Expression_aux _aux = expression.getAux();
      Expression _logicExp = _aux.getLogicExp();
      boolean _notEquals_5 = (!Objects.equal(_logicExp, null));
      if (_notEquals_5) {
        Expression_aux _aux_1 = expression.getAux();
        Expression _logicExp_1 = _aux_1.getLogicExp();
        Expression_aux _aux_2 = expression.getAux();
        String _logicOp = _aux_2.getLogicOp();
        Object _generateSimpleLogicalExpression_1 = this.generateSimpleLogicalExpression(_logicExp_1, _logicOp);
        _builder.append(_generateSimpleLogicalExpression_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateIntLiteral(final Variable_declarator declarator) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = this.address.toString();
    _builder.append(_string, "");
    _builder.append(": LD R");
    String _string_1 = this.variables.toString();
    _builder.append(_string_1, "");
    _builder.append(", #");
    Variable_initializer _vari = declarator.getVari();
    Expression _expression = _vari.getExpression();
    Literal_Expression _literalExpression = _expression.getLiteralExpression();
    int _exp1 = _literalExpression.getExp1();
    _builder.append(_exp1, "");
    _builder.newLineIfNotEmpty();
    this.increment();
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    String _string_2 = this.address.toString();
    _builder.append(_string_2, "");
    _builder.append(": LD R");
    String _string_3 = this.variables.toString();
    _builder.append(_string_3, "");
    _builder.append(", #");
    Variable_initializer _vari_1 = declarator.getVari();
    Expression _expression_1 = _vari_1.getExpression();
    Expression_aux _aux = _expression_1.getAux();
    Expression _exp2 = _aux.getExp2();
    Literal_Expression _literalExpression_1 = _exp2.getLiteralExpression();
    int _exp1_1 = _literalExpression_1.getExp1();
    _builder.append(_exp1_1, "");
    _builder.newLineIfNotEmpty();
    this.increment();
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    {
      Variable_initializer _vari_2 = declarator.getVari();
      Expression _expression_2 = _vari_2.getExpression();
      Expression_aux _aux_1 = _expression_2.getAux();
      String _numericSign = _aux_1.getNumericSign();
      boolean _equals = _numericSign.equals("+");
      if (_equals) {
        String _string_4 = this.address.toString();
        _builder.append(_string_4, "");
        _builder.append(": ADD R");
        Integer _integer = new Integer(((this.variables).intValue() - 2));
        String _string_5 = _integer.toString();
        _builder.append(_string_5, "");
        _builder.append(", R");
        Integer _integer_1 = new Integer(((this.variables).intValue() - 1));
        String _string_6 = _integer_1.toString();
        _builder.append(_string_6, "");
        _builder.append(" , R");
        Integer _integer_2 = new Integer(((this.variables).intValue() - 2));
        String _string_7 = _integer_2.toString();
        _builder.append(_string_7, "");
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
      } else {
        Variable_initializer _vari_3 = declarator.getVari();
        Expression _expression_3 = _vari_3.getExpression();
        Expression_aux _aux_2 = _expression_3.getAux();
        String _numericSign_1 = _aux_2.getNumericSign();
        boolean _equals_1 = _numericSign_1.equals("*");
        if (_equals_1) {
          String _string_8 = this.address.toString();
          _builder.append(_string_8, "");
          _builder.append(": MUL R");
          Integer _integer_3 = new Integer(((this.variables).intValue() - 2));
          String _string_9 = _integer_3.toString();
          _builder.append(_string_9, "");
          _builder.append(", R");
          Integer _integer_4 = new Integer(((this.variables).intValue() - 1));
          String _string_10 = _integer_4.toString();
          _builder.append(_string_10, "");
          _builder.append(" , R");
          Integer _integer_5 = new Integer(((this.variables).intValue() - 2));
          String _string_11 = _integer_5.toString();
          _builder.append(_string_11, "");
          _builder.newLineIfNotEmpty();
          this.nextAddress();
          _builder.newLineIfNotEmpty();
        } else {
          Variable_initializer _vari_4 = declarator.getVari();
          Expression _expression_4 = _vari_4.getExpression();
          Expression_aux _aux_3 = _expression_4.getAux();
          String _numericSign_2 = _aux_3.getNumericSign();
          boolean _equals_2 = _numericSign_2.equals("/");
          if (_equals_2) {
            String _string_12 = this.address.toString();
            _builder.append(_string_12, "");
            _builder.append(": DIV R");
            Integer _integer_6 = new Integer(((this.variables).intValue() - 2));
            String _string_13 = _integer_6.toString();
            _builder.append(_string_13, "");
            _builder.append(", R");
            Integer _integer_7 = new Integer(((this.variables).intValue() - 1));
            String _string_14 = _integer_7.toString();
            _builder.append(_string_14, "");
            _builder.append(" , R");
            Integer _integer_8 = new Integer(((this.variables).intValue() - 2));
            String _string_15 = _integer_8.toString();
            _builder.append(_string_15, "");
            _builder.newLineIfNotEmpty();
            this.nextAddress();
            _builder.newLineIfNotEmpty();
          } else {
            Variable_initializer _vari_5 = declarator.getVari();
            Expression _expression_5 = _vari_5.getExpression();
            Expression_aux _aux_4 = _expression_5.getAux();
            String _numericSign_3 = _aux_4.getNumericSign();
            boolean _equals_3 = _numericSign_3.equals("-");
            if (_equals_3) {
              String _string_16 = this.address.toString();
              _builder.append(_string_16, "");
              _builder.append(": SUB R");
              Integer _integer_9 = new Integer(((this.variables).intValue() - 2));
              String _string_17 = _integer_9.toString();
              _builder.append(_string_17, "");
              _builder.append(", R");
              Integer _integer_10 = new Integer(((this.variables).intValue() - 1));
              String _string_18 = _integer_10.toString();
              _builder.append(_string_18, "");
              _builder.append(" , R");
              Integer _integer_11 = new Integer(((this.variables).intValue() - 2));
              String _string_19 = _integer_11.toString();
              _builder.append(_string_19, "");
              _builder.newLineIfNotEmpty();
              this.nextAddress();
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    String _string_20 = this.address.toString();
    _builder.append(_string_20, "");
    _builder.append(": ST ");
    String _nameVariable = declarator.getNameVariable();
    _builder.append(_nameVariable, "");
    _builder.append(", R");
    Integer _integer_12 = new Integer(((this.variables).intValue() - 2));
    String _string_21 = _integer_12.toString();
    _builder.append(_string_21, "");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    this.increment();
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateIntLiteralExpression(final Expression expression) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = this.address.toString();
    _builder.append(_string, "");
    _builder.append(": LD R");
    String _string_1 = this.variables.toString();
    _builder.append(_string_1, "");
    _builder.append(", #");
    Literal_Expression _literalExpression = expression.getLiteralExpression();
    int _exp1 = _literalExpression.getExp1();
    _builder.append(_exp1, "");
    _builder.newLineIfNotEmpty();
    this.increment();
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    String _string_2 = this.address.toString();
    _builder.append(_string_2, "");
    _builder.append(": LD R");
    String _string_3 = this.variables.toString();
    _builder.append(_string_3, "");
    _builder.append(", #");
    Expression_aux _aux = expression.getAux();
    Expression _exp2 = _aux.getExp2();
    Literal_Expression _literalExpression_1 = _exp2.getLiteralExpression();
    int _exp1_1 = _literalExpression_1.getExp1();
    _builder.append(_exp1_1, "");
    _builder.newLineIfNotEmpty();
    this.increment();
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    {
      Expression_aux _aux_1 = expression.getAux();
      String _numericSign = _aux_1.getNumericSign();
      boolean _equals = _numericSign.equals("+");
      if (_equals) {
        String _string_4 = this.address.toString();
        _builder.append(_string_4, "");
        _builder.append(": ADD R");
        Integer _integer = new Integer(((this.variables).intValue() - 2));
        String _string_5 = _integer.toString();
        _builder.append(_string_5, "");
        _builder.append(", R");
        Integer _integer_1 = new Integer(((this.variables).intValue() - 1));
        String _string_6 = _integer_1.toString();
        _builder.append(_string_6, "");
        _builder.append(" , R");
        Integer _integer_2 = new Integer(((this.variables).intValue() - 2));
        String _string_7 = _integer_2.toString();
        _builder.append(_string_7, "");
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
      } else {
        Expression_aux _aux_2 = expression.getAux();
        String _numericSign_1 = _aux_2.getNumericSign();
        boolean _equals_1 = _numericSign_1.equals("*");
        if (_equals_1) {
          String _string_8 = this.address.toString();
          _builder.append(_string_8, "");
          _builder.append(": MUL R");
          Integer _integer_3 = new Integer(((this.variables).intValue() - 2));
          String _string_9 = _integer_3.toString();
          _builder.append(_string_9, "");
          _builder.append(", R");
          Integer _integer_4 = new Integer(((this.variables).intValue() - 1));
          String _string_10 = _integer_4.toString();
          _builder.append(_string_10, "");
          _builder.append(" , R");
          Integer _integer_5 = new Integer(((this.variables).intValue() - 2));
          String _string_11 = _integer_5.toString();
          _builder.append(_string_11, "");
          _builder.newLineIfNotEmpty();
          this.nextAddress();
          _builder.newLineIfNotEmpty();
        } else {
          Expression_aux _aux_3 = expression.getAux();
          String _numericSign_2 = _aux_3.getNumericSign();
          boolean _equals_2 = _numericSign_2.equals("/");
          if (_equals_2) {
            String _string_12 = this.address.toString();
            _builder.append(_string_12, "");
            _builder.append(": DIV R");
            Integer _integer_6 = new Integer(((this.variables).intValue() - 2));
            String _string_13 = _integer_6.toString();
            _builder.append(_string_13, "");
            _builder.append(", R");
            Integer _integer_7 = new Integer(((this.variables).intValue() - 1));
            String _string_14 = _integer_7.toString();
            _builder.append(_string_14, "");
            _builder.append(" , R");
            Integer _integer_8 = new Integer(((this.variables).intValue() - 2));
            String _string_15 = _integer_8.toString();
            _builder.append(_string_15, "");
            _builder.newLineIfNotEmpty();
            this.nextAddress();
            _builder.newLineIfNotEmpty();
          } else {
            Expression_aux _aux_4 = expression.getAux();
            String _numericSign_3 = _aux_4.getNumericSign();
            boolean _equals_3 = _numericSign_3.equals("-");
            if (_equals_3) {
              String _string_16 = this.address.toString();
              _builder.append(_string_16, "");
              _builder.append(": SUB R");
              Integer _integer_9 = new Integer(((this.variables).intValue() - 2));
              String _string_17 = _integer_9.toString();
              _builder.append(_string_17, "");
              _builder.append(", R");
              Integer _integer_10 = new Integer(((this.variables).intValue() - 1));
              String _string_18 = _integer_10.toString();
              _builder.append(_string_18, "");
              _builder.append(" , R");
              Integer _integer_11 = new Integer(((this.variables).intValue() - 2));
              String _string_19 = _integer_11.toString();
              _builder.append(_string_19, "");
              _builder.newLineIfNotEmpty();
              this.nextAddress();
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    this.increment();
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateTesting(final Variable_declarator declarator) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = this.address.toString();
    _builder.append(_string, "");
    _builder.append(": LD R");
    String _string_1 = this.variables.toString();
    _builder.append(_string_1, "");
    _builder.append(", #");
    Variable_initializer _vari = declarator.getVari();
    Expression _expression = _vari.getExpression();
    Literal_Expression _literalExpression = _expression.getLiteralExpression();
    int _exp1 = _literalExpression.getExp1();
    _builder.append(_exp1, "");
    _builder.newLineIfNotEmpty();
    this.increment();
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    String _string_2 = this.address.toString();
    _builder.append(_string_2, "");
    _builder.append(": LD R");
    String _string_3 = this.variables.toString();
    _builder.append(_string_3, "");
    _builder.append(", #");
    Variable_initializer _vari_1 = declarator.getVari();
    Expression _expression_1 = _vari_1.getExpression();
    Expression_aux _aux = _expression_1.getAux();
    Expression _exp1_1 = _aux.getExp1();
    Literal_Expression _literalExpression_1 = _exp1_1.getLiteralExpression();
    int _exp1_2 = _literalExpression_1.getExp1();
    _builder.append(_exp1_2, "");
    _builder.newLineIfNotEmpty();
    this.increment();
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    {
      Variable_initializer _vari_2 = declarator.getVari();
      Expression _expression_2 = _vari_2.getExpression();
      Expression_aux _aux_1 = _expression_2.getAux();
      String _testingSign = _aux_1.getTestingSign();
      boolean _equals = _testingSign.equals("<");
      if (_equals) {
        String _string_4 = this.address.toString();
        _builder.append(_string_4, "");
        _builder.append(": SUB R");
        Integer _integer = new Integer((this.variables).intValue());
        String _string_5 = _integer.toString();
        _builder.append(_string_5, "");
        _builder.append(", R");
        Integer _integer_1 = new Integer(((this.variables).intValue() - 2));
        String _string_6 = _integer_1.toString();
        _builder.append(_string_6, "");
        _builder.append(" , R");
        Integer _integer_2 = new Integer(((this.variables).intValue() - 1));
        String _string_7 = _integer_2.toString();
        _builder.append(_string_7, "");
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
        this.increment();
        _builder.newLineIfNotEmpty();
        String _string_8 = this.address.toString();
        _builder.append(_string_8, "");
        _builder.append(": BGTZ R");
        Integer _integer_3 = new Integer((this.variables).intValue());
        String _string_9 = _integer_3.toString();
        _builder.append(_string_9, "");
        _builder.append(", ");
        _builder.append(((this.address).intValue() + 24), "");
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
        String _string_10 = this.address.toString();
        _builder.append(_string_10, "");
        _builder.append(": LD R");
        Integer _integer_4 = new Integer(((this.variables).intValue() - 2));
        String _string_11 = _integer_4.toString();
        _builder.append(_string_11, "");
        _builder.append(", FALSE");
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
        String _string_12 = this.address.toString();
        _builder.append(_string_12, "");
        _builder.append(": BR ");
        _builder.append(((this.address).intValue() + 16), "");
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
        String _string_13 = this.address.toString();
        _builder.append(_string_13, "");
        _builder.append(": LD R");
        Integer _integer_5 = new Integer(((this.variables).intValue() - 2));
        String _string_14 = _integer_5.toString();
        _builder.append(_string_14, "");
        _builder.append(", TRUE");
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
      } else {
        Variable_initializer _vari_3 = declarator.getVari();
        Expression _expression_3 = _vari_3.getExpression();
        Expression_aux _aux_2 = _expression_3.getAux();
        String _testingSign_1 = _aux_2.getTestingSign();
        boolean _equals_1 = _testingSign_1.equals(">");
        if (_equals_1) {
          String _string_15 = this.address.toString();
          _builder.append(_string_15, "");
          _builder.append(": SUB R");
          Integer _integer_6 = new Integer((this.variables).intValue());
          String _string_16 = _integer_6.toString();
          _builder.append(_string_16, "");
          _builder.append(", R");
          Integer _integer_7 = new Integer(((this.variables).intValue() - 2));
          String _string_17 = _integer_7.toString();
          _builder.append(_string_17, "");
          _builder.append(" , R");
          Integer _integer_8 = new Integer(((this.variables).intValue() - 1));
          String _string_18 = _integer_8.toString();
          _builder.append(_string_18, "");
          _builder.newLineIfNotEmpty();
          this.nextAddress();
          _builder.newLineIfNotEmpty();
          this.increment();
          _builder.newLineIfNotEmpty();
          String _string_19 = this.address.toString();
          _builder.append(_string_19, "");
          _builder.append(": BGTZ R");
          Integer _integer_9 = new Integer((this.variables).intValue());
          String _string_20 = _integer_9.toString();
          _builder.append(_string_20, "");
          _builder.append(", ");
          _builder.append(((this.address).intValue() + 24), "");
          _builder.newLineIfNotEmpty();
          this.nextAddress();
          _builder.newLineIfNotEmpty();
          String _string_21 = this.address.toString();
          _builder.append(_string_21, "");
          _builder.append(": LD R");
          Integer _integer_10 = new Integer(((this.variables).intValue() - 2));
          String _string_22 = _integer_10.toString();
          _builder.append(_string_22, "");
          _builder.append(", TRUE");
          _builder.newLineIfNotEmpty();
          this.nextAddress();
          _builder.newLineIfNotEmpty();
          String _string_23 = this.address.toString();
          _builder.append(_string_23, "");
          _builder.append(": BR ");
          _builder.append(((this.address).intValue() + 16), "");
          _builder.newLineIfNotEmpty();
          this.nextAddress();
          _builder.newLineIfNotEmpty();
          String _string_24 = this.address.toString();
          _builder.append(_string_24, "");
          _builder.append(": LD R");
          Integer _integer_11 = new Integer(((this.variables).intValue() - 2));
          String _string_25 = _integer_11.toString();
          _builder.append(_string_25, "");
          _builder.append(", FALSE");
          _builder.newLineIfNotEmpty();
          this.nextAddress();
          _builder.newLineIfNotEmpty();
        } else {
          Variable_initializer _vari_4 = declarator.getVari();
          Expression _expression_4 = _vari_4.getExpression();
          Expression_aux _aux_3 = _expression_4.getAux();
          String _testingSign_2 = _aux_3.getTestingSign();
          boolean _equals_2 = _testingSign_2.equals(">=");
          if (_equals_2) {
            String _string_26 = this.address.toString();
            _builder.append(_string_26, "");
            _builder.append(": SUB R");
            Integer _integer_12 = new Integer((this.variables).intValue());
            String _string_27 = _integer_12.toString();
            _builder.append(_string_27, "");
            _builder.append(", R");
            Integer _integer_13 = new Integer(((this.variables).intValue() - 2));
            String _string_28 = _integer_13.toString();
            _builder.append(_string_28, "");
            _builder.append(" , R");
            Integer _integer_14 = new Integer(((this.variables).intValue() - 1));
            String _string_29 = _integer_14.toString();
            _builder.append(_string_29, "");
            _builder.newLineIfNotEmpty();
            this.nextAddress();
            _builder.newLineIfNotEmpty();
            this.increment();
            _builder.newLineIfNotEmpty();
            String _string_30 = this.address.toString();
            _builder.append(_string_30, "");
            _builder.append(": BGEZ R");
            Integer _integer_15 = new Integer((this.variables).intValue());
            String _string_31 = _integer_15.toString();
            _builder.append(_string_31, "");
            _builder.append(", ");
            _builder.append(((this.address).intValue() + 24), "");
            _builder.newLineIfNotEmpty();
            this.nextAddress();
            _builder.newLineIfNotEmpty();
            String _string_32 = this.address.toString();
            _builder.append(_string_32, "");
            _builder.append(": LD R");
            Integer _integer_16 = new Integer(((this.variables).intValue() - 2));
            String _string_33 = _integer_16.toString();
            _builder.append(_string_33, "");
            _builder.append(", TRUE");
            _builder.newLineIfNotEmpty();
            this.nextAddress();
            _builder.newLineIfNotEmpty();
            String _string_34 = this.address.toString();
            _builder.append(_string_34, "");
            _builder.append(": BR ");
            _builder.append(((this.address).intValue() + 16), "");
            _builder.newLineIfNotEmpty();
            this.nextAddress();
            _builder.newLineIfNotEmpty();
            String _string_35 = this.address.toString();
            _builder.append(_string_35, "");
            _builder.append(": LD R");
            Integer _integer_17 = new Integer(((this.variables).intValue() - 2));
            String _string_36 = _integer_17.toString();
            _builder.append(_string_36, "");
            _builder.append(", FALSE");
            _builder.newLineIfNotEmpty();
            this.nextAddress();
            _builder.newLineIfNotEmpty();
          } else {
            Variable_initializer _vari_5 = declarator.getVari();
            Expression _expression_5 = _vari_5.getExpression();
            Expression_aux _aux_4 = _expression_5.getAux();
            String _testingSign_3 = _aux_4.getTestingSign();
            boolean _equals_3 = _testingSign_3.equals("<=");
            if (_equals_3) {
              String _string_37 = this.address.toString();
              _builder.append(_string_37, "");
              _builder.append(": SUB R");
              Integer _integer_18 = new Integer((this.variables).intValue());
              String _string_38 = _integer_18.toString();
              _builder.append(_string_38, "");
              _builder.append(", R");
              Integer _integer_19 = new Integer(((this.variables).intValue() - 2));
              String _string_39 = _integer_19.toString();
              _builder.append(_string_39, "");
              _builder.append(" , R");
              Integer _integer_20 = new Integer(((this.variables).intValue() - 1));
              String _string_40 = _integer_20.toString();
              _builder.append(_string_40, "");
              _builder.newLineIfNotEmpty();
              this.nextAddress();
              _builder.newLineIfNotEmpty();
              this.increment();
              _builder.newLineIfNotEmpty();
              String _string_41 = this.address.toString();
              _builder.append(_string_41, "");
              _builder.append(": BGEZ R");
              Integer _integer_21 = new Integer((this.variables).intValue());
              String _string_42 = _integer_21.toString();
              _builder.append(_string_42, "");
              _builder.append(", ");
              _builder.append(((this.address).intValue() + 24), "");
              _builder.newLineIfNotEmpty();
              this.nextAddress();
              _builder.newLineIfNotEmpty();
              String _string_43 = this.address.toString();
              _builder.append(_string_43, "");
              _builder.append(": LD R");
              Integer _integer_22 = new Integer(((this.variables).intValue() - 2));
              String _string_44 = _integer_22.toString();
              _builder.append(_string_44, "");
              _builder.append(", FALSE");
              _builder.newLineIfNotEmpty();
              this.nextAddress();
              _builder.newLineIfNotEmpty();
              String _string_45 = this.address.toString();
              _builder.append(_string_45, "");
              _builder.append(": BR ");
              _builder.append(((this.address).intValue() + 16), "");
              _builder.newLineIfNotEmpty();
              this.nextAddress();
              _builder.newLineIfNotEmpty();
              String _string_46 = this.address.toString();
              _builder.append(_string_46, "");
              _builder.append(": LD R");
              Integer _integer_23 = new Integer(((this.variables).intValue() - 2));
              String _string_47 = _integer_23.toString();
              _builder.append(_string_47, "");
              _builder.append(", TRUE");
              _builder.newLineIfNotEmpty();
              this.nextAddress();
              _builder.newLineIfNotEmpty();
            } else {
              Variable_initializer _vari_6 = declarator.getVari();
              Expression _expression_6 = _vari_6.getExpression();
              Expression_aux _aux_5 = _expression_6.getAux();
              String _testingSign_4 = _aux_5.getTestingSign();
              boolean _equals_4 = _testingSign_4.equals("==");
              if (_equals_4) {
                String _string_48 = this.address.toString();
                _builder.append(_string_48, "");
                _builder.append(": SUB R");
                Integer _integer_24 = new Integer((this.variables).intValue());
                String _string_49 = _integer_24.toString();
                _builder.append(_string_49, "");
                _builder.append(", R");
                Integer _integer_25 = new Integer(((this.variables).intValue() - 2));
                String _string_50 = _integer_25.toString();
                _builder.append(_string_50, "");
                _builder.append(" , R");
                Integer _integer_26 = new Integer(((this.variables).intValue() - 1));
                String _string_51 = _integer_26.toString();
                _builder.append(_string_51, "");
                _builder.newLineIfNotEmpty();
                this.nextAddress();
                _builder.newLineIfNotEmpty();
                this.increment();
                _builder.newLineIfNotEmpty();
                String _string_52 = this.address.toString();
                _builder.append(_string_52, "");
                _builder.append(": CMP R");
                Integer _integer_27 = new Integer((this.variables).intValue());
                String _string_53 = _integer_27.toString();
                _builder.append(_string_53, "");
                _builder.append(", ");
                _builder.append(((this.address).intValue() + 24), "");
                _builder.newLineIfNotEmpty();
                this.nextAddress();
                _builder.newLineIfNotEmpty();
                String _string_54 = this.address.toString();
                _builder.append(_string_54, "");
                _builder.append(": LD R");
                Integer _integer_28 = new Integer(((this.variables).intValue() - 2));
                String _string_55 = _integer_28.toString();
                _builder.append(_string_55, "");
                _builder.append(", FALSE");
                _builder.newLineIfNotEmpty();
                this.nextAddress();
                _builder.newLineIfNotEmpty();
                String _string_56 = this.address.toString();
                _builder.append(_string_56, "");
                _builder.append(": BR ");
                _builder.append(((this.address).intValue() + 16), "");
                _builder.newLineIfNotEmpty();
                this.nextAddress();
                _builder.newLineIfNotEmpty();
                String _string_57 = this.address.toString();
                _builder.append(_string_57, "");
                _builder.append(": LD R");
                Integer _integer_29 = new Integer(((this.variables).intValue() - 2));
                String _string_58 = _integer_29.toString();
                _builder.append(_string_58, "");
                _builder.append(", TRUE");
                _builder.newLineIfNotEmpty();
                this.nextAddress();
                _builder.newLineIfNotEmpty();
              } else {
                Variable_initializer _vari_7 = declarator.getVari();
                Expression _expression_7 = _vari_7.getExpression();
                Expression_aux _aux_6 = _expression_7.getAux();
                String _testingSign_5 = _aux_6.getTestingSign();
                boolean _equals_5 = _testingSign_5.equals("!=");
                if (_equals_5) {
                  String _string_59 = this.address.toString();
                  _builder.append(_string_59, "");
                  _builder.append(": SUB R");
                  Integer _integer_30 = new Integer((this.variables).intValue());
                  String _string_60 = _integer_30.toString();
                  _builder.append(_string_60, "");
                  _builder.append(", R");
                  Integer _integer_31 = new Integer(((this.variables).intValue() - 2));
                  String _string_61 = _integer_31.toString();
                  _builder.append(_string_61, "");
                  _builder.append(" , R");
                  Integer _integer_32 = new Integer(((this.variables).intValue() - 1));
                  String _string_62 = _integer_32.toString();
                  _builder.append(_string_62, "");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  this.increment();
                  _builder.newLineIfNotEmpty();
                  String _string_63 = this.address.toString();
                  _builder.append(_string_63, "");
                  _builder.append(": CMP R");
                  Integer _integer_33 = new Integer((this.variables).intValue());
                  String _string_64 = _integer_33.toString();
                  _builder.append(_string_64, "");
                  _builder.append(", ");
                  _builder.append(((this.address).intValue() + 24), "");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  String _string_65 = this.address.toString();
                  _builder.append(_string_65, "");
                  _builder.append(": LD R");
                  Integer _integer_34 = new Integer(((this.variables).intValue() - 2));
                  String _string_66 = _integer_34.toString();
                  _builder.append(_string_66, "");
                  _builder.append(", TRUE");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  String _string_67 = this.address.toString();
                  _builder.append(_string_67, "");
                  _builder.append(": BR ");
                  _builder.append(((this.address).intValue() + 16), "");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  String _string_68 = this.address.toString();
                  _builder.append(_string_68, "");
                  _builder.append(": LD R");
                  Integer _integer_35 = new Integer(((this.variables).intValue() - 2));
                  String _string_69 = _integer_35.toString();
                  _builder.append(_string_69, "");
                  _builder.append(", FALSE");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
    }
    String _string_70 = this.address.toString();
    _builder.append(_string_70, "");
    _builder.append(": ST ");
    String _nameVariable = declarator.getNameVariable();
    _builder.append(_nameVariable, "");
    _builder.append(", R");
    Integer _integer_36 = new Integer(((this.variables).intValue() - 2));
    String _string_71 = _integer_36.toString();
    _builder.append(_string_71, "");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateTestingExpression(final Expression expression) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = this.address.toString();
    _builder.append(_string, "");
    _builder.append(": LD R");
    String _string_1 = this.variables.toString();
    _builder.append(_string_1, "");
    _builder.append(", #");
    Literal_Expression _literalExpression = expression.getLiteralExpression();
    int _exp1 = _literalExpression.getExp1();
    _builder.append(_exp1, "");
    _builder.newLineIfNotEmpty();
    this.increment();
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    String _string_2 = this.address.toString();
    _builder.append(_string_2, "");
    _builder.append(": LD R");
    String _string_3 = this.variables.toString();
    _builder.append(_string_3, "");
    _builder.append(", #");
    Expression_aux _aux = expression.getAux();
    Expression _exp1_1 = _aux.getExp1();
    Literal_Expression _literalExpression_1 = _exp1_1.getLiteralExpression();
    int _exp1_2 = _literalExpression_1.getExp1();
    _builder.append(_exp1_2, "");
    _builder.newLineIfNotEmpty();
    this.increment();
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    {
      Expression_aux _aux_1 = expression.getAux();
      String _testingSign = _aux_1.getTestingSign();
      boolean _equals = _testingSign.equals("<");
      if (_equals) {
        String _string_4 = this.address.toString();
        _builder.append(_string_4, "");
        _builder.append(": SUB R");
        Integer _integer = new Integer((this.variables).intValue());
        String _string_5 = _integer.toString();
        _builder.append(_string_5, "");
        _builder.append(", R");
        Integer _integer_1 = new Integer(((this.variables).intValue() - 2));
        String _string_6 = _integer_1.toString();
        _builder.append(_string_6, "");
        _builder.append(" , R");
        Integer _integer_2 = new Integer(((this.variables).intValue() - 1));
        String _string_7 = _integer_2.toString();
        _builder.append(_string_7, "");
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
        this.increment();
        _builder.newLineIfNotEmpty();
        String _string_8 = this.address.toString();
        _builder.append(_string_8, "");
        _builder.append(": BGTZ R");
        Integer _integer_3 = new Integer((this.variables).intValue());
        String _string_9 = _integer_3.toString();
        _builder.append(_string_9, "");
        _builder.append(", ");
        _builder.append(((this.address).intValue() + 24), "");
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
        String _string_10 = this.address.toString();
        _builder.append(_string_10, "");
        _builder.append(": LD R");
        Integer _integer_4 = new Integer(((this.variables).intValue() - 2));
        String _string_11 = _integer_4.toString();
        _builder.append(_string_11, "");
        _builder.append(", FALSE");
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
        String _string_12 = this.address.toString();
        _builder.append(_string_12, "");
        _builder.append(": BR ");
        _builder.append(((this.address).intValue() + 16), "");
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
        String _string_13 = this.address.toString();
        _builder.append(_string_13, "");
        _builder.append(": LD R");
        Integer _integer_5 = new Integer(((this.variables).intValue() - 2));
        String _string_14 = _integer_5.toString();
        _builder.append(_string_14, "");
        _builder.append(", TRUE");
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
      } else {
        Expression_aux _aux_2 = expression.getAux();
        String _testingSign_1 = _aux_2.getTestingSign();
        boolean _equals_1 = _testingSign_1.equals(">");
        if (_equals_1) {
          String _string_15 = this.address.toString();
          _builder.append(_string_15, "");
          _builder.append(": SUB R");
          Integer _integer_6 = new Integer((this.variables).intValue());
          String _string_16 = _integer_6.toString();
          _builder.append(_string_16, "");
          _builder.append(", R");
          Integer _integer_7 = new Integer(((this.variables).intValue() - 2));
          String _string_17 = _integer_7.toString();
          _builder.append(_string_17, "");
          _builder.append(" , R");
          Integer _integer_8 = new Integer(((this.variables).intValue() - 1));
          String _string_18 = _integer_8.toString();
          _builder.append(_string_18, "");
          _builder.newLineIfNotEmpty();
          this.nextAddress();
          _builder.newLineIfNotEmpty();
          this.increment();
          _builder.newLineIfNotEmpty();
          String _string_19 = this.address.toString();
          _builder.append(_string_19, "");
          _builder.append(": BGTZ R");
          Integer _integer_9 = new Integer((this.variables).intValue());
          String _string_20 = _integer_9.toString();
          _builder.append(_string_20, "");
          _builder.append(", ");
          _builder.append(((this.address).intValue() + 24), "");
          _builder.newLineIfNotEmpty();
          this.nextAddress();
          _builder.newLineIfNotEmpty();
          String _string_21 = this.address.toString();
          _builder.append(_string_21, "");
          _builder.append(": LD R");
          Integer _integer_10 = new Integer(((this.variables).intValue() - 2));
          String _string_22 = _integer_10.toString();
          _builder.append(_string_22, "");
          _builder.append(", TRUE");
          _builder.newLineIfNotEmpty();
          this.nextAddress();
          _builder.newLineIfNotEmpty();
          String _string_23 = this.address.toString();
          _builder.append(_string_23, "");
          _builder.append(": BR ");
          _builder.append(((this.address).intValue() + 16), "");
          _builder.newLineIfNotEmpty();
          this.nextAddress();
          _builder.newLineIfNotEmpty();
          String _string_24 = this.address.toString();
          _builder.append(_string_24, "");
          _builder.append(": LD R");
          Integer _integer_11 = new Integer(((this.variables).intValue() - 2));
          String _string_25 = _integer_11.toString();
          _builder.append(_string_25, "");
          _builder.append(", FALSE");
          _builder.newLineIfNotEmpty();
          this.nextAddress();
          _builder.newLineIfNotEmpty();
        } else {
          Expression_aux _aux_3 = expression.getAux();
          String _testingSign_2 = _aux_3.getTestingSign();
          boolean _equals_2 = _testingSign_2.equals(">=");
          if (_equals_2) {
            String _string_26 = this.address.toString();
            _builder.append(_string_26, "");
            _builder.append(": SUB R");
            Integer _integer_12 = new Integer((this.variables).intValue());
            String _string_27 = _integer_12.toString();
            _builder.append(_string_27, "");
            _builder.append(", R");
            Integer _integer_13 = new Integer(((this.variables).intValue() - 2));
            String _string_28 = _integer_13.toString();
            _builder.append(_string_28, "");
            _builder.append(" , R");
            Integer _integer_14 = new Integer(((this.variables).intValue() - 1));
            String _string_29 = _integer_14.toString();
            _builder.append(_string_29, "");
            _builder.newLineIfNotEmpty();
            this.nextAddress();
            _builder.newLineIfNotEmpty();
            this.increment();
            _builder.newLineIfNotEmpty();
            String _string_30 = this.address.toString();
            _builder.append(_string_30, "");
            _builder.append(": BGEZ R");
            Integer _integer_15 = new Integer((this.variables).intValue());
            String _string_31 = _integer_15.toString();
            _builder.append(_string_31, "");
            _builder.append(", ");
            _builder.append(((this.address).intValue() + 24), "");
            _builder.newLineIfNotEmpty();
            this.nextAddress();
            _builder.newLineIfNotEmpty();
            String _string_32 = this.address.toString();
            _builder.append(_string_32, "");
            _builder.append(": LD R");
            Integer _integer_16 = new Integer(((this.variables).intValue() - 2));
            String _string_33 = _integer_16.toString();
            _builder.append(_string_33, "");
            _builder.append(", TRUE");
            _builder.newLineIfNotEmpty();
            this.nextAddress();
            _builder.newLineIfNotEmpty();
            String _string_34 = this.address.toString();
            _builder.append(_string_34, "");
            _builder.append(": BR ");
            _builder.append(((this.address).intValue() + 16), "");
            _builder.newLineIfNotEmpty();
            this.nextAddress();
            _builder.newLineIfNotEmpty();
            String _string_35 = this.address.toString();
            _builder.append(_string_35, "");
            _builder.append(": LD R");
            Integer _integer_17 = new Integer(((this.variables).intValue() - 2));
            String _string_36 = _integer_17.toString();
            _builder.append(_string_36, "");
            _builder.append(", FALSE");
            _builder.newLineIfNotEmpty();
            this.nextAddress();
            _builder.newLineIfNotEmpty();
          } else {
            Expression_aux _aux_4 = expression.getAux();
            String _testingSign_3 = _aux_4.getTestingSign();
            boolean _equals_3 = _testingSign_3.equals("<=");
            if (_equals_3) {
              String _string_37 = this.address.toString();
              _builder.append(_string_37, "");
              _builder.append(": SUB R");
              Integer _integer_18 = new Integer((this.variables).intValue());
              String _string_38 = _integer_18.toString();
              _builder.append(_string_38, "");
              _builder.append(", R");
              Integer _integer_19 = new Integer(((this.variables).intValue() - 2));
              String _string_39 = _integer_19.toString();
              _builder.append(_string_39, "");
              _builder.append(" , R");
              Integer _integer_20 = new Integer(((this.variables).intValue() - 1));
              String _string_40 = _integer_20.toString();
              _builder.append(_string_40, "");
              _builder.newLineIfNotEmpty();
              this.nextAddress();
              _builder.newLineIfNotEmpty();
              this.increment();
              _builder.newLineIfNotEmpty();
              String _string_41 = this.address.toString();
              _builder.append(_string_41, "");
              _builder.append(": BGEZ R");
              Integer _integer_21 = new Integer((this.variables).intValue());
              String _string_42 = _integer_21.toString();
              _builder.append(_string_42, "");
              _builder.append(", ");
              _builder.append(((this.address).intValue() + 24), "");
              _builder.newLineIfNotEmpty();
              this.nextAddress();
              _builder.newLineIfNotEmpty();
              String _string_43 = this.address.toString();
              _builder.append(_string_43, "");
              _builder.append(": LD R");
              Integer _integer_22 = new Integer(((this.variables).intValue() - 2));
              String _string_44 = _integer_22.toString();
              _builder.append(_string_44, "");
              _builder.append(", FALSE");
              _builder.newLineIfNotEmpty();
              this.nextAddress();
              _builder.newLineIfNotEmpty();
              String _string_45 = this.address.toString();
              _builder.append(_string_45, "");
              _builder.append(": BR ");
              _builder.append(((this.address).intValue() + 16), "");
              _builder.newLineIfNotEmpty();
              this.nextAddress();
              _builder.newLineIfNotEmpty();
              String _string_46 = this.address.toString();
              _builder.append(_string_46, "");
              _builder.append(": LD R");
              Integer _integer_23 = new Integer(((this.variables).intValue() - 2));
              String _string_47 = _integer_23.toString();
              _builder.append(_string_47, "");
              _builder.append(", TRUE");
              _builder.newLineIfNotEmpty();
              this.nextAddress();
              _builder.newLineIfNotEmpty();
            } else {
              Expression_aux _aux_5 = expression.getAux();
              String _testingSign_4 = _aux_5.getTestingSign();
              boolean _equals_4 = _testingSign_4.equals("==");
              if (_equals_4) {
                String _string_48 = this.address.toString();
                _builder.append(_string_48, "");
                _builder.append(": SUB R");
                Integer _integer_24 = new Integer((this.variables).intValue());
                String _string_49 = _integer_24.toString();
                _builder.append(_string_49, "");
                _builder.append(", R");
                Integer _integer_25 = new Integer(((this.variables).intValue() - 2));
                String _string_50 = _integer_25.toString();
                _builder.append(_string_50, "");
                _builder.append(" , R");
                Integer _integer_26 = new Integer(((this.variables).intValue() - 1));
                String _string_51 = _integer_26.toString();
                _builder.append(_string_51, "");
                _builder.newLineIfNotEmpty();
                this.nextAddress();
                _builder.newLineIfNotEmpty();
                this.increment();
                _builder.newLineIfNotEmpty();
                String _string_52 = this.address.toString();
                _builder.append(_string_52, "");
                _builder.append(": CMP R");
                Integer _integer_27 = new Integer((this.variables).intValue());
                String _string_53 = _integer_27.toString();
                _builder.append(_string_53, "");
                _builder.append(", ");
                _builder.append(((this.address).intValue() + 24), "");
                _builder.newLineIfNotEmpty();
                this.nextAddress();
                _builder.newLineIfNotEmpty();
                String _string_54 = this.address.toString();
                _builder.append(_string_54, "");
                _builder.append(": LD R");
                Integer _integer_28 = new Integer(((this.variables).intValue() - 2));
                String _string_55 = _integer_28.toString();
                _builder.append(_string_55, "");
                _builder.append(", FALSE");
                _builder.newLineIfNotEmpty();
                this.nextAddress();
                _builder.newLineIfNotEmpty();
                String _string_56 = this.address.toString();
                _builder.append(_string_56, "");
                _builder.append(": BR ");
                _builder.append(((this.address).intValue() + 16), "");
                _builder.newLineIfNotEmpty();
                this.nextAddress();
                _builder.newLineIfNotEmpty();
                String _string_57 = this.address.toString();
                _builder.append(_string_57, "");
                _builder.append(": LD R");
                Integer _integer_29 = new Integer(((this.variables).intValue() - 2));
                String _string_58 = _integer_29.toString();
                _builder.append(_string_58, "");
                _builder.append(", TRUE");
                _builder.newLineIfNotEmpty();
                this.nextAddress();
                _builder.newLineIfNotEmpty();
              } else {
                Expression_aux _aux_6 = expression.getAux();
                String _testingSign_5 = _aux_6.getTestingSign();
                boolean _equals_5 = _testingSign_5.equals("!=");
                if (_equals_5) {
                  String _string_59 = this.address.toString();
                  _builder.append(_string_59, "");
                  _builder.append(": SUB R");
                  Integer _integer_30 = new Integer((this.variables).intValue());
                  String _string_60 = _integer_30.toString();
                  _builder.append(_string_60, "");
                  _builder.append(", R");
                  Integer _integer_31 = new Integer(((this.variables).intValue() - 2));
                  String _string_61 = _integer_31.toString();
                  _builder.append(_string_61, "");
                  _builder.append(" , R");
                  Integer _integer_32 = new Integer(((this.variables).intValue() - 1));
                  String _string_62 = _integer_32.toString();
                  _builder.append(_string_62, "");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  this.increment();
                  _builder.newLineIfNotEmpty();
                  String _string_63 = this.address.toString();
                  _builder.append(_string_63, "");
                  _builder.append(": CMP R");
                  Integer _integer_33 = new Integer((this.variables).intValue());
                  String _string_64 = _integer_33.toString();
                  _builder.append(_string_64, "");
                  _builder.append(", ");
                  _builder.append(((this.address).intValue() + 24), "");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  String _string_65 = this.address.toString();
                  _builder.append(_string_65, "");
                  _builder.append(": LD R");
                  Integer _integer_34 = new Integer(((this.variables).intValue() - 2));
                  String _string_66 = _integer_34.toString();
                  _builder.append(_string_66, "");
                  _builder.append(", TRUE");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  String _string_67 = this.address.toString();
                  _builder.append(_string_67, "");
                  _builder.append(": BR ");
                  _builder.append(((this.address).intValue() + 16), "");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  String _string_68 = this.address.toString();
                  _builder.append(_string_68, "");
                  _builder.append(": LD R");
                  Integer _integer_35 = new Integer(((this.variables).intValue() - 2));
                  String _string_69 = _integer_35.toString();
                  _builder.append(_string_69, "");
                  _builder.append(", FALSE");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
}
