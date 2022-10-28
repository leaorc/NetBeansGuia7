/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mascota.servicio;

import java.util.Scanner;
import mascotappguia7ej1.entidades.Mascotas;

/**
 *
 * @author Romina
 */
public class MascotaServicio {

    public Mascotas altaMascota() {

        Mascotas M1 = new Mascotas();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de animal");
        M1.setTipo(leer.nextLine());
        System.out.println("Ingrese el nombre");
        M1.setNombre(leer.nextLine());
        System.out.println("Ingrese la raza");
        M1.setRaza(leer.nextLine());
        System.out.println("Ingrese el color");
        M1.setColor(leer.nextLine());
        System.out.println("¿Tiene cola?");
        M1.setCola(leer.nextLine());
        System.out.println("Edad");
        M1.setEdad(leer.nextInt());
        
        System.out.println("El animal es: "+M1.getTipo()+" El nombre es: "+ M1.getNombre()
        +" La raza es: "+M1.getRaza()+" El color es: "+M1.getColor()+" ¿tiene cola? " + M1.getCola()
        +" Y la edad es: "+M1.getEdad());
        
        return M1;
    }
}
