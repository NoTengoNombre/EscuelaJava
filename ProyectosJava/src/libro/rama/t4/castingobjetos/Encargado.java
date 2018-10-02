/**
 * @see 
 * @since 9 sept. 2018 : 21:35:24
 * @author Formacion
 *
*/

package libro.rama.t4.castingobjetos;

/**
 * CLASE NIETA :
 * 
 * Solo tiene el setPuesto
 *
 */
public class Encargado extends Empleado {

	private String puesto;

	public int getSueldo() {
		Double d = new Double(sueldoBase * 1.1);
		return d.intValue();
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getPuesto() {
		return puesto;
	}

}
