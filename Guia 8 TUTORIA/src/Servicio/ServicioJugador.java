/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Jugador;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class ServicioJugador {
    Scanner leer = new Scanner (System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    
    
    public Jugador crearJugador(){
        
        Jugador Jug = new Jugador();
        
        System.out.println("Ingrese el nombre del jugador");
        Jug.setNombre(leer.next());
        System.out.println("Ingrese la nacionalidad");
        Jug.setNacionalidad(leer.next());
        System.out.println("Ingrese la edad");
        Jug.setEdad(leer.nextInt());
        System.out.println("Ingrese el peso");
        Jug.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura");
        Jug.setAltura(leer.nextDouble());
        
        return Jug;
    }
    
    public ArrayList <Jugador> crearListaJugadores(){
        ArrayList <Jugador> Jugadores = new ArrayList<>();
        
        String opcion;
        
        do {
            Jugador Jug = crearJugador();
            Jugadores.add(Jug);
            
            do {
                System.out.println("¿Desea agregar otro jugador? (s/n)");
                opcion = leer.next();
                System.out.println("");
            } while (!(opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n")));
    
        } while (opcion.equalsIgnoreCase("s"));
        
        return Jugadores; 
    }
    
    
    public void MostrarListaJugadores(ArrayList <Jugador> Jugadores){
        System.out.println("NOMBRE\tNACIONALIDAD\tEDAD\tPESO\tALTURA");
        for (Jugador aux : Jugadores) {
            System.out.println(aux.toString());            
        }
  
    }
     public void eliminarJugador (ArrayList <Jugador> jugadores){
            System.out.println("Ingrese el nombre del jugador que desea eliminar");
            String eliminar = leer.next();
            boolean encontro = false;
            Iterator <Jugador> itJugador = jugadores.iterator();
            while(itJugador.hasNext())
                if (itJugador.next().getNombre().equalsIgnoreCase(eliminar)) {
                    itJugador.remove();
                    encontro = true;
                }else{
                    System.out.println("El jugador no se encontro en la lista");
                    encontro = false;
                }
            
        }
    
    
}
