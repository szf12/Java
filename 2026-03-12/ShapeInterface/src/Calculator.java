public class Calculator {

    Shape shape;

    Calculator( Shape shape ) {

        this.shape = shape;
    }

    public void calculateArea() {

        shape.calcArea();
    }

    public void calculatePerimeter() {

        shape.calcPerimeter();
    }
}
