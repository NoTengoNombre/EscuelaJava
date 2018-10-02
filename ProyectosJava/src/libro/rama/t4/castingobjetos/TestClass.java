/**
 * @see 
 * @since 9 sept. 2018 : 21:40:44
 * @author Formacion
 *
*/

package libro.rama.t4.castingobjetos;

/**
 * RECUERDA DE :
 * 
 * HIJO A PADRE ( SIN CASTING)
 * <br>-------------<br>
 * PADRE A HIJO ( CASTING )
 *
 */
public class TestClass {

	public static void main(String[] args) {

		Persona p1 = new Empleado();
		p1.setNombre("Issac Newton");
		((Empleado) p1).setSueldo(100); // DownCasting
		Empleado e1 = new Encargado();
		e1.setSueldo(500);
		((Encargado) e1).setPuesto("Jefe de Almacen"); // DownCasting
		System.out.println("Sueldo : obj 'Empleado' ejecuta metodo de 'Encargado' : " + e1.getSueldo());

		Persona p2 = new Empleado();
		p2.setNombre("Person Second");

		Encargado en1 = new Encargado();
		en1.setNombre("Andres Rosique");
		Empleado.metodoNombreEmpleado((Empleado) p1);

		Persona p3 = new Empleado();
		p3.setNombre("Juan Serrano");

	}
}
