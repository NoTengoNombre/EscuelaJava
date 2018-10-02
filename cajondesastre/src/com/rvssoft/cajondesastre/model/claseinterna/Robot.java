package com.rvssoft.cajondesastre.model.claseinterna;

/**
 * 
 * Clase Principal
 * 
 * @author Formacion
 *
 */
public class Robot {

	/**
	 * Variables de instancia
	 */
	private int x;

	/**
	 * Variable de instancia
	 */
	private DescripcionRobot descripcion;

	/**
	 * Constructor
	 * 
	 * @param x
	 */
	public Robot(int x) {
		this.x = x;
		this.descripcion = new DescripcionRobot();
	}

	/**
	 * Clase Interna , Anidada 
	 * 
	 * Puede ser 'static'
	 * 
	 * Clase anidada tiene acceso a los miembros de la
	 * clase que la contiene
	 * 
	 * Las instancias se crean , ejemplo : 
	 * 
	 * Robot.DescripcionRobot = (new Robot(3)).new DescripcionRobot())
	 * 
	 * Robot.DescripcionRobot
	 * 
	 * @author Formacion
	 *
	 */
	public class DescripcionRobot {

		/**
		 * Variable de instancia
		 */
		private String nombre, color;

		/**
		 * Constructor de la clase interna
		 */
		public DescripcionRobot() {
			if (x > 0) {
				this.nombre = "A";
				this.color = "blanco";
			} else {
				this.nombre = "B";
				this.color = "rojo";
			}
		}
	} // fin de la clase interna

	/**
	 * 
	 * @param d
	 */
	public void avanzar(int d) {
		this.x += d;
	}

	public int valorX() {
		return this.x;
	}

	public void asignarX(int x) {
		this.x = x;
	}

	public String toString() {
		return "Robot(" + this.x + ")";
	}
}


