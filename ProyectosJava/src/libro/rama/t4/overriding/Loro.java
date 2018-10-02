/**
 * @see 
 * @since 9 sept. 2018 : 21:12:36
 * @author Formacion
 *
*/

package libro.rama.t4.overriding;

public class Loro extends Pajaro {

	protected String pedigri;

	@Override
	public String getDetalles() {
		return "Nombre : " + nombre + " \n " + " Color : " + color + " \n " + "Perigri : " + pedigri;
	}
}
