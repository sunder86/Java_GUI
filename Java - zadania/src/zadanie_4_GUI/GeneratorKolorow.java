package zadanie_4_GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GeneratorKolorow extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel naglowek, poleTekst;
	private JTextField kodKoloru;
	private JSlider pierwszy, drugi, trzeci;
	private JPanel gora,dol, glowny;
		
	
	public GeneratorKolorow () {
		
		SpringLayout layout = new SpringLayout();
		this.setLayout(layout);
	
		
	gora = new JPanel();
	dol = new JPanel();
	glowny = new JPanel();
	naglowek = new JLabel("Suwaki R-G-B (0-255)");
	poleTekst = new JLabel("Kod koloru: ");
	pierwszy = new JSlider(JSlider.HORIZONTAL, 0 , 255, 0);
	drugi = new JSlider(JSlider.HORIZONTAL,  0 , 255, 0);
	trzeci = new JSlider(JSlider.HORIZONTAL,  0 , 255, 0);
	kodKoloru = new JTextField();
	kodKoloru.setPreferredSize(new Dimension(200, 70));
	kodKoloru.setEditable(false);
	
	pierwszy.setMajorTickSpacing(50);     
	pierwszy.setMinorTickSpacing(5);
	pierwszy.setPaintTicks(true);         
	pierwszy.setPaintLabels(true); 
	
	drugi.setMajorTickSpacing(50);     
	drugi.setMinorTickSpacing(5);
	drugi.setPaintTicks(true);         
	drugi.setPaintLabels(true);
	
	trzeci.setMajorTickSpacing(50);     
	trzeci.setMinorTickSpacing(5);
	trzeci.setPaintTicks(true);         
	trzeci.setPaintLabels(true);
	
	
	layout.putConstraint(SpringLayout.WEST, naglowek, 25, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.NORTH, naglowek, 20, SpringLayout.NORTH, this);
	
	layout.putConstraint(SpringLayout.WEST, poleTekst, 25, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.NORTH, poleTekst, 250, SpringLayout.NORTH, this);
	
	layout.putConstraint(SpringLayout.WEST, drugi, 25, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.NORTH, drugi, 120, SpringLayout.NORTH, this);
	
	layout.putConstraint(SpringLayout.WEST, trzeci, 25, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.NORTH, trzeci, 185, SpringLayout.NORTH, this);
	
	layout.putConstraint(SpringLayout.WEST, kodKoloru, 25, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.NORTH, kodKoloru, 280, SpringLayout.NORTH, this);
	
	layout.putConstraint(SpringLayout.WEST, pierwszy, 25, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.NORTH, pierwszy, 55, SpringLayout.NORTH, this);
	
	layout.putConstraint(SpringLayout.WEST, dol, 0, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.NORTH, dol, 370, SpringLayout.NORTH, this);
	
	
	
	
	this.add(naglowek);
	this.add(pierwszy);
	this.add(drugi);
	this.add(trzeci);
	this.add(kodKoloru);
	this.add(poleTekst);
	
	BorderLayout border = new BorderLayout();
	glowny.setLayout(border);
	glowny.add(gora, BorderLayout.NORTH);
	this.add(dol);
	dol.setPreferredSize(new Dimension(255, 80));
	dol.setBackground(Color.BLUE);
	add(glowny)	;
	
	
	ObslugaZdarzen zdarzenie = new ObslugaZdarzen();
	pierwszy.addChangeListener(zdarzenie);
	drugi.addChangeListener(zdarzenie);
	trzeci.addChangeListener(zdarzenie);
	
	}
	

	
	
	
	
	public class ObslugaZdarzen  implements ChangeListener
	{

		

		@Override
		public void stateChanged(ChangeEvent arg0) {
			// TODO Auto-generated method stub
			
			
			
			int r = pierwszy.getValue();
			int g = drugi.getValue();
			int b = trzeci.getValue();
		
			String hex = String.format("#%02x%02x%02x", r, g, b);
			kodKoloru.setText(hex);
			dol.setBackground(Color.decode(kodKoloru.getText()));
			
		}
		
		
	}
	
	
}
