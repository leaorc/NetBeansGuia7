/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejextra04;

import Entidad.Raices;
import ServicioRaices.ServicioRaices;

/**
 *
 * @author A134192
 */
public class POOEJExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioRaices sr = new ServicioRaices();
        Raices ra = sr.CrearRaices();
        //sr.getDiscriminante(ra);
        //sr.obtenerRaices(ra);
        //sr.obtenerRaiz(ra);
        double discriminante = sr.getDiscriminante(ra);
        System.out.println("El valor del discrimintante es " + discriminante);
        sr.calcular(ra);
        
    }
    
}
