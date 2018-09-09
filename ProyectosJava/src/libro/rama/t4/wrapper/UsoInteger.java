/**
 * @see 
 * @since 9 sept. 2018 : 15:39:10
 * @author Formacion
 *
*/

package libro.rama.t4.wrapper;

public class UsoInteger {

	String y;

	public UsoInteger(int i) {
		y = String.valueOf(i);
	}

	public static void main(String[] args) {

		int x = Integer.min(10, 20);
		System.out.println("Crear : " + x);


	}
}
