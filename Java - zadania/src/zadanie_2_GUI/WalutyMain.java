package zadanie_2_GUI;

import java.awt.Frame;

import javax.swing.JFrame;

import zadanie_1_GUI.Kontener;

public class WalutyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Okno okno = new Okno();
		Waluty kontener = new Waluty();
		
		okno.setVisible(true);
		okno.add(kontener);
		okno.setResizable(false);
	}

}
