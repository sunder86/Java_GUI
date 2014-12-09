package zadanie_3;

public abstract class Person {

	private String name;
	private String surname;
	private int birth;
	private int weight;
	
	
	
	
	/**
	 * @param name
	 * @param surname
	 * @param birth
	 * @param weight
	 */
	public Person(String name, String surname, int birth, int weight) {
		this.name = name;
		this.surname = surname;
		this.birth = birth;
		this.weight = weight;
		
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the birth
	 */
	public int getBirth() {
		return birth;
	}
	/**
	 * @param birth the birth to set
	 */
	public void setBirth(int birth) {
		this.birth = birth;
	}
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", birth="
				+ birth + ", weight=" + weight + "]";
	}
	
	
	
	
	
	
}
