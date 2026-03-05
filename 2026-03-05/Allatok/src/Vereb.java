public class Vereb extends Allat {

    Vereb( String name, String color, int weight ) {

        super( name, color, weight );
    }

    @Override
    public void speaking() {

        System.out.println( "Csip- csip" );
    }

    @Override
    public void moving() {

        System.out.println( "Ugálok" );
    }
}
