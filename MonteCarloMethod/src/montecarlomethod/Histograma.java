/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlomethod;

import static montecarlomethod.SeudoRandomMethod.isBetween;
import static montecarlomethod.SeudoRandomMethod.random;

/**
 *
 * @author aels21
 */
public class Histograma extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    int calcular_posicion(int seudo, int min){
        return min-(seudo*30/100);
    }
    public Histograma() {
      initComponents();
      setLocationRelativeTo(null);
      int contadorSeudoAleatorio = 0;
      while(contadorSeudoAleatorio < SeudoRandomMethod.diasStatic){
            int seudoRandomNumber = (int) (SeudoRandomMethod.tablaSolucion1Static[contadorSeudoAleatorio][1]*1000);
            if (isBetween(seudoRandomNumber,0,49)){
                javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                jLabel4.setText("------------>");
                MainPanel.setLayout(null);
                jLabel4.setSize(100, 50);
                MainPanel.add(jLabel4);
                jLabel4.setLocation(90,calcular_posicion(seudoRandomNumber, 350));                
            }else if(isBetween(seudoRandomNumber,50,199)){
                javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                jLabel4.setText("------------>");
                MainPanel.setLayout(null);
                jLabel4.setSize(100, 50);
                MainPanel.add(jLabel4);
                jLabel4.setLocation(130,calcular_posicion(seudoRandomNumber, 350)); //Camiones en el dia
            }else if(isBetween(seudoRandomNumber,200,419)){
                javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                jLabel4.setText("------------>");
                MainPanel.setLayout(null);
                jLabel4.setSize(100, 50);
                MainPanel.add(jLabel4);
                jLabel4.setLocation(170,calcular_posicion(seudoRandomNumber, 350)); //Camiones en el dia
            }else if(isBetween(seudoRandomNumber,420,639)){
                javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                jLabel4.setText("------------>");
                MainPanel.setLayout(null);
                jLabel4.setSize(100, 50);
                MainPanel.add(jLabel4);
                jLabel4.setLocation(210,calcular_posicion(seudoRandomNumber, 350)); //Camiones en el dia
            }else if(isBetween(seudoRandomNumber,640,809)){
                javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                jLabel4.setText("------------>");
                MainPanel.setLayout(null);
                jLabel4.setSize(100, 50);
                MainPanel.add(jLabel4);
                jLabel4.setLocation(250,calcular_posicion(seudoRandomNumber, 350)); //Camiones en el dia
            }else if(isBetween(seudoRandomNumber,810,919)){
                javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                jLabel4.setText("------------>");
                MainPanel.setLayout(null);
                jLabel4.setSize(100, 50);
                MainPanel.add(jLabel4);
                jLabel4.setLocation(290,calcular_posicion(seudoRandomNumber, 350)); //Camiones en el dia
            }else if(isBetween(seudoRandomNumber,920,969)){
                javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                jLabel4.setText("------------>");
                MainPanel.setLayout(null);
                jLabel4.setSize(100, 50);
                MainPanel.add(jLabel4);
                jLabel4.setLocation(330,calcular_posicion(seudoRandomNumber, 350)); //Camiones en el dia
            }else if(isBetween(seudoRandomNumber,970,999)){
                javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                jLabel4.setText("------------>");
                MainPanel.setLayout(null);
                jLabel4.setSize(100, 50);
                MainPanel.add(jLabel4);
                jLabel4.setLocation(370,calcular_posicion(seudoRandomNumber, 350)); //Camiones en el dia
            }
            contadorSeudoAleatorio++;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The MonteCarlo Project");
        setUndecorated(true);
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MainPanel.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        MainPanel.setMinimumSize(new java.awt.Dimension(400, 400));
        MainPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/montecarlomethod/assets/histograma3.png"))); // NOI18N
        MainPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 410, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Salida2().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Histograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Histograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Histograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Histograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Histograma().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
