package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {
        Cafetera cafe = new Cafetera();

        System.out.println("La cantidad máxima de café que puede contener la cafetera es de 1 litro");
        cafe.setCapacidadMaxima(1000);
        System.out.println("¿Cuántos cm3 de café le quiere ingresar?");
        cafe.setCantidadActual(leer.nextInt());
        System.out.println("Usted ingresó a la cafetera: " + cafe.getCantidadActual());

        return cafe;
    }

    //• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(Cafetera C) {
        System.out.println("A continuación se procederá a llenar la cafetera\n");
        System.out.println("**************");
        System.out.println("* PROCESANDO *");
        System.out.println("**************\n");
        System.out.println("La cafetera se encuentra llena (1 Litro)");
        C.setCantidadActual(C.getCapacidadMaxima());
    }

    /**
     * • Método servirTaza(int): se pide el tamaño de una taza vacía, el método
     * recibe el tamaño de la taza y simula la acción de servir la taza con la
     * capacidad indicada. Si la cantidad actual de café “no alcanza” para
     * llenar la taza, se sirve lo que quede. El método le informará al usuario
     * si se llenó o no la taza, y de no haberse llenado en cuanto quedó la
     * taza.
     *
     * @param C
     */
    public void servirTaza(Cafetera C) {

        int taza;
        int capacidadTaza;
        do {
            System.out.println("Menú:\n");
            System.out.println("Elija una taza\n");
            System.out.println("1) Taza chica (200 cm3");
            System.out.println("2) Taza mediana (400 cm3)");
            System.out.println("3) Taza grande (600 cm3)");
            taza = leer.nextInt();

            switch (taza) {
                case 1:
                    capacidadTaza = 200;
                    if (capacidadTaza > C.getCantidadActual()) {
                        System.out.println("La taza no llegó a llenarse");
                        System.out.println("Se sirvieron " + C.getCantidadActual() + " cm3");
                        C.setCantidadActual(0);
                        break;

                    } else {
                        System.out.println("Sirviendo taza chica\n");
                        System.out.println("**************");
                        System.out.println("* PROCESANDO *");
                        System.out.println("**************\n");
                        System.out.println("Retire su taza chica, gracias");
                        C.setCantidadActual(C.getCantidadActual() - 200);

                        System.out.println("La cafetera ahora tiene: " + C.getCantidadActual()
                                + " cm3");
                        break;
                    }

                case 2:
                    capacidadTaza = 400;
                    if (capacidadTaza > C.getCantidadActual()) {
                        System.out.println("La taza no llegó a llenarse");
                        System.out.println("Se sirvieron " + C.getCantidadActual() + " cm3");
                        C.setCantidadActual(0);
                        break;
                    } else {
                        System.out.println("Sirviendo taza mediana\n");
                        System.out.println("**************");
                        System.out.println("* PROCESANDO *");
                        System.out.println("**************\n");
                        System.out.println("Retire su taza mediana, gracias");
                        C.setCantidadActual(C.getCantidadActual() - 400);
                        System.out.println("La cafetera ahora tiene: " + C.getCantidadActual()
                                + " cm3");
                        break;
                    }

                case 3:
                    capacidadTaza = 600;
                    if (capacidadTaza > C.getCantidadActual()) {
                        System.out.println("La taza no llegó a llenarse");
                        System.out.println("Se sirvieron " + C.getCantidadActual() + " cm3");
                        C.setCantidadActual(0);
                        break;
                    } else {
                        System.out.println("Sirviendo taza grande\n");
                        System.out.println("**************");
                        System.out.println("* PROCESANDO *");
                        System.out.println("**************\n");
                        System.out.println("Retire su taza grande, gracias");
                        C.setCantidadActual(C.getCantidadActual() - 600);
                        System.out.println("La cafetera ahora tiene: " + C.getCantidadActual()
                                + " cm3");
                        break;
                    }

                default:
                    System.out.println("Opcion incorrecta, elija una opcion");
                    break;
            }

        } while (taza < 0 || taza > 3);

    }

    //• Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera C) {
        System.out.println("A continuación se procederá a vaciar la cafetera\n");
        System.out.println("**************");
        System.out.println("* PROCESANDO *");
        System.out.println("**************\n");
        System.out.println("La cafetera se encuentra vacía");
        C.setCantidadActual(0);

    }

    /**
     * • Método agregarCafe(int): se le pide al usuario una cantidad de café, el
     * método lo recibe y se añade a la cafetera la cantidad de café indicada.
     *
     * @param C
     */
    public void agregarCafe(Cafetera C) {

        int ingreso;
        int max = C.getCapacidadMaxima() - C.getCantidadActual();
        do {
            System.out.println("Ingrese la cantidad de café que le quiere agregar a la cafetera");
            System.out.println("La cafetera tiene: " + C.getCantidadActual());
            ingreso = leer.nextInt();

            if (ingreso > C.getCapacidadMaxima() - C.getCantidadActual()) {
                System.out.println("Supera la cantidad máxima de la cafetera (1 Litro");

                System.out.println("Lo máximo que le puede ingresar es: " + max);
            }
        } while (ingreso > max);

        System.out.println("Usted agregó: " + ingreso);

        C.setCantidadActual(C.getCantidadActual() + ingreso);
        System.out.println("La cafetera ahora tiene: " + C.getCantidadActual());

    }

    public void menu(Cafetera cafe) {
        int opcion;
        do {
            System.out.println("Menú:\n");
            System.out.println("Elija una opción\n");
            System.out.println("1) Servir taza");
            System.out.println("2) Agregar café");
            System.out.println("3) Llenar cafetera");
            System.out.println("4) Vaciar cafetera");
            System.out.println("5) Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    servirTaza(cafe);
                    break;

                case 2:
                    agregarCafe(cafe);
                    break;

                case 3:
                    llenarCafetera(cafe);
                    break;

                case 4:
                    vaciarCafetera(cafe);
                    break;
                case 5:
                    System.out.println("Hasta luego");

            }

        } while (opcion != 5);
    }

}
