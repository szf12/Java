import java.sql.Connection;

public class Controller {

    private Connection conn;
    private String[] data;

    Controller() {

        conn = null;
        data = new String[ 5 ];

        connecting();
        setData();
        //writeData();
        //deleteData();
        closeDb();
    }

    private void connecting() {

        ConnectDatabase connDb = new ConnectDatabase();
        connDb.getConnect();
        conn = connDb.getConn();

        if( conn != null ) {

            System.out.println( "Ok" );
        }else {

            System.out.println( "Baj van");
        }

        boolean success = connDb.destroyConnection();
        if( success ) {

            System.out.println("Kapcsolat lezárva" );
        }
    }

    private void setData() {

        data[ 0 ] = "2026-04-23";
        data[ 1 ] = "14.25";
        data[ 2 ] = "1";
        data[ 3 ] = "1";
        data[ 4 ] = "1";
    }

    private void writeData() {

        SqlRunner sqlRun = new SqlRunner();
        boolean success = sqlRun.setData( data, conn );

        if( success ) {

            System.out.println( "Sikeres írás" );

        }else {

            System.out.println( "Hiba az írás során" );
        }
    }

    private void deleteData() {

        SqlRunner sqlRun = new SqlRunner();
        boolean success = sqlRun.deleteRecord( conn, 22 );

        if( success ) {

            System.out.println( "Sikeres törlés" );

        }else {

            System.out.println( "Hiba a törlés során" );
        }
    }

    private void closeDb() {

        ConnectDatabase connDb = new ConnectDatabase();
        boolean success = connDb.destroyConnection();

        
        if( success ) {

            System.out.println("Kapcsolat lezárva" );
        }
    }
}
