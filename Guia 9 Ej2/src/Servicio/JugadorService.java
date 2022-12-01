/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:


 */
package Servicio;

import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class JugadorService {
    
    Scanner leer = new Scanner (System.in);
    RevolverService RS = new RevolverService();
    
    public ArrayList<Jugador> crearJugador(){
        ArrayList<Jugador>ListaJugadores = new ArrayList();
        
        int cantidad = 0;
        
        
            System.out.println("Ingrese la cantidad de jugadores (máximo 6)");
            cantidad = leer.nextInt();
            
        if (cantidad<1 || cantidad>6) {
            cantidad=6;
            
        }
        
        for (int i = 0; i < cantidad; i++) {
            Jugador J = new Jugador();
            J.setId(i+1);
            J.setNombre("Jugador "+(i+1));
            ListaJugadores.add(J);
            
        }
        
        return ListaJugadores;
    }
    /*
    • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
    */
    public boolean disparo(Revolver r){
        boolean aux = false;
        
        if (RS.mojar(r)) {
            aux = true;
            
        }else{
            RS.siguienteChorro(r);
            aux = false;
            
        }
        return aux;
    }
}

