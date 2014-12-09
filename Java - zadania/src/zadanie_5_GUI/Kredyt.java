package zadanie_5_GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Kredyt extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField pierwszy, drugi, trzeci, czwarty, piaty;
	private JButton oblicz;
	private JLabel kwota, oprocentowanie, okresKredytowania, lata, miesiace, kapitalizacja, miesieczna, kwartalna, raty, rowne, malejace, koszt, odestki, procent;
	private JCheckBox okresLata, okresMiesiace, kapitalMiesieczna, kapitalKwartalna, ratyRowne, ratyMalejace;
	
	
	public Kredyt() {
		
		SpringLayout spring = new SpringLayout();
		this.setLayout(spring);
		
		pierwszy = new JTextField(15);
		drugi = new JTextField(5);
		trzeci = new JTextField(4);
		czwarty = new JTextField(15);
		piaty = new JTextField(15);
		pierwszy.setInputVerifier(new MyInputVerifier());
		drugi.setInputVerifier(new MyInputVerifier());
		trzeci.setInputVerifier(new MyInputVerifier2());
		
		oblicz = new JButton("Oblicz");
		
		kwota = new JLabel("Kwota kredytu: ");
		oprocentowanie = new JLabel("Oprocentowanie nominalne: ");
		procent = new JLabel("%");
		okresKredytowania = new JLabel("Okres kredytowania: ");
		lata = new JLabel("lata");
		miesiace = new JLabel("miesiace");
		kapitalizacja = new JLabel("Kapitalizacja: ");
		miesieczna = new JLabel("miesieczna");
		kwartalna = new JLabel("kwartalna");
		raty = new JLabel("Raty: ");
		rowne = new JLabel("rowne");
		malejace = new JLabel("malejace");
		koszt = new JLabel("Koszt kredytu: ");
		odestki = new JLabel("Odsetki: ");
		
		okresLata = new JCheckBox();
		okresMiesiace = new JCheckBox();
		kapitalMiesieczna = new JCheckBox();
		kapitalKwartalna = new JCheckBox();
		ratyRowne = new JCheckBox();
		ratyMalejace = new JCheckBox();
		
		spring.putConstraint(SpringLayout.WEST, kwota, 130, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, kwota, 20, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, pierwszy, 255, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, pierwszy, 20, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, oprocentowanie, 55, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, oprocentowanie, 55, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, drugi, 255, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, drugi, 55, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, procent, 325, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, procent, 55, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, okresKredytowania, 96, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, okresKredytowania, 90, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, okresLata, 251, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, okresLata, 88, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, lata, 272, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, lata, 90, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, okresMiesiace, 340, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, okresMiesiace, 88, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, miesiace, 362, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, miesiace, 90, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, trzeci, 430, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, trzeci, 88, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, kapitalizacja, 139, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, kapitalizacja, 125, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, lata, 272, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, lata, 90, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, kapitalMiesieczna, 251, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, kapitalMiesieczna, 123, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, miesieczna, 272, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, miesieczna, 125, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, kapitalKwartalna, 355, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, kapitalKwartalna, 123, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, kwartalna, 376, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, kwartalna, 125, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, raty, 185, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, raty, 160, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, ratyRowne, 251, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, ratyRowne, 158, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, rowne, 272, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, rowne, 160, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, ratyMalejace, 325, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, ratyMalejace, 159, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, malejace, 347, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, malejace, 160, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, oblicz, 254, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, oblicz, 198, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, koszt, 132, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, koszt, 242, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, czwarty, 255, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, czwarty, 242, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, odestki, 166, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, odestki, 272, SpringLayout.NORTH, this);
		
		spring.putConstraint(SpringLayout.WEST, piaty, 255, SpringLayout.WEST, this);
		spring.putConstraint(SpringLayout.NORTH, piaty, 272, SpringLayout.NORTH, this);
		
		
		this.add(pierwszy);
		this.add(kwota);
		this.add(oprocentowanie);
		this.add(drugi);
		this.add(procent);
		this.add(okresKredytowania);
		this.add(okresLata);
		this.add(okresMiesiace);
		this.add(lata);
		this.add(miesiace);
		this.add(trzeci);
		this.add(kapitalizacja);
		this.add(kapitalMiesieczna);
		this.add(kapitalKwartalna);
		this.add(miesieczna);
		this.add(kwartalna);
		this.add(raty);
		this.add(rowne);
		this.add(malejace);
		this.add(ratyRowne);
		this.add(ratyMalejace);
		this.add(oblicz);
		this.add(koszt);
		this.add(czwarty);
		this.add(odestki);
		this.add(piaty);
		
		
		ObslugaZdarzenia obsluga = new ObslugaZdarzenia();
		oblicz.addActionListener(obsluga);
		
		ObslugaCheck1 checkLata = new ObslugaCheck1();
		ObslugaCheck2 checkMiesiace = new ObslugaCheck2();
		ObslugaKapitalizacjaMiesieczna kapitalizacjaMiesieczna = new ObslugaKapitalizacjaMiesieczna();
		ObslugaKapitalizacjaKwartalna kapitalizacjaKwartalna = new ObslugaKapitalizacjaKwartalna();
		RatyRowne rRowne = new RatyRowne();
		RatyMalejace rMalejace = new RatyMalejace();
		
		okresLata.addActionListener(checkLata);
		okresMiesiace.addActionListener(checkMiesiace);
		kapitalMiesieczna.addActionListener(kapitalizacjaMiesieczna);
		kapitalKwartalna.addActionListener(kapitalizacjaKwartalna);
		ratyRowne.addActionListener(rRowne);
		ratyMalejace.addActionListener(rMalejace);
		
		
	}
	
	
	public class MyInputVerifier extends InputVerifier {
	    public boolean verify(JComponent input) {
	        String text = ((JTextField) input).getText();
	        try {
	            BigDecimal value = new BigDecimal(text);
	            return (value.scale() <= Math.abs(2));
	            
	            
	            
	        } catch (NumberFormatException e) {
	        	
	        	
	            return false;
	        }
	    }
	}
	
	
	public class MyInputVerifier2 extends InputVerifier {
	    public boolean verify(JComponent input) {
	        String text = ((JTextField) input).getText();
	        try {
	            BigDecimal value = new BigDecimal(text);
	            
	                      
	            return (value.scale() <= Math.abs(0));
	            
	            
	            
	        } catch (NumberFormatException e) {
	        	
	        	
	            return false;
	        }
	    }
	}
	
	
	public class ObslugaCheck1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if (okresLata.isSelected()){
				okresMiesiace.setEnabled(false);
			}
			
			else  { 
				okresLata.setEnabled(true);
				okresMiesiace.setEnabled(true);
			}
			
			
			
			
			// dodac gdy zaznaczy bez wpisania liczby w pole tekstowe
			
		}
		
		
	}
	
	
	public class ObslugaCheck2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if (okresMiesiace.isSelected()){
				okresLata.setEnabled(false);
			}
			
			else  { 
				okresMiesiace.setEnabled(true);
				okresLata.setEnabled(true);
			}
			
			
			
			
			// dodac gdy zaznaczy bez wpisania liczby w pole tekstowe
		}
	
	}
	
	
	public class ObslugaKapitalizacjaMiesieczna implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		if (kapitalMiesieczna.isSelected()) {
			
			kapitalKwartalna.setEnabled(false);
			
			
		}
			
		else {
			kapitalMiesieczna.setEnabled(true);
			kapitalKwartalna.setEnabled(true);
			
		}
		
			
		}
			
			
	}
	
	
	
	public class ObslugaKapitalizacjaKwartalna implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		if (kapitalKwartalna.isSelected()) {
			
			kapitalMiesieczna.setEnabled(false);
			
			
		}
			
		else {
			kapitalKwartalna.setEnabled(true);
			kapitalMiesieczna.setEnabled(true);
			
		}
		
			
		}
			
			
	}
	
	
	public class RatyRowne implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			if (ratyRowne.isSelected()) {
				ratyMalejace.setEnabled(false);
			}
				
			else {
				ratyRowne.setEnabled(true);
				ratyMalejace.setEnabled(true);
				
			}
			
			
			
		}
			
			
	}
	
	
	public class RatyMalejace implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if (ratyMalejace.isSelected()) {
				ratyRowne.setEnabled(false);
			}
				
			else {
				ratyMalejace.setEnabled(true);
				ratyRowne.setEnabled(true);
				
			}
		
			
		}
			
			
	}
	
	
	public class ObslugaZdarzenia implements ActionListener {

		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			   
			if (pierwszy.getText().equals("") || 
				drugi.getText().equals("") || 
				trzeci.getText().equals("") ||
				
				(okresLata.isSelected() == false && okresMiesiace.isSelected() == false) ||
				(kapitalMiesieczna.isSelected() == false && kapitalKwartalna.isSelected() == false) ||
				(ratyRowne.isSelected() == false && ratyMalejace.isSelected() == false)) {
				
				
				JOptionPane.showMessageDialog(null,
					    "Uzupelnij wszystkie pola zanim wykonasz obliczenia.", "Info", JOptionPane.ERROR_MESSAGE);
				
			}
					
						
			else {
				
			
				double kwota = Double.parseDouble(pierwszy.getText());
				String czas = trzeci.getText();
				double czasKredytowaniaLata = (Double.parseDouble(czas) * 12);
				double czasKredytowaniaMiesiace = Double.parseDouble(czas);
				String oproc = drugi.getText();
				double rMiesiac = ((Double.parseDouble(oproc)) / 1200);
				double rKwartal = ((Double.parseDouble(oproc)) / 400);
					
				if (ratyRowne.isSelected()) {
					
					
					if (okresLata.isSelected()) {
						
						
						if (kapitalMiesieczna.isSelected()) {
							
							double rata= kwota * rMiesiac * ((Math.pow ((1+ rMiesiac),czasKredytowaniaLata)) / (Math.pow ((1 + rMiesiac), czasKredytowaniaLata) - 1));
							double kosztKredytu = rata * czasKredytowaniaLata;
							double odsetki = kosztKredytu - kwota;
							
							DecimalFormat df=new DecimalFormat("0.00");
							String odsetki1 = df.format(odsetki);
							String kosztKredytu1 = df.format(kosztKredytu);
							
							
							czwarty.setText(String.valueOf(kosztKredytu1));
							piaty.setText( String.valueOf(odsetki1));
							
						}
						
						
						else if (kapitalKwartalna.isSelected()) {
							
							
							double rata= kwota * rKwartal * ((Math.pow ((1+ rKwartal),czasKredytowaniaLata)) / (Math.pow ((1 + rKwartal), czasKredytowaniaLata) - 1));
							double kosztKredytu = rata * czasKredytowaniaLata;
							double odsetki = kosztKredytu - kwota;
							
							DecimalFormat df=new DecimalFormat("0.00");
							String odsetki1 = df.format(odsetki);
							String kosztKredytu1 = df.format(kosztKredytu);
							
							
							czwarty.setText(String.valueOf(kosztKredytu1));
							piaty.setText( String.valueOf(odsetki1));
							
							
							
							
						}
						
						
					}
					
					
					else if (okresMiesiace.isSelected()) {
						
						
						
						if (kapitalMiesieczna.isSelected()) {
							
								double rata= kwota * rMiesiac * ((Math.pow ((1+ rMiesiac),czasKredytowaniaMiesiace)) / (Math.pow((1 + rMiesiac), czasKredytowaniaMiesiace) - 1));
								double kosztKredytu = rata * czasKredytowaniaMiesiace;
								double odsetki = kosztKredytu - kwota;
								
								
								DecimalFormat df=new DecimalFormat("0.00");
								String odsetki1 = df.format(odsetki);
								String kosztKredytu1 = df.format(kosztKredytu);
								
								
								czwarty.setText(String.valueOf(kosztKredytu1));
								piaty.setText( String.valueOf(odsetki1));
								
							
						}
						
						
						else if (kapitalKwartalna.isSelected()) {
						
							
							double rata= kwota * rKwartal * ((Math.pow ((1+ rKwartal),czasKredytowaniaMiesiace)) / (Math.pow((1 + rKwartal), czasKredytowaniaMiesiace) - 1));
							double kosztKredytu = rata * czasKredytowaniaMiesiace;
							double odsetki = kosztKredytu - kwota;
							
							
							DecimalFormat df=new DecimalFormat("0.00");
							String odsetki1 = df.format(odsetki);
							String kosztKredytu1 = df.format(kosztKredytu);
							
							
							czwarty.setText(String.valueOf(kosztKredytu1));
							piaty.setText( String.valueOf(odsetki1));
							
							
							
						}
						
						
						
					}
					
					
					
				}
				 
				
				else if (ratyMalejace.isSelected()) {
					
					
					
					
						if (okresLata.isSelected()) {
					
							
							
					
								if (kapitalMiesieczna.isSelected()) {
								
									double [] tablicaRaty = new double[(int) czasKredytowaniaLata];
									double kosztKredytu = 0;
									int n = 1;
									
									for (int i = 0; i < czasKredytowaniaLata; i++) {
										
										
										tablicaRaty[i] = kwota / czasKredytowaniaLata * ( 1 + (czasKredytowaniaLata - n + 1) * rMiesiac);
										n++;
										kosztKredytu = kosztKredytu + tablicaRaty[i];
										double odsetki = kosztKredytu - kwota;
										
										
										DecimalFormat df=new DecimalFormat("0.00");
										String odsetki1 = df.format(odsetki);
										String kosztKredytu1 = df.format(kosztKredytu);
										
										
										czwarty.setText(String.valueOf(kosztKredytu1));
										piaty.setText( String.valueOf(odsetki1));
									}
									
									
								
								}	
								
								
						
								else if (kapitalKwartalna.isSelected())  {
								
									
									double [] tablicaRaty = new double[(int) (czasKredytowaniaLata/3)];
									double kosztKredytu = 0;
									int n = 1;
								
										for (int i = 0; i < (czasKredytowaniaLata/3); i++) {
										
										
										tablicaRaty[i] = kwota / (czasKredytowaniaLata/3) * ( 1 + ((czasKredytowaniaLata/3) - n + 1) * rKwartal);
										n++;
										kosztKredytu = kosztKredytu + tablicaRaty[i];
										double odsetki = kosztKredytu - kwota;
										
										
										DecimalFormat df=new DecimalFormat("0.00");
										String odsetki1 = df.format(odsetki);
										String kosztKredytu1 = df.format(kosztKredytu);
										
										
										czwarty.setText(String.valueOf(kosztKredytu1));
										piaty.setText( String.valueOf(odsetki1));
									}
									
									
									
								}
							
							
						
						}
						
						
							
						else if (okresMiesiace.isSelected()) {
						
						
						
								if (kapitalMiesieczna.isSelected()) {
								
								
									double [] tablicaRaty = new double[(int) czasKredytowaniaMiesiace];
									double kosztKredytu = 0;
									int n = 1;
									
									for (int i = 0; i < czasKredytowaniaMiesiace; i++) {
										
										
										tablicaRaty[i] = kwota / czasKredytowaniaMiesiace * ( 1 + (czasKredytowaniaMiesiace - n + 1) * rMiesiac);
										n++;
										kosztKredytu = kosztKredytu + tablicaRaty[i];
										double odsetki = kosztKredytu - kwota;
										
										
										DecimalFormat df=new DecimalFormat("0.00");
										String odsetki1 = df.format(odsetki);
										String kosztKredytu1 = df.format(kosztKredytu);
										
										
										czwarty.setText(String.valueOf(kosztKredytu1));
										piaty.setText( String.valueOf(odsetki1));
									}
									
									
									
									
								}	
							
							
					
								else if (kapitalKwartalna.isSelected())  {
							
							
									double [] tablicaRaty = new double[(int) (czasKredytowaniaMiesiace/3)];
									double kosztKredytu = 0;
									int n = 1;
								
										for (int i = 0; i < (czasKredytowaniaMiesiace/3); i++) {
										
										
										tablicaRaty[i] = kwota / (czasKredytowaniaMiesiace/3) * ( 1 + ((czasKredytowaniaMiesiace/3) - n + 1) * rKwartal);
										n++;
										kosztKredytu = kosztKredytu + tablicaRaty[i];
										double odsetki = kosztKredytu - kwota;
										
										
										DecimalFormat df=new DecimalFormat("0.00");
										String odsetki1 = df.format(odsetki);
										String kosztKredytu1 = df.format(kosztKredytu);
										
										
										czwarty.setText(String.valueOf(kosztKredytu1));
										piaty.setText( String.valueOf(odsetki1));
									}
									
									
							
								}
						
						
					
						}
						
						
						
						
					}
					
				}
				
				
			
			}
			
		}
		
}	
		
		
	
	

	

	

