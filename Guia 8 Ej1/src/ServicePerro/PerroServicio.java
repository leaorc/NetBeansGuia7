/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ServicePerro;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PerroServicio {
    
    Scanner leer = new Scanner (System.in);
    
    public ArrayList <Perro> crearListaRazas(){
    ArrayList <Perro> raza = new ArrayList <>();
    
    String opcion;
        do {
            Perro Ra = CrearRaza();
            raza.add(Ra);
            
            do {
                System.out.println("¿Desea agregar otra raza? (S/N)");
                opcion=leer.next();
                System.out.println("");
                
            } while (!(opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n")));
            
            
        } while (opcion.equalsIgnoreCase("s"));
        
        return raza;
        
    }
    
    public Perro CrearRaza(){
    
        Perro Ra = new Perro();
        
        System.out.println("Ingrese la raza del perro");
        Ra.setRaza(leer.next());
        
        return Ra;
    
}
    public void mostrarLista(ArrayList <Perro> raza){
        System.out.println("Raza ");
        for (Perro aux : raza) {
            System.out.println(aux.toString());
        }
    }
    /*
    2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
    */
    public void eliminarRaza (ArrayList <Perro> raza){
            System.out.println("Ingrese la raza que desea eliminar");
            String eliminar = leer.next();
            boolean encontro = false;
            Iterator <Perro> ItPerro = raza.iterator();
            while(ItPerro.hasNext())
                
                if (ItPerro.next().getRaza().equalsIgnoreCase(eliminar)) {
                    ItPerro.remove();
                    encontro = true; 
                }else{
                    System.out.println("La raza no se encontro en la lista");
                    
                }
            
        }
}
