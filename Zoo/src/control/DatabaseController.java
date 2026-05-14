/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.sql.Connection;
import model.ConnectDatabase;
import model.SqlRunner;
import java.util.Vector;

public class DatabaseController {
    
    private Connection conn;
    
    public DatabaseController() {
        
        conn = null;
        connecting();
    }
    
    private void connecting() {
        
        ConnectDatabase connDb = new ConnectDatabase();
        connDb.getConnect();
        conn = connDb.getConn();
    }
    
    public Vector<Vector<Object>> getAnimals() {
        
        SqlRunner sqlR = new SqlRunner( "__ANIMAL__" );
        Vector<Vector<Object>> animals = sqlR.getAnimals( conn );
        
        return animals;
    }
}
