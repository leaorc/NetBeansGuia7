/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hecto
 */
public class EGG_Ej20_practica {

    /**
     * @param args the command line arguments
     */
    /*20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/
    
    static Scanner leer = new Scanner(System.in);
            
    public static void main(String[] args) {
        // TODO code application logic here
              
        System.out.println("De qué dimension quieres tu matriz cuadrada");
        int dimension = leer.nextInt();
        
        int[][] matrizMagica = new int[dimension][dimension];
     
        llenarMatriz(matrizMagica, dimension);
        validarSiEsMagica(matrizMagica, dimension);
        
        
    }
    
    public static void llenarMatriz(int[][] matriz, int dim){
        
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                do {
                    System.out.println("ingrese el valor de Matriz ["+i+"]"+"["+j+"] entre 1 y 9");
                    matriz[i][j] = leer.nextInt();
                    if (matriz[i][j]<1 || matriz[i][j]>10) {
                        System.out.println("Probá de nuevo. Debe ser entre 1 y 9, gil!"); 
                    } 
                } while (matriz[i][j]<1 || matriz[i][j]>10);
                System.out.println("Dato guardado");
            }
        }
        System.out.println("Matriz cargada por completo");
        System.out.println("");
    }
    
    public static void validarSiEsMagica(int[][] matriz, int dim){
        
        int valorInicial = 0;
        int valorAComparar;
        boolean esMagica = true;
        
        for (int i = 0; i < dim; i++) {
            valorInicial += matriz[i][0];
        }
        
       
        for (int i = 0; i < dim; i++) {
            valorAComparar=0;
            for (int j = 0; j < dim; j++) {
                valorAComparar+=matriz[i][j];                
            }
            if (valorInicial != valorAComparar) {
                esMagica=false;                
            }
        }
        
        for (int j = 0; j < dim; j++) {
            valorAComparar=0;
            for (int i = 0; i < dim; i++) {
                valorAComparar+=matriz[i][j];                
            }
            if (valorInicial != valorAComparar) {
                esMagica=false;                
            }
        }
        
        //chequeo diagonal principal
        valorAComparar=0; 
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (i==j) {
                    valorAComparar+=matriz[i][j];   
                }
            }
        }
        if (valorInicial != valorAComparar) {
                esMagica=false;                
        }
        
        //chequeo diagonal segundaria
        valorAComparar=0;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (i+j==dim-1) {
                    valorAComparar+=matriz[i][j];   
                }
            }
        }
        if (valorInicial != valorAComparar) {
                esMagica=false;                
        }

 // terminamos las comparaciones. Muestro resultado
 
 
        System.out.println(Arrays.deepToString(matriz));
        
        System.out.println("");
 
        if (esMagica) {
            System.out.println("Felicitaciones. Su matriz es mágica");
        } else {
            System.out.println("Lo siento. Tiene una matriz común (no mágica)");
        }
        System.out.println("");
        
    }
    
}
