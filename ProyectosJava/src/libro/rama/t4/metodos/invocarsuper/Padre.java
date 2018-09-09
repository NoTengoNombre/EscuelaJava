/**
 * @see 
 * @since 9 sept. 2018 : 22:48:27
 * @author Formacion
 *
*/

package libro.rama.t4.metodos.invocarsuper;

public class Padre {

	/**
	 * Atributo clase Padre
	 */
	protected int dato;

	/**
	 * Metodo clase Padre
	 */
	public void metodo() {
		System.out.println("METODO CLASE PADRE");
	}
}

/**
 * 
 *
 */
class Hijo extends Padre {

	/**
	 * Atributo Clase Hijo
	 */
	private int dato;

	/**
	 * Metodo clase Hijo
	 */
	public void metodo() {
		System.out.println("metodo clase hijo");
		super.dato = 10; // Invoca al atributo de la clase PADRE
		dato = 20; // Invoca al atributo de la clase hija
	}

	/**
	 * Metodo clase Hija
	 * 
	 * Invoca al atributo de la clase PADRE
	 */
	public void getDato() {
//		 Invoca al atributo de la clase PADRE
		System.out.println(super.dato);
	}

	/**
	 * • Metodo de la clase hija
	 */
	public void mostrar() {
		this.metodo(); // metodo de la clase hija
		metodo(); // metodo de la clase hija
		super.metodo(); // metodo de la CLASE PADRE
	}
}

class Test {

	public static void main(String[] args) {
		Hijo h = new Hijo();
		h.mostrar();
		h.getDato();

	}
}