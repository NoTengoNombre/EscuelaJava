/**
 * @see 
 * @since 9 sept. 2018 : 12:44:00
 * @author Formacion
 *
*/

package libro.rama.t4.herenciainterfaces.basica;

public interface Figura {

	public String getTipo();
	
	public void setTipo();

	
}

interface Figura2 {
	
	public int setArea(Punto p);
	
	public int setPerimetro();
	
	public Punto setPunto(Punto p , int x , int y);
	
}