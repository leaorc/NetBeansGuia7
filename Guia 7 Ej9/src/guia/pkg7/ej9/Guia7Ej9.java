/*
 En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package guia.pkg7.ej9;


import Entidad.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author Romina
 */
public class Guia7Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MatematicaServicio Ms = new MatematicaServicio();
        Matematica Ma = new Matematica();
        
        
        Ma.setNum1(Math.random()*100);
        System.out.println("El primer número es: "+ Ma.getNum1());
        Ma.setNum2(Math.random()* 100);
        System.out.println("El segundo número es: "+ Ma.getNum2()+"\n");
        
        Ms.devolverMayor(Ma);
        Ms.calcularPotencia(Ma);
        Ms.calcularRaiz(Ma);
        
    }
    
}
