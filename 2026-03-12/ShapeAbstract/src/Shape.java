public abstract class Shape {

    private String name;

    public Shape( String name ) {

        this.name = name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public void printArea() {

        double area = getArea();
        System.out.printf( "Terület: %.2f cm2", area );
    }

    public void printPerimeter() {

        double perimeter = getPerimeter();
        System.out.printf( "Kerület: %.2f cm", perimeter );
    }

    public String getName() { return name; }
}
