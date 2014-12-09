package zadanie_5;

import java.util.Comparator;

public class Indeks implements Comparator<Student> {
	 
    

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int porownanieIndeksow = o1.getIndeks()-o2.getIndeks();
		if(porownanieIndeksow == 0){
			
			return o1.compareTo(o2);
		}
		return porownanieIndeksow;
	
	}

}


