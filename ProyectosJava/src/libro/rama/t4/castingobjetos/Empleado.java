/**
 * @see 
 * @since 9 sept. 2018 : 21:35:15
 * @author Formacion
 *
*/

package libro.rama.t4.castingobjetos;

/**
 * 
 * Clase HIJA :
 * 
 * Empleado tiene solo el Sueldo
 *
 */
public class Empleado extends Persona {

	protected int sueldoBase;

	public int getSueldo() {
		return sueldoBase;
	}

	public void setSueldo(int sueldo) {
		this.sueldoBase = sueldo;
	}

	/**
	 * Metodo Clase Hija
	 * 
	 * @param e
	 */
	public static void metodoNombreEmpleado(Empleado e) {
		System.out.println(e.getNombre());

	}
}
