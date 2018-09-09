/**
 * @see 
 * @since 9 sept. 2018 : 21:34:01
 * @author Formacion
 *
*/

package libro.rama.t4.castingobjetos;

/**
 * SUPERCLASE :
 * 
 * Clase Persona solo tiene el nombre
 *
 */
public class Persona {

	private String nombre;
	private String apellido1;
	private String apellido2;

	public void setNombre(String nom, String ape1, String ape2) {
		nombre = nom;
		apellido1 = ape1;
		apellido2 = ape2;
	}

	public void setNombre(String nom, String ape1) {
		nombre = nom;
		apellido1 = ape1;
	}

	public void setNombre(String nom) {
		nombre = nom;
	}

	/**
	 * Metodo Original de la clase Padre
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

}
