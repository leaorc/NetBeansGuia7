
package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class RectanguloServicio {

    public Rectangulo crearRectangulo() {
        
        Rectangulo rec = new Rectangulo();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base");
        rec.setBase(leer.nextInt());
        
        System.out.println("Ingrese la altura");
        rec.setAltura(leer.nextInt());

        return rec;

    }

    /**
     * También incluirá un método para calcular la superficie del rectángulo y
     * un método para calcular el perímetro del rectángulo. Superficie = base *
     
     */

    public void superficie(Rectangulo base, Rectangulo altura) {
        int superficie = base.getBase() * altura.getAltura();
        System.out.println("La superficie del rectangulo es: "+ superficie);
        
        
    }

    //Perímetro = (base + altura) * 2.
    public void perimetro(Rectangulo base, Rectangulo altura) {
        int perimetro = (base.getBase() + altura.getAltura()) * 2;
        System.out.println("El perìmetro del rectángulo es: "+ perimetro );
  
    }
    /*
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. 
 */
    public void mostrarRectangulo(Rectangulo base, Rectangulo altura){
        for (int i = 0; i < base.getBase() ; i++) {
            for (int j = 0; j < altura.getAltura(); j++) 
                if (i==0 || i==base.getBase()-1 || j==0 || j==altura.getAltura()-1) {
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                
            }
            System.out.println(" ");
            }
          
            
        }
        
}
    

