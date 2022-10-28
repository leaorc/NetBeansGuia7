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
public class Ej13Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.*/
        
        String [] equipo = new String [5];
        Scanner leer = new Scanner (System.in);
        for (int i=0; i<equipo.length; i++){
            System.out.println("Ingrese el " +i+ " nombre");
            
            equipo [i]= leer.nextLine();
        }
        for (int i=0; i<equipo.length; i++){
            System.out.println("Los nombres ingresados son: " + equipo[i]);
        }
    }
    
}
