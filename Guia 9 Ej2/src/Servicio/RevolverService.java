/*
2. Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Servicio;

import Entidad.Revolver;

public class RevolverService {
    
    public Revolver llenarRevolver(){
        
        Revolver r1 = new Revolver();
        
        System.out.println("Vamos a inicializar la posicion del agua");
        r1.setPosicionAgua((int)(Math.random()*5+1));
        System.out.println("La posicion del agua ahora está en la posición: "+r1.getPosicionAgua());
        System.out.println("Vamos a inicializar la posición del tambor");
        r1.setPosicionActual((int)(Math.random()*5+1));
        System.out.println("La posición del tambor ahora es: "+r1.getPosicionActual());
        return r1;
        
    }
    public boolean mojar(Revolver r1){
        
        boolean disparo = false;
        
        if (r1.getPosicionActual()==r1.getPosicionAgua()) {
            System.out.println("Se disparó el agua, se terminó el juego");
            disparo=true;
            
            
        }else{
            System.out.println("El disparo no salió, se sigue el juego");
        }
        return disparo;
    }
    
    public void siguienteChorro(Revolver r1){
        
        if (r1.getPosicionActual()<5) {
            r1.setPosicionActual(r1.getPosicionActual()+1);
            
        }else{
            r1.setPosicionActual(0);
        }
    }
}
