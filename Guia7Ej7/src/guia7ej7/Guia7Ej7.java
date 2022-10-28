
package guia7ej7;

import Entidades.Persona;
import Servicio.PersonaServicio;


public class Guia7Ej7 {

   /*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
 */
    public static void main(String[] args) {
        PersonaServicio PS = new PersonaServicio();
        
        Persona P1 = PS.crearPersona();
        
        Persona P2 = PS.crearPersona();
        
        Persona P3 = PS.crearPersona();
        
        Persona P4 = PS.crearPersona();
        
        
        Persona [] personas = new Persona[4];
        
        personas[0] = P1;
        personas[1] = P2;
        personas[2] = P3;
        personas[3] = P4;
        
        int contadorSobrePeso = 0;
        int contadorPesoIdeal = 0;
        int contadorPesoBajo = 0;
        int contadorMayorEdad = 0;
        int contadorMenorEdad = 0;
        
        for (int i = 0; i < personas.length; i++) {

            switch (PS.calcularIMC(personas[i])) {
                case -1:
                    contadorPesoBajo++;
                    break;
                case 0:
                    contadorPesoIdeal++;
                    break;
                case 1:
                    contadorSobrePeso++;
                    break;
            }

            if (PS.esMayorEdad(personas[i])) {

                contadorMayorEdad++;

            } else {

                contadorMenorEdad++;
            }

        }

        System.out.println("El porcentaje de las personas que estan por debajo del peso ideal es: " + (contadorPesoBajo * 100 / 4) + "%\n");
        System.out.println("El porcentaje de las personas que estan en el peso ideal es: " + (contadorPesoIdeal * 100 / 4) + "%\n");
        System.out.println("El porcentaje de las personas que estan por encima del peso ideal es: " + (contadorSobrePeso * 100 / 4) + "%\n");
        System.out.println("El porcentaje de las personas que son mayor de edad es: " + (contadorMayorEdad * 100 / 4) + "%\n");
        System.out.println("El porcentaje de las personas que son menor de edad es: " + (contadorMenorEdad * 100 / 4) + "%\n");
        
    }
    }
    /**
     * Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
     */
    
    
    
    

    

