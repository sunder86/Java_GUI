package zadanie_1;

public class Stoper_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start = 0;
		long stop = 0;
		
		Stoper stoper = new Stoper(start, stop);
		
		stoper.setStart(start);
		
		for (int i =0 ; i<1000 ; i++)
		{
			
			System.out.println(i++);
		}
		
		
		stoper.setStop(stop);
		
		
		System.out.println(stoper);
		
	}

}
