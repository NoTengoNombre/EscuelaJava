/**
 * @see 
 * @since 9 sept. 2018 : 12:46:00
 * @author Formacion
 *
*/

package libro.rama.t4.herenciainterfaces.basica;

public class Punto {

	private int x;
	private int y;

	public Punto() {
		this.x = 0;
		this.y = 0;
	}

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punto(Punto p) {
		this.x = p.getX();
		this.y = p.getY();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return " • Obtener Y : " + this.getY() + " Obtener X : " + this.getX();
	}

}
