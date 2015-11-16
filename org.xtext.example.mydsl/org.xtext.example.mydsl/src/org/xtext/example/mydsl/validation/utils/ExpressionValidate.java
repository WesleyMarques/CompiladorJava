package org.xtext.example.mydsl.validation.utils;

import org.xtext.example.mydsl.myDsl.Expression;

public class ExpressionValidate {
	
	
	private Expression exp;

	public void validate(Expression exp) throws Exception{
		this.exp = exp;
		if (exp.getLogicalExpression() != null) {
			if(!validExp("logical")){
				throw new Exception("Expression not well formed");
			}
		}else{
			
		}
		
	}
	
	private boolean validExp(String type){
		
		switch (type) {
		case "logical":
			return validateLogical(exp);			

		default:
			break;
		}
		
		
		
		return false;
	}

	private boolean validateLogical(Expression exp) {
		boolean ans = false;
		if(exp.getLogicalExpression() == null){
			return false;
		}else{
			if(exp.getLogicalExpression().getExpression() != null){
				ans = validateLogical(exp.getLogicalExpression().getExpression());
			}else if(exp.getLogicalExpression().getFalse() != null || exp.getLogicalExpression().getTrue() != null){			
				ans = true;
			}else{
				return false;
			}
		}
		if(exp.getAux() != null){
			if(exp.getAux().getLogicOp() != null && exp.getAux().getLogicExp() != null){
				return ans && validateLogical(exp.getAux().getLogicExp());
			}else if(exp.getAux().getLogicOp() == null && exp.getAux().getLogicExp() == null){
				return ans && true;
			}else{
				return false;
			}
		}
		return ans;
		
	}

}
