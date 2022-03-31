
package tablamultiplicawhile;

import java.util.Scanner;

public class TablaMultiplicaWhile {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); //entrada -- objeto
       
       int i=1,numero;
       
        System.out.print("Ingrese un número de Tabla: ");
        numero = entrada.nextInt();
       
       
       while(i<=10){
           System.out.println(numero+" X "+i+" = "+(i*numero));
           i++;
       }
       
    }
    
}
