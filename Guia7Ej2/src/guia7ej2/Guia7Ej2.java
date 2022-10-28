/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej2;

import Entidades.Circunferencia;
import Servicios.CircunferenciaServicios;

/**
 *
 * @author Romina
 */
public class Guia7Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (área = pi * radio2).
e) Método perimetro(): para calcular el perímetro (perímetro = 2 * pi * radio).*/
        
        CircunferenciaServicios CS = new CircunferenciaServicios();
        
        Circunferencia C1 = CS.NuevaCircunferencia();
    }
    
}
