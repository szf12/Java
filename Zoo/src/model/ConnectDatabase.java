/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectDatabase {
    
    private Connection conn;

    public ConnectDatabase() {

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

        String connectionString = "jdbc:mariadb://localhost:3306/tanar_zoo?user=tanar&password=123";

        conn = DriverManager.getConnection( connectionString );

    }

    public boolean destroyConnection() {

        if( conn != null ) {

            try {
                
                conn.close();

            } catch ( SQLException ex ) {

                System.out.println( "Hiba a lezárás során" );
            }
            
            return true;

        }else {

            return false;
        }
    }

    public Connection getConn() { return conn; }
}
