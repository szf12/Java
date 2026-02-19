public class Circle {

    public Circle() {}

    protected double calculating_circle_perimeter( double radius ) {

        double perimeter = radius * 2 * Math.PI;

        return perimeter;
    }

    protected double calculating_circle_area( double radius ) {

        double area = Math.pow( radius, 2 ) * Math.PI;

        return area;
    }
}
