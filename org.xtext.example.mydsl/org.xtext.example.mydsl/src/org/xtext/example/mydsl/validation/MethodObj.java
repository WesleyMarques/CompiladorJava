package org.xtext.example.mydsl.validation;

import java.util.List;

public class MethodObj {
	
	private String name;
	private String returnType;
	private List<String> parameters;
	
	public MethodObj(String name, String returnType, List<String> parameters) {
		this.name = name;
		this.returnType = returnType;
		this.parameters = parameters;
		
	}
	
	public boolean isEqualsParameters(List<String> otherParamters){
		if(otherParamters.size() != this.getParameters().size())return false;
		for (int i = 0; i < otherParamters.size(); i++) {
			if (this.getParameters().get(i) != otherParamters.get(i)) {
				return false;
			}			
		}
		return true;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MethodObj){
			MethodObj newObj = (MethodObj) obj;
			if(newObj.getName().equals(this.name) && isEqualsParameters(newObj.getParameters())){
				return true;
			}
		}
		return false;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getReturnType() {
		return returnType;
	}


	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}


	public List<String> getParameters() {
		return parameters;
	}


	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}
	
	

}
