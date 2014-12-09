package zadanie_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student[] lista = new Student[4];
		 
		lista[0] = new Student("Jan", "Kowalski", 432187);
		lista[1] = new Student("Adam", "Nowak", 332132);
		lista[2] = new Student("Joanna", "Wyszek", 632165);
		lista[3] = new Student("Ania", "Nowak", 321419);

		
		
		ArrayList<Student> studenci = new ArrayList<>();
		studenci.add(lista[0]);
		studenci.add(lista[1]);
		studenci.add(lista[2]);
		studenci.add(lista[3]);
		
		
		System.out.println("Nieposortowane:\n");
		
		
		 for(Student s : studenci) {
	            System.out.println(s);
		 }
		
		 
		 System.out.println("\n");
		 System.out.println("Posortowane:\n");
		 
		 
		 
		Collections.sort(studenci);
		 
		 for(Student s : studenci) {
	            System.out.println(s);
		 }
		 
		}
	}


