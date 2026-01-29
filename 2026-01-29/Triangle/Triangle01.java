class Triangle01 {
	
	public static void main( String[] args ) {
		
		double[] sides = { 10, 20, 30 };
		
		double result = pher( sides );
		
		System.out.println( "Kerület: " + result );
	}
	
	private static double pher( double[] sides ) {
		
		double result = 0;
		for( double side : sides ) {
			
			result += side;
		}
		
		return result;
	}
}
