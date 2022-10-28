/*
 En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:


 */
package guia7ej8;

import Entidades.Cadena;
import Servicio.CadenaServicio;

public class Guia7Ej8 {

    public static void main(String[] args) {
        
        
        CadenaServicio CS = new CadenaServicio(); 
        
        Cadena frase = CS.crearCadena();
        CS.mostrarVocales(frase);
        CS.vecesRepetido(frase);
        CS.invertirFrase(frase);
        CS.compararLongitud(frase);
        CS.unirFrase(frase);
        CS.reemplazar(frase);
        
    }
    
}
