
package utilidades;

import Entidad.Jugador;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator <Jugador> comprarEdad = new Comparator <Jugador>() {
        @Override
        public int compare(Jugador t, Jugador t1) {
            return t.getEdad().compareTo(t1.getEdad());
            
        }
    };
      public static Comparator <Jugador> compararAltura = new Comparator <Jugador>() {
        @Override
        public int compare(Jugador t, Jugador t1) {
            return Double.compare(t.getAltura(), t1.getAltura());
        }
    };
      
      public static Comparator <Jugador> compararPeso = new Comparator <Jugador>() {
        @Override
        public int compare(Jugador t, Jugador t1) {
            return Double.compare(t.getPeso(), t1.getPeso());
        }
    };
      

}
