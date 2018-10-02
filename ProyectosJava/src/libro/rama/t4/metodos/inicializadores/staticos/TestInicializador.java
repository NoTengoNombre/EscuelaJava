/**
 * @see 
 * @since 9 sept. 2018 : 10:48:45
 * @author Formacion
 *
*/

package libro.rama.t4.metodos.inicializadores.staticos;

import java.lang.reflect.Array;

import libro.rama.t4.metodos.constructor.referencias.Rectangulo;

public class TestInicializador {

	static {
		System.out.println("Llamada al inicializador 1 ");
	}

	static {
		System.out.println("Llamada al inicializador 2");

		int x = 0;
		int y = 0;
		int z = 0;

		try {
			z = y / x;

		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
	}

	static {
		Rectangulo r1 = new Rectangulo(10, 20);
		Rectangulo r2 = null;
		r2 = new Rectangulo(r1);

		System.out.println("r1 : Alto : " + r1.getAlto() + " - Ancho : " + r1.getAncho());
		System.out.println("r2 : Alto : " + r2.getAlto() + " - Ancho : " + r2.getAncho());
	}

	static int[] array = { 1, 2, 3, 4, 5 };

	static {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " - ");
		}
		System.out.println();
	}

	/**
	 * Cuando se ejecuta el metodo main se lanza automaticamente el constructor
	 */
	public TestInicializador() {
		System.out.println("Llamada al constructor");
	}

	public static void main(String[] args) {

		TestInicializador t1 = new TestInicializador();
		TestInicializador t2 = new TestInicializador();
		TestInicializador t3 = new TestInicializador();

	}
}
