/*
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearjuego() {

        Ahorcado AO = new Ahorcado();
        System.out.println("Ingrese la palabra a descubrir\n");
        AO.setBuscarPalabra(leer.next().toCharArray());
        System.out.println("¿Qué cantidad de errores desea tener la partida?\n");
        AO.setJugadasMax(leer.nextInt());
        System.out.println("COMIENZA EL JUEGO\n");

        return AO;
    }

    /*
    • Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
     */
    public void longitud(Ahorcado AO) {
        System.out.println("La palabra a descubrir contiene " + AO.getBuscarPalabra().length + " letras\n");

    }

    /*  
• Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
     */
    public void buscarLetra(Ahorcado AO) {

        char[] letrasGuiones = new char[AO.getBuscarPalabra().length];
        boolean exito = false;

        for (int i = 0; i < AO.getBuscarPalabra().length; i++) {
            letrasGuiones[i] = '_';

        }
        for (int i = 0; i < letrasGuiones.length; i++) {
            System.out.print(letrasGuiones[i]+" ");
        }
        

        while (exito == false) {

            System.out.println("Ingrese una letra");
            char letra = leer.next().charAt(0);

            int cont = AO.getLetrasEnc();
            int cont2 = AO.getJugadasMax();
            boolean validar = false;

            for (int i = 0; i < AO.getBuscarPalabra().length; i++) {

                if (AO.getBuscarPalabra()[i] == letra) {
                    letrasGuiones[i] = letra;
                    cont++;
                    AO.setLetrasEnc(cont);
                    System.out.println("¡Letra encontrada!");
                    validar = true;
                }

            }
            System.out.println(letrasGuiones);

            if (validar == false) {
                cont2--;
                System.out.println("Letra no encontrada");
                AO.setJugadasMax(cont2);
                System.out.println("Te quedan " + AO.getJugadasMax() + " intentos");

            }
            if (cont==letrasGuiones.length) {
                System.out.println("FELICIDADES, encontraste la palabra");
                exito = true;
            }
            if (AO.getJugadasMax() == 0) {
                System.out.println("Perdiste, no tenes más intentos");
                exito = true;
            }

         
        }

    }
    public void juego (Ahorcado AO){
        
        longitud(AO);
     
        buscarLetra(AO);

}
}


/*
    • Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 */

