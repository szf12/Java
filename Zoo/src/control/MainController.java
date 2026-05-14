/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author tanar
 */
public class MainController {
    
    private FormController formCtrl;
    private DatabaseController dbCtrl;

    public MainController() {
        
        start();
    }
   
   private void start() {
       
       dbCtrl = new DatabaseController();
       formCtrl = new FormController( dbCtrl );
       formCtrl.start();
   } 
}
