public class Rectangle extends Shape {

    private double aSide, bSide;

    Rectangle( double aSide, double bSide ) {

        super( "Téglalap" );
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    public double getArea() {

        return aSide * bSide;
    }

    @Override
    public double getPerimeter() {

        return ( aSide + bSide ) * 2;
    }
}
