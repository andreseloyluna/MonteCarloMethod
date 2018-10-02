/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlomethod;

import java.util.Arrays;


/**
 *
 * @author aels21
 */
public class SeudoRandomMethod extends javax.swing.JFrame {
    static final double precioHoraNormalCuadrilla = 6600;
    static final double precioHoraExtraCuadrilla = 9900;
    /**
     * Creates new form SeudoRandomMethod
     */
    public SeudoRandomMethod() {
        initComponents();
        semilla1.setVisible(false);
        semilla2.setVisible(false);
        a.setVisible(false);
        m.setVisible(false);
        c.setVisible(false);
        sem1.setVisible(false);
        sem2.setVisible(false);
        a1.setVisible(false);
        m1.setVisible(false);
        c1.setVisible(false);
        constante.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PseudoRandomSelector = new javax.swing.JComboBox<>();
        semilla1 = new javax.swing.JTextField();
        sem2 = new javax.swing.JLabel();
        semilla2 = new javax.swing.JTextField();
        sem1 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        m1 = new javax.swing.JLabel();
        m = new javax.swing.JTextField();
        c1 = new javax.swing.JLabel();
        c = new javax.swing.JTextField();
        calcularM = new javax.swing.JButton();
        constante = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        days = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Selección de método generador ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 237, -1));

        PseudoRandomSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "1 - Cuadrado medio", "2 - Producto medio", "3 - Producto medio variado", "4 - Congruencial multiplicativo", "5 - Congruencial mixto" }));
        PseudoRandomSelector.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PseudoRandomSelectorItemStateChanged(evt);
            }
        });
        PseudoRandomSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PseudoRandomSelectorActionPerformed(evt);
            }
        });
        jPanel1.add(PseudoRandomSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        semilla1.setName(""); // NOI18N
        semilla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semilla1ActionPerformed(evt);
            }
        });
        jPanel1.add(semilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 90, -1));

        sem2.setText("Semilla 2");
        jPanel1.add(sem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 70, -1));
        jPanel1.add(semilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 90, 20));

        sem1.setText("Semilla 1");
        jPanel1.add(sem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        a1.setText("a");
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 20, -1));

        a.setName(""); // NOI18N
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 90, -1));

        m1.setText("m");
        jPanel1.add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 20, -1));

        m.setName(""); // NOI18N
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        jPanel1.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 90, -1));

        c1.setText("c");
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 20, -1));

        c.setName(""); // NOI18N
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        jPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 90, -1));

        calcularM.setText("Calcular");
        calcularM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularMActionPerformed(evt);
            }
        });
        jPanel1.add(calcularM, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        constante.setText("Constante");
        jPanel1.add(constante, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 70, -1));

        jLabel1.setText("Cantidad de días de la simulación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, 20));
        jPanel1.add(days, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void semilla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semilla1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semilla1ActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

    private void PseudoRandomSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PseudoRandomSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PseudoRandomSelectorActionPerformed

    private void PseudoRandomSelectorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PseudoRandomSelectorItemStateChanged
        if(evt.getStateChange()==1){
            switch(PseudoRandomSelector.getSelectedItem().toString().split(" - ")[0]){
                    case "1":
                        semilla1.setVisible(true); //input
                        sem1.setVisible(true); //texto
                        
                        
                        semilla2.setVisible(false); //input
                        sem2.setVisible(false);  //texto
                        constante.setVisible(false); //texto
                        
                        a.setVisible(false); //input
                        a1.setVisible(false);  //texto
                        
                        m.setVisible(false); //input
                        m1.setVisible(false); //texto
                        
                        c.setVisible(false); //input
                        c1.setVisible(false); //texto
                    break;
                    case "2":
                        semilla1.setVisible(true); //input
                        sem1.setVisible(true); //texto
                        semilla2.setVisible(true); //input
                        sem2.setVisible(true); //texto
                        
                        constante.setVisible(false); //texto
                        
                        a.setVisible(false); //input
                        a1.setVisible(false);  //texto
                        
                        m.setVisible(false); //input
                        m1.setVisible(false); //texto
                        
                        c.setVisible(false); //input
                        c1.setVisible(false); //texto
                    break;
                    case "3":
                        semilla1.setVisible(true); //input
                        sem1.setVisible(true); //texto
                        semilla2.setVisible(true); //input
                        constante.setVisible(true); //texto
                        
                        sem2.setVisible(false);  //texto
                        
                        a.setVisible(false); //input
                        a1.setVisible(false);  //texto
                        
                        m.setVisible(false); //input
                        m1.setVisible(false); //texto
                        
                        c.setVisible(false); //input
                        c1.setVisible(false); //texto
                    break;
                    case "4":
                        semilla1.setVisible(true); //input
                        sem1.setVisible(true); //texto
                        a.setVisible(true); //input
                        a1.setVisible(true);  //texto
                        
                        m.setVisible(true); //input
                        m1.setVisible(true); //texto
                        
                        sem2.setVisible(false);  //texto
                        semilla2.setVisible(false); //input
                        constante.setVisible(false); //texto
                        c.setVisible(false); //input
                        c1.setVisible(false); //texto
                    break;
                    case "5":
                        semilla1.setVisible(true); //input
                        sem1.setVisible(true); //texto
                        a.setVisible(true); //input
                        a1.setVisible(true);  //texto
                        
                        sem2.setVisible(false);  //texto
                        semilla2.setVisible(false); //input
                        constante.setVisible(false); //texto
                        m.setVisible(true); //input
                        m1.setVisible(true); //texto
                        
                        c.setVisible(true); //input
                        c1.setVisible(true); //texto
                    break;
                    default:
                        semilla1.setVisible(false); //input
                        sem1.setVisible(false); //texto
                        
                        semilla2.setVisible(false); //input
                        sem2.setVisible(false);  //texto
                        constante.setVisible(false); //texto
                        
                        a.setVisible(false); //input
                        a1.setVisible(false);  //texto
                        
                        m.setVisible(false); //input
                        m1.setVisible(false); //texto
                        
                        c.setVisible(false); //input
                        c1.setVisible(false); //texto
                    break;
                }
            
        }
    }//GEN-LAST:event_PseudoRandomSelectorItemStateChanged
    public int contadorSeudoAleatorio = 0;
    public static int cantCargaA = 0;
    public static int cantCargaB = 0;
    public static int cantCargaC = 0;
    public static double[][] random;
    
    private void calcularMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularMActionPerformed
        Integer dias = Integer.parseInt(days.getText());
// TODO add your handling code here:
        switch(PseudoRandomSelector.getSelectedItem().toString().split(" - ")[0]){
                    case "1":
                        Integer semilla = Integer.parseInt(semilla1.getText()); //input
                        random = PseudoRandomNumbers.mediosCuadrados(semilla, dias);
                    break;
                    case "2":
                        Integer semillaOne = Integer.parseInt(semilla1.getText()); //input
                        Integer semillaTwo = Integer.parseInt(semilla2.getText()); //input
                        random = PseudoRandomNumbers.productoMedio(semillaOne, semillaTwo, dias);
                    break;
                    case "3":
                        Integer semillaOneTwo = Integer.parseInt(semilla1.getText()); //input
                        Integer constanteMultiplicativa = Integer.parseInt(semilla2.getText()); //input
                        random = PseudoRandomNumbers.productoMedioVariado(semillaOneTwo, constanteMultiplicativa, dias);
                    break;
                    case "4":
                        Integer semillaOneThree = Integer.parseInt(semilla1.getText()); //input
                        Integer aConstant = Integer.parseInt(a.getText()); //input
                        Integer mConstant = Integer.parseInt(m.getText()); //input
                        random = PseudoRandomNumbers.congruencialMultiplicativo(semillaOneThree, aConstant, mConstant, dias);
                    break;
                    case "5":
                        Integer semillaOneFour = Integer.parseInt(semilla1.getText()); //input
                        Integer aConstantTwo = Integer.parseInt(a.getText()); //input
                        Integer mConstantTwo = Integer.parseInt(m.getText()); //input
                        Integer cConstantTwo = Integer.parseInt(c.getText()); //input
                        random = PseudoRandomNumbers.congruencialMixto(semillaOneFour, aConstantTwo, cConstantTwo, mConstantTwo, dias);
                    default:
                        System.out.println("Debe seleccionar una opción");
                    break;
                        
        }
        /*
        * Calculo de la primera tabla de solucion
        * [ Dia | Rn | Camion ]
        */
        double[][] tablaSolucion1 = new double[dias][3];
        while(contadorSeudoAleatorio < dias){
            tablaSolucion1[contadorSeudoAleatorio][0] = contadorSeudoAleatorio;
            tablaSolucion1[contadorSeudoAleatorio][1] = random[contadorSeudoAleatorio][random[contadorSeudoAleatorio].length-1];
            int seudoRandomNumber = (int) (tablaSolucion1[contadorSeudoAleatorio][1]*1000);
            if (isBetween(seudoRandomNumber,0,49)){
                tablaSolucion1[contadorSeudoAleatorio][2] = 0; //Camiones en el dia
            }else if(isBetween(seudoRandomNumber,50,199)){
                tablaSolucion1[contadorSeudoAleatorio][2] = 1; //Camiones en el dia
            }else if(isBetween(seudoRandomNumber,200,419)){
                tablaSolucion1[contadorSeudoAleatorio][2] = 2; //Camiones en el dia
            }else if(isBetween(seudoRandomNumber,420,639)){
                tablaSolucion1[contadorSeudoAleatorio][2] = 3; //Camiones en el dia
            }else if(isBetween(seudoRandomNumber,640,809)){
                tablaSolucion1[contadorSeudoAleatorio][2] = 4; //Camiones en el dia
            }else if(isBetween(seudoRandomNumber,810,919)){
                tablaSolucion1[contadorSeudoAleatorio][2] = 5; //Camiones en el dia
            }else if(isBetween(seudoRandomNumber,920,969)){
                tablaSolucion1[contadorSeudoAleatorio][2] = 6; //Camiones en el dia
            }else if(isBetween(seudoRandomNumber,970,999)){
                tablaSolucion1[contadorSeudoAleatorio][2] = 7; //Camiones en el dia
            }
            contadorSeudoAleatorio++;
        }
        System.out.println("Tabla de Solucion 1:");
        System.out.println(Arrays.deepToString(tablaSolucion1));
        // Tabla de solucion 1 lista
        
        /*
        * Suma de la cantidad total de camiones
        */
        int cantidadDeCamiones = 0;
        for (int i = 0; i < dias; i++) {
            cantidadDeCamiones += tablaSolucion1[i][2]; // Se suma la ultima columna pues es la que tiene el numero de camiones cada dia
        }
        
        /*
        * Calculo de la segunda tabla de solucion (Primer recorrido)
        * [ Dia | Camion | Rn | Kilogramos | Rn | TipoCarga | DuracionDescarga | CostoDescarga ]
        * ( En este recorrido se realiza el primer despliegue de Rn para la cantidad de kilogramos de carga )
        */
        double[][] tablaSolucion2 = new double[cantidadDeCamiones][8];
        int k = 0;
        for (int i = 0; i < dias; i++) {
            //Para cada uno de los dias, reviso cuantos camiones llegan
            int cantCamionesDia = (int) tablaSolucion1[i][tablaSolucion1[i].length-1];
                for (int j = 0; j < cantCamionesDia; j++) {
                    // Y por cada camion que llega, se guarda un registro en la tabla.
                    tablaSolucion2[k][0] = i; //Dia
                    tablaSolucion2[k][1] = j; //Camion del dia
                    tablaSolucion2[k][2] = random[contadorSeudoAleatorio][random[contadorSeudoAleatorio].length-1]; //Rn para kilogramos de carga
                    int seudoRandomNumber = (int) (tablaSolucion2[k][2]*1000);
                    if (isBetween(seudoRandomNumber,0,79)){ //Calculo de la cantidad de carga
                        tablaSolucion2[k][3] = 5000; //Kilogramos de carga
                    }else if(isBetween(seudoRandomNumber,80,189)){
                        tablaSolucion2[k][3] = 10000; //Kilogramos de carga
                    }else if(isBetween(seudoRandomNumber,190,339)){
                        tablaSolucion2[k][3] = 15000; //Kilogramos de carga
                    }else if(isBetween(seudoRandomNumber,340,569)){
                        tablaSolucion2[k][3] = 20000; //Kilogramos de carga
                    }else if(isBetween(seudoRandomNumber,570,769)){
                        tablaSolucion2[k][3] = 25000; //Kilogramos de carga
                    }else if(isBetween(seudoRandomNumber,770,889)){
                        tablaSolucion2[k][3] = 30000; //Kilogramos de carga
                    }else if(isBetween(seudoRandomNumber,900,999)){
                        tablaSolucion2[k][3] = 35000; //Kilogramos de carga
                    }
                    contadorSeudoAleatorio++;
                    k++;
                }
        }
        /*
        * Calculo de la segunda tabla de solucion (Segundo recorrido)
        * [ Dia | Camion | Rn | Kilogramos | Rn | TipoCarga | DuracionDescarga ]
        * ( En este recorrido se realiza el segundo despliegue de Rn para el tipo carga )
        */
        for (int i = 0; i < cantidadDeCamiones; i++) {
            tablaSolucion2[i][4] = random[contadorSeudoAleatorio][random[contadorSeudoAleatorio].length-1]; //Rn para Tipo de carga
            int seudoRandomNumber = (int) (tablaSolucion2[i][4]*1000);
            if (isBetween(seudoRandomNumber,0,399)){ //Calculo de la cantidad de carga
                tablaSolucion2[i][5] = 1; //Tipo de carga A
                cantCargaA++; //Se incrementa el contador de camiones con tipo de carga A
            }else if(isBetween(seudoRandomNumber,400,749)){
                tablaSolucion2[i][5] = 2; //Tipo de carga B
                cantCargaB++; //Se incrementa el contador de camiones con tipo de carga B
            }else if(isBetween(seudoRandomNumber,750,999)){
                tablaSolucion2[i][5] = 3; //Tipo de carga C
                cantCargaC++; //Se incrementa el contador de camiones con tipo de carga C
            }
            contadorSeudoAleatorio++;
            /*
            * Ahora se procede a calcular la ultima columna, la cual nos ayuda a saber la duracion
            * de descarga de cada camion en funcion del tipo de carga (A=1, B=2, C=3).
            */
            switch((int) tablaSolucion2[i][5]){
                case 1:
                    //Tipo de carga A
                    tablaSolucion2[i][6] = Math.round((tablaSolucion2[i][3] / 4000)*1000d)/1000d; //Duracion de la descarga
                    break;
                case 2:
                    //Tipo de carga B
                    tablaSolucion2[i][6] = Math.round((tablaSolucion2[i][3] / 3500)*1000d)/1000d; //Duracion de la descarga
                    break;
                case 3:
                    //Tipo de carga C
                    tablaSolucion2[i][6] = Math.round((tablaSolucion2[i][3] / 2500)*1000d)/1000d; //Duracion de la descarga
                    break;
            }
        }
        System.out.println("Tabla de Solucion 2:");
        System.out.println(Arrays.deepToString(tablaSolucion2));
        // Tabla de solucion 2 lista
        
        /*
        * (Listo) Requerimiento 1: Cantidad de camiones por tipo de carga (Almacenado en las variables cantCargaA, cantCargaB, cantCargaC)
        * (Pendiente) Requerimiento 2: Horas extras totales trabajadas por las cuadrillas (Especificar por cuadrilla y luego totalizar)
        * (Pendiente) Requerimiento 3: Costo generado por pago a cuadrillas (Especificar Horas normales y horas extras)
        */
        
        int diaActual = (int) tablaSolucion2[0][0];
        int i = 0;
        Cuadrilla cuadrillaA = new Cuadrilla();
        Cuadrilla cuadrillaB = new Cuadrilla();
        Cuadrilla cuadrillaC = new Cuadrilla();
        while((i<cantidadDeCamiones) && (diaActual != dias-1)){ //Todos los dias se procesan, excepto el ultimo, pues los camiones de ese dia no entraran en la simulacion
            Cuadrilla cuadrillaActual = menosTiempo(cuadrillaA,cuadrillaB,cuadrillaC); //Se selecciona qué cuadrilla ocupará éste camion, analizando quién tiene menos tiempo
            if((int)(tablaSolucion2[i][0]) == diaActual){
              //Asignar cudrillas
              cuadrillaActual.horasTrabajadasDia += tablaSolucion2[i][6];
              boolean hayExtras = cuadrillaActual.horasTrabajadasDia > 8;
              if(!hayExtras){
                  //La cuadrilla no ha trabajado ninguna hora extra con ése camión.
                  tablaSolucion2[i][7] = Math.round((tablaSolucion2[i][6] * precioHoraNormalCuadrilla)*1000d)/1000d;;
              }else{
                  double horasAnteriores = cuadrillaActual.horasTrabajadasDia - tablaSolucion2[i][6];
                  boolean parteNormal = horasAnteriores < 8;
                  if(parteNormal){
                      //La cuadrilla trabajó el resto de 8 horas más unas extras con éste camión.
                      double horasNormales = 8 - horasAnteriores;
                      double horasExtras = tablaSolucion2[i][6] - horasNormales;
                      tablaSolucion2[i][7] = Math.round((horasNormales * precioHoraNormalCuadrilla + horasExtras * precioHoraExtraCuadrilla)*1000d)/1000d;
                      cuadrillaActual.horasExtraDia += horasExtras;
                  }else{
                      //La cuadrilla trabajó solamente horas extras con éste camión.
                      tablaSolucion2[i][7] = Math.round((tablaSolucion2[i][6] * precioHoraExtraCuadrilla)*1000d)/1000d;
                      cuadrillaActual.horasExtraDia += tablaSolucion2[i][6];
                  }
              }
              i++;
            }else{
                diaActual = (int)(tablaSolucion2[i][0]);
                //Sacar cuentas del dia
                cuadrillaActual.horasTrabajadasTotales += cuadrillaActual.horasTrabajadasDia;
                cuadrillaActual.horasExtraTotales += cuadrillaActual.horasExtraDia;
            }
        }
        System.out.println("Tabla de Solucion 2:");
        System.out.println(Arrays.deepToString(tablaSolucion2));
    }//GEN-LAST:event_calcularMActionPerformed
    
    public Cuadrilla menosTiempo(Cuadrilla a, Cuadrilla b, Cuadrilla c){
        if((a.horasTrabajadasDia <= b.horasTrabajadasDia) && (a.horasTrabajadasDia <= c.horasTrabajadasDia)){
           return a;
        } else if((b.horasTrabajadasDia <= a.horasTrabajadasDia) && (b.horasTrabajadasDia <= c.horasTrabajadasDia)){
           return b;
        }
        return c;
    }
    
    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    } 
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
            java.util.logging.Logger.getLogger(SeudoRandomMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeudoRandomMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeudoRandomMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeudoRandomMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeudoRandomMethod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> PseudoRandomSelector;
    private static javax.swing.JTextField a;
    private javax.swing.JLabel a1;
    private static javax.swing.JTextField c;
    private javax.swing.JLabel c1;
    private javax.swing.JButton calcularM;
    private javax.swing.JLabel constante;
    private static javax.swing.JTextField days;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JTextField m;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel sem1;
    private javax.swing.JLabel sem2;
    private javax.swing.JTextField semilla1;
    private static javax.swing.JTextField semilla2;
    // End of variables declaration//GEN-END:variables
}
