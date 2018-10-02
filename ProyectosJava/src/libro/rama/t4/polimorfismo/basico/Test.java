/**
 * @see 
 * @since 9 sept. 2018 : 18:56:35
 * @author Formacion
 *
*/

package libro.rama.t4.polimorfismo.basico;

public class Test {

	public static void main(String[] args) {

		// PADRE --------- HIJA
		aPersona p1 = new bEmpleado();
		p1.setNombre("Isaac Sanches");
		p1.setSueldoBase(100);

		System.out.println(p1.toString());
		
		bEmpleado p2  = new cEncargado();
		p2.setSueldoBase(100);
		
		System.out.println(p2.toString());
		

	}
}
