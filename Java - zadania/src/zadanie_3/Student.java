package zadanie_3;

public class Student extends Person {
	
	private int index;

	/**
	 * @param name
	 * @param surname
	 * @param birth
	 * @param weight
	 * @param index
	 */
	public Student(String name, String surname, int birth, int weight, int index) {
		super(name, surname, birth, weight);
		this.index = index;
	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "3) Student ==>  Imie:  " + getName() + ", Nazwisko:  "
				+ getSurname() + ", Rok urodzenia:  " + getBirth()
				+ ",  Waga:  " + getWeight() + ",  Nr indeksu:  " + index;
	}
	
	

}
