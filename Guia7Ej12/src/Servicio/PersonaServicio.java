
package Servicio;

import Entidades.Persona;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    public static Date fechaActual = new Date();
    /*
    • Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    */
    public Persona crearPersona() throws ParseException{
        
        
        Persona P = new Persona();
        System.out.println("Ingrese su nombre completo");
        P.setNombre(leer.next());
        System.out.println("Ingrese su fecha de nacimiento (dd/MM/yyyy)");
        SimpleDateFormat fechaN = new SimpleDateFormat("dd/MM/yyyy");
        
        Date fechaNueva = fechaN.parse(leer.next());
        P.setFecha(fechaNueva);
        return P;
        
    }
    /*
    • Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
    */
    public void calcularEdad(Persona P){
        
        System.out.println(P.getNombre()+" tiene "+ (fechaActual.getYear()-P.getFecha().getYear())+" años\n");
    }
    /*
    • Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
    */
    public void menorQue(Persona P, Persona P2) throws ParseException{
        boolean menor;
        
        
        System.out.println("Ahora veremos si usted es menor que la peresona anterior");
        if ((P2.getFecha().getYear()>P.getFecha().getYear())) {
            menor=true;
            System.out.println(P2.getNombre()+" es menor que "+ P.getNombre());
        }else{
            menor=false;
            System.out.println(P.getNombre()+ " es menor que "+P2.getNombre());
        }
         
        
    }
    /*
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
    public void mostrarPersona(Persona P2){
        
        System.out.println("El nombre de la segunda persona es: "+ P2.toString());
    }
}
