class Buborek {
	
	public static void main( String[] args ) {
		
		//int[] numbers = new int[ 5 ]
		int[] numbers = { 2, 5, 4, 8, 3, 6, 9, 10, 1, 7 };
		
		for( int number : numbers ) {    //for( int i = 0; i < numbers.length; i++ )
			
			System.out.print( number + ", " );
		}
		System.out.println();
		
		for( int i = numbers.length - 1; i > 0; i-- ) {
			
			for( int j = 0; j < i; j++ ) {
				
				if( numbers[ j ] > numbers[ j + 1 ]) {
					
					int temp = numbers[ j ];
					numbers[ j ] = numbers[ j + 1 ];
					numbers[ j + 1 ] = temp;
				}
			}
		}
		
		for( int number : numbers ) {    //for( int i = 0; i < numbers.length; i++ )
			
			System.out.print( number + ", " );
		}
		System.out.println();
	}
}
