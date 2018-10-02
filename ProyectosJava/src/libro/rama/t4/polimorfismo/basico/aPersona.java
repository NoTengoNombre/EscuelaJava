/**
 * @see 
 * @since 9 sept. 2018 : 18:51:05
 * @author Formacion
 *
*/

package libro.rama.t4.polimorfismo.basico;

public class aPersona {

	private String nombre;

	protected int sueldoBase;

	/**
	 * 
	 * @param nom
	 */
	public void setNombre(String nom) {
		this.nombre = nom;
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param i
	 */
	public void setSueldoBase(int i) {
		this.sueldoBase = i;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Nombre : " + getNombre() + " Sueldo " + sueldoBase;
	}

}
