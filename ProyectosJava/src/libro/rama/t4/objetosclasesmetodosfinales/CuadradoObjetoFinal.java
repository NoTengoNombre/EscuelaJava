/**
 * @see 
 * @since 9 sept. 2018 : 17:55:48
 * @author Formacion
 *
*/

package libro.rama.t4.objetosclasesmetodosfinales;

public class CuadradoObjetoFinal {

	public static void main(String[] args) {

		// OBJETO FINAL
		final Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
//		c1 = c2; // No puede apuntar c1 a la referencia de c2

	}
}

final class Cuadrado {

	private int numero;
	private String color;

	/**
	 * Metodo final : No va a cambiar : NO SE PUEDE SOBRESCRIBRIR NI HEREDAR
	 * 
	 * @param s
	 */
	public final void setColor(String s) {
		color = s;
	}

}
