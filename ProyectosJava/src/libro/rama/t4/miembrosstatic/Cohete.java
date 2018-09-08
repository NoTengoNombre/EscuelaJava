/**
 * @see 
 * @since 8 sept. 2018 : 21:23:59
 * @author Formacion
 *
*/

package libro.rama.t4.miembrosstatic;

public class Cohete {

	private static int numCohetes = 0;

	public Cohete() {
		numCohetes = 0;
	}

	public void setCohete(int num) {

		int i;

		for (i = 0; i < num; i++) {
			this.setCohete(i++);
		}
		Cohete.numCohetes = i * 2 ;
	}

	public int getCohete() {
		return numCohetes;
	}

	public static void main(String[] args) {

		Cohete c1 = new Cohete();
		Cohete c2 = new Cohete();
		Cohete c3 = new Cohete();

		c1.setCohete(10);

		System.out.println(c1.getCohete());

	}
}
