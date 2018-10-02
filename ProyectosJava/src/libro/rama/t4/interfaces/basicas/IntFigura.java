/**
 * @see 
 * @since 9 sept. 2018 : 12:19:30
 * @author Formacion
 *
*/

package libro.rama.t4.interfaces.basicas;

public interface IntFigura {

	public int area();

}

class Rectangulo implements IntFigura {

	private int ancho;
	private int alto;

	/**
	 * Por defecto
	 */
	public Rectangulo() {
		this.ancho = 0;
		this.alto = 0;
	}

	/**
	 * Constructor copia
	 * 
	 * @param an
	 * @param al
	 */
	public Rectangulo(int an, int al) {
		this.ancho = an;
		this.alto = al;
	}

	/**
	 * Constructor copia
	 * 
	 * @param rectangulo
	 */
	public Rectangulo(Rectangulo rectangulo) {
		this.ancho = rectangulo.getAncho();
		this.alto = rectangulo.getAlto();
	}

	public int getAlto() {
		return alto;
	}

	public int getAncho() {
		return ancho;
	}

	@Override
	public int area() {
		return (getAlto() + getAncho());
	}
}
