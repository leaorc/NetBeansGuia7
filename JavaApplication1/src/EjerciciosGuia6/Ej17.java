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
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/
        Scanner leer = new Scanner(System.in);

        int div = 10;
        int con = 0;
        int res = 0;

        System.out.println("Ingrese el numero de vector");
        int num = leer.nextInt();
        int vector[] = new int[num];

        //int contador[]= new int [5];
        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 20000);
        }
        for (int i = 0; i < num; i++) {
            System.out.println(vector[i]);
        }
        for (int i = 0; i < num; i++) {

            do {
                vector[i] = num / div;
                con++;
                div = div * 10;

            } while (res >= 1);

            if (con == 1) {
                System.out.println("Los numeros de 1 digito son: " + con);
            }
            if (con == 2) {
                System.out.println("los numeros de 2 digitos son: " + con);
            }
            if (con == 3) {
                System.out.println("Los numeros de 3 digitos son: " + con);
            }
            if (con == 4) {
                System.out.println("Los numeros de 4 digitos son: " + con);
            } else {
                System.out.println("Los numeros de 5 digitos son. " + con);
            }
        }
        //contador[vector[i]]+=1;

        /* }
        for (int j = 0; j < contador.length; j++) {
            System.out.println("Los numeros que tienen " +con);
            
            //System.out.println("Los numeros" + j + "se repiten" + contador[j]);
        }*/
    }
}
