/*


 */
package Servicio;

import Entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicio {

    Scanner leer = new Scanner(System.in);

    //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public Cuenta crearCuenta() {

        Cuenta cnt = new Cuenta();

        System.out.println("Ingrese su nombre completo");
        cnt.setNombre(leer.next());
        System.out.println("Ingrese su numero de cuenta");
        cnt.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        cnt.setDni(leer.next());
        System.out.println("¿Su cuenta tiene intereses?[Y/N]");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("y")) {
            System.out.println("Ingrese el porcentaje de interes");
            cnt.setInteres(leer.nextInt());

        } else {
            cnt.setInteres(0);
        }

        System.out.println(" ");
        return cnt;
    }

    /**
     * d) Método ingresar(double ingreso): el método recibe una cantidad de
     * dinero a ingresar y se la sumara a saldo actual.
     *
     * @param saldoActual
     */
    public void ingresoSaldo(Cuenta saldoActual) {
        System.out.println("Su saldo es: " + saldoActual.getSaldoActual());
        System.out.println("Ingrese la cantidad de dinero a depositar en su cuenta");
        saldoActual.setSaldoActual(saldoActual.getSaldoActual() + leer.nextDouble());

        System.out.println("Su saldo ahora es: " + saldoActual.getSaldoActual());

    }

    /**
     * e) Método retirar(double retiro): el método recibe una cantidad de dinero
     * a retirar y se la restará al saldo actual. Si la cuenta no tiene la
     * cantidad de dinero a retirar, se pondrá el saldo actual en 0.
     *
     * @param saldoActual
     */
    public void retiroSaldo(Cuenta saldoActual) {
        System.out.println("Su saldo es: " + saldoActual.getSaldoActual());
        System.out.println("Ingrese la cantidad de dinero que quiere retirar (retiro comun)");
        double retiro = leer.nextDouble();
        if (retiro > saldoActual.getSaldoActual()) {
            saldoActual.setSaldoActual(0);
            System.out.println("Usted retiró: " + retiro);
            System.out.println("Su saldo es: " + saldoActual.getSaldoActual());

        } else {
            saldoActual.setSaldoActual(saldoActual.getSaldoActual() - retiro);
            System.out.println("Su saldo es: " + saldoActual.getSaldoActual());
        }

    }

    /**
     * f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo.
     * Validar que el usuario no saque más del 20%.
     *
     * @param saldoActual
     */
    public void extraccionRapida(Cuenta saldoActual) {
        
        double extraccionRapida=0;
        double saldoMod;

        do {
              System.out.println("Cuanto dinero quiero retirar (extraccion rapida)?");
        extraccionRapida = leer.nextDouble();

            if (extraccionRapida > (saldoActual.getSaldoActual() * 0.20)) {
                System.out.println("No puede retirar más de: " + (saldoActual.getSaldoActual() * 0.20) + " el 20% de su saldo actual");
                System.out.println("Ingrese un retiro menor al 20% de: " + saldoActual.getSaldoActual());
            }

        } while (extraccionRapida > (saldoActual.getSaldoActual() * 0.20));

        System.out.println("Usted retiró:" + extraccionRapida);
    
       saldoMod=(saldoActual.getSaldoActual()- extraccionRapida);
       saldoActual.setSaldoActual(saldoMod);
       
        System.out.println("Su saldo ahora es: "+ saldoMod );
  
    }

    //g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(Cuenta saldoActual) {
        System.out.println("Su saldo actual es: " + saldoActual.getSaldoActual());
    }

    //h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(Cuenta numeroCuenta, Cuenta dni, Cuenta saldoActual) {
        System.out.println("Su numero de cuenta es: " + numeroCuenta.getNumeroCuenta());
        System.out.println("Su DNI es: " + dni.getDni());
        System.out.println("Su saldo Actual es: " + saldoActual.getSaldoActual());

    }
}
