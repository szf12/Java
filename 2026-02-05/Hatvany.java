class Hatvany {

	public static void main( String[] args ) {
		
		int number01 = 3;
		double number02 = 61;
		double result = negyzet( number01 );
		System.out.printf( "A %d szám négyzete: %f\n", number01, result );
		
		double eredmeny = negyzet( number01, number02 );
		System.out.printf( "A %d szám %f hatványa: %f\n", number01, number02, eredmeny );
		
		double gyok = gyokvonas( number02 );
		System.out.printf( "A %f számnak a négyzetgyöke: %f", number02, gyok );
	}
	
	private static double negyzet( int number ) {
	
		double result = Math.pow( number, 2 );
		
		return result;
	}
	
	private static double negyzet( double alap, double kitevo ) {
		
		double eredmeny = Math.pow( alap, kitevo );
		
		return eredmeny;
	}
	
	private static double gyokvonas( double number ) {
		
		double eredmeny = Math.sqrt( number );
		
		return eredmeny;
	}
}
