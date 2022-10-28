/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia6;

import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej9Substring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.*/
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un frase");
        String frase = leer.next();
        
        String frase2 = frase.substring(0,1);
        System.out.println(frase2);
      
        if (frase2.equalsIgnoreCase("a")) {
        
        System.out.println("Correcto");
            
       }else{
            System.out.println("Incorrecto");
        }
    }

}
