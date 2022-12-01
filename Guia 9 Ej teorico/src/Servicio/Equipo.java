/*
EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Servicio;

import Entidad.Jugador;
import java.util.ArrayList;

public class Equipo {
    
    private ArrayList<Jugador>Jugadores;

    public Equipo() {
    }

    public Equipo(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "Jugadores=" + Jugadores + '}';
    }
    
    
    
}
