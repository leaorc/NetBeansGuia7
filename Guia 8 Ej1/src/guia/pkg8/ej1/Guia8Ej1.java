/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package guia.pkg8.ej1;

import Entidad.Perro;
import ServicePerro.PerroServicio;
import java.util.ArrayList;

public class Guia8Ej1 {

    public static void main(String[] args) {
        
        PerroServicio PS = new PerroServicio();
        ArrayList <Perro> raza = PS.crearListaRazas();
     
        PS.mostrarLista(raza);
        PS.eliminarRaza(raza);
        PS.mostrarLista(raza);
    }
    
}
