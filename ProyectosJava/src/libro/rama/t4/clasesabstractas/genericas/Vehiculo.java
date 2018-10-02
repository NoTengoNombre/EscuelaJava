/**
 * @see 
 * @since 9 sept. 2018 : 17:43:13
 * @author Formacion
 *
*/

package libro.rama.t4.clasesabstractas.genericas;

public abstract class Vehiculo {

	private double peso;

	private int numeroPuertas;
	
	public abstract double getVelocidadActual();

	public abstract int getRuedas();

	public abstract String getColor();
	
	public abstract String getNombre();

	public abstract int getPuertas();

	
	public void setPeso(double p) {
		peso = p;
	}
	
	public Vehiculo() {
		this.peso = 0;
	}
	
	
}
