package com.rvssoft.cajondesastre.model.claseinternaHerencia;

/**
 * Herencia de una clase interna
 * 
 * @author Formacion
 *
 */
public class WithInner {

	class Inner {

	}

	/**
	 * 
	 * @author Formacion
	 *
	 */
	public class InheritInner extends WithInner.Inner {
		InheritInner(WithInner wi) {
			wi.super();
		}
	}

	public static void main(String[] args) {
		WithInner wi = new WithInner();
//		InheritInner ii = new InheritInner(wi);
	}

}
