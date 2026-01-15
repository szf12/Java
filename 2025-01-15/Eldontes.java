import java.util.Scanner;
import java.util.Vector;
import java.util.Random;

class Eldontes {
	
	public static void main( String[] args ) {
		
		Scanner scan = new Scanner( System.in );
		Vector<Integer> numberList = new Vector<>();
		Random rand = new Random();
		
		System.out.print( "Lista hossz: " );
		int listSize = scan.nextInt();
		
		for( int i = 0; i < listSize; i++ ) {
			
			numberList.add( rand.nextInt( 600 ) + 200 );
		}
		
		//System.out.print( numberList );
		
		System.out.print( "Keresett szám: " );
		int found = scan.nextInt();
		boolean ok = false;
		
		for( int number : numberList ) {
			
			if( number == found ) {
				
				ok = true;
			}
		}
		
		if( ok ) {
			
			System.out.println( "Benne van." );
			
		}else {
			
			System.out.println( "Nincs benne." );
		}
	}
}
