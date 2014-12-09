package zadanie_5_GUI;

public class KredytMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OknoKredyt okno = new OknoKredyt();
		Kredyt main = new Kredyt();
		
		okno.add(main);
		okno.setSize(560, 360);
		okno.setVisible(true);
		okno.setResizable(false);
		
		
		
	}

}
