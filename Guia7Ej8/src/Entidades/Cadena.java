/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud.
 */
public class Cadena {
    private String frase, nuevaFrase;
    private int longitud;

    public Cadena() {
    }

    public String getNuevaFrase() {
        return nuevaFrase;
    }

    public void setNuevaFrase(String nuevaFrase) {
        this.nuevaFrase = nuevaFrase;
    }
    

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
    
}
