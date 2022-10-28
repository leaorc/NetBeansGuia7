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
public class Ej6FuncionEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.*/
        
        Scanner leer = new Scanner (System.in);
        
        String letra, frase;
        do {
            System.out.println("Ingrese un frase");
        frase = leer.nextLine();
        
        //letra=frase.substring(frase.length());
        
        } while (!frase.equalsIgnoreCase("eureka"));
        
        System.out.println("Ingreso la palabra correcta: Eureka");
        
        
        
    }
    
}
