/*
EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package guia.pkg9.ej.teorico;

import Entidad.Jugador;
import Servicio.Equipo;
import java.util.ArrayList;

public class Guia9EjTeorico {

    public static void main(String[] args) {
       
        Jugador J1 = new Jugador();
        Jugador J2 = new Jugador();
        Jugador J3 = new Jugador();
        
        J1.setNombre("Pepe");
        J1.setApellido("Garcia");
        J1.setNumero(24);
        J1.setPosicion("defensor");
        
        J2.setNombre("Carla");
        J2.setApellido("Gomes");
        J2.setNumero(32);
        J2.setPosicion("Delantera");
        
        J3.setNombre("Laura");
        J3.setApellido("Carrizo");
        J3.setNumero(10);
        J3.setPosicion("Mediocampista");
        
        ArrayList<Jugador> jugadores = new ArrayList();
        jugadores.add(J1);
        jugadores.add(J2);
        jugadores.add(J3);
        
        
        Equipo Olivos = new Equipo();
        
       Olivos.setJugadores(jugadores);
       
        System.out.println("En el equipo estan los jugadores " + Olivos.toString());
        
    }
    
}
