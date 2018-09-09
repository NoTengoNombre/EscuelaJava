/**
 * @see 
 * @since 9 sept. 2018 : 18:50:49
 * @author Formacion
 *
*/

package libro.rama.t4.polimorfismo.basico;

public class cEncargado extends bEmpleado {

	/**
	 * Metodo especifico para la clase Encargado heredado Empleado
	 */
	public int getSueldo() {
		Double d = new Double(sueldoBase + 500);
		return d.intValue();
	}
}
