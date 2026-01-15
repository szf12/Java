class Formazott {
	
	public static void main( String[] args ) {
		
		int number01 = -34;
		double number02 = 23.2345456765;
		String text = "szöveg";
		
		/*
		 * Formázott kimenet.
		 * System.out.printf();
		 * 
		 * %d ->integer
		 * %f ->double
		 * %s ->String
		 * 
		 * */
		 
		 System.out.printf( "Ez egy egész szám: %d\n", number01 );
		 System.out.printf( "Ez egy tört szám: %f\n", number02 );
		 System.out.printf( "Ez egy szöveg: %s\n", text );
		 
		 System.out.printf( "Ez egy tört szám: %.2f\n", number02 );
		 System.out.printf( "Ezek számok: %d, %.2f\n", number01, number02 );
		 System.out.printf( "Ezek számok: %+10d, %+10.2f\n", number01, number02 );
	}
}
