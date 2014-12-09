/**
 * 
 */
package zadanie_3;

/**
 * @author DOM
 *
 */
public class Employee extends Person {

	
	protected int id;
	protected String company;
	
	
	
	
	
	/**
	 * @param name
	 * @param surname
	 * @param birth
	 * @param weight
	 * @param id
	 * @param company
	 */
	public Employee(String name, String surname, int birth, int weight, int id,
			String company) {
		super(name, surname, birth, weight);
		this.id = id;
		this.company = company;
	}





	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}





	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}





	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}





	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "1) Pracownik ==>  Imie:  " + getName() + ", Nazwisko:  "
				+ getSurname() + ", Rok urodzenia:  " + getBirth()
				+ ",  Waga:  " + getWeight() + ",  ID firmy:  " + id + ",  Nazwa Firmy:  "
				+ company;
	}





	




	





	

}
