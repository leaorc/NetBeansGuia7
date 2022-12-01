/*
3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:

 */
package AlumnoServicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alumno CrearAlumno(){
        Alumno Al = new Alumno();
        ArrayList <Integer> not = new ArrayList<>();
        
        System.out.println("Ingrese el nombre del alumno");
        Al.setNombre(leer.next());
        for (int i = 1; i < 4; i++) {
            System.out.println("Ingrese la nota "+i);
            not.add(leer.nextInt());
            
        }
        Al.setNotas(not);
        
        return Al;
        
    }
    
    public ArrayList<Alumno> crearListaAlumno() {
    
    ArrayList <Alumno> ListaDeAlumnos = new ArrayList();
    String opcion;
        do {
            Alumno Ra = CrearAlumno();
            ListaDeAlumnos.add(Ra);
            
           System.out.println("¿Desea agregar otro Alumno? (S/N)");
                opcion=leer.next();
            
        } while (opcion.equalsIgnoreCase("s"));
        
        return ListaDeAlumnos;

    }

    
    /*
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
    
  
    */
//
    public void PromedioFinal(ArrayList <Alumno> AL){
        Integer notaFinal = 0;
        boolean aux = false;
        
        System.out.println("Ingrese el nombre del alumno a bsucar");
        String Alumno = leer.next();
       
        for (int i = 0; i < AL.size(); i++) {
            if (AL.get(i).getNombre().equalsIgnoreCase(Alumno)) {
                
                for (int j = 0; j < AL.get(i).getNotas().size(); j++) {
                    notaFinal+= AL.get(i).getNotas().get(j);
        
                }
                 System.out.println("La nota final de " + Alumno + " es: " + notaFinal.doubleValue() / 3);
            aux = true;
            }
           
        }
        if (!aux) {
            System.out.println("El alumno no se encuentra en la lista");
        }
       
       
    }
    
}
 