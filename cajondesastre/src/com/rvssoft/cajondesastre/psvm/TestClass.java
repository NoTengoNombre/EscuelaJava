package com.rvssoft.cajondesastre.psvm;

public class TestClass {

	/*
	 * Parametros desde el programa usando la ventana de Arguments
	 * 
	 * TestClass.java ------ compilamos -----> TestClass.class
	 * 
	 * Para compilar : c:/javac TestClass
	 * 
	 * Para ejecutar pasamos parametros: c:/java TestClass 120 false caracoles
	 * 
	 * javac TestClass
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);	
		System.out.println(args[2]);
	}

}
