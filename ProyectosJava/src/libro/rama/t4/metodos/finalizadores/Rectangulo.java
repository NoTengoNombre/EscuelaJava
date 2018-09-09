/**
 * @see libro pag 104
 * @since 9 sept. 2018 : 12:10:17
 * @author Formacion
 *
*/

package libro.rama.t4.metodos.finalizadores;

public class Rectangulo {

	protected void finalize() {
		System.out.println("Adiooos");
	}

}

class TestFinalize {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			// Esta llamando al constructor 20 veces
			Rectangulo r = new Rectangulo();
		}
		// Invoca al finalizador
		System.runFinalization();
		// Invoca al recolector de basura
		System.gc();
	}
}
