import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Employee {
    
    private static FileReader fReader;
    private static Scanner scan;
    private static Vector<Vector<String>> employees;

    public static void main(String[] args) throws Exception {
        
        readFile();
        writeNames();
    }

    private static void readFile() {
        
        employees = null;
        try {
            
            read();
            System.out.println( employees.size() );

        } catch ( FileNotFoundException e) {
            
            System.out.println( "Nincs meg a fájl" );
        }
    }

    private static void read() throws FileNotFoundException {

        fReader = new FileReader( "dolgozok100.txt" );
        scan = new Scanner( fReader );
        employees = new Vector<>();

        scan.nextLine();
        while( scan.hasNext() ) {

            String row = scan.nextLine();
            String[] rowSp = row.split( ":" );
            Vector<String> emp = new Vector<>();

            emp.add( rowSp[ 0 ] );
            emp.add( rowSp[ 1 ] );
            emp.add( rowSp[ 2 ] );
            emp.add( rowSp[ 3 ] );
            emp.add( rowSp[ 4 ] );
            emp.add( rowSp[ 5 ] );
            emp.add( rowSp[ 6 ] );

            employees.add( emp );
        }
    }

    private static void writeNames() {

        for( int i = 0; i < employees.size(); i++ ) {

            Vector<String> employee = new Vector<>();
            employee = employees.get( i );

            System.out.println( employee.get( 0 ));
        }
    }
}
