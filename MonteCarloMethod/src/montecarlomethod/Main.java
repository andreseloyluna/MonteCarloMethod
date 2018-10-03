/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlomethod;

/**
 *
 * @author aels21
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
      initComponents();
      setLocationRelativeTo(null);		
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        MainButtonContinue = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The MonteCarlo Project");
        setBackground(new java.awt.Color(233, 242, 243));
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(233, 242, 243));
        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MainPanel.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainButtonContinue.setBackground(new java.awt.Color(196, 220, 245));
        MainButtonContinue.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        MainButtonContinue.setText("Continuar");
        MainButtonContinue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainButtonContinue.setPreferredSize(new java.awt.Dimension(79, 23));
        MainButtonContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainButtonContinueActionPerformed(evt);
            }
        });
        MainPanel.add(MainButtonContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 90, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("SIMULACIÓN Y MODELOS");
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, 10));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("NÚCLEO NUEVA ESPARTA");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, 10));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("UNIVERSIDAD DE ORIENTE");
        MainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, 10));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("ESCUELA DE INGENIERÍA Y CIENCIAS APLICADAS");
        MainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, 10));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("LICENCIATURA EN INFORMÁTICA");
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainButtonContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainButtonContinueActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new InputTables().setVisible(true);
        //new InputTables().setVisible(true);
    }//GEN-LAST:event_MainButtonContinueActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainButtonContinue;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
