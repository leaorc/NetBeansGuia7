/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class LibroServicio {
    
    public Libro NuevoLibro() {
        
        Libro L1 = new Libro();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el numero de ISBN");//International Standard book number.
        L1.setISBN(leer.next());
        
        System.out.println("Ingrese el título");
        L1.setTitulo(leer.next());
        
        System.out.println("Ingrese el autor");
        L1.setAutor(leer.next());
        
        System.out.println("Ingrese la cantidad de páginas");
        L1.setPaginas(leer.nextInt());
        
        System.out.println("El número de ISBN es: " + L1.getISBN()+"\n");
        System.out.println("El título del libro es: " + L1.getTitulo());
        System.out.println("El autor del libro es: " + L1.getAutor());
        System.out.println("El libro tiene: " + L1.getPaginas() + " páginas");
        
        return L1;
        
    }
    
}
