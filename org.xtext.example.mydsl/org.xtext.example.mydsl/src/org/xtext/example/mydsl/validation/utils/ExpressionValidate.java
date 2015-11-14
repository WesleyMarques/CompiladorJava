package org.xtext.example.mydsl.validation.utils;

import org.xtext.example.mydsl.myDsl.Expression;

public class ExpressionValidate {
	
	
	private Expression exp;

	public void validate(Expression exp){
		this.exp = exp;
		if (exp.getLogicalExpression() != null) {
			validExp("logical");
		}
		
	}
	
	private String validExp(String type){
		
		switch (type) {
		case "logical":
			validateLogical(exp);			
			break;

		default:
			break;
		}
		
		
		
		return null;
	}

	private boolean validateLogical(Expression exp) {
		boolean ans = false;
		if(exp.getLogicalExpression() == null){
			return false;
		}else{
			if(exp.getLogicalExpression().getExpression() != null){
				return validateLogical(exp.getLogicalExpression().getExpression());
			}			
		}
		if(exp.getAux() != null){
			
		}
		
		return ans;
		
	}

}
