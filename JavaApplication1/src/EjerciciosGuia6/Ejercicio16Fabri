/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.java;

import java.util.Scanner;

/**
 *
 * @author A134192
 */
public class Ejercicio16Guia6 {

    /**
     * @param args the command line arguments
     */
//    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//    usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//    numero y si se encuentra repetido
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int contador;
        contador=0;
        System.out.println("Ingrese tamaño del vector");
        int n= leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i]= (int) (Math.random()*100)+1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i]+",");
        }
        System.out.println();
        System.out.println("Que numero desea buscar entre 0 y 100");
        int num=leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            if(vector[i]== num){
                contador=contador+1;
                System.out.println("La posicion del numero buscado es " + i );
            }
            
        }
        if(contador==0){
            System.out.println("El numero no esta en el vector");
        }else {
        System.out.println("Esta repetido " + contador + " veces");
        }
    }
    
}
