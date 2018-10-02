/**
 * @see 
 * @since 8 sept. 2018 : 20:23:35
 * @author Formacion
 *
*/

package libro.rama.t4.metodos.toString;

public class TesteoRectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(10, 20, "Rectangulo 1");
		Rectangulo r2 = new Rectangulo(10, 20, "Rectangulo 2");

		r2.incrementoAncho();
		r2.incrementoAlto();

		r1.setNombre("Chiquito");
		r2.setNombre("Grande");

		System.out.println("Alto : " + r1.getAlto());
		System.out.println("Ancho : " + r1.getAncho());
		System.out.println("Alto : " + r2.getAlto());
		System.out.println("Ancho : " + r2.getAncho());
		System.out.println("Nombre : " + r1.getNombre());
		System.out.println("Nombre : " + r2.getNombre());

		Rectangulo r3 = r1;

		if (r1.equals(r2)) {
			System.out.println("• Iguales r1 y r2(equals)");
		} else {
			System.out.println("•• No son Iguales r1 y r2(equals)");
		}

		if (r1.equals(r3)) {
			System.out.println("• Rectangulo r3 = r1; --> Iguales r1 y r3(equals)");
		} else {
			System.out.println("•• No son Iguales r1 y r3(equals)");
		}

		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());

		Rectangulo r4 = new Rectangulo(30, 40, "Rectangulo r4");

		r4 = (Rectangulo) Rectangulo.deepClone(r3);

		if (r4.equals(r3)) {
			System.out.println("• Rectangulo r4 = r3; --> Iguales r4 y r3(equals) " + r4.toString());
			System.out.println("• Rectangulo r4 = r3; --> Iguales r4 y r3(equals) " + r3.toString());
		} else {
			System.out.println("• Rectangulo r4 = r3; --> No Iguales r4 y r3(equals) " + r4.toString());
			System.out.println("• Rectangulo r4 = r3; --> No Iguales r4 y r3(equals) " + r3.toString());

		}

	}

}
