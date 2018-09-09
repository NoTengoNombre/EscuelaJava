/**
 * @see 
 * @since 9 sept. 2018 : 19:29:53
 * @author Formacion
 *
*/

package libro.rama.t4.polimorfismo.basico2;

public class Test {

	public static void main(String[] args) {

		Persona p1 = new Empleado();

		p1.setNombre("Isaac Sanchez");
// PARA QUE UN METODO DE LA CLASE Empleado pueda 
// ejecutarse desde una REFERENCIA DE LA CLASE Persona
// Tenemos que hacer 'Upcasting'
		((Empleado) p1).setSueldoBase(100);

		System.out.println("Nombre : " + p1.getNombre());

		Empleado e1 = new Encargado();
		e1.setSueldoBase(500);
		((Encargado) e1).setPuesto("Jefe de Almacen");
		System.out.println("Sueldo : " + e1.getSueldo());
		System.out.println("Puesto : " + ((Encargado) e1).getPuesto());

	}
}
