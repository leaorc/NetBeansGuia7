/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotappguia7ej1.entidades;

/**
 *
 * @author Romina
 */
public class Mascotas {
    private String nombre;
    private String apodo;
    private String tipo;//perro, gato, loro, etc.
    private String raza;
    private String color;
    private String cola;
    private int edad;

    public Mascotas() {
    }
    

    public Mascotas(String nombre, String apodo, String tipo, String raza, String color, String cola, int edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        if (tipo.equalsIgnoreCase("perro")|| tipo.equalsIgnoreCase("gato") || tipo.equalsIgnoreCase("Loro")) {
            this.tipo=tipo;    
        }
        this.raza = raza;
        this.color = color;
        this.cola = cola;
        this.edad = edad;
    }
    
    public void setColor(String color){
        //Se pueden poner condicionales: If, do, While, etc.
    this.color="Blanco y negro";
    }
    public String getColor(){
        return color;//No hace falta poner "This.color" ya que no hay redundancia (String color).
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
     public String getApodo() {
        return apodo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
 public String getTipo() {
        return tipo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }
    
    public void setCola(String cola) {
        this.cola = cola;
    }
    public String getCola() {
        return cola;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", raza=" + raza + ", color=" + color + ", cola=" + cola + ", edad=" + edad + '}';
    }
    
    
}
