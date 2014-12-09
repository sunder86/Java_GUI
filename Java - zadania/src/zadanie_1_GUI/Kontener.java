package zadanie_1_GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.jws.Oneway;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;


public class Kontener extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton przyciskWlacz, przyciskWylacz;
	private JPanel panel1, panel2, panel3;
	private JLabel status;
	
	public Kontener(){
		
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		setLayout(new BorderLayout());

		//tworzenie przycisków
		przyciskWlacz = new JButton("Wlacz");
		przyciskWylacz = new JButton("Wylacz");
		
		panel3.setLayout(new BorderLayout ());
		status = new JLabel("Aktualny stan: Wylaczony", SwingConstants.LEFT);
		
		
		
		panel1.add(przyciskWlacz);
		panel1.add(przyciskWylacz);
		panel3.add(status);
		
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);
		add(panel3, BorderLayout.SOUTH);
		
		panel2.setBackground(Color.BLACK);
		przyciskWlacz.setEnabled(true);
		przyciskWylacz.setEnabled(false);
		
		
		
			
		ObslugaZdarzen zmianaNaZolty = new ObslugaZdarzen(Color.YELLOW);
		ObslugaZdarzen zmianaNaCzarny = new ObslugaZdarzen(Color.BLACK);
		
		przyciskWlacz.addActionListener(zmianaNaZolty);
		przyciskWylacz.addActionListener(zmianaNaCzarny);
		
		
	}
	

		private class ObslugaZdarzen implements ActionListener {

		private Color kolor;
	
		/**
		 * @param kolor
		 */
		public ObslugaZdarzen(Color kolor) {
			this.kolor = kolor;
		}

		
		public void actionPerformed(ActionEvent e) {
		panel2.setBackground(kolor);
		
		String info = "Wylaczony";
		
		if (kolor == Color.YELLOW) {
			przyciskWlacz.setEnabled(false);
			przyciskWylacz.setEnabled(true);
			info = "Wlaczony";
			
			
		}
		
		else {
			przyciskWylacz.setEnabled(false);
			przyciskWlacz.setEnabled(true);
			info = "Wylaczony";
			
		}
		
		status.setText("Aktualny stan: " + info);
		
		repaint();
		
		}
		
	}
	
	

}



