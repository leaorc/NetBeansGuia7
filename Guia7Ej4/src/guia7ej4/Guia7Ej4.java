/*
 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package guia7ej4;

import Entidades.Rectangulo;
import Servicio.RectanguloServicio;


public class Guia7Ej4 {

  
    public static void main(String[] args) {
        
        RectanguloServicio RS = new RectanguloServicio();
        
        Rectangulo rec = RS.crearRectangulo();
        
        RS.perimetro(rec, rec);
        RS.superficie(rec, rec);
        RS.mostrarRectangulo(rec, rec);
    }
    
}
