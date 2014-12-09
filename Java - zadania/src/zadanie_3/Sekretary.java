package zadanie_3;

public class Sekretary extends Employee {
	
	private String position;
	private double salary;
	/**
	 * @param name
	 * @param surname
	 * @param birth
	 * @param weight
	 * @param id
	 * @param company
	 * @param position
	 * @param salary
	 */
	public Sekretary(String name, String surname, int birth, int weight,
			int id, String company, String position, double salary) {
		super(name, surname, birth, weight, id, company);
		this.position = position;
		this.salary = salary;
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "1) Sekretarka ==>  Imie:  " + getName() + ", Nazwisko:  "
				+ getSurname() + ", Rok urodzenia:  " + getBirth()
				+ ",  Waga:  " + getWeight() + ",  ID firmy:  " + id + ",  Nazwa Firmy:  "
				+ company + "  Stanowisko:  " + position + ",  Wynagrodzenie:  " + salary + " zl";
	}
	
	

}
