class Tomb01 {
	
	public static void main( String[] args ) {
		
		int numbers01[] = { 1, 2, 3, 4, 5 };
		int numbers02[] = new int[ 5 ];
		
		System.out.println( numbers01[ 2 ] );
		
		numbers01[ 2 ] = 9;
		System.out.println( numbers01[ 2 ] );
		
		//numbers01[ 5 ] = 2;
		
		//numbers01[ 2 ] = null;
		//System.out.println( numbers01[ 2 ] );
		
		numbers02[ 0 ] = 10;
		System.out.println( numbers02[ 0 ] );
	}
}
