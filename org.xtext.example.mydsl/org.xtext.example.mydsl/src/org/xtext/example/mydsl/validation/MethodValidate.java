package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xtext.example.mydsl.myDsl.Field_declaration;
import org.xtext.example.mydsl.myDsl.Method_declaration;
import org.xtext.example.mydsl.myDsl.Parameter;

public class MethodValidate {

	public Map<String, List<MethodObj>> methodValidateAll(List<Field_declaration> list) throws Exception {
		Map<String, List<MethodObj>> allMethods = new HashMap<String,List<MethodObj>>();
		List<Parameter> parameters;
		
		for (Field_declaration field_declaration : list) {
			if (field_declaration instanceof Method_declaration) {
				Method_declaration md = field_declaration.getMethodName();
				parameters = getAllParameters(md);
				String methodReturnType = returnTypeToString(md);
				MethodObj newMethod = new MethodObj(md.getNameMethod(), methodReturnType, this.filterTypeByParameters(parameters));
				if(!allMethods.containsKey(md.getNameMethod())){
					allMethods.put(md.getNameMethod(), new ArrayList<MethodObj>());
				}
				allMethods.get(md.getNameMethod()).add(newMethod);
			}			
		}
		
		return allMethods;
		
	}

	private String returnTypeToString(Method_declaration md) {
		String methodReturnType = md.getTypeMethod().getTypeSpecifier();
		if(md.getTypeMethod().getTypeVector()!= null){
			methodReturnType += md.getTypeMethod().getTypeVector();
		}
		return methodReturnType;
	}

	private List<Parameter> getAllParameters(Method_declaration md) {
		List<Parameter> parameters = new ArrayList<Parameter>();
		if(md.getParameterListMethod().getParameters()!= null){
			parameters.addAll(md.getParameterListMethod().getParameters());					
		}
		if(md.getParameterListMethod().getParameter() != null){
			parameters.add(md.getParameterListMethod().getParameter());	
		}
		return parameters;
	}
	
	private List<String> filterTypeByParameters(List<Parameter> list){
		List<String> paramsFiltered = new ArrayList<String>();
		String aux = "";
		for (Parameter param : list) {
			aux = param.getType().getTypeSpecifier();
			if(param.getType().getTypeVector() != null){
				aux+= param.getType().getTypeVector();
			}
			paramsFiltered.add(aux);
		}
		return paramsFiltered;
		
	}

}
