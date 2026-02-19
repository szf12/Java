public class Triangle {

    public Triangle() {}

    protected double calculating_triangle_perimeter( double sideA, double sideB, double sideC ) {

        double perimeter = sideA + sideB + sideC;

        return perimeter;
    }

    protected double calculating_triangle_area( double base, double high ) {

        double area = ( base * high ) / 2;

        return area;
    }

    protected double calculating_triangle_area( double sideA, double sideB, double sideC ) {

        double s = calculating_triangle_perimeter( sideA, sideB, sideC ) / 2 ;
        //s(s-a)(s-b)(s-c)
        double subResult = ( s - sideA ) * ( s - sideB ) * ( s - sideC ) * s;
        double area = Math.sqrt( subResult );

        return area;
    }

    private boolean isRightAngel( double sideA, double sideB, double sideC ) {

        double maxSide = Math.max( sideA, Math.max( sideB, sideC ));
    }
}
