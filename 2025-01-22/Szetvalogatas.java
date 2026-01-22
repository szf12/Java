import java.util.Vector;
import java.util.Random;

class Szetvalogatas {
	
	public static void main( String[] args ) {
		
		Random rand = new Random();
		Vector<Integer> numbers = new Vector<>();
		
		for( int i = 0; i < 100; i++ ) {
			
			numbers.add( rand.nextInt( 100 ) + 100 );
		}
		//System.out.print( numbers.size() );
		
		double result = 0;
		for( int number : numbers ) {
			
			result += number;
		}
		
		double avg = result / numbers.size();
		System.out.print( "Átlag:\n" + avg + "\n" );
		
		System.out.print( "Eredeti lista:\n" + numbers + "\n" );
		
		Vector<Integer> selectedList = new Vector<>();
		
		for( int number : numbers ) {
			
			if( number < avg ) {
				
				selectedList.add( number );
			}
		}
		System.out.print( "Átlag lista:\n" + selectedList + "\n" );
	}
}
