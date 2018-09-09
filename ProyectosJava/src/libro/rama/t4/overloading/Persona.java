/**
 * @see 
 * @since 9 sept. 2018 : 21:21:34
 * @author Formacion
 *
*/

package libro.rama.t4.overloading;

public class Persona {

	private int sinsegundo = 0;
	private String nombre;
	private String apellido1;
	private String apellido2;

	public void setNombre(String nom, String ape1) {
		nombre = nom;
		apellido1 = ape1;
	}

	public void setNombre(String nom, String ape1, String ape2) {
		nombre = nom;
		apellido1 = ape1;
		apellido2 = ape2;
	}

}
