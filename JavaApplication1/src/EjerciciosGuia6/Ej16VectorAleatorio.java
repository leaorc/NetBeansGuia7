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
public class Ej16VectorAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
        Scanner leer = new Scanner(System.in);
        int aux = 0;

        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();

        int vector[] = new int[tam];
        
        for (int i = 0; i < tam; i++) {
             vector[i] = (int) (Math.random() * 10 + 1);
            
        }
        //int pos[]= new int [tam];
        
        //int coincidencia[] = new int [tam];

        System.out.println("Ingrese un numero del 1 al 10 que quiera buscar");

        int num = leer.nextInt();

           //el numero 2 indica desde donde y la suma de ambos hasta donde.
        
        
        for (int i = 0; i < tam; i++) {
            System.out.print(vector[i] + ", ");
            
        }
            
        System.out.println();
        for (int i = 0; i < tam; i++) {
            if (vector[i] == num) {
                aux++;
                System.out.println("El numero " + num + " se encuentra en la posicion " + i);
            }
        }
        if (aux==0) {
            System.out.println("El numero buscado no está en la lista");
            
        }else{
            System.out.println("El numero " + num + " se encuentra "+ aux + " veces");
        }

    }
}

