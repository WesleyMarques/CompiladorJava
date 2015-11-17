package org.xtext.example.mydsl.validation.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classes {	

	private Map<String,Heranca> classes;
	private Map<String, Heranca> interfaces;
	
	public Classes() {
		classes = new HashMap<String, Heranca>();
		interfaces = new HashMap<String, Heranca>();
		
	}
	
	public List<ConstructorObj> getConstructors(String className) {
		Heranca actualCons = classes.get("className");
		return actualCons.getConstructors();
	}

	public void setConstructors(List<ConstructorObj> constructors) {
		Heranca actualCons = classes.get("className");
		actualCons.setConstructors(constructors);
	}
	
	public boolean findClass(String className){
		return classes.containsKey(className);
	}
	
	public boolean findInterface(String interName){
		return interfaces.containsKey(interName);
	}
	
	public void setGlobalVar(Variable vari, String className){
		classes.get(className).setVar(vari);
	}
	
	public void setMethods(Map<String, List<MethodObj>> method, String className){
		classes.get(className).setMethod(method);
	}
	
	public class Heranca{
		private List<String> extendsClass;
		private List<String> implementsInterface;
		private List<Variable> globalVaribles;
		private List<ConstructorObj> constructors;
		

		private Map<String, List<MethodObj>> methodNames;
		
		
		public Heranca() {
			extendsClass = new ArrayList<String>();
			implementsInterface = new ArrayList<String>();
			globalVaribles = new ArrayList<Variable>();
			constructors = new ArrayList<ConstructorObj>();
			methodNames = new HashMap<String, List<MethodObj>>();
			
		}
		
		public void setMethod(Map<String, List<MethodObj>> methods) {
			methodNames = methods;
			
		}

		private boolean findMethod(String method){
			return methodNames.containsKey(method);			
		}
		
		public void setVar(Variable vari) {
			globalVaribles.add(vari);
			
		}

		public List<ConstructorObj> getConstructors() {
			return constructors;
		}


		public void setConstructors(List<ConstructorObj> constructors) {
			this.constructors = constructors;
		}
		
		
		public void addClass(String className){
			extendsClass.add(className);
		}
		
		public void addInterface(String intefaceName){
			implementsInterface.add(intefaceName);			
		}
		
		
	}
	
	

}
