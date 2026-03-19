public class ShapeMenu {

    private GettingData getData;

    public ShapeMenu() {

        getData = new GettingData();
    }

    protected int getMainMenu() {

        System.out.println( "Sikidomok terület, kerület számítása.\n" );
        System.out.println( "----- Menü -----" );
        System.out.println( "Háromszög\t[ 1 ]");
        System.out.println( "Téglalap\t[ 2 ]");
        System.out.println( "Kör\t\t[ 3 ]");
        System.out.println( "Kilépés [ 0 ]");

        int choosingShape = getData.getInt( "Választás: " );

        return choosingShape;
    }

    protected int getSubMenu( String shape ) {

        System.out.println( "A " + shape + " síkidomot választottad." );
        System.out.println( "Terület:\t[ 1 ]");
        System.out.println( "Kerület:\t[ 2 ]");
        System.out.println( "Vissza:\t[ 0 ]");

        int choosing = getData.getInt( "Választás: " );

        return choosing;
    }
}
