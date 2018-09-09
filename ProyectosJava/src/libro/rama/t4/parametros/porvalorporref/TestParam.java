/**
 *	
 * @see 
 * @since 8 sept. 2018:22:42:50
 * @author Formacion
 *
 */
/**
 * 
 *
 */
package libro.rama.t4.parametros.porvalorporref;

public class TestParam {

	public static void cambiar(int x) {
		System.out.println("Por valor : " + x);
		x++;
		
	}

	public static void cambiar2(int[] par) {
		System.out.println("Por Ref : " + par.hashCode() + " Por Ref : " + par[0]);
		par[0]++;
	}

	public static void main(String[] args) {

		int x = 3;
		int[] arrx = { 3 };

		cambiar(x);
		System.out.println("Por valor - Si no sale del metodo no se modifica : " + x);

		cambiar2(arrx);
		System.out.println("Por referencia - Modifico el valor aunque este fuera del metodo : " + arrx[0]);

	}
}