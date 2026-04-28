import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectDatabase {

    private Connection conn;

    ConnectDatabase() {

        conn = null;
    }

    public void getConnect() {

        try {

            connecting();
            
        } catch ( SQLException ex ) {
            
            System.err.println( "Hiba a kapcsolódás során" );
        }
    }

    private void connecting() throws SQLException {

        String connectionString = "jdbc:mariadb://localhost:3306/tanar_pizza?user=tanar&password=123";

        conn = DriverManager.getConnection( connectionString );

    }

    public Connection getConn() { return conn; }
}
