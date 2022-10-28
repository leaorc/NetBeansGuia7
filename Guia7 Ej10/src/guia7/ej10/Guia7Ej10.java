/*
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package guia7.ej10;

import java.util.Arrays;

public class Guia7Ej10 {

    public static void main(String[] args) {
       
        double A[]= new double [50];
        double B[]= new double [20];
        System.out.println("Los 50 números del arreglo A, son: \n");
        for (int i = 0; i < A.length; i++) {
            A[i]=Math.random()*10;
            System.out.println(A[i]);
    
        }
        System.out.println("");
        System.out.println("Los números ordenados: \n");
            Arrays.sort(A);
            for (int i = 0; i < A.length ; i++) {
                
                    System.out.println(A[i]);
                    
                }
            System.out.println("");
            
            for (int i = 0; i < 20; i++) {
                if (i<10) {
                    B[i]=A[i];
    
                }else{
                    B[i]=0.5;
                }
            }
            System.out.println("El vector B es: \n");
                for (int j = 0; j < 20; j++) {
                    System.out.println(B[j]);
                }
        }

    }
