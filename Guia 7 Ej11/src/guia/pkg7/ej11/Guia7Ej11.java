/*
 11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. 
 */
package guia.pkg7.ej11;


import java.util.Date;
import java.util.Scanner;

public class Guia7Ej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int dia, mes, anio;
        System.out.println("Ingrese el día");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes=leer.nextInt();
        System.out.println("Ingrese el año");
        anio=leer.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        
        /*
        Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
        */
        
        System.out.println(fecha+"\n");
        Date fechaActual = new Date();
        System.out.println(fechaActual+"\n");
        
        System.out.println("Entre la fecha ingresada y la fecha actual la diferencia es de : "
                + (fechaActual.getYear()-fecha.getYear())+ " años");
        
    
}
}
