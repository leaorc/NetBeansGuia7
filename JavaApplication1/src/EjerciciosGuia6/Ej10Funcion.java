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
public class Ej10Funcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un valor limite positivo");
        int num_limite = leer.nextInt();
        
        int suma = 0;
        
        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            suma+=num;
            
        } while (suma<num_limite);
        
        System.out.println("El numero limite es:"+num_limite);
        System.out.println("La suma de los numeros ingresados es: "+suma);
        
    }
    
}
