/**
 * @see 
 * @since 8 sept. 2018 : 22:13:01
 * @author Formacion
 *
*/

package libro.rama.t4.metodos.clase;

public class MetodoStatic {

	/**
	 * 
	 */
	private int dato = 0;

	/**
	 * 
	 */
	private static int datoStatic = 0;

	/**
	 * Constructor llama a una variable Static con 'this'
	 */
	public MetodoStatic() {
		this.datoStatic++;
		--datoStatic;
	}

	/**
	 * Metodo de instancia cambia valor variable de clase
	 */
	public void metodo() {
		datoStatic++;
	}

	public static void main(String[] args) {

		System.out.println("Constructor invoca una variable de instancia pero sin direccion de memoria : "
				+ new MetodoStatic().dato++);

		MetodoStatic ms = new MetodoStatic();

		System.out.println("ms.dato : " + ms.dato++);
		System.out.println("ms.dato : " + ms.dato++);
		
		datoStatic++;

		System.out.println("Variable static llamada desde el Constructor : " + new MetodoStatic().datoStatic);

	}

}
