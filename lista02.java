/*
 * tömb -> length (hossza) 
 * lista, vector -> size() (mérete)
 * */
import java.util.ArrayList;

class Lista02 {
	
	public static void main( String[] args ) {
		
		ArrayList<Integer> numberList = new ArrayList<>();
		
		for( int i = 0; i < 10; i++ ) {
			
			numberList.add( i + 1 );
		}
		
		for( int i = 0; i < numberList.size(); i++ ) {
			
			System.out.printf( "%d, ", numberList.get( i ));
		}
		System.out.println();
		
		for( int number : numberList ) {
			
			//System.out.print( number + ", " );
			System.out.printf( "%d, ", number );
		}
		System.out.println();
	}
}
