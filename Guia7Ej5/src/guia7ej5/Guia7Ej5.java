/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej5;

import Entidades.Cuenta;
import Servicio.CuentaServicio;

/**
 *
 * @author Romina
 */
public class Guia7Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaServicio CS = new CuentaServicio();
        Cuenta cnt = CS.crearCuenta();
        
        CS.ingresoSaldo(cnt);
        CS.extraccionRapida(cnt);
        CS.retiroSaldo(cnt);
        CS.consultarSaldo(cnt);
        CS.consultarDatos(cnt, cnt, cnt);
        
    }
    
}
