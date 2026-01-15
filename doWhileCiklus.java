import java.util.Scanner;

class DoWhileCiklus {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
		System.out.print( "Szám: " );
		int number = scan.nextInt();
		
		int num = 0;
		do {
			
			System.out.print( "Szám: " );
			num = scan.nextInt();
			
		}while( num != 0 );
		
		System.out.println( "Vége" );
	}
}

