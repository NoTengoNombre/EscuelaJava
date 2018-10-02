/**
 * @see 
 * @since 9 sept. 2018 : 18:45:54
 * @author Formacion
 *
*/

package libro.rama.t4.polimorfismo.basico;

public class bEmpleado extends aPersona {

	protected int sueldoBase;

	/**
	 * 
	 * @return
	 */
	public int getSueldo() {
		return sueldoBase;
	}

	/**
	 * 
	 * @param s
	 */
	public void setSueldo(int s) {
		sueldoBase = s + 100;
	}
}

