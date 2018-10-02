/**
 * @see 
 * @since 9 sept. 2018 : 19:27:20
 * @author Formacion
 *
*/

package libro.rama.t4.polimorfismo.basico2;

public class Empleado extends Persona {

	protected int sueldoBase;

	public int getSueldo() {
		return sueldoBase;
	}

	public void setSueldoBase(int s) {
		sueldoBase = s;
	}

}
