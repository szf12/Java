import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlRunner {

    SqlRunner() {}

    protected boolean setData( String[] data, Connection conn ) {

        try {
            
            PreparedStatement pstmt = null;
            boolean success = settingData( data, conn, pstmt );

            return success;

        } catch ( SQLException ex ) {

            return false;
            //System.out.println( "Hiba az írás során" );
        }
    }

    private boolean settingData( String[] data, Connection conn, PreparedStatement pstmt ) throws SQLException {

        String sql = "INSERT INTO rendelesek (datum, ido, vevo_id, " +
                    "futar_id, pizza_id) VALUES " +
                    "( ?, ?, ?, ?, ? );";

        pstmt = conn.prepareStatement( sql );
        pstmt.setString( 1, data[ 0 ]);
        pstmt.setDouble( 2, Double.parseDouble( data[ 1 ]));
        pstmt.setInt( 3, Integer.parseInt( data[ 2 ]));
        pstmt.setInt( 4, Integer.parseInt( data[ 3 ]));
        pstmt.setInt( 5, Integer.parseInt( data[ 4 ]));

        pstmt.execute();

        return true;
    }

    public boolean deleteRecord( Connection conn, int id ) {

        String sql = "DELETE FROM rendelesek " +
                     "WHERE rid = ?";

        PreparedStatement pstmt = null;
        try {
            
            pstmt = conn.prepareStatement( sql );
            pstmt.setInt( 1, id );

            pstmt.execute();

            return true;

        } catch ( SQLException ex ) {
            
            return false;
        }
    }
}
