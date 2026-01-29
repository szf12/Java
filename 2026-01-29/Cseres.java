class Cseres {
	
	public static void main( String[] args ) {
		
		int[] numbers = { 2, 5, 4, 8, 3, 6, 9, 10, 1, 7 };
		
		for( int number : numbers ) {    //for( int i = 0; i < numbers.length; i++ )
			
			System.out.print( number + ", " );
		}
		System.out.println();
		
		for( int i = 0; i < numbers.length; i++ ) {
			
			for( int j = i + 1; j < numbers.length; j++ ) {
				
				if( numbers[ i ] > numbers[ j ] ) {
					
					int temp = numbers[ i ];
					numbers[ i ] = numbers[ j ];
					numbers[ j ] = temp;
				}
			}
		}
		
		for( int number : numbers ) {    //for( int i = 0; i < numbers.length; i++ )
			
			System.out.print( number + ", " );
		}
		System.out.println();
	}
}
