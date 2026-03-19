public class Circle implements Shape {


    Circle() {}

    @Override
    public void calcArea() {

        double area = Math.pow( 10, 2 ) * Math.PI;
        System.out.println( area );
    }

    @Override
    public void calcPerimeter() {
        
        double perimeter = 10 * 2 * Math.PI;
        System.out.println( perimeter );
    }
}
