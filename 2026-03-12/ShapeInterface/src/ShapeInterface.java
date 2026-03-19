public class ShapeInterface {
    public static void main(String[] args) throws Exception {
        
        Circle circle = new Circle();
        Calculator calculator01 = new Calculator( circle );
        calculator01.calculateArea();
        calculator01.calculatePerimeter();

        Rectangle rectangle = new Rectangle();
        Calculator calculator02 = new Calculator( rectangle );
        calculator02.calculateArea();
        calculator02.calculatePerimeter();
    }
}
