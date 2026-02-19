public class Controller {

    public Controller() {

        start();
    }

    private void start() {

        System.out.println( "Síkidom számoló program.");
        System.out.println( "------ Menü ------\n");
        System.out.println( "Téglalap:\t[ 1 ]\nKör:\t\t[ 2 ]\nHáromszög:\t[ 3 ]\nKilépés:\t[ 0 ]\nVálassz!");
        
        GettingData getData = new GettingData();
        int choosing = getData.getInt("Választás: ");
        switch ( choosing ) {
            case 1:
                System.out.println( "Kerület: [ 1 ] Terület: [ 2 ]" );
                int choose = getData.getInt("Választás: ");
                if( choose == 1 ) {
                    rectangle_perimeter();
                }else {
                    rectangle_area();
                }
                break;
            case 2:
                System.out.println( "Kerület: [ 1 ] Terület: [ 2 ]" );
                int ch = getData.getInt("Választás: " );
                if( ch == 1 ) {
                    circle_perimeter();
                }else {
                    circle_area();
                }
                break;
            case 0:
                System.exit( 0 );
                break;
            default:
                break;
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

        GettingData getData = new GettingData();
        double radius = getData.getDouble("Sugár:" );
        Circle circle = new Circle();
        double area = circle.calculating_circle_area( radius );

        System.out.println( "Kör területe: " + area );
    }
}
