package zadanie_2;

public class Licznik {

private int ilosc;

/**
 * @param ilosc
 */
public Licznik(int ilosc) {
	this.ilosc = ilosc;
}

/**
 * @return the ilosc
 */
public int getIlosc() {
	return ilosc;
}

/**
 * @param ilosc the ilosc to set
 */
public void setIlosc(int ilosc) {
	this.ilosc = ilosc;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Iloœæ spacji w zdaniu:  " + ilosc;
}	
	

public int Count(String zdanie) {
	
	
	int ilosc = 0;
	
	
	for (int i = 0 ; i < zdanie.length() ; i++) {
		
		char l = zdanie.charAt(i);
		if (l==' ') {
		
		ilosc++;	
	}
		
		
	}
	return ilosc;
}














}
