package zadanie_2;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Scanner;

public class Licznik_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ilosc = 0;
		Licznik licznik = new Licznik(ilosc);
		
		System.out.println("Prosze podac zdanie: ");
		
		Scanner odczyt = new Scanner(System.in);
		String zdanie = odczyt.nextLine();
		
		
		
		licznik.setIlosc(licznik.Count(zdanie));
		System.out.println(licznik);
		
				
	}

	

}
