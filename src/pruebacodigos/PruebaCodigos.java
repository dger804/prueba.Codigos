/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacodigos;

import javax.swing.UIManager;
import vista.*;

/**
 *
 * @author diego
 */
public class PruebaCodigos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            
            javax.swing.UIManager.setLookAndFeel( 
            javax.swing.UIManager.getSystemLookAndFeelClassName()); 
            
            Ventana1 v = new Ventana1();
            v.setVisible(true);
        } catch (Exception e) {
        }
        
        
        
        
        
    }
    
    
}
