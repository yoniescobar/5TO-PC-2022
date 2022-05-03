
package arregloordeninverso;

import java.util.Scanner;

public class ArregloOrdenInverso {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       float numeros[] = new float[5];
       
       //llenando el vector
        System.out.println("Guardano lo datos del arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+ "- Ingrese numero: ");
            numeros[i] = entrada.nextFloat();
        }
        
        System.out.println("\n Los elementos del arreglo en orden inverso son: ");
        
        for (int i = 4; i >=0; i--) {
            System.out.println(numeros[i]);
        }
        
       
    }
    
}
