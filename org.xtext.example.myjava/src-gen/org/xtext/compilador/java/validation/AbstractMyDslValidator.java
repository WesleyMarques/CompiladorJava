/*
 * generated by Xtext
 */
package org.xtext.compilador.java.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractMyDslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.compilador.java.myDsl.MyDslPackage.eINSTANCE);
		return result;
	}
}