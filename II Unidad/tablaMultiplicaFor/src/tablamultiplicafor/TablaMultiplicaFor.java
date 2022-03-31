
package tablamultiplicafor;

import java.util.Scanner;

public class TablaMultiplicaFor {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); //entrada -- objeto
       int i,numero;
       
        System.out.print("Ingrese un número de Tabla: ");
        numero = entrada.nextInt();
        
        for(i=1;i<=10;i++){
             System.out.println(numero+" X "+i+" = "+(i*numero));
        }
        
    }
    
}
