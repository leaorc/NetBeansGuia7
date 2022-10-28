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
public class numeroHhastaCero {
    public static void main(String[] args){
    
   /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.*/
        
Scanner leer = new Scanner(System.in);
        
   int num,i = 1, suma=0;
   
   do {
       
        System.out.println ( "Ingrese un numero" ) ;
        num = leer.nextInt();
        i++;
        suma = suma+num;
        if (num==0){
        
   System.out.println("Se ingreso el numero 0");
   break; 

   }
    } while (i<5);
        System.out.println("La suma total es igual a " + suma);
        
}

}