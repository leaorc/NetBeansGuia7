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
public class Ej4Farenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese los grados centigrados");
        int c = leer.nextInt();
        int f = 32 + (9 * c / 5);
        System.out.println("Los grados en Farenheit son: "+f);
        
                
    }
    
}
