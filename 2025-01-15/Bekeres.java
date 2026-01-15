import java.util.Scanner;

class Bekeres {
	
	public static void main( String[] args ) {
		
		Scanner scan = new Scanner( System.in );
		
		System.out.print( "Szám: " );
		int number = scan.nextInt();
		
		System.out.println( "Ezt írtad: " + number );
	}
}
