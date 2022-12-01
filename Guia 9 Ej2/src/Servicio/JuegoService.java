/*

Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10

 */
package Servicio;

import Entidad.Juago;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;

public class JuegoService {
    
    RevolverService RS = new RevolverService();
    JugadorService JugS = new JugadorService();
    
    Juago J = new Juago();
    
 public Juago llenarJuego(ArrayList<Jugador>jugadores, Revolver r){
     
     J.setJugadores(jugadores);
     J.setRevolver(r);
     
     return J;

 }
 
 /*
 • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
 
  public void ronda (Juago j){
    
        boolean aux=false;
        
        do {
           for (Jugador j1 : j.getJugadores()) {
               
               System.out.println("Le toca al " + j1.getNombre() + " disparar");
           if(JugS.disparo(j.getRevolver())){
               
               j1.setMojado(true);
               System.out.println("el " + j1.getNombre() + " la quedo por que se pego el corchazo");
               aux=true;
               break;
             }else {
               System.out.println("El " + j1.getNombre() + " safo");
               System.out.println("El tambor gira a la posicion "+ j.getRevolver().getPosicionActual());
              
           }
}
           
        }while(aux = false);
        }
}
        
  
           
        
  
