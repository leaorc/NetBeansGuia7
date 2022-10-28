/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioRaices;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author A134192 Método getDiscriminante(): devuelve el valor del
 * discriminante (double). El discriminante tiene la siguiente formula:
 * (b^2)-4*a*c
 */
public class ServicioRaices {

    public Raices CrearRaices() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese valor de a ");
        double a = leer.nextDouble();
        System.out.println("Ingrese valor de b ");
        double b = leer.nextDouble();
        System.out.println("Ingrese valor de c");
        double c = leer.nextDouble();
        Raices ec = new Raices(a, b, c);
        return ec;

    }
//Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
//    

    public double getDiscriminante(Raices ec) {
        double discri = (Math.pow(ec.getB(), 2)) - (4 * ec.getA() * ec.getC());
        //System.out.println(discri);
        //boolean raices = tieneRaices(discri);
        //boolean raiz = tieneRaiz(discri);
        //System.out.println(raices);
        //System.out.println(raiz);
        return discri;
    }

//Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(Raices ec) {
        return getDiscriminante(ec) > 0;
    }
//Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.

    public boolean tieneRaiz(Raices ec) {
        return getDiscriminante(ec) == 0;
    }

//Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
//soluciones.
    public void obtenerRaices(Raices ec) {
        boolean r = tieneRaices(ec);
        if (r) {
            double a = (-ec.getB() + Math.sqrt((ec.getB() * ec.getB()) - (4 * ec.getA() * ec.getC()))) / (2 * ec.getA());
            double b = (-ec.getB() - Math.sqrt((ec.getB() * ec.getB()) - (4 * ec.getA() * ec.getC()))) / (2 * ec.getA());
            System.out.println("La raiz uno es: " + a + "la raiz dos es: " + b);
        } else {
            System.out.println("No tiene dos raices");
        }

    }

//Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
//en el caso en que se tenga una única solución posible
    public void obtenerRaiz(Raices ec) {
        boolean r = tieneRaiz(ec);
        if (r) {
            double a = (-ec.getB() + Math.sqrt((ec.getB() * ec.getB()) - (4 * ec.getA() * ec.getC()))) / (2 * ec.getA());
            System.out.println("La raiz es " + a);
        }
    }

//Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
    public void calcular(Raices ec) {
        double resultado = getDiscriminante(ec);
        if (resultado > 0) {
            obtenerRaices(ec);
        }else if(resultado==0){
            obtenerRaiz(ec);
        }else
            System.out.println("No tiene raices");

    }

}
