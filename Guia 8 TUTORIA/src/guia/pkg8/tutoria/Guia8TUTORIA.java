
package guia.pkg8.tutoria;

import Entidad.Jugador;
import Servicio.ServicioJugador;

import java.util.ArrayList;
//import java.util.Comparator;

public class Guia8TUTORIA {

    public static void main(String[] args) {
        
        ServicioJugador SJ = new ServicioJugador();
        ArrayList <Jugador> Jugadores = SJ.crearListaJugadores();
        //Comparator J = new Comparator();
        
//        SJ.crearJugador();
//        SJ.crearListaJugadores();
        SJ.MostrarListaJugadores(Jugadores);
        SJ.eliminarJugador(Jugadores);
        
        System.out.println("Ordenamos por nacionalidad");
        
        
        
 
    }
    
    
}
