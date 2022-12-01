
package guia.pkg9.ej1;

import Entidades.Perro;
import Entidades.Persona;
import Service.PerroService;
import java.util.ArrayList;
import java.util.Scanner;

/**
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class Guia9Ej1 {

   Scanner leer = new Scanner (System.in);
    public static void main(String[] args) {
        
        PerroService PS = new PerroService();
        ArrayList<Persona> listaPers = new ArrayList();
        ArrayList<Perro> listaPerro = new ArrayList();
        ArrayList<Persona>personasAdoptaron = new ArrayList();
        ArrayList<Perro> perrosAdoptado = new ArrayList();
        PS.menu(listaPers, listaPerro, personasAdoptaron, perrosAdoptado);
        
    }
    }
       /*
         Perro P1 = new Perro();
         Perro P2 = new Perro();
         Persona Pe1 = new Persona();
         Persona Pe2 = new Persona();
         
         P1.setNombre("HP");
         P1.setRaza("callejero");
         P1.setEdad(10);
         P1.setTamaño("mediano");
         
         P2.setNombre("Beethoven");
         P2.setRaza("Bulldog");
         P2.setEdad(15);
         P2.setTamaño("chico");
         
         Pe1.setNombre("Juan");
         Pe1.setApellido("Garcia");
         Pe1.setEdad(37);
         Pe1.setDni(12345678);
         Pe1.setPerro(P2);
         
         Pe2.setNombre("Pedro");
         Pe2.setApellido("Gomes");
         Pe2.setEdad(34);
         Pe2.setDni(87654321);
         Pe2.setPerro(P1);
         
         System.out.println(Pe1.toString());
         System.out.println(Pe2.toString());
         
    }
}
         
         /*
         ArrayList<Perro>perro = new ArrayList();
         String opcion;
        do {
            System.out.println("");
            perro.add(leer.next())
            
            
            
        } while (true);
    }*/
    

