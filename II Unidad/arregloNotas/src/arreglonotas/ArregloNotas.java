
package arreglonotas;

import java.util.Scanner;

public class ArregloNotas {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int nElementos;
       
        System.out.print("Cuantas notas desea ingresar: ");
        nElementos = entrada.nextInt();
        //definimos el tamaño del arreglo
        int[] notas = new int[nElementos];
        
        //este ciclo for llena el vector
        for (int i = 0; i < nElementos; i++) {
            System.out.print("Ingrese nota del alumno "+(i+1)+": ");
            notas[i] = entrada.nextInt(); //estoy llenando el vector con las notas
        }
        
         //este ciclo for muestra las notas segun las posiciones del vector
         System.out.println("\n Las notas ingresadas Fueron: ");
         
         for (int j = 0; j < nElementos; j++) {
             System.out.print("Alumno Clave "+(j+1)+": " + notas[j]);
             System.out.println("");
        }
       
    }
    
}
