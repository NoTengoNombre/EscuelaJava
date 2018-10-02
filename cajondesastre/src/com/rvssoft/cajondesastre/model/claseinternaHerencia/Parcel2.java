package com.rvssoft.cajondesastre.model.claseinternaHerencia;

/**
 * Retorno de una referencia a una clase interna
 * 
 * @author Formacion
 *
 */
public class Parcel2 {

	/**
	 * Clase interna
	 * 
	 * @author Formacion
	 *
	 */
	class Contents {

		private int i = 11;

		/**
		 * 
		 * @return valor : 11
		 */
		public int value() {
			return i;
		}
	}

	/**
	 * 
	 * @author Formacion
	 *
	 */
	class Destination {

		/**
		 * 
		 */
		private String label;

		/**
		 * 
		 * @param whereTo
		 */
		Destination(String whereTo) {
			label = whereTo;
		}

		/**
		 * Devuelve un objeto 'String' label
		 * 
		 * @return
		 */
		String readLabel() {
			return label;
		}
	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public Destination Destinationto(String s) {
		return new Destination(s);
	}

	/**
	 * 
	 * @return
	 */
	public Contents cont() {
		return new Contents();
	}

	/**
	 * 
	 * @param dest
	 */
	public void ship(String dest) {
		Contents con = cont();
		Destination d = Destinationto(dest);
		System.out.println(d.readLabel());
	}

	public static void main(String[] args) {
//		ClaseEx  
		Parcel2 parcel1 = new Parcel2();
		parcel1.ship("Tanzania");

		Parcel2 parcel2 = new Parcel2();		
		// Definiendo una referencia a una clase interna
		Parcel2.Contents c = parcel2.cont();
//     ClaseExt.ClaseInter      objeExt.ConstructorClaseInterna 
		Parcel2.Destination d = parcel2.Destinationto("Borneo");
	}
}
