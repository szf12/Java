class Strings {

	public static void main( String[] args ) {
	
		String text = "Ez egy egyszerű szöveg.";
		System.out.println( text.length() );
		
		char spell = text.charAt( 2 );
		System.out.println( spell );
		
		String text01 = "banán";
		if( text01.equals( "banán" )) {
			
			System.out.println( "Egyezik" );
			
		}else {
			
			System.out.println( "Nincs egyezés" );
		}
		
		String[] textSp = text.split( ":" );
		for( String word : textSp ) {
			
			System.out.println( word );
		}
		
		String changed = text.replace( "egyszerű", "bonyolult" );
		System.out.println( changed );
		
		String s = "Finomabb";
		int kezdet;
		kezdet = s.indexOf("bal");
		System.out.println( kezdet );
		
		String number = "25.3";
		if( number.matches( "[A-Za-z0.-9.]+" )) {
			
			System.out.println( "Megfelel" );
			
		}else {
			
			System.out.println( "Nem felel meg" );
		} 
	}
}
