/**
 * @see 
 * @since 8 sept. 2018 : 22:57:20
 * @author Formacion
 *
*/

package libro.rama.t4.metodos.constructor;

import java.util.Date;
import java.util.GregorianCalendar;

public class Constructores {

	private Date alta;

	public Constructores() {

		GregorianCalendar cal = new GregorianCalendar(1984, 10, 15);
		System.out.println(alta = cal.getTime());
	}

	public Date getAlta() {
		return alta;
	}

	public static void main(String[] args) {

		System.out.println(new Constructores());

	}
}
