
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author Romina
 */
public class MatematicaServicio {

    //a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public void devolverMayor(Matematica Ma) {
        
        if (Ma.getNum1() > Ma.getNum2()) {

            System.out.println("El primer número:(" + Ma.getNum1() + "), es mayor al segundo: (" + Ma.getNum2() + ")\n");
            
        } else {
            System.out.println("El segundo número:(" + Ma.getNum2() + "), es mayor al primero: (" + Ma.getNum1() + ")\n");
            
        }

    }

    //b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
    //al menor número. Previamente se deben redondear ambos valores.
    public void calcularPotencia(Matematica Ma) {

        Ma.setNum1(Math.round(Ma.getNum1()));
        Ma.setNum2(Math.round(Ma.getNum2()));
        System.out.println("Ahora vamos a calcular la potencia del numero mayor\n");
        System.out.println("Procederemos a redondear el primer número: " + Ma.getNum1() + "\n");
        System.out.println("Y a redondear el segundo número: " + Ma.getNum2() + "\n");
        

        if (Ma.getNum1() > Ma.getNum2()) {
            System.out.println("La potencia de " + Ma.getNum1() + " elevado a la potencia " + Ma.getNum2()+" es: \n");
            System.out.println(Math.pow(Ma.getNum1(),Ma.getNum2())+"\n");

        } else {
            System.out.println("La potencia de " + Ma.getNum2() + " elevado a la potencia " + Ma.getNum1()+" es: \n");
            System.out.println(Math.pow(Ma.getNum2(),Ma.getNum1())+"\n");
        }

    }
    /*
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
    
    public void calcularRaiz(Matematica Ma){
        double num1Abs = Math.abs(Ma.getNum1());
        double num2Abs = Math.abs(Ma.getNum2());
        
        
        System.out.println("Ahora procederemos a calcular la raiz cuadrada del menor numero\n");
        
        if (Ma.getNum1() < Ma.getNum2()) {
            System.out.println("El valor absoluto de "+ Ma.getNum1()+" es: "+ num1Abs+"\n");
            System.out.println("La raiz cuadrada de " + num1Abs + " es: "+Math.sqrt(num1Abs));
            

        } else {
            System.out.println("El valor absoluto de "+ Ma.getNum2()+" es: "+ num2Abs+"\n" );
            System.out.println("La raiz cuadrada de " + num2Abs + " es: "+Math.sqrt(num2Abs));
            
    }
}
}
