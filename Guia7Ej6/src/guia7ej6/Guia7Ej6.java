/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej6;

import Entidades.Cafetera;
import Servicio.CafeteraServicio;


/**
 *
 * @author Romina
 */
public class Guia7Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CafeteraServicio CS = new CafeteraServicio();

        Cafetera cafe = CS.crearCafetera();
       
        CS.menu(cafe);
    }

    }


