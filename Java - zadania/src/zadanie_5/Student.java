package zadanie_5;

	public class Student implements Comparable<Student> {
		
		private String imie;
		private String nazwisko;
		private int indeks;
		/**
		 * @param imie
		 * @param nazwisko
		 * @param indeks
		 */
		public Student(String imie, String nazwisko, int indeks) {
			this.imie = imie;
			this.nazwisko = nazwisko;
			this.indeks = indeks;
		}
		/**
		 * @return the imie
		 */
		public String getImie() {
			return imie;
		}
		/**
		 * @param imie the imie to set
		 */
		public void setImie(String imie) {
			this.imie = imie;
		}
		/**
		 * @return the nazwisko
		 */
		public String getNazwisko() {
			return nazwisko;
		}
		/**
		 * @param nazwisko the nazwisko to set
		 */
		public void setNazwisko(String nazwisko) {
			this.nazwisko = nazwisko;
		}
		/**
		 * @return the indeks
		 */
		public int getIndeks() {
			return indeks;
		}
		/**
		 * @param indeks the indeks to set
		 */
		public void setIndeks(int indeks) {
			this.indeks = indeks;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
	
		@Override
		public String toString() {
			return String.format("Student: %s %-7s" + " numer albumu: %s %n", imie,nazwisko,indeks);
		}
		@Override
		public int compareTo(Student other) {
			int porownanieNazwiska = nazwisko.compareTo(other.nazwisko);
		
				
				if(porownanieNazwiska == 0) {
		            return imie.compareTo(other.imie);
		        }
		        else {
		            return porownanieNazwiska;
		        }	
		
		}
		
			
		}
		
	
	

