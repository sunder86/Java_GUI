package zadanie_3_GUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Kalkulator extends JPanel {

	double result;
	char action;
	double liczba1;
	double liczba2;
	private JPanel panel , panelDol;
	private JTextField licznik;
	private JButton jeden, dwa, trzy, dziel, cztery, piec, szesc, mnoz, siedem, osiem, dziewiec, odejmuj, zero, przecinek, rowna, dodaj;
	
	
	public Kalkulator () {
		
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		
		panel = new JPanel();
		panelDol = new JPanel();
		licznik = new JTextField();
		licznik.setPreferredSize(new Dimension(21, 25));
		jeden = new JButton("1");
		dwa = new JButton("2");
		trzy = new JButton("3");
		dziel = new JButton("/");
		cztery = new JButton("4");
		piec = new JButton("5");
		szesc = new JButton("6");
		mnoz = new JButton("*");
		siedem = new JButton("7");
		osiem = new JButton("8");
		dziewiec = new JButton("9");
		odejmuj = new JButton("-");
		zero = new JButton("0");
		przecinek = new JButton(".");
		rowna = new JButton("=");
		dodaj = new JButton("+");
		
		
		panelDol.setLayout(new GridLayout(4,4,2,2));
		panel.setLayout(new GridLayout(1,1));
		
		licznik.setEditable(false);
		panel.add(licznik);
		panel.add(panelDol);
		
		panelDol.add(siedem);
		panelDol.add(osiem);
		panelDol.add(dziewiec);
		panelDol.add(dziel);
		panelDol.add(cztery);
		panelDol.add(piec);
		panelDol.add(szesc);
		panelDol.add(mnoz);
		panelDol.add(jeden);
		panelDol.add(dwa);
		panelDol.add(trzy);
		panelDol.add(odejmuj);
		panelDol.add(zero);
		panelDol.add(przecinek);
		panelDol.add(rowna);
		panelDol.add(dodaj);
		
		
		add(panel, BorderLayout.NORTH);
		add(panelDol, BorderLayout.SOUTH);
		
		
		
		ObslugaZdarzen obsluga = new ObslugaZdarzen(jeden, dwa, trzy, cztery, piec, szesc, siedem, osiem, dziewiec, zero, przecinek);
		
		jeden.addActionListener(obsluga);
		dwa.addActionListener(obsluga);
		trzy.addActionListener(obsluga);
		cztery.addActionListener(obsluga);
		piec.addActionListener(obsluga);
		szesc.addActionListener(obsluga);
		siedem.addActionListener(obsluga);
		osiem.addActionListener(obsluga);
		dziewiec.addActionListener(obsluga);
		zero.addActionListener(obsluga);
		przecinek.addActionListener(obsluga);
		
		
		ObslugaObliczen licz = new ObslugaObliczen(dodaj, dziel, mnoz, odejmuj, rowna);
		
		dziel.addActionListener(licz);
		mnoz.addActionListener(licz);
		odejmuj.addActionListener(licz);
		rowna.addActionListener(licz);
		dodaj.addActionListener(licz);
		
	}
	
	
	private class ObslugaObliczen implements ActionListener {

		private JButton dodaj;
		private JButton dziel;
		private JButton mnoz;
		private JButton odejmuj;
		private JButton rowna;
		
		
		
	


		/**
		 * @param dodaj
		 * @param dziel
		 * @param mnoz
		 * @param odejmuj
		 * @param rowna
		 */
		public ObslugaObliczen(JButton dodaj, JButton dziel, JButton mnoz,
				JButton odejmuj, JButton rowna) {
			this.dodaj = dodaj;
			this.dziel = dziel;
			this.mnoz = mnoz;
			this.odejmuj = odejmuj;
			this.rowna = rowna;
		}



		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			if (event.getSource() == dodaj) {
				
				 	action = '+';
				    liczba1 = Double.parseDouble(licznik.getText());
				    licznik.setText("");
			}
					
			else if (event.getSource() == odejmuj) {
				
				action = '-';
			    liczba1 = Double.parseDouble(licznik.getText());
			    licznik.setText("");
			}
					
			
			else if (event.getSource() == mnoz) {
				
				action = '*';
			    liczba1 = Double.parseDouble(licznik.getText());
			    licznik.setText("");
			}
			
			else if (event.getSource() == dziel) {
				
				action = '/';
			    liczba1 = Double.parseDouble(licznik.getText());
			    licznik.setText("");
			}

			

			else if (event.getSource() == rowna) {
			
			    liczba2 = Double.parseDouble(licznik.getText());
			    doCal();
			}
			
		
		}
			


			void doCal() {
			    switch (action) {
			        case '+': result = liczba1 + liczba2; break;
			        case '-': result = liczba1 - liczba2; break;
			        case '*': result = liczba1 * liczba2; break;
			        case '/': result = liczba1 / liczba2; break;
			    }      
			    licznik.setText(String.valueOf(result));
			
			
			
		
				
				
			
		}
		
	}
		
	

	private class ObslugaZdarzen implements ActionListener {

		private JButton jeden, dwa, trzy, cztery, piec, szesc, siedem, osiem, dziewiec, zero, przecinek;
		
		
		
		/**
		 * @param jeden
		 * @param dwa
		 * @param trzy
		 * @param dziel
		 * @param cztery
		 * @param piec
		 * @param szesc
		 * @param mnoz
		 * @param siedem
		 * @param osiem
		 * @param dziewiec
		 * @param odejmuj
		 * @param zero
		 * @param przecinek
		 * @param rowna
		 * @param dodaj
		 */
		public ObslugaZdarzen(JButton jeden, JButton dwa, JButton trzy,
				JButton cztery, JButton piec, JButton szesc,
				JButton siedem, JButton osiem, JButton dziewiec, JButton zero, JButton przecinek) {
			this.jeden = jeden;
			this.dwa = dwa;
			this.trzy = trzy;
			this.cztery = cztery;
			this.piec = piec;
			this.szesc = szesc;
			this.siedem = siedem;
			this.osiem = osiem;
			this.dziewiec = dziewiec;
			this.zero = zero;
			this.przecinek = przecinek;
		
		}



		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			if (e.getSource() == jeden) {
				
				String s1 = jeden.getText();
				licznik.setText(licznik.getText() + s1);  
				
			}
			
			else if (e.getSource() == dwa) {
				
				String s1 = dwa.getText();
				licznik.setText(licznik.getText() + s1);  
				
			}
			
			
			else if (e.getSource() == trzy) {
				
				String s1 = trzy.getText();
				licznik.setText(licznik.getText() + s1);  
				
			}
			
			else if (e.getSource() == cztery) {
				
				String s1 = cztery.getText();
				licznik.setText(licznik.getText() + s1); 
					
			}
			
			
			else if (e.getSource() == piec) {
				
				String s1 = piec.getText();
				licznik.setText(licznik.getText() + s1); 
			
			}
			
			else if (e.getSource() == szesc) {
				
				String s1 = szesc.getText();
				licznik.setText(licznik.getText() + s1); 
			
			}
			
			
			else if (e.getSource() == siedem) {
				
				String s1 = siedem.getText();
				licznik.setText(licznik.getText() + s1); 
			
			}
			
			else if (e.getSource() == osiem) {
				
				String s1 = osiem.getText();
				licznik.setText(licznik.getText() + s1); 
			
			}
			
			else if (e.getSource() == dziewiec) {
				
				String s1 = dziewiec.getText();
				licznik.setText(licznik.getText() + s1); 
			
			}
			
			else if (e.getSource() == zero) {
				
				String s1 = zero.getText();
				
				licznik.setText(licznik.getText() + s1); 
				
			}
			
			else if (e.getSource() == przecinek){
				
				String s1 = przecinek.getText();
				if (licznik.getText().isEmpty()) 
				{
		            licznik.setText("0."); }
				else
				licznik.setText(licznik.getText() + s1); 
			
			}
			
			
		}
		
		
		
		
	}
	
	
	
}
