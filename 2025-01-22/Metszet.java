import java.util.Vector;
import java.util.Random;

class Metszet {
	
	public static void main( String[] args ) {
		
		Random rand = new Random();
		Vector<Integer> numbers01 = new Vector<>();
		Vector<Integer> numbers02 = new Vector<>();
		
		for( int i = 0; i < 100; i++ ) {
			
			numbers01.add( rand.nextInt( 100 ) + 100 );
			numbers02.add( rand.nextInt( 100 ) + 100 );
		}
		
		System.out.print( "numbers01:\n" + numbers01 + "\n" );
		System.out.print( "numbers02:\n" + numbers02 + "\n" );

		Vector<Integer> intSec = new Vector<>();
		
		for( int number01 : numbers01 ) {
			for( int number02 : numbers02 ) {
				
				if( number01 == number02 && !intSec.contains( number01 )) {
					
					intSec.add( number01 );
				}
			}
		}
		System.out.print( "Egyesített:\n" + intSec + "\n" );
	}
}
