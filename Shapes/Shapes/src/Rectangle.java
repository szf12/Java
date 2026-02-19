public class Rectangle {

    public Rectangle() {}

    protected double calculating_rectangle_perimeter( double sideA, double sideB ) {

        double perimeter = ( sideA + sideB ) * 2;

        return perimeter;
    }

    protected double calculating_rectangle_area( double sideA, double sideB ) {

        double area = sideA * sideB;

        return area;
    }
}
