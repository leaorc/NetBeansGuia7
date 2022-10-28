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
public class Ej2Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("El nombre ingresado es: "+nombre);
    }
    
}
