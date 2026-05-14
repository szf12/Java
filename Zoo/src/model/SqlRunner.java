/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Vector;

public class SqlRunner {
    
    private String filePath;
    
    public SqlRunner( String fileName ) {
        
        this.filePath = "sql/" + fileName + ".sql";
    }
    
    private String[] getSql() {
        
        String[] sql = null;
        Path path = Path.of( filePath );
        
        try {
            
            String content = Files.readString( path );
            sql = content.split( ";" );
            
        } catch ( IOException e ) {
            
            System.out.println( "Hiba a beolvasás során" );
        }
        
        return sql;
    }
    
    public Vector<Vector<Object>> getAnimals( Connection conn ) {
        
        Vector<Vector<Object>> animals = new Vector<>();
        Statement stmt = null;
        ResultSet rs = null;
        String[] sql = getSql();
        
        try {
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery( sql[ 0 ] );
            
            while( rs.next() ) {
                
                Vector<Object> animal = new Vector<>();
                animal.add( rs.getObject( 1 ));
                animal.add( rs.getObject( 2 ));
                animal.add( rs.getObject( 3 ));
                animal.add( rs.getObject( 4 ));
                
                animals.add( animal );
            }
        } catch ( SQLException e ) {
            
            System.out.println("Hiba a lekérdezés során.");
        }
        
        return animals;
     }
}
