package com.rvssoft.cajondesastre.model.ciclodevida;

import javax.annotation.PostConstruct;

//Todo static 
//Todo Bloque de inicializacion
//Todo de instancia
public class Foo {

	static {
		int i = 0;
		System.out.println("Solo me inicializo una " + (++i) + "");
	}

	{
		System.out.println("Bloque de inicializacion - Se genera cada vez que instancia un objeto de la clase");
	}

	static {
		int i = 0;
		System.out.println("Solo me inicializo una " + (++i) + "");
	}

	{
		System.out.println("Bloque de inicializacion - Se genera cada vez que instancia un objeto de la clase");
	}

	static {
		int i = 0;
		System.out.println("Solo me inicializo una " + (++i) + "");
	}

	{
		System.out.println("Bloque de inicializacion - Se genera cada vez que instancia un objeto de la clase");
	}

	private static int n2 = 666;

	private int n1 = 100;

	/**
	 * Instancia una clase se almacena en la logica del programa
	 */
	public Foo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Prolongar la fase de construcción
	 * 
	 * Se ejecuta antes de que se genere un constructor
	 * 
	 * PostConstruct Se ejecuta antes de que se genere un constructor
	 */
	@PostConstruct
	public void xxxxxxxxxxx() {
		System.out.println("Soy el postconstruct - se gestiona desde fuera");
	}

}
