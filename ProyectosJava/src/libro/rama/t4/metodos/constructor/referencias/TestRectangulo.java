/**
 * @see 
 * @since 9 sept. 2018 : 10:01:40
 * @author Formacion
 *
*/

package libro.rama.t4.metodos.constructor.referencias;

public class TestRectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(5,7);
		Rectangulo r2 = new Rectangulo();

		r1 = r2;

		r2.incrementarAlto();
		r2.incrementarAncho();

		System.out.println("Alto : " + r1.getAlto() + " - Ancho : " + r1.getAncho());

	}
}
