/**

 * @since 9 sept. 2018 : 10:01:40
 * @author Formacion
 *
*/

package libro.rama.t4.metodos.constructor.referencias;

public class TestRectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(5, 7);
		Rectangulo r2 = new Rectangulo();

		// Cuando haces una asignación como esta
		// Ambas referencias apunta a la
		// misma posicion de memoria del objeto
		r2 = r1;

		r2.incrementarAlto();
		r2.incrementarAncho();

		System.out.println("Alto : " + r1.getAlto() + " - Ancho : " + r1.getAncho());

		Rectangulo r3 = new Rectangulo(11, 12);
		Rectangulo r4 = new Rectangulo(r3);

		System.out.println("r3 - Alto : " + r3.getAlto() + " - Ancho : " + r3.getAncho());
		System.out.println("r4 -- Alto : " + r4.getAlto() + " - Ancho : " + r4.getAncho());
		
	}
}
