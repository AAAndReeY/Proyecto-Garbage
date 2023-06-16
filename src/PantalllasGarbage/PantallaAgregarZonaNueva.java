/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PantalllasGarbage;

import garbageapp.DistritoZonanueva;
import javax.swing.JOptionPane;

/**
 *
 * @author hanze
 */
public class PantallaAgregarZonaNueva extends javax.swing.JFrame {
    
    private DistritoZonanueva distritoZonanueva;
    private PantallaDistrito padre;

    /**
     * Creates new form PantallaAgregarZonaNueva
     */
    public PantallaAgregarZonaNueva() {
        initComponents();
        
    }
    
    public PantallaAgregarZonaNueva(PantallaDistrito padre){
        initComponents();
        this.padre = padre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblZonaNueva = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtReferencia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JTextField();
        btnSolicitar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblZonaNueva.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblZonaNueva.setForeground(new java.awt.Color(255, 255, 255));
        lblZonaNueva.setText("Agregar Zona Nueva");
        getContentPane().add(lblZonaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 260, 41));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ubicacion :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        getContentPane().add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 319, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Referencia :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        getContentPane().add(txtReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 168, 319, 34));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Calle :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        getContentPane().add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 319, 34));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Distrito :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));
        getContentPane().add(txtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 319, 34));

        btnSolicitar.setBackground(new java.awt.Color(0, 0, 255));
        btnSolicitar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSolicitar.setForeground(new java.awt.Color(0, 0, 255));
        btnSolicitar.setText("Solicitar");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 120, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 0, 51));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_zona.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         PantallaPrincipal PP2 = new PantallaPrincipal();
         PP2.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
    
        if(JOptionPane.showConfirmDialog(this, "¿Deseas solicitar?")
                == JOptionPane.OK_OPTION) {
            distritoZonanueva = new DistritoZonanueva();
            distritoZonanueva.setDistrito(txtDistrito.getText());
            distritoZonanueva.setUbicacion(txtUbicacion.getText());
            distritoZonanueva.setReferencia(txtReferencia.getText());
            distritoZonanueva.setCalle(txtCalle.getText());
            
            this.padre.setDistritoZonanueva(distritoZonanueva);
            this.padre.setVisible(true);
            this.dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSolicitarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaAgregarZonaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaAgregarZonaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaAgregarZonaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaAgregarZonaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaAgregarZonaNueva().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblZonaNueva;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
