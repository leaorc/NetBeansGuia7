/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Ej11Switch {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/
        boolean s = false;

        
        try {
            do {
                
                System.out.println("MENU\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir\n"
                + "Elija opción:");

                
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    s=salir();
                    break;
                default:
                    System.out.println("El numero ingresado no es una opcion correcta");

            }
            } while(!s);

        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un numero");
            leer.next();
        }

    }

    static void suma() {
        System.out.println("Ingrese el primer numero");
        int num = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        int resultado = num + num2;
        System.out.println("La suma de los numeros ingresados es: " + resultado);
    }

    static void resta() {
        System.out.println("Ingrese el primer numero");
        int num = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        int resultado = num - num2;
        System.out.println("La resta de los numeros ingresados es: " + resultado);

    }

    static void multiplicar() {
        System.out.println("Ingrese el primer numero");
        int num = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        int resultado = num * num2;
        System.out.println("La multiplicacion de los numeros ingresados es: " + resultado);
    }

    static void dividir() {
        System.out.println("Ingrese el primer numero");
        int num = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        int resultado = num / num2;
        System.out.println("La división de los numeros ingresados es: " + resultado);
    }

    static boolean salir() {
        leer.nextLine();//esta linea va para resetear el boolean y me lo tome como String.
        System.out.println(" ¿Está seguro de que desea salir del programa (S/N)?");
        String s_n = leer.nextLine();
        
        if (s_n.equalsIgnoreCase("s")) {
            System.out.println("El programa ha finalizado");
            return true;
    
        } else {
            System.out.println("volvemos al menu");
            return false;
        }

    }

}
