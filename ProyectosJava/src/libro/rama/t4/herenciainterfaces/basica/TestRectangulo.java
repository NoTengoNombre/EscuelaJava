/**
 * @see 
 * @since 9 sept. 2018 : 13:21:36
 * @author Formacion
 *
*/

package libro.rama.t4.herenciainterfaces.basica;

public class TestRectangulo {

	public static void main(String[] args) {

		Punto p = new Punto(30, 40);

		Rectangulo r1 = new Rectangulo();
		System.out.println(r1.toString());

		Rectangulo r2 = new Rectangulo(10, 20);
		System.out.println(r2.toString() + " - " + r2.getTipo());

		Rectangulo r3 = new Rectangulo(p);
		System.out.println(r3.toString() + " ");

		Rectangulo r4 = new Rectangulo(p);
		System.out.println(r4.setPunto(p, 12, 22));
		String valores = p.toString();
		System.out.println("Valores de los puntos :" + valores);
		int area = r4.setArea(p);
		System.out.println("Area es : " + area + " cm ");
		System.out.println("Perimetro es de : " + r4.setPerimetro() + " cm ");
		r4.setTipo();
		String nombre = r4.getTipo();
		System.out.println("r4.getTipo :"+ nombre);

	}
}
