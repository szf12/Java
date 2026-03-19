public class Rectangle implements Shape {

    Rectangle() {}

    @Override
    public void calcArea() {

        int area = 10 *10;

        System.out.println( area );
    }

    @Override
    public void calcPerimeter() {

        int perimeter = ( 10 + 10 ) * 2;

        System.out.println( perimeter );
    }
}
