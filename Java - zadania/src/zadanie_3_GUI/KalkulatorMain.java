/**
 * 
 */
package zadanie_3_GUI;

/**
 * @author DOM
 *
 */
public class KalkulatorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Okno okno = new Okno ();
		Kalkulator glowne = new Kalkulator();
		
		okno.setVisible(true);
		okno.add(glowne);
		okno.setSize(240, 165);
		okno.setResizable(false);
	}

}
