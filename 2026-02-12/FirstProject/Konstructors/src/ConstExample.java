public class ConstExample {

    private int number;

    public ConstExample() {
    }

    public ConstExample( int number ) {

        this.number = number;
    }

    protected void plus( int num01, int num02 ) {

        int result = num01 + num02;

        System.out.println( result );
    }

    protected void minus() {

        int result = this.number - 2;

        System.out.println( result );
    }
}
