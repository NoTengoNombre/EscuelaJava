/**
 * @see 
 * @since 9 sept. 2018 : 15:39:10
 * @author Formacion
 *
*/

package libro.rama.t4.wrapper;

import java.util.Base64.Decoder;

public class UsoMetodoInteger {

	public UsoMetodoInteger() {
		super();
	}

	public static void main(String[] args) {

		int x = new Integer(1);
		if (x == 1) {
			System.out.println("Si es un numero");
		}

		int y = new Integer("1");

		if (y == 1) {
			System.out.println("Si es un numero");
		}

		byte byteValue = new Integer("11").byteValue();

		short shortValue = new Integer("222").shortValue();

		int intValue = new Integer("3333").intValue();

		float floatValue = new Integer("11").floatValue();

		double doubleValue = new Integer("22").doubleValue();

		Number[] arrayNumero = { byteValue, shortValue, intValue, floatValue, doubleValue };

		for (int i = 0; i < arrayNumero.length; i++) {
			System.out.println(arrayNumero[i]);
		}

		Integer int1 = new Integer(22);
		// string here given the value of 65
		String nstr = "65";

		// Returns an Integer object holding the int value
		System.out.println("Actual Integral Number = " + int1.decode(nstr));

		Integer int2 = new Integer("666");

		System.out.println(int2);

		// 2 parametro le indicamos la base 2 , 8 , 10 , 16
		int base2 = Integer.parseInt("101", 2);
		System.out.println(base2);
		int base8 = Integer.parseInt("101", 8);
		System.out.println(base8);
		int base10 = Integer.parseInt("101", 10);
		System.out.println(base10);
		int base16 = Integer.parseInt("101", 16);
		System.out.println(base16);
		
		

	}
}
