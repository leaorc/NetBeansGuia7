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
public class Ej13CuadradoDeAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
         */
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la dimension del cuadrado");
        int dim = leer.nextInt();

        for (int i = 1; i <= dim; i++) {
            for (int j = 1; j <= dim; j++) {
                if ((i == 1) || (i == dim) || (j == 1) || (j == dim)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

    }
}
