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
public class Par {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un numero positivo");
        int numero=leer.nextInt();
        
        if (numero%2==0) {
            System.out.println("Numero Par");
            
        }
        else { 
            System.out.println("Numero Impar");
        }
    }
    
}
