package zadanie_1_GUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Oswietlenie_Main {

	public static void main(String[] args) {

		Okno okno = new Okno();
		okno.setVisible(true);
		Kontener kontener = new Kontener();
	
		okno.add(kontener);
		
	}

}


