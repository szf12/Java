import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
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
            System.out.println( exception.getMessage() );
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

            worker.setName( rowSp[ 0 ] );
            worker.setCity( rowSp[ 1 ] );
            worker.setAddress( rowSp[ 2 ] );
            worker.setSalary( rowSp[ 3 ] );
            worker.setBonus ( rowSp[ 4 ] );
            worker.setBorn( rowSp[ 5 ] );
            worker.setHire ( rowSp[ 6 ] );

            workers.add( worker );
        }
        return workers;
    }

    public boolean writeGyorSalary( String salary ) {

        FileWriter fWriter = null;
        try {
            
            write( salary, fWriter );

            return true;

        } catch ( IOException exception ) {
            
            System.out.println( "Hiba az írás során" );

            return false;

        }
    }

    private boolean write( String salary, FileWriter fWriter ) throws IOException {

        fWriter = new FileWriter( "Gyor.txt", false );

        fWriter.write( "Győri dolgozók fizetése:\n");
        fWriter.write( salary );

        fWriter.close();

        return true;
    }
}
