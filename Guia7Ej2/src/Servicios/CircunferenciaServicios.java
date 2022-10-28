/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class CircunferenciaServicios {
    
    public Circunferencia NuevaCircunferencia(){
        
        Circunferencia C1 = new Circunferencia();
        
        Scanner leer = new Scanner (System.in);
       
        System.out.println("Ingrese el radio de la circunferencia");
        double radio = leer.nextDouble();
        
        C1.crearCircunferencia(radio);
        
        System.out.println("El área de la circunferencia es: "+C1.areaCalculo()+"\n");
        
        
        System.out.println("El perímetro de la circunferencia es: "+C1.perimetroCalculo());
        
        
        return C1;
    
    }
    
}

