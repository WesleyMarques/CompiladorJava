/*
 * generated by Xtext
 */
package org.xtext.compilador.java;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MyDslStandaloneSetup extends MyDslStandaloneSetupGenerated{

	public static void doSetup() {
		new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

