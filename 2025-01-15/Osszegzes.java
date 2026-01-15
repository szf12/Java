import java.util.Scanner;
import java.util.Random;
import java.util.Vector;

class Osszegzes {
	
	public static void main( String[] args ) {
		
		Scanner scan = new Scanner( System.in );
		Random rand = new Random();
		Vector<Integer> numbers = new Vector<>();
		
		System.out.print( "Darabszám: " );
		int listSize = scan.nextInt();
		
		for( int i = 0; i < listSize; i++ ) {
			
			numbers.add( rand.nextInt( 900 ) + 100 );
		}
		
		int result = 0;
		
		for( int number : numbers ) {
			
			if( number > 300 && number < 500 ) {
				
				result = result + number;
				// result += number;
			}
		}
		
		System.out.printf( "Az összeg: %d", result );
	}
}
