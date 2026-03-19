public class Circle extends Shape {

    private double radius;

    Circle( double radius ) {

        super( "Kör" );
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.pow( radius, 2 ) *  Math.PI;
    }

    @Override
    public double getPerimeter() {

        return radius *  2 * Math.PI;
    }
}
