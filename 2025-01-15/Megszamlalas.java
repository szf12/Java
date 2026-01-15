import java.util.Scanner;
import java.util.Random;
import java.util.Vector;

class Megszamlalas {
	
	public static void main( String[] args ) {
		
		Scanner scan = new Scanner( System.in );
		Random rand = new Random();
		Vector<Integer> numbers = new Vector<>(); 
		
		System.out.print( "Darabszám: " );
		int listSize = scan.nextInt();
		
		for( int i = 0; i < listSize; i++ ) {
			
			int generatedNumber = rand.nextInt( 900 ) + 100;
			numbers.add( generatedNumber );
		} 
		
		int counter = 0;
		
		for( int i = 0; i < numbers.size(); i++ ) {
			
			if( numbers.get( i ) < 500 ) {
				
				counter++;
			}
		}
		
		System.out.printf( "Az 500 alattiak : %d darab", counter );
	}
}
