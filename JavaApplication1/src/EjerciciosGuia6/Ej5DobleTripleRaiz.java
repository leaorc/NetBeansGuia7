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
public class Ej5DobleTripleRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        double raiz = Math.sqrt(num);
        
        System.out.println("El doble del numero ingresado es: "+num*2);
        System.out.println("El triple del numero ingresado es: "+num*3);
        System.out.println("La reiz cuadrada del numero ingresado es: "+raiz);
        
    }
    
}
