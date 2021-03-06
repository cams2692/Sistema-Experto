/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaexperto.GUI;

import com.sistemaexperto.logic.Computador;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar
 */
public class Tabla extends javax.swing.JFrame {

    /**
     * Creates new form Tabla
     */
    
    private Encuesta encuesta;
    
    public Tabla(ArrayList<Computador> computadores, Encuesta encuesta) {
        this.encuesta=encuesta;
        
        String[] nombres = {"Marca", "Disco Duro", "Procesador", "RAM", "GPU", "Valor"};
        String [][] data = new String[computadores.size()][6];
        initComponents();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                switch (j){
                    case 0:
                        data[i][j] = computadores.get(i).getMarca();
                        break;
                    case 1:
                        data[i][j] = computadores.get(i).getDisco().getCapacidad();
                        break;
                    case 2:
                        data[i][j] = computadores.get(i).getProcesador().getReferencia();
                        break;
                    case 3:
                        data[i][j] = computadores.get(i).getRam().getCapacidad();
                        break;
                    case 4:
                        data[i][j] = computadores.get(i).getTarjeta().getCapacidad();
                        break;
                    case 5:
                        data[i][j] = String.valueOf(computadores.get(i).getValor());
                        break;
                }
                
            }
        }
        jTable1.setModel(new DefaultTableModel(data, nombres));
        
        this.addWindowListener(new WindowAdapter() {
            
            public void windowClosing(WindowEvent we){
                
                
                    
                 dispose();  
                    getEncuesta().setVisible(true);
            }
        });
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the encuesta
     */
    public Encuesta getEncuesta() {
        return encuesta;
    }

    /**
     * @param encuesta the encuesta to set
     */
    public void setEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
    }
}
