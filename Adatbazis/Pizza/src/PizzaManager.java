import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PizzaManager {

    PizzaManager(){

        getCuriers();
        getBuyers();
    }

    private void getCuriers() {

        String sql = "SELECT * FROM futarok;";

        Statement stmt = null;
        ResultSet rs = null;
        ConnectDatabase connDb = new ConnectDatabase();
        connDb.getConnect();
        Connection conn = connDb.getConn();

        try {

            stmt = conn.createStatement();
            rs = stmt.executeQuery( sql );

            while( rs.next() ) {

                System.out.println( rs.getInt( "fid" ));
                System.out.println( rs.getString( 2 ));
                System.out.println( rs.getString( "tel" ));
            }
            
        } catch ( SQLException ex ) {
            
            System.out.println( "Hiba a lekérdezés során" );
        }
    }

    private void getBuyers() {

        String sql = "SELECT * FROM vevok;";

        Statement stmt = null;
        ResultSet rs = null;
        ConnectDatabase connDb = new ConnectDatabase();
        connDb.getConnect();
        Connection conn = connDb.getConn();

        try {

            stmt = conn.createStatement();
            rs = stmt.executeQuery( sql );

            while( rs.next() ) {

                System.out.println( rs.getInt( 1 ));
                System.out.println( rs.getString( 2 ));
                System.out.println( rs.getString( 3 ));
            }
            
        } catch ( SQLException ex ) {
            
            System.out.println( "Hiba a lekérdezés során" );
        }
    }
}
