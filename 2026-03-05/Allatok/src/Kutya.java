public class Kutya extends Allat {

    Kutya( String name, String color, int weight ) {

        super( name, color, weight );
    }

    @Override
    public void speaking() {

        System.out.println( "Vau-vau" );
    }

    @Override
    public void moving() {

        System.out.println( "Futok" );
    }
}
