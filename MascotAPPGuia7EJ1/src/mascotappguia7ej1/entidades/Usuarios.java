/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotappguia7ej1.entidades;

import java.util.Date;

/**
 *
 * @author Romina
 */
public class Usuarios {
    public String nombre;
    public String apellido;
    public Date nacimiento;
    public Integer dni;
    public String pais;

    public Usuarios(String nombre, String apellido, Date nacimiento, int dni, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.dni = dni;
        this.pais = pais;
    }

    public Usuarios(String nombre, String apellido, int dni, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pais = pais;
    }
    
    
    
}
