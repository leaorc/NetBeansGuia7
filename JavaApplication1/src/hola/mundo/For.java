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
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
        */
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese 4 numeros entre 1 y 20");
        int numero = leer.nextInt();
        int numero2 = leer.nextInt();
        int numero3 = leer.nextInt();
        int numero4 = leer.nextInt();

        if (numero < 0 && numero > 21) {
            System.out.println("El numero ingresado esta fuera de los parametros, "
                    + "ingrese un nuevo numero");
       

                    }

                    System.out.print(numero);
                    for (int i = 1; i <= numero; i++) {
                        System.out.print(" * ");

                    }
                    System.out.println(" ");

                    System.out.print(numero2);
                    for (int i = 1; i <= numero2; i++) {
                        System.out.print(" * ");

                    }
                    System.out.println(" ");

                    System.out.print(numero3);
                    for (int i = 1; i <= numero3; i++) {
                        System.out.print(" * ");
                    }
                    System.out.println(" ");

                    System.out.print(numero4);
                    for (int i = 1; i <= numero4; i++) {
                        System.out.print(" * ");

                    }
                }
            }
            
   
