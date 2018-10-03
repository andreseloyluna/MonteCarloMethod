/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlomethod;

import static montecarlomethod.SeudoRandomMethod.cantCargaA;
import static montecarlomethod.SeudoRandomMethod.cantCargaB;
import static montecarlomethod.SeudoRandomMethod.cantCargaC;
import static montecarlomethod.SeudoRandomMethod.isBetween;
import static montecarlomethod.SeudoRandomMethod.random;

/**
 *
 * @author aels21
 */
public class Histograma3 extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    int calcular_posicion(int seudo, int min){
        return min-(seudo*30/100);
    }
    public Histograma3() {
      initComponents();
      setLocationRelativeTo(null);
      for (int i = 0; i < SeudoRandomMethod.cantidadDeCamionesStatic; i++) {
            int seudoRandomNumber = (int) (SeudoRandomMethod.tablaSolucion2Static[i][4]*1000);
            if (isBetween(seudoRandomNumber,0,399)){ //Calculo de la cantidad de carga
                 javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                 jLabel4.setText("--------->");
                 MainPanel.setLayout(null);
                 jLabel4.setSize(100, 50);
                 MainPanel.add(jLabel4);
                 jLabel4.setLocation(151,calcular_posicion(seudoRandomNumber, 350));//Se incrementa el contador de camiones con tipo de carga A
            }else if(isBetween(seudoRandomNumber,400,749)){
                javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                 jLabel4.setText("--------->");
                 MainPanel.setLayout(null);
                 jLabel4.setSize(100, 50);
                 MainPanel.add(jLabel4);
                 jLabel4.setLocation(251,calcular_posicion(seudoRandomNumber, 350));//Se incrementa el contador de camiones con tipo de carga B
            }else if(isBetween(seudoRandomNumber,750,999)){
                javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                 jLabel4.setText("--------->");
                 MainPanel.setLayout(null);
                 jLabel4.setSize(100, 50);
                 MainPanel.add(jLabel4);
                 jLabel4.setLocation(351,calcular_posicion(seudoRandomNumber, 350));//Se incrementa el contador de camiones con tipo de carga C
            }
      /*
      int k = 0;
        for (int i = 0; i < SeudoRandomMethod.diasStatic; i++) {
            //Para cada uno de los dias, reviso cuantos camiones llegan
            int cantCamionesDia = (int) SeudoRandomMethod.tablaSolucion1Static[i][SeudoRandomMethod.tablaSolucion1Static[i].length-1];
                for (int j = 0; j < cantCamionesDia; j++) {
                    // Y por cada camion que llega, se guarda un registro en la tabla.
                   
                    int seudoRandomNumber = (int) (SeudoRandomMethod.tablaSolucion2Static[k][2]*1000);
                    if (isBetween(seudoRandomNumber,0,79)){ //Calculo de la cantidad de carga
                         javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                        jLabel4.setText("------------>");
                        MainPanel.setLayout(null);
                        jLabel4.setSize(100, 50);
                        MainPanel.add(jLabel4);
                        jLabel4.setLocation(90,calcular_posicion(seudoRandomNumber, 350));//Kilogramos de carga
                    }else if(isBetween(seudoRandomNumber,80,189)){
                         javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                jLabel4.setText("------------>");
                MainPanel.setLayout(null);
                jLabel4.setSize(100, 50);
                MainPanel.add(jLabel4);
                jLabel4.setLocation(130,calcular_posicion(seudoRandomNumber, 350));//Kilogramos de carga
                    }else if(isBetween(seudoRandomNumber,190,339)){
                         javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                jLabel4.setText("------------>");
                MainPanel.setLayout(null);
                jLabel4.setSize(100, 50);
                MainPanel.add(jLabel4);
                jLabel4.setLocation(170,calcular_posicion(seudoRandomNumber, 350));//Kilogramos de carga
                    }else if(isBetween(seudoRandomNumber,340,569)){
                         javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                jLabel4.setText("------------>");
                MainPanel.setLayout(null);
                jLabel4.setSize(100, 50);
                MainPanel.add(jLabel4);
                jLabel4.setLocation(210,calcular_posicion(seudoRandomNumber, 350));//Kilogramos de carga
                    }else if(isBetween(seudoRandomNumber,570,769)){
                         javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                jLabel4.setText("------------>");
                MainPanel.setLayout(null);
                jLabel4.setSize(100, 50);
                MainPanel.add(jLabel4);
                jLabel4.setLocation(250,calcular_posicion(seudoRandomNumber, 350));//Kilogramos de carga
                    }else if(isBetween(seudoRandomNumber,770,889)){
                         javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                jLabel4.setText("------------>");
                MainPanel.setLayout(null);
                jLabel4.setSize(100, 50);
                MainPanel.add(jLabel4);
                jLabel4.setLocation(290,calcular_posicion(seudoRandomNumber, 350));//Kilogramos de carga
                    }else if(isBetween(seudoRandomNumber,900,999)){
                         javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                jLabel4.setText("------------>");
                MainPanel.setLayout(null);
                jLabel4.setSize(100, 50);
                MainPanel.add(jLabel4);
                jLabel4.setLocation(330,calcular_posicion(seudoRandomNumber, 350));//Kilogramos de carga
                    }
                   
                    k++;
                }
        */
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
        jLabel8 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The MonteCarlo Project");
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MainPanel.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        MainPanel.setMinimumSize(new java.awt.Dimension(400, 400));
        MainPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/montecarlomethod/assets/Imagen2.png"))); // NOI18N
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
            java.util.logging.Logger.getLogger(Histograma3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Histograma3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Histograma3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Histograma3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Histograma3().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
