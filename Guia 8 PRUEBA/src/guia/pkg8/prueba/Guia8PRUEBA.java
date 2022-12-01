
package guia.pkg8.prueba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;

public class Guia8PRUEBA {

    public static void main(String[] args) {
        //Arraylist: Es un Array dinamico, se pueden duplicar los objetos.
        ArrayList <Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x);//agrega x en la posición 0 al ser un ArrayList
        numerosA.remove(10);//elimina el numero en la posición (10), o el que se desee.
        
        //Muestra en pantalla
        for (Integer numerito : numerosA) {
            System.out.println(numerito);
            
        }
        
        //Se utiliza una "tabla Hash", que le da un valor unico a cada elemento evitando dulpicados
        HashSet <Integer> numerosB = new HashSet();
        int z = 30;
        numerosB.add(24);//Se elimina el numero (24), o que se desee.
        
        //mostramso por pantalla.
        for (Integer num : numerosB) {
            System.out.println(num);
            
        }
        
        //Igual que el HashSet, pero los ordena de forma ascendente.
        TreeSet <Integer> numeros = new TreeSet();
        
        //Utiliza "tabla Hash" y respeta el orden de isercción
        LinkedHashSet <String> numerosC = new LinkedHashSet();
        
        
        //Mapa que utiliza llaves y valores, lsa llaves utilizan "tabla Hash" para evitar duplicados.
        HashMap <Integer, String> alumnos = new HashMap();
        int dni = 31469900;// Esta es la llave (valor unico)
        String nombre = "Leandro";// Este es el valor (puede estar duplicado, varias personas con el mismo nombre)
        alumnos.put(dni, nombre);// Agregamos la llave y el valor
        alumnos.remove(31469900);//eliminamos la llave número (tanto).
        
        //Recorre las 2 partes del mapa, entry.getKey trae la llave y entry.getValue, los valores.
        for (Map.Entry <Integer, String> entry : alumnos.entrySet()) {
            System.out.println("El DNI es: " + entry.getKey() + " y el nombre es: " + entry.getValue());
            
        }
        //Si queremos mostrar solo la llave (sin map.Entry).
        for (Integer dni : alumnos.keySet()) {
            System.out.println("El documento es: " + dni);
           
        }
        
        //Si queremos mostrar solo el valor.
        for (String nombre : alumnos.values()) {
            System.out.println("El nombre del alumno es: " + nombre);
            
        }
        
    }
    
}
