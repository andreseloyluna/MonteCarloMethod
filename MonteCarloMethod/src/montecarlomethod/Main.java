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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The MonteCarlo Project");
        setBackground(new java.awt.Color(233, 242, 243));
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(146, 213, 220));
        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MainPanel.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainButtonContinue.setBackground(new java.awt.Color(196, 220, 245));
        MainButtonContinue.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        MainButtonContinue.setText("Iniciar");
        MainButtonContinue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainButtonContinue.setPreferredSize(new java.awt.Dimension(79, 23));
        MainButtonContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainButtonContinueActionPerformed(evt);
            }
        });
        MainPanel.add(MainButtonContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 90, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("SIMULACIÓN Y MODELOS");
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, 10));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("NÚCLEO NUEVA ESPARTA");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, 10));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("UNIVERSIDAD DE ORIENTE");
        MainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, 10));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("ESCUELA DE INGENIERÍA Y CIENCIAS APLICADAS");
        MainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, 10));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("LICENCIATURA EN INFORMÁTICA");
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/montecarlomethod/assets/logo100.png"))); // NOI18N
        jLabel6.setName("jlbfoto"); // NOI18N
        MainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        jLabel6.getAccessibleContext().setAccessibleName("jLbfoto");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setText("The MonteCarlo Project");
        MainPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/montecarlomethod/assets/camionpng.png"))); // NOI18N
        MainPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("Terminal de descargas");
        MainPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, 20));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel10.setText("2018 © Todos los derechos reservados - Luna,Rodríguez,Natera");
        MainPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
