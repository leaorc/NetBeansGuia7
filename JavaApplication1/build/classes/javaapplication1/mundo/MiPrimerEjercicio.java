/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class MiPrimerEjercicio {
    public static void main(String[] args){
    
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String nombre=leer.next();
        System.out.println("Hola Mundo! Soy " +nombre+ " este es mi primer programa");
}
}