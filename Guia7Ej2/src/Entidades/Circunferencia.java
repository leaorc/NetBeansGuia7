/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Romina
 */

///*2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
// tipo real. A continuación, se deben crear los siguientes métodos:
public class Circunferencia {
    
    private double radio, area, perimetro;
    

    
    // a) Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia(double radio, double area, double perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }

    public Circunferencia() {
    }
    
    public double getRadio(){
    return radio;
}

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    // b) Métodos get y set para el atributo radio de la clase Circunferencia.
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    // c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
    // objeto.
    public double crearCircunferencia(double rad) {
        this.radio = rad;
        
        return rad;
    }
    
    //d) Método area(): para calcular el área de la circunferencia (área = pi * radio2).
    public double areaCalculo(){
        this.area= Math.PI*this.radio * this.radio;
        return area;
    }
    
    // e) Método perimetro(): para calcular el perímetro (perímetro = 2 * pi * radio)
    
    public double perimetroCalculo(){
        this.perimetro = 2 * Math.PI * this.radio;
        
        return perimetro;
    }
   
}