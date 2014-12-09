package zadanie_4_GUI;

public class GeneratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Okno okno = new Okno();
		GeneratorKolorow kontener = new GeneratorKolorow();
		
		okno.add(kontener);
		okno.setVisible(true);
		okno.setSize(270, 480);
		
		
	}

}
