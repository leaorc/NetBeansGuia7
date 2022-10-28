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
public class Ej12FuncionMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num = leer.nextInt();
        int num2 = leer.nextInt();

    validar( num, num2);
    }
    //public static multiplo(int num, int num2);
    
    public static void validar (int num, int num2){

    if(num2 % num == 0) {
   
            System.out.println("Los numeros "+num +" y "+ num2+ ": son multiplos");
    }

    
        else {
                    System.out.println("Los numeros no son multiplos");

                    
    }
    

    }


}