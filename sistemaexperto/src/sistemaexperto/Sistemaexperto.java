/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaexperto;

import com.sistemaexperto.GUI.Encuesta;
import com.sistemaexperto.logic.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Cesar
 */
public class Sistemaexperto {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /*
             * Set the Nimbus look and feel
             */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /*
             * If Nimbus (introduced in Java SE 6) is not available, stay with the
             * default look and feel. For details see
             * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
             */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /*
             * Create and display the form
             */
             UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            java.awt.EventQueue.invokeLater(new Runnable() {

                public void run() {
                    
                    new Encuesta().setVisible(true);
                }
            });
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sistemaexperto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Sistemaexperto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Sistemaexperto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Sistemaexperto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
