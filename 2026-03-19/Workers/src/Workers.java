import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Workers {
    public static void main(String[] args) throws Exception {
        
        readFile();
    }

    private static void readFile() {

        FileReader freader = null;
        Scanner scan = null;

        try {
            
            freader = new FileReader( "dolgozok100.txt" );
            scan = new Scanner( freader );

        } catch ( FileNotFoundException exception ) {
            
            System.out.println( "Nincs meg a fájl" );
            //System.out.println( exception.getMessage() );

        }finally {

            System.out.println( "Fájlbeolvasás bejezve" );
        }

        int counter = 0;
        while( scan.hasNext() ) {

            scan.nextLine();
            counter ++;
        }

        System.out.println( "A fájl " + counter + " sorból áll" );
    }
}
