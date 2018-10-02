package com.rvssoft.helloword.servicios;

public class NumberFormatter {

	private static final String[] UNIDADES =
		{ "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho","nueve" };
	private static final String[] DECENAS = 
		{ "", "", "", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta","ochenta", "noventa" };
	private static final String[] CENTENAS = 
		{ "", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos",
			"seiscientos", "setecientos", "ochocientos", "novecientos" };
	private static final String[] EXCEPCIONES = { "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis",
			"diecisiete", "dieciocho", "diecinueve", "veinte", "veintiuno", "veintidÛs", "veintitrés", "veinticuatro",
			"veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve" };

	public static String convert(String strNumero) {

		int numero = Integer.parseInt(strNumero);
		String resultado = "";

		if (numero == 100)
			return "cien";
		if (numero == 0)
			return "cero";

		int c = numero / 100;
		int d = numero % 100 / 10;
		int u = numero % 10;

		int du = d * 10 + u;
		boolean excepcion = (du > 9 && du < 30) ? true : false;

		resultado = UNIDADES[u];

		if (excepcion) {
			resultado = EXCEPCIONES[du - 10];
		} else {
			resultado = DECENAS[d] + ((d == 0 || u == 0) ? "" : " y ") + resultado;
		}

		return CENTENAS[c] + " " + resultado;
	}
}
