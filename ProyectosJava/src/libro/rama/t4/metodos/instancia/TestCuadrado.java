/**
 *	
 * @see 
 * @since 8 sept. 2018:21:50:39
 * @author Formacion
 *
 */
package libro.rama.t4.metodos.instancia;

public class TestCuadrado {

	public static int var;
	public int var2;

	public TestCuadrado() {
		var = 3;
		var2 = 5;
	}

	public static void main(String[] args) {

		int tc = new TestCuadrado().var2;

		System.out.println("Valores 1 : " + var);
		System.out.println("Valores 2 : " + tc);

	}

}
