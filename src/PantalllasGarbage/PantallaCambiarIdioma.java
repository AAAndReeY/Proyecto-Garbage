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
public class PantallaCambiarIdioma extends javax.swing.JFrame {

    /**
     * Creates new form PantallaCambiarIdioma
     */
    public PantallaCambiarIdioma() {
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

        lblCambiarIdioma = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        cmbIdioma = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCambiarIdioma.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCambiarIdioma.setText("Cambiar Idioma");
        getContentPane().add(lblCambiarIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("Salir");
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 110, 30));

        cmbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingles", "Ruso", "Aleman", "Quechua", "Aymara", "Binario", "Brainle", "Codigo Morse", " " }));
        getContentPane().add(cmbIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PantallaCambiarIdioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCambiarIdioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCambiarIdioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCambiarIdioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCambiarIdioma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbIdioma;
    private javax.swing.JLabel lblCambiarIdioma;
    // End of variables declaration//GEN-END:variables
}