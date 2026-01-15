import java.util.Vector;

class WhileCiklus {
	
	public static void main (String[] args) {
		
		Vector<Integer> numList = new Vector<>();
		
		int number = 0;
		while( number < 10 ) {
			
			numList.add( number + 1 );
			
			number++;
		}
		
		number = 0;
		while( number < numList.size() ) {
			
			System.out.printf( "%d, ", numList.get( number ));
			
			number++;
		}
	}
}

