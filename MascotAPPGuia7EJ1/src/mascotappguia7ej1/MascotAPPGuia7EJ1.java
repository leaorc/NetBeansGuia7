/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotappguia7ej1;

//import java.util.Date;
import Mascota.servicio.MascotaServicio;
import javax.swing.JOptionPane;
import mascotappguia7ej1.entidades.Mascotas;
import mascotappguia7ej1.entidades.Usuarios;

/**
 *
 * @author Romina
 */
public class MascotAPPGuia7EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MascotaServicio MS = new MascotaServicio();
        
        Mascotas M1 = MS.altaMascota();
        
        
        // Si queremos llamar a otros metodos que queramos crear en la clase service, sería:
        //MS.CosasQueLeGustan(M1);
        //MS.Vacunas(M1); (etc)
        
        
        
        
        // TODO code application logic here
        
        // Date fecha = new Date();

        
        //Se inicializa esto dentro del servicio por lo que queda sin efecto.
        //Mascotas M1 = new Mascotas("tupac", "negrito", "perro", "callejero", "negro", true, 14);
        //Usuarios U1 = new Usuarios("Leandro", "Moriondo", 20202020, "Argentina");
        
     
        //Al llamar a los constructores, el resto queda sin efecto ya que 
        // los parámetros se llenan con los atributos que tienen los constructores.
        
        /*  U1.nombre = "Leandro";
        
        M1.tipo = "Perro";
        M1.nombre = "Tupac";
        M1.apodo = "Perrito";
        M1.color = "negro";
        M1.edad = 14;
        M1.raza = "callejero";
        M1.cola = true; */
        
        /* Set y get para modificar y mostrar el nuevo valor, se realiza en el service y se deja sin efecto.
        
        M1.setColor("Blanco y negro");
        System.out.println("El color del perro es: " +M1.getColor());
        System.out.println(M1);*/
/*
        System.out.println("Tipo: " + M1.tipo);
        System.out.println("Nombre: "+ M1.nombre);
        System.out.println("Apodo: "+ M1.apodo);
        System.out.println("Raza: "+ M1.raza);
        System.out.println("Color: "+ M1.color);
        System.out.println("Tiene cola? " +M1.cola);
        System.out.println("Edad: " +M1.edad);
        System.out.println("y el dueño se llama: " +U1.nombre);*/
    }

}
