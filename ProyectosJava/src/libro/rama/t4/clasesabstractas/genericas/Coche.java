/**
 * @see 
 * @since 9 sept. 2018 : 17:47:21
 * @author Formacion
 *
*/

package libro.rama.t4.clasesabstractas.genericas;

public class Coche extends Vehiculo {

	private double velocidad;

	@Override
	public double getVelocidadActual() {
		return 100 * velocidad;
	}

	@Override
	public int getRuedas() {
		return 4;
	}

	@Override
	public String getColor() {
		return "blanco";
	}

	@Override
	public String getNombre() {
		return "Corsa";
	}

	@Override
	public int getPuertas() {
		return 4;
	}

}
