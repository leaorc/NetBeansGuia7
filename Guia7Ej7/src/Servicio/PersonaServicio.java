package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 * • Metodo crearPersona(): el método crear persona, le pide los valores de los
 * atributos al usuario y después se le asignan a sus respectivos atributos para
 * llenar el objeto Persona. Además, comprueba que el sexo introducido sea
 * correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona P = new Persona();
        System.out.println("Ingrese su nombre completo");
        P.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        P.setEdad(leer.nextInt());

        System.out.println("Ingrese el sexo");
        System.out.println("H = Hombre");
        System.out.println("M = Mujer");
        System.out.println("O = Otro");
        P.setSexo(leer.next());

        while (!P.getSexo().equalsIgnoreCase("h") && !P.getSexo().equalsIgnoreCase("m") && !P.getSexo().equalsIgnoreCase("o")) {
            System.out.println("Ingrese una opcion válida");
            P.setSexo(leer.next());
        }
        System.out.println("Ingrese su peso");
        P.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura");
        P.setAltura(leer.nextDouble());

        return P;

    }

    /**
     * • Método calcularIMC(): calculara si la persona está en su peso ideal
     * (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor
     * menor que 20, significa que la persona está por debajo de su peso ideal y
     * la función devuelve un -1. Si la fórmula da por resultado un número entre
     * 20 y 25 (incluidos), significa que la persona está en su peso ideal y la
     * función devuelve un 0. Finalmente, si el resultado de la fórmula es un
     * valor mayor que 25 significa que la persona tiene sobrepeso, y la función
     * devuelve un 1.
     *
     * @param P
     */
    public int calcularIMC(Persona P) {
        int valor;
        double calculo = P.getPeso() / (P.getAltura() * P.getAltura());

        if (calculo < 20) {
            System.out.println("Usted se encuentra por debajo de su peso ideal");
            valor = -1;
        } else if (calculo >= 20 && calculo <= 25) {
            System.out.println("Usted se encuentra en su peso ideal");
            valor = 0;
        } else {
            System.out.println("Usted tiene sobrepeso");
            valor = 1;
        }
        return valor;
    }


/**
 * • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano.
 *
 * @param P
 */
public boolean esMayorEdad(Persona P) {
        boolean mayor = false;
        
        if (P.getEdad() >= 18) {
            System.out.println("Usted es mayor de edad (mayor de 18 años)");
            mayor = true;
            

        } else {
            System.out.println("Usted es menor de edad");
            mayor = false;
            
}
return mayor;
    }

    

}

