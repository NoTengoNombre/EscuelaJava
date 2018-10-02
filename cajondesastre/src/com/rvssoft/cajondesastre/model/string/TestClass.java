package com.rvssoft.cajondesastre.model.string;

public class TestClass {

	public static void main(String[] args) {

		String nombre = "Pepin";

		// Para que ambos objetos tenga la misma referencia
		nombre = nombre.toUpperCase();
		// Ahora nombre es el mismo objeto pero machaco los valores anterior
		System.out.println(nombre);

		String resultado = "";

		for (int i = 0; i < 100; i++) {
			// Penaliza mucho concatenar string
			resultado += String.valueOf(i);
		}
		System.out.println(resultado);

		// Ganas en Performance
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 100; i++) {
//			sb.append(String.valueOf(i));
			sb.append(i);
		}
		String resultado2 = sb.toString();
		
		System.out.println(resultado);
	}
}
