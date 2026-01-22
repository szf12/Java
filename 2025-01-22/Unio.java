import java.util.Vector;
import java.util.Random;

class Unio {
	
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

		Vector<Integer> unio = new Vector<>();
		
		for( int number01 : numbers01 ) {
			
			if( !unio.contains( number01 )) {
				
				unio.add( number01 );
			}
		}
		
		for( int number02 : numbers02 ) {
			
			if( !unio.contains( number02 )) {
				
				unio.add( number02 );
			}
		}
		System.out.print( "Egyesített:\n" + unio + "\n" );
	}
}
