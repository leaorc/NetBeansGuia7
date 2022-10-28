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
public class Ej8Longitud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*8. Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.*/
        
        Scanner leer = new Scanner (System.in);
        
        int num=8;
        System.out.println("Ingrese una frase o palabra");
        String frase = leer.nextLine();
                
         if (frase.length()== num){
             System.out.println("CORRECTO");
             
         }else{
             System.out.println("INCORRECTO");
             
            
        }
    }
    
}
