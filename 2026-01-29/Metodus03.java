class Metodus03 {
	
	public static void main( String[] args ) {
		
		double result = multiple( 20.2, 3 );
		System.out.println( "Szorzat: " + result );
	}
	
	private static double multiple( double number, double num ) {
		
		double result = number * num;
		
		return result;
	}
}
