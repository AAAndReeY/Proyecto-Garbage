/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PantalllasGarbage;

/**
 *
 * @author hanze
 */
public class ContactoGargabage extends javax.swing.JFrame {

    /**
     * Creates new form ContactoGargabage
     */
    public ContactoGargabage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtComentarios = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMensajeriaInter = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRecomendaciones = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jlblimagenUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTACTO GARGABAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 41));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Comentarios:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComentariosActionPerformed(evt);
            }
        });
        getContentPane().add(txtComentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mensajeria Interna :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txtMensajeriaInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensajeriaInterActionPerformed(evt);
            }
        });
        getContentPane().add(txtMensajeriaInter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Recomendaciones :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtRecomendaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecomendacionesActionPerformed(evt);
            }
        });
        getContentPane().add(txtRecomendaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 160, -1));

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 90, 40));

        jlblimagenUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoVentanas.PNG"))); // NOI18N
        jlblimagenUser.setText("jLabel6");
        getContentPane().add(jlblimagenUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComentariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComentariosActionPerformed

    private void txtMensajeriaInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensajeriaInterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensajeriaInterActionPerformed

    private void txtRecomendacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecomendacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecomendacionesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         PantallaPrincipal PP7 = new PantallaPrincipal();
         PP7.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(ContactoGargabage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactoGargabage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactoGargabage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactoGargabage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactoGargabage().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlblimagenUser;
    private javax.swing.JTextField txtComentarios;
    private javax.swing.JTextField txtMensajeriaInter;
    private javax.swing.JTextField txtRecomendaciones;
    // End of variables declaration//GEN-END:variables
}
