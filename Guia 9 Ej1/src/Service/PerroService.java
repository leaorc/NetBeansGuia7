/*
* 1. Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Service;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PerroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {

        Perro P1 = new Perro();

        System.out.println("Ingrese el nombre del perro");
        P1.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        P1.setEdad(leer.nextInt());
        System.out.println("Ingrese la raza");
        P1.setRaza(leer.next());
        System.out.println("Ingrese el tamaño");
        P1.setTamaño(leer.next());

        return P1;

    }

    public void crearListaPerro(ArrayList<Perro> perroLista) {

        String opcion;

        do {
            Perro pe = crearPerro();
            perroLista.add(pe);
            System.out.println("Desea agregar otro perro?");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("s"));

    }

    public Persona crearPersona() {
        Persona Pe = new Persona();

        System.out.println("Ingrese el nombre de la persona");
        Pe.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        Pe.setApellido(leer.next());
        System.out.println("Ingrese el dni");
        Pe.setDni(leer.nextInt());
        System.out.println("Ingrese la edad");
        Pe.setEdad(leer.nextInt());

        return Pe;
    }

    public void crearListaPersona(ArrayList<Persona> ListaPersona) {
        //ArrayList<Persona> ListaPersona = new ArrayList();
        String opcion;

        do {
            Persona P = crearPersona();
            ListaPersona.add(P);

            System.out.println("Desea agregar a otra persona?");
            opcion = leer.next();

        } while (opcion.equalsIgnoreCase("s"));

    }

    /*
* 1. Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
     */
    public void asignarPerroPersona(ArrayList<Persona> personalista, ArrayList<Perro> perrolista, ArrayList<Persona> personaAdopto, ArrayList<Perro> perrosAdoptado) {

        String opcion;
        
        

        Iterator<Persona> itPersona = personalista.iterator();
        boolean adopto = false;

        while (itPersona.hasNext()) {

            Persona personaAux = itPersona.next();

            
            
            do {
                boolean yaAdoptado=false;

                System.out.println(personaAux.getNombre() + ", ingrese el nombre del perro que desee adoptar");
                opcion = leer.next();
                for (Perro auxperro : perrolista) {
                    if (auxperro.getNombre().equalsIgnoreCase(opcion)) {
                        personaAux.setPerro(auxperro);
                        adopto = true;
                        perrosAdoptado.add(auxperro);
                        perrolista.remove(auxperro);
                        itPersona.remove();
                        personaAdopto.add(personaAux);
                        System.out.println("FELICITACIONES " + personaAux.getNombre() + " acaba de adoptar al perro " + auxperro.getNombre());
                        break;
                    }

                }
                if (adopto == false) {
                    for (Perro auxperro2 : perrosAdoptado) {
                        if (auxperro2.getNombre().equalsIgnoreCase(opcion)) {
                            System.out.println("El perro ya fue adoptado por otra persona");
                            yaAdoptado = true;
                            break;

                        }
                    }
                    if (yaAdoptado == false) {

                        System.out.println("El perro no está en la lista");

                    }
                }
            } while (adopto == false);

        }
    }

    public void menu(ArrayList<Persona> listaPersonaNueva, ArrayList<Perro> listaPerroNuevo, ArrayList<Persona> listaPersonasAdoptaron, ArrayList<Perro> perrosAdoptado) {

        int opcion;

        do {

            System.out.println("************************************************");

            System.out.println("Menu:");

            System.out.println("1: Agregar personas que deseen adoptar un perro");
            System.out.println("2: Agregar perros en adopción");
            System.out.println("3: Adoptar perro");
            System.out.println("4: Consultar personas que ya adoptaron");
            System.out.println("5: Consultar los perros que ya fueron adoptados");
            System.out.println("6: Salir");
            System.out.println("************************************************");

            System.out.println("Ingrese la opcion deseada:");

            switch (opcion = leer.nextInt()) {
                case 1:
                    crearListaPersona(listaPersonaNueva);
                    break;
                case 2:
                    crearListaPerro(listaPerroNuevo);
                    break;
                case 3:
                    asignarPerroPersona(listaPersonaNueva, listaPerroNuevo, listaPersonasAdoptaron, perrosAdoptado);
                    break;
                case 4:
                    System.out.println("Las personas que adoptaron son " + listaPersonasAdoptaron);
                    break;
                case 5:
                    System.out.println("Los perros que ya fueron adoptados son: " + perrosAdoptado);
                    break;
                case 6:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("El numero ingresado no corresponde");

            }

        } while (opcion != 6);

    }
}
