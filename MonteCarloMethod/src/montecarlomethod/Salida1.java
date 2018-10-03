/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlomethod;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aels21
 */
public class Salida1 extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Salida1() {
      initComponents();
      setLocationRelativeTo(null);
      
      String[] headerTablaSolucion1 = {"Dia","Rn","Nro de Camiones"};
      DefaultTableModel modelTablaSolucion1 = new DefaultTableModel(null, headerTablaSolucion1);
        
        
      for (int i = 0; i < SeudoRandomMethod.diasStatic; i++) {
          String[] fila = new String[3];
          fila[0] = String.valueOf(i + 1) ;
          fila[1] = String.valueOf(SeudoRandomMethod.tablaSolucion1Static[i][1]);
          fila[2] = String.valueOf(SeudoRandomMethod.tablaSolucion1Static[i][2]);
          modelTablaSolucion1.addRow(fila);
      }
        

      JtablaSolucion1.setModel(modelTablaSolucion1);
      
      System.out.println("Cantidad carga A: ");
      System.out.println(SeudoRandomMethod.cantCargaA);
      System.out.println("Cantidad carga B: ");
      System.out.println(SeudoRandomMethod.cantCargaB);
      System.out.println("Cantidad carga C: ");
      System.out.println(SeudoRandomMethod.cantCargaC);
      System.out.println(SeudoRandomMethod.totalPagarStatic); 
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
        jScrollPane1 = new javax.swing.JScrollPane();
        JtablaSolucion1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MainButtonContinue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The MonteCarlo Project - Salida I");
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(146, 213, 220));
        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MainPanel.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        JtablaSolucion1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        JtablaSolucion1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JtablaSolucion1);

        MainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 500, 190));

        jButton1.setBackground(new java.awt.Color(196, 220, 245));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton1.setText("Salida II");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 90, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 120, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Tabla de Resultados N° 1");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, 20));

        MainButtonContinue.setBackground(new java.awt.Color(196, 220, 245));
        MainButtonContinue.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        MainButtonContinue.setText("Atrás");
        MainButtonContinue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainButtonContinue.setName("btnatras1"); // NOI18N
        MainButtonContinue.setPreferredSize(new java.awt.Dimension(79, 23));
        MainButtonContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainButtonContinueActionPerformed(evt);
            }
        });
        MainPanel.add(MainButtonContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 90, 30));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       this.setVisible(false);
       new Salida2().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MainButtonContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainButtonContinueActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SeudoRandomMethod().setVisible(true);
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
            java.util.logging.Logger.getLogger(Salida1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salida1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salida1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salida1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salida1().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtablaSolucion1;
    private javax.swing.JButton MainButtonContinue;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
