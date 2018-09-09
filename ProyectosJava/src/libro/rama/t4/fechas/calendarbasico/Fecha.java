/**
 * @see 
 * @since 9 sept. 2018 : 17:27:33
 * @author Formacion
 *
*/

package libro.rama.t4.fechas.calendarbasico;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {

	public static void main(String[] args) {

		Date d = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(d);

		int day = gc.get(Calendar.DAY_OF_MONTH);
		int mes = gc.get(Calendar.MONTH) + 1;
		int anio = gc.get(Calendar.YEAR);

		System.out.println("dia : " + day + " mes : " + mes + " anio " + anio);

	}
}
