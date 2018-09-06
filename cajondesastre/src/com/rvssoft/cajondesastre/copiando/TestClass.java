package com.rvssoft.cajondesastre.copiando;

import java.util.Arrays;

import com.rvssoft.cajondesastre.model.model5.Perro;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perro p1 = new Perro(100, "Rufus");
		Perro p2 = new Perro(100, "Boby");
		Perro p3 = new Perro(100, "Gueri");

		Perro[] perrera = { p1, p2, p3 };

		// Como crear una copia del array perrera ?

		Perro[] otraPerrera = perrera.clone();

		System.out.println("Los arrays son distintos : " + (perrera == otraPerrera));

		System.out.println(Arrays.toString(perrera));

		// Solo crea un clon del ARRAYS no de los contenidos
		// shallowCopy - Copia Superficial
		// deepCopy - Copia en profundidad
		perrera[2].setNombre("BRUTUS EDITADO");

		System.out.println(Arrays.toString(otraPerrera));

//		Framework de mapping para hacer copias iguales de objetos
		// no tendra los mismo atributos
		// Objeto Empleado puedo copiar el objeto pero puedo prescindir de un atributo como sueldo
//		Clase a y clase b puedo generar un objeto de la clase b mediante la clase a

	}

}
