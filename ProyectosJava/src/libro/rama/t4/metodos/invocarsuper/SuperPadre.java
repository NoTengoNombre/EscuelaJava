/**
 * @see 
 * @since 9 sept. 2018 : 23:06:16
 * @author Formacion
 *
*/

package libro.rama.t4.metodos.invocarsuper;

public class SuperPadre {

	protected int dato1, dato2;

	public SuperPadre(int x, int y) {
		dato1 = x;
		dato2 = y;
	}

	public SuperPadre() {
		this(5, 5);
	}
}

class MiniHijo extends SuperPadre {

	private int dato1, dato2;

	MiniHijo(int x, int y) {
		super(2, 2);
		dato1 = x;
		dato2 = y;
	}

	public MiniHijo() {
		dato1 = 3;
		dato2 = 3;
	}

	public void getDato() {
		System.out.println("♦ Padre dato1 : " + super.dato1);
		System.out.println("♦ Padre dato1 : " + super.dato2);
		System.out.println("• Padre dato1 : " + this.dato1);
		System.out.println("• Padre dato1 : " + this.dato2);
	}
}

class SuperTest {

	public static void main(String[] args) {
		System.out.println("Prueba Superclase");
		MiniHijo h1 = new MiniHijo();
		h1.getDato();
		MiniHijo h2 = new MiniHijo();
		h2.getDato();
	}
}