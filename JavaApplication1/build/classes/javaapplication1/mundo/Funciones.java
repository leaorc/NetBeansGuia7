/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String letra, text;

        do {

            System.out.println("Ingrese una frase:");
            text = leer.nextLine();

            letra = text.substring(text.length() - 1);

        } while (!letra.equalsIgnoreCase("."));
        //mientras letra sea distinto de "punto", repetir el bucle.

        String retorno = codificarFrase(text);
        System.out.println(retorno);
    }

    public static String codificarFrase(String text) {
        String retorno = "";
        String letra;

        for (int i = 0; i < text.length(); i++) {

            letra = text.substring(i, i + 1);

            switch (letra) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;

            }
            
            retorno = retorno + letra;//retorno+=letra

        }
        return retorno;
    }

}

