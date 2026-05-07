/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import view.ZooForm;

public class FormController {
    
    private ZooForm zooFrm;

    public FormController() {
        
        
    }
    
    public void start() {
        
        initComponents();
    }
    
    private void initComponents() {
        
        zooFrm = new ZooForm();
        zooFrm.setVisible( true );
    }
}
