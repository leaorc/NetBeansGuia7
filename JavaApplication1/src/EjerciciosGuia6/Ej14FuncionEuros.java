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
public class Ej14FuncionEuros {
    
    static Scanner leer = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Vectores y Matrices en Java

14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/
        
        
        
        double libra=0.86;
        double dolar=1.28611;
        double yen = 129.852;
        
        System.out.println("Ingrese la cantidad de Euros que desea cambiar");
        double euros = leer.nextInt();
        
        System.out.println("Elija la opcion deseada"+
                "menu: "
                + "1 = Libras"
                + "2 = Dólares"
                + "3 = Yenes");
        int opcion = leer.nextInt();
       
        switch (opcion){
            case 1:
                libras(euros, libra);
                break;
            case 2:
                dolares(euros,dolar);
                break;
            case 3:
                yenes(euros, yen);
                break;
            default:
                System.out.println("El numero ingresado no es una opcion valida");
        
        }

    }
    
    static void libras(double euros, double libra){
        
        double resultado = euros * libra;
        System.out.println("La conversion de los euros a Libras son :"+ resultado);
        
        //* 0.86 libras es un 1 €
    }
    static void dolares(double euros, double dolar){
        //* 1.28611 $ es un 1 €
        double resultado = euros * dolar;
        System.out.println("La conversion de los euros a Libras son :"+ resultado);
    
}
    static void yenes(double euros, double yen){
        //* 129.852 yenes es un 1 €*/
        double resultado = euros * yen;
        System.out.println("La conversion de los euros a Libras son :"+ resultado);
        
    }
}

