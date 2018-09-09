/**
 * @see 
 * @since 9 sept. 2018 : 19:28:44
 * @author Formacion
 *
*/

package libro.rama.t4.polimorfismo.basico2;

/**
 * Soy una Subclase de Empleado
 *
 */
public class Encargado extends Empleado {

	private String puesto;

	/**
	 * Este metodo es propio de la clase Encargado
	 * 
	 * Para poderlo ejecutar como Empleado necesita un UpCasting
	 * 
	 * @param puesto
	 * @return
	 */
	public String getPuesto() {
		return puesto;
	}
	
	public void setPuesto(String puesto){
		this.puesto = puesto;
	}

	/**
	 *  Este metodo pertenece a la clase Empleado
	 */
	public int getSueldo() {
		Double d = new Double(sueldoBase * 1.1);
		return d.intValue();
	}
}
