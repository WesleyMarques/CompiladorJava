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
  private Integer countVar = Integer.valueOf(1);
  
  private Integer countaddr = Integer.valueOf(0);
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    this.countVar = Integer.valueOf(1);
    this.countaddr = Integer.valueOf(0);
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Class_declaration> _filter = Iterables.<Class_declaration>filter(_iterable, Class_declaration.class);
    for (final Class_declaration e : _filter) {
      String _className = e.getClassName();
      String _string = _className.toString();
      String _plus = (_string + ".txt");
      CharSequence _genClass = this.genClass(e);
      fsa.generateFile(_plus, _genClass);
    }
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
    Iterable<Interface_declaration> _filter_1 = Iterables.<Interface_declaration>filter(_iterable_1, Interface_declaration.class);
    for (final Interface_declaration e_1 : _filter_1) {
      String _interfaceName = e_1.getInterfaceName();
      String _string_1 = _interfaceName.toString();
      String _plus_1 = (_string_1 + ".txt");
      CharSequence _genInterface = this.genInterface(e_1);
      fsa.generateFile(_plus_1, _genInterface);
    }
  }
  
  public CharSequence genClass(final Class_declaration cd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.countaddr, "");
    _builder.append(": LD SP, 1000");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    {
      EList<Field_declaration> _fieldsDeclaration = cd.getFieldsDeclaration();
      for(final Field_declaration f : _fieldsDeclaration) {
        CharSequence _genField = this.genField(f);
        _builder.append(_genField, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genInterface(final Interface_declaration cd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.countaddr, "");
    _builder.append("LD SP, 1000");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    {
      EList<Field_declaration> _fieldsDeclaration = cd.getFieldsDeclaration();
      for(final Field_declaration f : _fieldsDeclaration) {
        CharSequence _genField = this.genField(f);
        _builder.append(_genField, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genField(final Field_declaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Variable_declaration _variableDeclaration = declaration.getVariableDeclaration();
      if ((_variableDeclaration instanceof Variable_declaration)) {
        Variable_declaration _variableDeclaration_1 = declaration.getVariableDeclaration();
        CharSequence _genVariable = this.genVariable(((Variable_declaration) _variableDeclaration_1));
        _builder.append(_genVariable, "");
        _builder.newLineIfNotEmpty();
      } else {
        Method_declaration _methodName = declaration.getMethodName();
        if ((_methodName instanceof Method_declaration)) {
          Method_declaration _methodName_1 = declaration.getMethodName();
          CharSequence _genMethod = this.genMethod(((Method_declaration) _methodName_1));
          _builder.append(_genMethod, "");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  public CharSequence genMethod(final Method_declaration declaration) {
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
        CharSequence _genStatementBlock = this.genStatementBlock(_statementMethod_1);
        _builder.append(_genStatementBlock, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genStatementBlock(final Statement_block block) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Statement> _statments = block.getStatments();
      boolean _notEquals = (!Objects.equal(_statments, null));
      if (_notEquals) {
        EList<Statement> _statments_1 = block.getStatments();
        CharSequence _genStatements = this.genStatements(_statments_1);
        _builder.append(_genStatements, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genStatements(final EList<Statement> listStatements) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Statement actualStatment : listStatements) {
        CharSequence _genStatement = this.genStatement(actualStatment);
        _builder.append(_genStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genStatement(final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Variable_declaration _variableDeclaration = statement.getVariableDeclaration();
      boolean _notEquals = (!Objects.equal(_variableDeclaration, null));
      if (_notEquals) {
        Variable_declaration _variableDeclaration_1 = statement.getVariableDeclaration();
        CharSequence _genVariable = this.genVariable(_variableDeclaration_1);
        _builder.append(_genVariable, "");
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
          CharSequence _genDeclarator = this.genDeclarator(_nameVariable_1);
          _builder.append(_genDeclarator, "");
          _builder.newLineIfNotEmpty();
        } else {
          While_Statement _whileStatement = statement.getWhileStatement();
          boolean _notEquals_3 = (!Objects.equal(_whileStatement, null));
          if (_notEquals_3) {
            While_Statement _whileStatement_1 = statement.getWhileStatement();
            CharSequence _genWhileStatement = this.genWhileStatement(_whileStatement_1);
            _builder.append(_genWhileStatement, "");
            _builder.newLineIfNotEmpty();
          } else {
            String _ret = statement.getRet();
            boolean _notEquals_4 = (!Objects.equal(_ret, null));
            if (_notEquals_4) {
              String _ret_1 = statement.getRet();
              CharSequence _genReturnStatement = this.genReturnStatement(_ret_1);
              _builder.append(_genReturnStatement, "");
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
                    CharSequence _genExpression = this.genExpression(exp);
                    _builder.append(_genExpression, "");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                Statement_block _statementBlock = statement.getStatementBlock();
                boolean _notEquals_6 = (!Objects.equal(_statementBlock, null));
                if (_notEquals_6) {
                  Statement_block _statementBlock_1 = statement.getStatementBlock();
                  Object _genStatementBlock = this.genStatementBlock(_statementBlock_1);
                  _builder.append(_genStatementBlock, "");
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
  
  public CharSequence genReturnStatement(final String statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.countaddr, "");
    _builder.append(": BR *0(SP)");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genWhileStatement(final While_Statement whileStatement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#StartWHILE:");
    _builder.newLine();
    {
      Expression _expression = whileStatement.getExpression();
      boolean _notEquals = (!Objects.equal(_expression, null));
      if (_notEquals) {
        Expression _expression_1 = whileStatement.getExpression();
        CharSequence _genSimpleLogical = this.genSimpleLogical(_expression_1);
        _builder.append(_genSimpleLogical, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Statement _whileStatement = whileStatement.getWhileStatement();
      boolean _notEquals_1 = (!Objects.equal(_whileStatement, null));
      if (_notEquals_1) {
        Statement _whileStatement_1 = whileStatement.getWhileStatement();
        Object _genStatement = this.genStatement(_whileStatement_1);
        _builder.append(_genStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    String _string = this.countaddr.toString();
    _builder.append(_string, "");
    _builder.append(": BR #StartWHILE");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#EndWHILE:");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genExpression(final Expression expression) {
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
                CharSequence _genStringExpression = this.genStringExpression(expression);
                _builder.append(_genStringExpression, "");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            {
              Expression_aux _aux_3 = expression.getAux();
              String _testingSign = _aux_3.getTestingSign();
              boolean _equals_2 = Objects.equal(_testingSign, null);
              if (_equals_2) {
                CharSequence _genIntLiteralExpression = this.genIntLiteralExpression(expression);
                _builder.append(_genIntLiteralExpression, "");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      } else {
        Logical_Expression_NR _logicalExpression = expression.getLogicalExpression();
        boolean _notEquals_2 = (!Objects.equal(_logicalExpression, null));
        if (_notEquals_2) {
          CharSequence _genFullLogicalExpression = this.genFullLogicalExpression(expression, "");
          _builder.append(_genFullLogicalExpression, "");
          _builder.newLineIfNotEmpty();
        } else {
          Numeric_Expression_NR _numericExpression3 = expression.getNumericExpression3();
          boolean _notEquals_3 = (!Objects.equal(_numericExpression3, null));
          if (_notEquals_3) {
            CharSequence _genNumericExpression = this.genNumericExpression(expression);
            _builder.append(_genNumericExpression, "");
            _builder.newLineIfNotEmpty();
          } else {
            String _name = expression.getName();
            boolean _notEquals_4 = (!Objects.equal(_name, null));
            if (_notEquals_4) {
              {
                Expression_aux _aux_4 = expression.getAux();
                boolean _notEquals_5 = (!Objects.equal(_aux_4, null));
                if (_notEquals_5) {
                  String _string_1 = this.countaddr.toString();
                  _builder.append(_string_1, "");
                  _builder.append(": ADD SP, SP, #methodSize");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  String _string_2 = this.countaddr.toString();
                  _builder.append(_string_2, "");
                  _builder.append(": ST *SP, ");
                  _builder.append(((this.countaddr).intValue() + 16), "");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  _builder.append(this.countaddr, "");
                  _builder.append(": BR ");
                  String _name_1 = expression.getName();
                  _builder.append(_name_1, "");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                  String _string_3 = this.countaddr.toString();
                  _builder.append(_string_3, "");
                  _builder.append(": SUB SP, SP, #methodSize");
                  _builder.newLineIfNotEmpty();
                  this.nextAddress();
                  _builder.newLineIfNotEmpty();
                } else {
                  String _string_4 = this.countaddr.toString();
                  _builder.append(_string_4, "");
                  _builder.append(": LD R");
                  String _string_5 = this.countVar.toString();
                  _builder.append(_string_5, "");
                  _builder.append(", *");
                  String _name_2 = expression.getName();
                  _builder.append(_name_2, "");
                  _builder.newLineIfNotEmpty();
                  this.increment();
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
  
  public CharSequence genNumericExpression(final Expression expression) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Numeric_Expression_NR _numericExpression3 = expression.getNumericExpression3();
      boolean _notEquals = (!Objects.equal(_numericExpression3, null));
      if (_notEquals) {
        String _string = this.countaddr.toString();
        _builder.append(_string, "");
        _builder.append(": LD R");
        String _string_1 = this.countVar.toString();
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
            String _string_2 = this.countaddr.toString();
            _builder.append(_string_2, "");
            _builder.append(": ADD R");
            String _string_3 = this.countVar.toString();
            _builder.append(_string_3, "");
            _builder.append(", R");
            String _string_4 = this.countVar.toString();
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
              String _string_5 = this.countaddr.toString();
              _builder.append(_string_5, "");
              _builder.append(": SUB R");
              String _string_6 = this.countVar.toString();
              _builder.append(_string_6, "");
              _builder.append(", R");
              String _string_7 = this.countVar.toString();
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
  
  public CharSequence genVariable(final Variable_declaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Variable_declarator _nameVariable = declaration.getNameVariable();
      boolean _notEquals = (!Objects.equal(_nameVariable, null));
      if (_notEquals) {
        Variable_declarator _nameVariable_1 = declaration.getNameVariable();
        CharSequence _genDeclarator = this.genDeclarator(_nameVariable_1);
        _builder.append(_genDeclarator, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genDeclarator(final Variable_declarator declarator) {
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
                    CharSequence _genString = this.genString(declarator);
                    _builder.append(_genString, "");
                    _builder.newLineIfNotEmpty();
                  } else {
                    String _string_1 = this.countaddr.toString();
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
                  boolean _equals_2 = Objects.equal(_testingSign, null);
                  if (_equals_2) {
                    CharSequence _genIntLiteral = this.genIntLiteral(declarator);
                    _builder.append(_genIntLiteral, "");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          } else {
            Variable_initializer _vari_7 = declarator.getVari();
            Expression _expression_6 = _vari_7.getExpression();
            Logical_Expression_NR _logicalExpression = _expression_6.getLogicalExpression();
            boolean _notEquals_3 = (!Objects.equal(_logicalExpression, null));
            if (_notEquals_3) {
              CharSequence _genSimpleLogical = this.genSimpleLogical(declarator);
              _builder.append(_genSimpleLogical, "");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public void increment() {
    this.countVar++;
  }
  
  public void nextAddress() {
    this.countaddr = Integer.valueOf(((this.countaddr).intValue() + 8));
  }
  
  public CharSequence genString(final Variable_declarator declarator) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = this.countaddr.toString();
    _builder.append(_string, "");
    _builder.append(": LD R");
    String _string_1 = this.countVar.toString();
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
    String _string_3 = this.countaddr.toString();
    _builder.append(_string_3, "");
    _builder.append(": ST ");
    String _nameVariable = declarator.getNameVariable();
    _builder.append(_nameVariable, "");
    _builder.append(", R");
    Integer _integer = new Integer(((this.countVar).intValue() - 1));
    String _string_4 = _integer.toString();
    _builder.append(_string_4, "");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genStringExpression(final Expression expression) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = this.countaddr.toString();
    _builder.append(_string, "");
    _builder.append(": LD R");
    String _string_1 = this.countVar.toString();
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
  
  public CharSequence genSimpleLogical(final Variable_declarator declarator) {
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
        String _string = this.countaddr.toString();
        _builder.append(_string, "");
        _builder.append(": LD R");
        String _string_1 = this.countVar.toString();
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
          String _string_2 = this.countaddr.toString();
          _builder.append(_string_2, "");
          _builder.append(": LD R");
          String _string_3 = this.countVar.toString();
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
        CharSequence _genFullLogicalExpression = this.genFullLogicalExpression(_expression_7, "");
        _builder.append(_genFullLogicalExpression, "");
        _builder.newLineIfNotEmpty();
      } else {
        Variable_initializer _vari_6 = declarator.getVari();
        Expression _expression_8 = _vari_6.getExpression();
        Expression_aux _aux = _expression_8.getAux();
        Expression _logicExp = _aux.getLogicExp();
        boolean _notEquals_5 = (!Objects.equal(_logicExp, null));
        if (_notEquals_5) {
          Variable_initializer _vari_7 = declarator.getVari();
          Expression _expression_9 = _vari_7.getExpression();
          Expression_aux _aux_1 = _expression_9.getAux();
          Expression _logicExp_1 = _aux_1.getLogicExp();
          Variable_initializer _vari_8 = declarator.getVari();
          Expression _expression_10 = _vari_8.getExpression();
          Expression_aux _aux_2 = _expression_10.getAux();
          String _logicOp = _aux_2.getLogicOp();
          CharSequence _genFullLogicalExpression_1 = this.genFullLogicalExpression(_logicExp_1, _logicOp);
          _builder.append(_genFullLogicalExpression_1, "");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    String _string_4 = this.countaddr.toString();
    _builder.append(_string_4, "");
    _builder.append(": ST ");
    String _nameVariable = declarator.getNameVariable();
    _builder.append(_nameVariable, "");
    _builder.append(", R");
    Integer _integer = new Integer(((this.countVar).intValue() - 1));
    String _string_5 = _integer.toString();
    _builder.append(_string_5, "");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genSimpleLogical(final Expression declarator) {
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
        String _string = this.countaddr.toString();
        _builder.append(_string, "");
        _builder.append(": LD R");
        String _string_1 = this.countVar.toString();
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
          String _string_2 = this.countaddr.toString();
          _builder.append(_string_2, "");
          _builder.append(": LD R");
          String _string_3 = this.countVar.toString();
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
      boolean _and_2 = false;
      Logical_Expression_NR _logicalExpression_4 = declarator.getLogicalExpression();
      boolean _notEquals_4 = (!Objects.equal(_logicalExpression_4, null));
      if (!_notEquals_4) {
        _and_2 = false;
      } else {
        Logical_Expression_NR _logicalExpression_5 = declarator.getLogicalExpression();
        Expression _expression = _logicalExpression_5.getExpression();
        boolean _notEquals_5 = (!Objects.equal(_expression, null));
        _and_2 = _notEquals_5;
      }
      if (_and_2) {
        Logical_Expression_NR _logicalExpression_6 = declarator.getLogicalExpression();
        Expression _expression_1 = _logicalExpression_6.getExpression();
        CharSequence _genFullLogicalExpression = this.genFullLogicalExpression(_expression_1, "");
        _builder.append(_genFullLogicalExpression, "");
        _builder.newLineIfNotEmpty();
      } else {
        Expression_aux _aux = declarator.getAux();
        Expression _logicExp = _aux.getLogicExp();
        boolean _notEquals_6 = (!Objects.equal(_logicExp, null));
        if (_notEquals_6) {
          Expression_aux _aux_1 = declarator.getAux();
          Expression _logicExp_1 = _aux_1.getLogicExp();
          Expression_aux _aux_2 = declarator.getAux();
          String _logicOp = _aux_2.getLogicOp();
          CharSequence _genFullLogicalExpression_1 = this.genFullLogicalExpression(_logicExp_1, _logicOp);
          _builder.append(_genFullLogicalExpression_1, "");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    String _string_4 = this.countaddr.toString();
    _builder.append(_string_4, "");
    _builder.append(": BRF R");
    String _string_5 = Integer.valueOf(((this.countVar).intValue() - 1)).toString();
    _builder.append(_string_5, "");
    _builder.append(", #EndWHILE");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genFullLogicalExpression(final Expression expression, final String op) {
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
            String _string = this.countaddr.toString();
            _builder.append(_string, "");
            _builder.append(": AND R");
            String _string_1 = Integer.valueOf(((this.countVar).intValue() - 1)).toString();
            _builder.append(_string_1, "");
            _builder.append(", TRUE");
            _builder.newLineIfNotEmpty();
          } else {
            String _string_2 = this.countaddr.toString();
            _builder.append(_string_2, "");
            _builder.append(": OR R");
            String _string_3 = Integer.valueOf(((this.countVar).intValue() - 1)).toString();
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
              String _string_4 = this.countaddr.toString();
              _builder.append(_string_4, "");
              _builder.append(": AND R");
              String _string_5 = Integer.valueOf(((this.countVar).intValue() - 1)).toString();
              _builder.append(_string_5, "");
              _builder.append(", FALSE");
              _builder.newLineIfNotEmpty();
            } else {
              String _string_6 = this.countaddr.toString();
              _builder.append(_string_6, "");
              _builder.append(": OR R");
              String _string_7 = Integer.valueOf(((this.countVar).intValue() - 1)).toString();
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
        Object _genFullLogicalExpression = this.genFullLogicalExpression(_expression_1, op);
        _builder.append(_genFullLogicalExpression, "");
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
        Object _genFullLogicalExpression_1 = this.genFullLogicalExpression(_logicExp_1, _logicOp);
        _builder.append(_genFullLogicalExpression_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genIntLiteral(final Variable_declarator declarator) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = this.countaddr.toString();
    _builder.append(_string, "");
    _builder.append(": LD R");
    String _string_1 = this.countVar.toString();
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
    String _string_2 = this.countaddr.toString();
    _builder.append(_string_2, "");
    _builder.append(": LD R");
    String _string_3 = this.countVar.toString();
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
        String _string_4 = this.countaddr.toString();
        _builder.append(_string_4, "");
        _builder.append(": ADD R");
        Integer _integer = new Integer(((this.countVar).intValue() - 2));
        String _string_5 = _integer.toString();
        _builder.append(_string_5, "");
        _builder.append(", R");
        Integer _integer_1 = new Integer(((this.countVar).intValue() - 1));
        String _string_6 = _integer_1.toString();
        _builder.append(_string_6, "");
        _builder.append(" , R");
        Integer _integer_2 = new Integer(((this.countVar).intValue() - 2));
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
          String _string_8 = this.countaddr.toString();
          _builder.append(_string_8, "");
          _builder.append(": MUL R");
          Integer _integer_3 = new Integer(((this.countVar).intValue() - 2));
          String _string_9 = _integer_3.toString();
          _builder.append(_string_9, "");
          _builder.append(", R");
          Integer _integer_4 = new Integer(((this.countVar).intValue() - 1));
          String _string_10 = _integer_4.toString();
          _builder.append(_string_10, "");
          _builder.append(" , R");
          Integer _integer_5 = new Integer(((this.countVar).intValue() - 2));
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
            String _string_12 = this.countaddr.toString();
            _builder.append(_string_12, "");
            _builder.append(": DIV R");
            Integer _integer_6 = new Integer(((this.countVar).intValue() - 2));
            String _string_13 = _integer_6.toString();
            _builder.append(_string_13, "");
            _builder.append(", R");
            Integer _integer_7 = new Integer(((this.countVar).intValue() - 1));
            String _string_14 = _integer_7.toString();
            _builder.append(_string_14, "");
            _builder.append(" , R");
            Integer _integer_8 = new Integer(((this.countVar).intValue() - 2));
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
              String _string_16 = this.countaddr.toString();
              _builder.append(_string_16, "");
              _builder.append(": SUB R");
              Integer _integer_9 = new Integer(((this.countVar).intValue() - 2));
              String _string_17 = _integer_9.toString();
              _builder.append(_string_17, "");
              _builder.append(", R");
              Integer _integer_10 = new Integer(((this.countVar).intValue() - 1));
              String _string_18 = _integer_10.toString();
              _builder.append(_string_18, "");
              _builder.append(" , R");
              Integer _integer_11 = new Integer(((this.countVar).intValue() - 2));
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
    String _string_20 = this.countaddr.toString();
    _builder.append(_string_20, "");
    _builder.append(": ST ");
    String _nameVariable = declarator.getNameVariable();
    _builder.append(_nameVariable, "");
    _builder.append(", R");
    Integer _integer_12 = new Integer(((this.countVar).intValue() - 2));
    String _string_21 = _integer_12.toString();
    _builder.append(_string_21, "");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    this.increment();
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genIntLiteralExpression(final Expression expression) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = this.countaddr.toString();
    _builder.append(_string, "");
    _builder.append(": LD R");
    String _string_1 = this.countVar.toString();
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
    String _string_2 = this.countaddr.toString();
    _builder.append(_string_2, "");
    _builder.append(": LD R");
    String _string_3 = this.countVar.toString();
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
        String _string_4 = this.countaddr.toString();
        _builder.append(_string_4, "");
        _builder.append(": ADD R");
        Integer _integer = new Integer(((this.countVar).intValue() - 2));
        String _string_5 = _integer.toString();
        _builder.append(_string_5, "");
        _builder.append(", R");
        Integer _integer_1 = new Integer(((this.countVar).intValue() - 1));
        String _string_6 = _integer_1.toString();
        _builder.append(_string_6, "");
        _builder.append(" , R");
        Integer _integer_2 = new Integer(((this.countVar).intValue() - 2));
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
          String _string_8 = this.countaddr.toString();
          _builder.append(_string_8, "");
          _builder.append(": MUL R");
          Integer _integer_3 = new Integer(((this.countVar).intValue() - 2));
          String _string_9 = _integer_3.toString();
          _builder.append(_string_9, "");
          _builder.append(", R");
          Integer _integer_4 = new Integer(((this.countVar).intValue() - 1));
          String _string_10 = _integer_4.toString();
          _builder.append(_string_10, "");
          _builder.append(" , R");
          Integer _integer_5 = new Integer(((this.countVar).intValue() - 2));
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
            String _string_12 = this.countaddr.toString();
            _builder.append(_string_12, "");
            _builder.append(": DIV R");
            Integer _integer_6 = new Integer(((this.countVar).intValue() - 2));
            String _string_13 = _integer_6.toString();
            _builder.append(_string_13, "");
            _builder.append(", R");
            Integer _integer_7 = new Integer(((this.countVar).intValue() - 1));
            String _string_14 = _integer_7.toString();
            _builder.append(_string_14, "");
            _builder.append(" , R");
            Integer _integer_8 = new Integer(((this.countVar).intValue() - 2));
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
              String _string_16 = this.countaddr.toString();
              _builder.append(_string_16, "");
              _builder.append(": SUB R");
              Integer _integer_9 = new Integer(((this.countVar).intValue() - 2));
              String _string_17 = _integer_9.toString();
              _builder.append(_string_17, "");
              _builder.append(", R");
              Integer _integer_10 = new Integer(((this.countVar).intValue() - 1));
              String _string_18 = _integer_10.toString();
              _builder.append(_string_18, "");
              _builder.append(" , R");
              Integer _integer_11 = new Integer(((this.countVar).intValue() - 2));
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
}
