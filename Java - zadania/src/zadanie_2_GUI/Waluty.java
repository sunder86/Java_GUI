package zadanie_2_GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class Waluty extends JPanel {

	private JButton przelicz;
	private JLabel tekst1 , tekst2 , dolarText , euroText, plnText , dolarText2 , euroText2, plnText2, kwotaWymiany, przeliczenie, kursText ;
	private JTextField wymiana, wynik, kurs;
	private JPanel panel1;
	private JRadioButton plnPosiadane , eurPosiadane , dolPosiadane , plnWymiana , dolWymiana, eurWymiana;
	
	public Waluty() {
		
		SpringLayout layout = new SpringLayout();
		this.setLayout(layout);
		
		
		panel1 = new JPanel();
		wymiana = new JTextField(10);
		wynik = new JTextField(10);
		kurs = new JTextField(12);
		plnPosiadane = new JRadioButton();
		eurPosiadane = new JRadioButton();
		dolPosiadane = new JRadioButton();
		plnWymiana = new JRadioButton();
		dolWymiana = new JRadioButton();
		eurWymiana = new JRadioButton();
		tekst1 = new JLabel("Posiadana waluta:");
		tekst2 = new JLabel("Wymiana na:");
		plnText = new JLabel("PLN");
		dolarText = new JLabel("$");
		euroText = new JLabel("\u20ac");
		plnText2 = new JLabel("PLN");
		kursText = new JLabel("Kurs wybranej waluty:");
		dolarText2 = new JLabel("$");
		euroText2 = new JLabel("\u20ac");
		kwotaWymiany = new JLabel("Kwota wymiany:");
		przeliczenie = new JLabel("Wymiana: ");
		przelicz = new JButton("Przelicz");
		
		ButtonGroup bgLeft = new ButtonGroup();
		bgLeft.add(plnPosiadane);
		bgLeft.add(eurPosiadane);
		bgLeft.add(dolPosiadane);
		
		this.add(wymiana);
		this.add(przelicz);
		this.add(plnPosiadane);
		this.add(eurPosiadane);
		this.add(dolPosiadane);
		this.add(plnWymiana);
		this.add(eurWymiana);
		this.add(dolWymiana);
		this.add(tekst1);
		this.add(tekst2);
		this.add(dolarText);
		this.add(euroText);
		this.add(plnText);
		this.add(dolarText2);
		this.add(euroText2);
		this.add(plnText2);
		this.add(kwotaWymiany);
		this.add(wynik);
		this.add(przeliczenie);
		this.add(kurs);
		this.add(kursText);
		
		wynik.setEditable(false);
		przeliczenie.setForeground(Color.RED);
		
		add(panel1);
		
		layout.putConstraint(SpringLayout.WEST, przelicz, 160, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, przelicz, 290, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, tekst1, 20, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, tekst1, 15, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, tekst2, 300, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, tekst2, 15, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, plnPosiadane, 100, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, plnPosiadane, 110, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, dolPosiadane, 100, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, dolPosiadane, 80, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, eurPosiadane, 100, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, eurPosiadane, 50, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, plnText, 50, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, plnText, 110, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, dolarText, 50, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, dolarText, 80, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, euroText, 50, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, euroText, 50, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, plnWymiana, 355, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, plnWymiana, 110, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, dolWymiana, 355, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, dolWymiana, 80, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, eurWymiana, 355, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, eurWymiana, 50, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, plnText2, 305, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, plnText2, 110, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, dolarText2, 305, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, dolarText2, 80, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, euroText2, 305, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, euroText2, 50, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, wymiana, 25, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, wymiana, 200, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, kwotaWymiany, 25, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, kwotaWymiany, 170, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, wynik, 250, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, wynik, 200, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, przeliczenie, 250, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, przeliczenie, 170, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, kurs, 25, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, kurs, 250, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, kursText, 25, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, kursText, 230, SpringLayout.NORTH, this);
		
		
		
		ObslugaZdarzen przyciskPrzelicz = new ObslugaZdarzen();
		
		przelicz.addActionListener(przyciskPrzelicz);
		
		
		
		 ActionListener radioButtonActionListener = new ActionListener() {
			 
	            @Override
	            public void actionPerformed(ActionEvent ae) {
	               
	            	if(plnPosiadane.isSelected()){
	            		eurPosiadane.setSelected(false);
	            		dolPosiadane.setSelected(false);
	            		plnWymiana.setEnabled(false);
	            		dolWymiana.setEnabled(true);
	            		eurWymiana.setEnabled(true);
	            		
	            	}
	            	
	            	if (eurPosiadane.isSelected()) {
	            		plnPosiadane.setSelected(false);
	            		dolPosiadane.setSelected(false);
	            		eurWymiana.setEnabled(false);
	            		dolWymiana.setEnabled(true);
	            		plnWymiana.setEnabled(true);
	            	}
	            	
	            	if (dolPosiadane.isSelected()) {
	            		plnPosiadane.setSelected(false);
	            		eurPosiadane.setSelected(false);
	            		dolWymiana.setEnabled(false);
	            		eurWymiana.setEnabled(true);
	            		plnWymiana.setEnabled(true);
	            	}
	            	
	            }
	             
	        };
	         
	        plnPosiadane.addActionListener(radioButtonActionListener);
	        dolPosiadane.addActionListener(radioButtonActionListener);
	        eurPosiadane.addActionListener(radioButtonActionListener);

	}
	
	
	private class ObslugaZdarzen implements ActionListener {

		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
						double kwota = Double.parseDouble(wymiana.getText());
						double kursWaluty = Double.parseDouble(kurs.getText());
						double wynikWymiany = kwota/kursWaluty;
						
						DecimalFormat df=new DecimalFormat("0.00");
						String wynikWymiany2 = df.format(wynikWymiany);
						
						
						
						wynik.setText(String.valueOf(wynikWymiany2));
						
					
		}
		
		
	}
	
	
	
}
