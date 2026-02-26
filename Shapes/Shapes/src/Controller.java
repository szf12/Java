public class Controller {

    public Controller() {

        mainMenu();
    }

    private void mainMenu() {

        ShapeMenu shMenu = new ShapeMenu();
        while( true ) {

            int choosing = shMenu.getMainMenu();
            switch( choosing ) {

                case 1: subMenu( "Háromszög" ); break;
                case 2: subMenu( "Téglalap" ); break;
                case 3: subMenu( "Kör" ); break;
                case 0: exit(); break;
            }
        }
    }

    private void subMenu( String text ) {

        ShapeMenu shMenu = new ShapeMenu();
        boolean back = false;

        while( !back ) {

            int choosing = shMenu.getSubMenu( text );
            switch ( choosing ) {
                case 1: 
                    if( text.equals( "Háromszög" ) ) {

                    }else if( text.equals( "Téglalap" )){

                        rectangle_area();
                    
                    }else {

                        circle_area();

                    } back = true; break;
                case 2: break;
                case 0: back = true; break;
                default: errorMessage( choosing ); break;
            }
        }
    }

    private void rectangle_perimeter() {

        GettingData getData = new GettingData();
        double sideA = getData.getDouble( "\"A\" oldal: " );
        double sideB = getData.getDouble( "\"B\" oldal: " );

        Rectangle rect = new Rectangle();
        double result = rect.calculating_rectangle_perimeter( sideA, sideB );

        System.out.println( "Téglalap kerülete: " + result );
    }

    private void rectangle_area() {

        GettingData getData = new GettingData();
        double sideA = getData.getDouble("A oldal: ");
        double sideB = getData.getDouble("B oldal: ");
        Rectangle rect = new Rectangle();
        double area = rect.calculating_rectangle_area( sideA, sideB );

        System.out.println( "Téglalap területe: " + area );
    }

    private void circle_perimeter() {

        GettingData getData = new GettingData();
        double radius = getData.getDouble("Sugár: " );
        Circle circle = new Circle();
        double perimeter = circle.calculating_circle_perimeter( radius );

        System.out.println( "Kör kerülete: " + perimeter );
    }

    private void circle_area() {

        Circle circle = new Circle();
        GettingData getData = new GettingData();
        double radius = getData.getDouble("Sugár:" );
        double area = circle.calculating_circle_area( radius );

        System.out.println( "Kör területe: " + area );
    }

    private void errorMessage( int choosing ) {

        System.out.println( "A" + choosing + " opció nem létezik.");
    }

    private void exit() {

        System.exit( 0 );
    }
}
