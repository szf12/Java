import java.sql.Connection;

public class Kapcsolodas {

    public static void main(String[] args) {
        
        ConnectDatabase connDb = new ConnectDatabase();
        connDb.getConnect();
        Connection conn = connDb.getConn();

        if( conn != null ) {

            System.out.println( "OK" );

        }else {

            System.out.println( "Nincs kapcsolat" );
        }
    }
}
