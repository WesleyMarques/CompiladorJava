/**
 * generated by Xtext
 */
package org.xtext.example.mydsl.validation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.example.mydsl.myDsl.Class_declaration;
import org.xtext.example.mydsl.myDsl.Field_declaration;
import org.xtext.example.mydsl.myDsl.Interface_declaration;
import org.xtext.example.mydsl.myDsl.Method_declaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Type_declaration;
import org.xtext.example.mydsl.validation.AbstractMyDslValidator;
import org.xtext.example.mydsl.validation.ModifiersValidate;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class MyDslValidator extends AbstractMyDslValidator {
  private final String CLASS = "class";
  
  private final String INTERFACE = "interface";
  
  public Map<String, String> typeInValidation = new HashMap<String, String>();
  
  public Map<String, List<String>> classeExtends = new HashMap<String, List<String>>();
  
  public Map<String, List<String>> methodNames = new HashMap<String, List<String>>();
  
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
        _xblockexpression = this.validaClass(cd);
      }
      _xifexpression = _xblockexpression;
    } else {
      Interface_declaration _interfaceDec = td.getInterfaceDec();
      Interface_declaration id = ((Interface_declaration) _interfaceDec);
      this.typeInValidation.put("tipo", "interface");
      String _interfaceName = id.getInterfaceName();
      this.typeInValidation.put("name", _interfaceName);
      this.validaInterface(id);
    }
    return _xifexpression;
  }
  
  public Object validaClass(final Class_declaration declaration) {
    Object _xblockexpression = null;
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
      interfaces.add(_interfaceImplementada);
      for (final String interfaceName : interfaces) {
        this.validaHerancaInterface(declaration, interfaceName);
      }
      String _classHerdada = declaration.getClassHerdada();
      _xblockexpression = this.validaHerancaClass(_classHerdada);
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
    EList<Field_declaration> _fieldsDeclaration = declaration.getFieldsDeclaration();
    for (final Field_declaration field : _fieldsDeclaration) {
      this.validaFieldDeclaration(field);
    }
  }
  
  public Object validaFieldDeclaration(final Field_declaration declaration) {
    return null;
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
  
  public Object validaHerancaClass(final String string) {
    return null;
  }
  
  public Object validaHerancaInterface(final Class_declaration declaration, final String string) {
    return null;
  }
  
  @Check
  public void checkMethodDeclaration(final Method_declaration md) {
    ModifiersValidate modValidate = new ModifiersValidate();
    EList<String> methodMods = md.getModifiersMethod();
    int size = methodMods.size();
    try {
      String _nameMethod = md.getNameMethod();
      String _get = this.typeInValidation.get("name");
      modValidate.methodValidate(size, _nameMethod, methodMods, _get);
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
}
