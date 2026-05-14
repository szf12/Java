/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import view.ZooForm;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormController {
    
    private ZooForm zooFrm;
    private DatabaseController dbCtrl;

    public FormController( DatabaseController dbCtrl ) {
        
        this.dbCtrl = dbCtrl;
    }
    
    public void start() {
        
        initComponents();
        addEventHolder();
    }
    
    private void addEventHolder() {
        
        zooFrm.getExitBtn().addActionListener( event -> exit() );
        zooFrm.getLoadBtn().addActionListener( event -> loading() );
    }
    
    private void initComponents() {
        
        zooFrm = new ZooForm();
        
        Vector<String> columns = getColumnNames();
        DefaultTableModel model = new DefaultTableModel( columns, 10 );
        JTable table = zooFrm.getZooTbl();
        table.setModel( model );
        
        zooFrm.setVisible( true );
    }
    
    private Vector<String> getColumnNames() {
        
        Vector<String> columnNames = new Vector<>();
        
        columnNames.add( "Faj" );
        columnNames.add( "Étel" );
        columnNames.add( "Mennyiség" );
        columnNames.add( "Ár" );
        
        return columnNames;
    }
    
    private void loading() {
        
        Vector<String> columns = getColumnNames();
        Vector<Vector<Object>> animalsData = dbCtrl.getAnimals();
        DefaultTableModel model = new DefaultTableModel( animalsData, columns );
        
        zooFrm.getZooTbl().setModel( model );
    }
    
    private void exit() {
        
        System.exit( 0 );
    }
}
