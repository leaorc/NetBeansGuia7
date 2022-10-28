/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class OperacionServicio {
    
   public Operacion NuevaOperacion(){
       Scanner leer = new Scanner (System.in);
       
       Operacion C1 = new Operacion();
       
       System.out.println("Ingrese el primer numero");
       int numero1= leer.nextInt();
       
       System.out.println("Ingrese el segundo numero");
       int numero2=leer.nextInt();
       
       C1.crearOperacion(numero1, numero2);
       
       System.out.println("La suma de "+numero1+"+"+numero2+" es:" +C1.sumar());
       
       System.out.println("La resta de "+numero1+"-"+numero2+" es:" +C1.restar());
       
       System.out.println("La multiplicacion de "+numero1+"*"+numero2+" es:" +C1.multiplicar());
       
       System.out.println("La division de "+numero1+"/"+numero2+" es:" +C1.dividir());
       
       return C1;
       
       }
            
   }
  
