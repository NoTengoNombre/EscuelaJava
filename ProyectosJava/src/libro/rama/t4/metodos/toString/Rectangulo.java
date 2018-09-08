/**
 * @see 
 * @since 8 sept. 2018 : 20:28:53
 * @author Formacion
 *
*/

package libro.rama.t4.metodos.toString;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 */
class Rectangulo implements Cloneable, Serializable {

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
	public Rectangulo(int an, int al, String nombre) {
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

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
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

	/**
	 * Funciones static
	 * 
	 * @param object
	 * @return devuelve objeto o 'null'
	 */
	public static Object deepClone(Object object) {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			return ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}