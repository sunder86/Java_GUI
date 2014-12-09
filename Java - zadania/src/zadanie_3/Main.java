/**
 * 
 */
package zadanie_3;

/**
 * @author DOM
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person[] personTable = new Person[3];
		
		
		personTable[0] = new Employee("Wojtek" , "Kowalski" , 1986 , 88 , 12 , "IBM");
		personTable[1] = new Sekretary("Kasia" , "Kowalska" , 1966 , 45 , 15 , "Shell" , "sekretarka" , 3000);
		personTable[2] = new Student("Adam" , "Lipski" , 1984 , 78 , 12345);
		
		
		for (int i = 0 ; i < personTable.length ; i++) {
			
			System.out.println(personTable[i]);
			
		}
		
		
		
		
	}

}
