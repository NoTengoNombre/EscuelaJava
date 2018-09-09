/**
 * @see 
 * @since 9 sept. 2018 : 9:55:10
 * @author Formacion
 *
*/

package libro.rama.t4.metodos.constructor.referencias;

public class Rectangulo {

	private int ancho;
	private int alto;

	public Rectangulo() {
		ancho = alto = 0;
	}

	public Rectangulo(int dato) {
		ancho = alto = dato;
	}

	public Rectangulo(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	public int getAncho() {
		return this.ancho;
	}

	public int getAlto() {
		return this.alto;
	}

	public Rectangulo incrementarAncho() {
		ancho++;
		return this;
	}

	public Rectangulo incrementarAlto() {
		alto++;
		return this;
	}
}
