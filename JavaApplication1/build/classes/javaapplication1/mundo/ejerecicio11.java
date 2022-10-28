
package hola.mundo;

import java.util.Scanner;


public class ejerecicio11 {


    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String frase;
        
    System.out.println("Ingrese una frase");
    frase = leer.nextLine();
   
    System.out.println(fraseCodificada(frase));
        
    }
    
    public static String fraseCodificada(String frase){
    String letras,letra2;
    String frase2;
    frase2 = "";
//    int longitud;
//    
//        longitud = frase.length();
    
        for (int i=0;i<frase.length();i++){
            letras = frase.substring(i, i+1);
            switch (letras){
                case "a": letra2="@";
                break;
                case "e": letra2="#";
                break;
                case "i": letra2="$";
                break;
                case "o": letra2="%";
                break;
                case "u": letra2="*";
                break;
                default: letra2=letras;
     
            }
            frase2 = frase2.concat(letra2);
        }
        return frase2;    
    }
    
}


