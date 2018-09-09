/**
 * @see 
 * @since 9 sept. 2018 : 12:43:05
 * @author Formacion
 *
*/

package libro.rama.t4.herenciainterfaces.basica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangulo implements Figura, Figura2 {

	private int base;
	private int altura;
	private static String nombre;

	public Rectangulo() {
		this(0, 0);
	}

	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	/**
	 * Paso para parametro un objeto 'p' con los valores de 'x' e 'y' para
	 * almacenarlos dentro de los atributos de los objetos que instancie de la clase
	 * <b>Rectangulo</b>
	 * 
	 * @param p
	 */
	public Rectangulo(Punto p) {
		base = p.getX();
		altura = p.getY();
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "- Base : " + getBase() + " - Altura : " + getAltura();
	}

	/**
	 * Le paso un objeto de tipo 'p' le extraigo los valores 'x' e 'y' los almaceno
	 * en varias variables y devuelvo su valor
	 *
	 */
	@Override
	public int setArea(Punto p) {
		int base, altura;
		base = p.getX();
		altura = p.getY();
		return (base * altura);
	}

	@Override
	public int setPerimetro() {
		return ((2 * getBase()) + (2 * getAltura()));
	}

	@Override
	public Punto setPunto(Punto p, int x, int y) {
		p.setX(x);
		p.setY(y);
		return p;
	}

	@Override
	public void setTipo() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		try {
			System.out.println("Introduce un nombre : ");
			nombre = bf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getTipo() {
		return nombre;
	}

}
