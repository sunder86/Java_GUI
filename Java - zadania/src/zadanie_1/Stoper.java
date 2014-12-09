package zadanie_1;

public class Stoper {
	
	
	
	private long start;
	private long stop;
	
	
	
	
	
	/**
	 * @param start
	 * @param stop
	 */
	public Stoper(long start, long stop) {
		this.start = start;
		this.stop = stop;
	}
	
	/**
	 * @return the start
	 */
	public long getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(long start) {
		this.start = System.nanoTime();
	}
	/**
	 * @return the stop
	 */
	public long getStop() {
		return stop;
	}
	/**
	 * @param stop the stop to set
	 */
	public void setStop(long stop) {
		this.stop = System.nanoTime();
	}

	
	public double pobierzWyniki() {
		
		return (stop-start) /1000000;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Czas dzialania: " + this.pobierzWyniki() + " ms";
	}
	
	
	

}
