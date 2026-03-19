
public class Controller {

    private Shape currentShape;

    public Controller() {

        currentShape = null;

    }

    protected void mainMenu() {

        ShapeMenu shMenu = new ShapeMenu();
        while ( true ) {
            
            int choosing = shMenu.getMainMenu();
            switch ( choosing ) {

                case 1: subMenu( "Háromszög" ); break;

                case 2: subMenu("Téglalap" ); break;

                case 3: subMenu( "Kör" ); break;

                case 0: System.exit( 0 ); break;

                default: getErrorMessage( choosing ); break;
            }

        }
    }

    private void subMenu( String shape ) {

        ShapeMenu shMenu = new ShapeMenu();
        boolean back = false;

        while( !back ) {

            int mode = shMenu.getSubMenu( shape );
            switch( mode ) {

                case 1: 
                    currentShape = createShape( shape );
                    currentShape.printArea();
                    break;
            }
        }
    }

    private Shape createShape( String shape ) {

        switch( shape ) {

            case "Kör": return createCircle();
            case "Téglalap": return createRectangle();
            default: return null;
        }
    }

    private Shape createCircle() {

        GettingData getData = new GettingData();
        double radius = getData.getDouble("Sugár: ");

        return new Circle( radius );
    }

    private Shape createRectangle() { 
        
        GettingData getData = new GettingData();
        double sideA = getData.getDouble("A oldal: ");
        double sideB = getData.getDouble("B oldal: ");

        return new Rectangle( sideA, sideB );
    }

    private void getErrorMessage( int choosing ) {

        System.out.println( "A " + choosing + "opció nem választható" );
    }
}
