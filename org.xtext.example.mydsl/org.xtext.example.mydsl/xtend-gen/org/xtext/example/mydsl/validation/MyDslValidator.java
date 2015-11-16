/**
 * generated by Xtext
 */
package org.xtext.example.mydsl.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtex.example.mydsl.exceptions.MyDslException;
import org.xtext.example.mydsl.myDsl.Class_declaration;
import org.xtext.example.mydsl.myDsl.Constructor_declaration;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.Expression_aux;
import org.xtext.example.mydsl.myDsl.Field_declaration;
import org.xtext.example.mydsl.myDsl.Interface_declaration;
import org.xtext.example.mydsl.myDsl.Logical_Expression_NR;
import org.xtext.example.mydsl.myDsl.Method_declaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Statement_block;
import org.xtext.example.mydsl.myDsl.Type_declaration;
import org.xtext.example.mydsl.myDsl.Variable_declaration;
import org.xtext.example.mydsl.myDsl.While_Statement;
import org.xtext.example.mydsl.validation.AbstractMyDslValidator;
import org.xtext.example.mydsl.validation.utils.ConstructorObj;
import org.xtext.example.mydsl.validation.utils.ContructorValidate;
import org.xtext.example.mydsl.validation.utils.MethodObj;
import org.xtext.example.mydsl.validation.utils.MethodValidate;
import org.xtext.example.mydsl.validation.utils.ModifiersValidate;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class MyDslValidator extends AbstractMyDslValidator {
  private final String CLASS = "class";
  
  private final String INTERFACE = "interface";
  
  private final String METHOD = "method";
  
  private final String VARIABLE = "variable";
  
  private final String CONSTRUCTOR = "constructor";
  
  public Map<String, String> typeInValidation = new HashMap<String, String>();
  
  public Map<String, List<String>> classeExtends = new HashMap<String, List<String>>();
  
  public Map<String, List<MethodObj>> methodNames = new HashMap<String, List<MethodObj>>();
  
  public List<ConstructorObj> constructors = new ArrayList<ConstructorObj>();
  
  @Check
  public Object validaTypeDeclaration(final Type_declaration td) {
    Object _xifexpression = null;
    Class_declaration _classDec = td.getClassDec();
    if ((_classDec instanceof Class_declaration)) {
      Object _xblockexpression = null;
      {
        Class_declaration _classDec_1 = td.getClassDec();
        Class_declaration cd = ((Class_declaration) _classDec_1);
        this.typeInValidation.put("tipo", "class");
        String _className = cd.getClassName();
        this.typeInValidation.put("name", _className);
        EList<String> _modifiers = cd.getModifiers();
        ArrayList<String> _arrayList = new ArrayList<String>(_modifiers);
        boolean _contains = _arrayList.contains("abstract");
        String _plus = (Boolean.valueOf(_contains) + "");
        this.typeInValidation.put("abstract", _plus);
        this.validaClass(cd);
        EList<Field_declaration> _fieldsDeclaration = cd.getFieldsDeclaration();
        this.validaFieldDeclaration(_fieldsDeclaration, this.METHOD);
        EList<Field_declaration> _fieldsDeclaration_1 = cd.getFieldsDeclaration();
        this.validaFieldDeclaration(_fieldsDeclaration_1, this.CONSTRUCTOR);
        EList<Field_declaration> _fieldsDeclaration_2 = cd.getFieldsDeclaration();
        _xblockexpression = this.validaFieldDeclaration(_fieldsDeclaration_2, this.VARIABLE);
      }
      _xifexpression = _xblockexpression;
    } else {
      Object _xblockexpression_1 = null;
      {
        Interface_declaration _interfaceDec = td.getInterfaceDec();
        Interface_declaration id = ((Interface_declaration) _interfaceDec);
        this.typeInValidation.put("tipo", "interface");
        String _interfaceName = id.getInterfaceName();
        this.typeInValidation.put("name", _interfaceName);
        EList<String> _modifiers = id.getModifiers();
        ArrayList<String> _arrayList = new ArrayList<String>(_modifiers);
        boolean _contains = _arrayList.contains("abstract");
        String _plus = (Boolean.valueOf(_contains) + "");
        this.typeInValidation.put("abstract", _plus);
        this.validaInterface(id);
        EList<Field_declaration> _fieldsDeclaration = id.getFieldsDeclaration();
        _xblockexpression_1 = this.validaFieldDeclaration(_fieldsDeclaration, this.METHOD);
      }
      _xifexpression = _xblockexpression_1;
    }
    return _xifexpression;
  }
  
  @Check
  public void validExpression(final Expression exp) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from EClass to EStructuralFeature");
  }
  
  public Map<String, List<MethodObj>> validaMethods(final EList<Field_declaration> list) {
    Map<String, List<MethodObj>> _xblockexpression = null;
    {
      MethodValidate mv = new MethodValidate();
      Map<String, List<MethodObj>> _xtrycatchfinallyexpression = null;
      try {
        String _get = this.typeInValidation.get("name");
        Map<String, List<MethodObj>> _methodValidateAll = mv.methodValidateAll(list, _get);
        _xtrycatchfinallyexpression = this.methodNames = _methodValidateAll;
      } catch (final Throwable _t) {
        if (_t instanceof MyDslException) {
          final MyDslException e = (MyDslException)_t;
          MethodObj metAux = null;
          List<Object> _nodeError = e.getNodeError();
          for (final Object methodsError : _nodeError) {
            {
              metAux = ((MethodObj) methodsError);
              String _message = e.getMessage();
              String _string = metAux.toString();
              String _plus = (_message + _string);
              String _plus_1 = (_plus + " in Type ");
              String _get_1 = this.typeInValidation.get("name");
              String _plus_2 = (_plus_1 + _get_1);
              Method_declaration _md = metAux.getMd();
              this.error(_plus_2, _md, 
                MyDslPackage.Literals.METHOD_DECLARATION__NAME_METHOD);
            }
          }
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }
  
  public boolean validaClass(final Class_declaration declaration) {
    boolean _xblockexpression = false;
    {
      try {
        EList<String> _modifiers = declaration.getModifiers();
        this.validaModifiers(_modifiers, this.CLASS);
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          String _message = e.getMessage();
          this.error(_message, declaration, MyDslPackage.Literals.CLASS_DECLARATION__CLASS_NAME);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      EList<String> interfaces = declaration.getInterfacesImplementadas();
      String _interfaceImplementada = declaration.getInterfaceImplementada();
      _xblockexpression = interfaces.add(_interfaceImplementada);
    }
    return _xblockexpression;
  }
  
  public void validaInterface(final Interface_declaration declaration) {
    try {
      EList<String> _modifiers = declaration.getModifiers();
      this.validaModifiers(_modifiers, this.INTERFACE);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _message = e.getMessage();
        this.error(_message, declaration, MyDslPackage.Literals.INTERFACE_DECLARATION__INTERFACE_NAME);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public Object validaFieldDeclaration(final EList<Field_declaration> declaration, final String fieldType) {
    Object _xifexpression = null;
    boolean _equals = fieldType.equals(this.METHOD);
    if (_equals) {
      _xifexpression = this.validaMethods(declaration);
    } else {
      List<ConstructorObj> _xifexpression_1 = null;
      boolean _equals_1 = fieldType.equals(this.CONSTRUCTOR);
      if (_equals_1) {
        _xifexpression_1 = this.validaContructor(declaration);
      } else {
        Object _xifexpression_2 = null;
        boolean _equals_2 = fieldType.equals(this.VARIABLE);
        if (_equals_2) {
          _xifexpression_2 = null;
        }
        _xifexpression_1 = ((List<ConstructorObj>)_xifexpression_2);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public List<ConstructorObj> validaContructor(final EList<Field_declaration> list) {
    List<ConstructorObj> _xblockexpression = null;
    {
      ContructorValidate cv = new ContructorValidate();
      List<ConstructorObj> _xtrycatchfinallyexpression = null;
      try {
        String _get = this.typeInValidation.get("name");
        List<ConstructorObj> _constructorValidateAll = cv.constructorValidateAll(list, _get);
        _xtrycatchfinallyexpression = this.constructors = _constructorValidateAll;
      } catch (final Throwable _t) {
        if (_t instanceof MyDslException) {
          final MyDslException e = (MyDslException)_t;
          ConstructorObj constAux = null;
          List<Object> _nodeError = e.getNodeError();
          int _size = _nodeError.size();
          boolean _equals = (_size == 1);
          if (_equals) {
            List<Object> _nodeError_1 = e.getNodeError();
            Object _get_1 = _nodeError_1.get(0);
            constAux = ((ConstructorObj) _get_1);
            String _message = e.getMessage();
            Constructor_declaration _md = constAux.getMd();
            this.error(_message, _md, MyDslPackage.Literals.CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR);
          }
          List<Object> _nodeError_2 = e.getNodeError();
          for (final Object constError : _nodeError_2) {
            {
              constAux = ((ConstructorObj) constError);
              String _message_1 = e.getMessage();
              String _plus = (_message_1 + constAux);
              String _plus_1 = (_plus + " in Type ");
              String _get_2 = this.typeInValidation.get("name");
              String _plus_2 = (_plus_1 + _get_2);
              Constructor_declaration _md_1 = constAux.getMd();
              this.error(_plus_2, _md_1, 
                MyDslPackage.Literals.CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR);
            }
          }
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }
  
  public void validaModifiers(final EList<String> list, final String type) throws Exception {
    ModifiersValidate modValidate = new ModifiersValidate();
    String typeName = this.typeInValidation.get("name");
    int size = list.size();
    String firstModifier = null;
    if ((size > 0)) {
      String _get = list.get(0);
      firstModifier = _get;
    }
    try {
      boolean _equals = type.equals(this.CLASS);
      if (_equals) {
        modValidate.classValidate(size, firstModifier, typeName, list);
      } else {
        boolean _equals_1 = type.equals(this.INTERFACE);
        if (_equals_1) {
          modValidate.interfaceValidate(size, firstModifier, typeName, list);
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        throw e;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Check
  public void checkMethodDeclaration(final Method_declaration md) {
    ModifiersValidate modValidate = new ModifiersValidate();
    EList<String> methodMods = md.getModifiersMethod();
    int size = methodMods.size();
    try {
      String _nameMethod = md.getNameMethod();
      String _get = this.typeInValidation.get("name");
      String _get_1 = this.typeInValidation.get("abstract");
      Statement_block _statementMethod = md.getStatementMethod();
      boolean _notEquals = (!Objects.equal(_statementMethod, null));
      modValidate.methodValidate(size, _nameMethod, methodMods, _get, _get_1, _notEquals);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _message = e.getMessage();
        this.error(_message, md, MyDslPackage.Literals.METHOD_DECLARATION__NAME_METHOD);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Check
  public Object variableDeclaration(final Variable_declaration vd) {
    return null;
  }
  
  @Check
  public void validWhile(final While_Statement ws) {
    Expression exp = ws.getExpression();
    Expression_aux aux = exp.getAux();
    Logical_Expression_NR _logicalExpression = exp.getLogicalExpression();
    boolean _notEquals = (!Objects.equal(_logicalExpression, null));
    if (_notEquals) {
      while (((!Objects.equal(aux.getLogicalSign(), null)) || (!Objects.equal(exp.getLogicalExpression(), null)))) {
        {
          Expression _exp1 = aux.getExp1();
          exp = _exp1;
          Expression_aux _aux = aux.getAux();
          aux = _aux;
          String _logicalSign = aux.getLogicalSign();
          boolean _equals = Objects.equal(_logicalSign, null);
          if (_equals) {
            this.error("Operando not avalible", aux, MyDslPackage.Literals.EXPRESSION_AUX__LOGICAL_SIGN);
          }
          Logical_Expression_NR _logicalExpression_1 = exp.getLogicalExpression();
          boolean _notEquals_1 = (!Objects.equal(_logicalExpression_1, null));
          if (_notEquals_1) {
            this.error("type not avalible", exp, MyDslPackage.Literals.EXPRESSION__LOGICAL_EXPRESSION);
          }
        }
      }
    } else {
      this.error("parameter of While invalid", exp, MyDslPackage.Literals.EXPRESSION__LOGICAL_EXPRESSION);
    }
  }
}
