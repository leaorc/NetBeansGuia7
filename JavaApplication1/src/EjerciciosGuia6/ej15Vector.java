/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia6;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class ej15Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Funciones en Java

15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.*/
        
        Scanner leer = new Scanner (System.in);
        
        int vector []=new int [100];
        
        for (int i = 0; i < vector.length; i++) {
           vector[i]=i +1;
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        
    }
    
}
