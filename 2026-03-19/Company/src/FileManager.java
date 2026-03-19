import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class FileManager {

    FileManager() {}

    protected Vector<Worker> readFile( String fileName ) {

        Vector<Worker> workers = new Vector<>();
        try {
            
            workers = read( fileName );

        } catch ( FileNotFoundException exception ) {
            
            System.out.println( "Nincs meg a fájl" );
        }

        return workers;
    }

    private Vector<Worker> read( String fileName ) throws FileNotFoundException {

        Vector<Worker> workers = new Vector<>();
        FileReader fReader = new FileReader( fileName );
        Scanner scan = new Scanner( fReader );
        
        scan.nextLine();
        while( scan.hasNext() ) {

            Worker worker = new Worker();
            String row = scan.nextLine();
            String[] rowSp = row.split( ":" );

            worker.name = rowSp[ 0 ];
            worker.city = rowSp[ 1 ];
            worker.address = rowSp[ 2 ];
            worker.salary = rowSp[ 3 ];
            worker.bonus = rowSp[ 4 ];
            worker.born = rowSp[ 5 ];
            worker.hire = rowSp[ 6 ];

            workers.add( worker );
        }
        return workers;
    }
}
