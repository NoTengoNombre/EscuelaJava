/**
 * @see 
 * @since 9 sept. 2018 : 18:46:18
 * @author Formacion
 *
*/

package libro.rama.t4.polimorfismo.basico;

public class dJefatura extends bEmpleado {

	/**
	 * Metodo especifico para la clase Empleado heredado
	 */
	public int getSueldo() {
		Double d = new Double(sueldoBase + 1000);
		return d.intValue();
	}

}
