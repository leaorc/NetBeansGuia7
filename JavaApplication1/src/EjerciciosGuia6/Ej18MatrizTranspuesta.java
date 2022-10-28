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
public class Ej18MatrizTranspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
          int matriz[][] = new int[4][4];

        System.out.println("Ingrese los datos de la Matriz");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Matriz [" + i + "[" + "[" + j + "]: ");
                matriz[i][j] = leer.nextInt();
            }
        }

        System.out.println("Matriz Original: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }

        int aux;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {

                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;

            }
        }
            System.out.println("Matriz traspuesta");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("[" + matriz[i][j] + "]");

                }
                System.out.println("");
            }
            
        }
    }
