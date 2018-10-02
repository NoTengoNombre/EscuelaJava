/**
 * @see 
 * @since 9 sept. 2018 : 17:05:37
 * @author Formacion
 *
*/

package libro.rama.t4.wrapper;

public class UsarInteger {

	public static void main(String[] args) {

		Integer i1 = new Integer(5);
		Integer i2 = new Integer("7");

		String s1 = i1.toString();
		System.out.println(s1);

		int i3 = Integer.parseInt("10", 10);
		System.out.println(i3);

		int i4 = Integer.parseInt("10", 8);
		System.out.println(i4);

		int i5 = Integer.parseInt("BABA", 16);
		System.out.println(i5);
		System.out.printf("Integer.parseInt(\"BABA\", %d 16) : ", i5);

		System.out.println(Integer.toOctalString(i4));
		System.out.println(Integer.toHexString(i5));

		int i6 = Integer.valueOf("22");
		System.out.println("Integer.valueOf(\"22\") : " + i6);
		System.out.println("Integer.toOctalString(i4) : " + Integer.toOctalString(i4));
		System.out.println("Integer.toHexString(i5) : " + Integer.toHexString(i5));

		int i7 = Integer.valueOf("22").intValue();
		System.out.println(i7);

		
	}

}
