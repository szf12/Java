import java.util.Random;
import java.util.Vector;
import java.util.Scanner;

class Kivalasztas {

	public static void main( String[] args ){
		
		Random rand = new Random();
		Vector<Integer> numbers = new Vector<>();
		
		for( int i = 0; i < 100; i++ ) {
			
			numbers.add( rand.nextInt( 100 ) + 100 );
		}
		
		//System.out.println( numbers.size() );
		Scanner scan = new Scanner( System.in );
		System.out.print( "Keresett szám: " );
		int search = scan.nextInt();
		
		int i = 0;
		while( i < numbers.size() && numbers.get( i ) != search ) {
			
			i++;
		}
		
		if( i < numbers.size() ) {
			
			System.out.printf( "A keresett szám benne van, a %d helyen.\n", i );
			
		}else {
			
			System.out.println( "A keresett szám nincs a listában." );
		}
	}
}
