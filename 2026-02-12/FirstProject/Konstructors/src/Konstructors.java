public class Konstructors {
    public static void main(String[] args) throws Exception {
        
        // ConstExample cex = new ConstExample();
        // cex.plus(10, 20 );

        // ConstExample cexa = new ConstExample( 10 );
        // cexa.minus();

        // GettingData getData = new GettingData();
        // double number01 = getData.getDouble("Szám: " );
        // System.out.println( number01 );

        // GettingData getData = new GettingData();
        // int number = getData.getInt("Szám: " );
        // System.out.println( number );

        // GettingData getData = new GettingData();
        // String text = getData.getString( "Szöveg: " );
        // System.out.println( text );

        GettingData getData = new GettingData();
        //char x = getData.getSpell( "Betű: " );
        System.out.println( getData.getSpell( "Betű: " ) );
    }
}