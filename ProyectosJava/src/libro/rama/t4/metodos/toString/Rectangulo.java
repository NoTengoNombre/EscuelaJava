/**
 * @see 
 * @since 8 sept. 2018 : 20:28:53
 * @author Formacion
 *
*/

package libro.rama.t4.metodos.toString;

/**
 * 
 */
class Rectangulo implements Cloneable {

	private int ancho;
	private int alto;
	private String nombre;

	
	public Rectangulo() {
		ancho = 0;
		alto = 0;
		this.nombre = null; 
	}
	
	/**
	 * 
	 * @param an
	 * @param al
	 */
	public Rectangulo(int an, int al , String nombre) {
		ancho = an;
		alto = al;
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public int getAncho() {
		return this.ancho;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getAlto() {
		return alto;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * 
	 * @return
	 */
	public Rectangulo incrementoAncho() {
		ancho++;
		return this;
	}
	
	/**
	 * 
	 * @return
	 */
	public Rectangulo incrementoAlto() {
		this.alto++;
		return this;
	}
	
	/**
	 * Clona el objeto
	 */
	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException ex) {
			System.out.println("Error al duplicar : " + ex.getCause());
		}
		return object;
	}

}