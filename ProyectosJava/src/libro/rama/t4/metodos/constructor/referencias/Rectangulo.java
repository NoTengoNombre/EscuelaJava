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

	/**
	 * 
	 */
	public Rectangulo() {
		ancho = alto = 0;
	}

	/**
	 * 
	 * @param ancho
	 * @param alto
	 */
	public Rectangulo(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	/**
	 * 
	 * @param dato
	 */
	public Rectangulo(int dato) {
		ancho = alto = dato;
	}

	/**
	 * 
	 * Constructor copia se usa para pasarle los parametros del objeto a otro objeto
	 * de la misma clase
	 * 
	 * @param rectangulo
	 */
	public Rectangulo(Rectangulo rectangulo) {
		this.ancho = rectangulo.getAncho();
		this.alto = rectangulo.getAlto();
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
