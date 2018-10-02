/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlomethod;

import static java.lang.Math.round;

/**
 *
 * @author aels21
 */
public class PseudoRandomNumbers {
    public static double[][] mediosCuadrados(double seed, int n){
        int row = n+(2*(7*n)); //(7*n) Para cubrir el caso de mayor cantidad de camiones posible (n veces 7 camiones). (*2) porque por cada camion se necesitan 2 numeros seudo aleatorios. (+n) porque cada dia de la simulacion necesita un numero seudo aleatorio.
        int col = 5;
        double [][] matriz = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                switch(j){
                    case 0:
                        matriz[i][j] = i;
                    break;
                    case 1:
                        matriz[i][j] = seed;
                    break;
                    case 2:
                        matriz[i][j] = Math.pow(seed,2);
                    break;
                    case 3:
                        logicaMediosCuadrados(matriz,i,j);
                    break;
                    case 4:
                        matriz[i][j] = matriz[i][j-1]/1000;
                    break;
                }
                
            }
            seed = matriz[i][3];
        }
        return matriz;
    }
    public static double[][] logicaMediosCuadrados(double[][] matriz,int i, int j){
        if(matriz[i][j-1]> 99){
         if (Double.toString(matriz[i][j-1]).length() % 2 != 0){
            Double x = matriz[i][j-1];
            int y = Integer.toString(x.intValue()).length()/2;
            matriz[i][j] = Double.parseDouble((Double.toString(matriz[i][j-1])).substring(y-1, y+2));
        }else{
            Double x = matriz[i][j-1];
            int y = Integer.toString(x.intValue()).length()/2;
            matriz[i][j] = Double.parseDouble((Double.toString(matriz[i][j-1])).substring(y-2, y+1));
        }   
        }else{
            matriz[i][j] = matriz[i][j-1];
        }
    return matriz;    
    }
    public static double[][] productoMedio(double seed, double seed2, int n){
        int row = n+(2*(7*n));
        int col = 6;
        double [][] matriz = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                switch(j){
                    case 0:
                        matriz[i][j] = i;
                    break;
                    case 1:
                        matriz[i][j] = seed;
                    break;
                    case 2:
                        matriz[i][j] = seed2;
                    break;
                    case 3:
                        matriz[i][j] = seed*seed2;
                    break;
                    case 4:
                        logicaMediosCuadrados(matriz,i,j);
                    break;
                    case 5:
                        matriz[i][j] = matriz[i][j-1]/1000;
                    break;
                }
                
            }
            seed = seed2;
            seed2 = matriz[i][4];
        }
        return matriz;
    }
    public static double[][] productoMedioVariado(double seed, double fact, int n){
        int row = n+(2*(7*n));
        int col = 5;
        double [][] matriz = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                switch(j){
                    case 0:
                        matriz[i][j] = i;
                    break;
                    case 1:
                        matriz[i][j] = seed;
                    break;
                    case 2:
                        matriz[i][j] = seed*fact;
                    break;
                    case 3:
                        logicaMediosCuadrados(matriz,i,j);
                    break;
                    case 4:
                        matriz[i][j] = matriz[i][j-1]/1000;
                    break;
                }
                
            }
            seed = matriz[i][3];
        }
        return matriz;
    }
    public static double[][] congruencialMixto(double seed, double a, double c, double m, int n){
        int row = n+(2*(7*n));
        int col = 5;
        double [][] matriz = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                switch(j){
                    case 0:
                        matriz[i][j] = i;
                    break;
                    case 1:
                        matriz[i][j] = seed;
                    break;
                    case 2:
                        matriz[i][j] = (a*seed)+c;
                    break;
                    case 3:
                        matriz[i][j] = matriz[i][j-1] % m;
                    break;
                    case 4:
                        matriz[i][j] = Math.round((seed/m)*1000d)/1000d;
                    break;
                }
                
            }
            seed = matriz[i][3];
        }
        return matriz;
    }
    public static double[][] congruencialMultiplicativo(double seed, double a, double m, int n){
        int row = n+(2*(7*n));
        int col = 5;
        double [][] matriz = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                switch(j){
                    case 0:
                        matriz[i][j] = i;
                    break;
                    case 1:
                        matriz[i][j] = seed;
                    break;
                    case 2:
                        matriz[i][j] = (a*seed);
                    break;
                    case 3:
                        matriz[i][j] = matriz[i][j-1] % m;
                    break;
                    case 4:
                        matriz[i][j] = Math.round((seed/m)*1000d)/1000d;
                    break;
                }
                
            }
            seed = matriz[i][3];
        }
        return matriz;
    }
}
