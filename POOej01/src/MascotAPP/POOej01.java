/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MascotAPP;

import pooej01.entidades.Persona;

/**
 *
 * @author Romina
 */
public class POOej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona P1= new Persona();
        P1.nombre="Leandro";
        P1.apellido="Moriondo";
        P1.domicilio="Calle";
       
        System.out.println("Los datos de la primer persona son: "+ P1.nombre + " "+P1.apellido + " "+P1.domicilio);
    }
     
}
