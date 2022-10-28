
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;


public class CadenaServicio {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Cadena crearCadena(){
        Cadena frase = new Cadena();
        System.out.println("Ingrese una palabra o frase\n");
        frase.setFrase(leer.nextLine().toLowerCase());
        frase.setLongitud(frase.getFrase().length());
        
        return frase;
        
    }
    
    /**
     * a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
     */
    
    public void mostrarVocales(Cadena frase){
        
        String vocales[] ={"a","e","i","o","u"};
        int cont=0;
        String voc="";

        for (int i = 0; i < frase.getLongitud() ; i++) {
            //caracter=frase.getFrase().charAt(i);
            
            for (int j = 0; j < vocales.length; j++) {
                if (vocales[j].equalsIgnoreCase(frase.getFrase().substring(i, i+1))) {
                    cont++;
                    voc+=frase.getFrase().charAt(i);
                    
                }
                
            }
            
        }
        System.out.println("Frase original: "+frase.getFrase());
        System.out.println("La cantidad de vocales son: "+ cont);
        System.out.println("Las vocales fueron: "+voc);
 
    }
    
    /*
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    */
    public void invertirFrase(Cadena frase){
        String invertir="";
        for (int i = frase.getLongitud()-1; i >=0; i--) {
            invertir+=frase.getFrase().charAt(i);
        }
        System.out.println("La frase invertida es: "+ invertir+"\n");
    }
    
    /**
     * c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */
    
    public void vecesRepetido(Cadena frase){
        System.out.println("Ingrese una letra que desea ver cuantas veces se repite en la frase\n");
        char letra=leer.next().charAt(0);
        int cont=0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().charAt(i)== letra) {
                cont++;
            }
            
        }
        System.out.println("La letra: "+letra+" se repite: "+cont+" veces\n");
    }
    /*
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
    */
    public void compararLongitud(Cadena frase){
        System.out.println("Ingrese una nueva frase\n");
        frase.setNuevaFrase(leer.next());
        int nuevaFraseLong = frase.getNuevaFrase().length();
        System.out.println("La primer frase contiene: "+ frase.getLongitud()+" y la segunda frase tiene: "+ nuevaFraseLong);
        if (frase.getLongitud()>nuevaFraseLong) {
            int resultado= frase.getLongitud()-nuevaFraseLong;
            System.out.println("La primer frsae es más larga por "+ resultado+ " dígitos");
        }else{
            int resultado=nuevaFraseLong - frase.getLongitud();
            System.out.println("La segunda frsae es más larga por "+ resultado+ " dígitos");
        }
    }
    /*
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
    */
    public void unirFrase(Cadena frase){
        System.out.println("Las dos frase unidas son: "+ frase.getFrase()+" "+frase.getNuevaFrase());
    }
    /*
    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
    */
    public void reemplazar(Cadena frase){
        System.out.println("Ingrese un simbolo para reemplazar a las letras (a) de la frase");
        char simbolo = leer.next().charAt(0);
        frase.getFrase().toLowerCase();
        frase.setFrase(frase.getFrase().replace('a', simbolo));
        
        System.out.println("la frase ahora es: "+frase.getFrase());
        
    }
    /*
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    */
    public void contiene(Cadena frase){
        System.out.println("Ingrese una letra para ver si se encuentra en la frase");
        char letra = leer.next().charAt(0);
        boolean letrita= true;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().charAt(i)==letra) {
                letrita= true;
                
            }else{
                letrita=false;
            }
 
        }
        
    }
}
