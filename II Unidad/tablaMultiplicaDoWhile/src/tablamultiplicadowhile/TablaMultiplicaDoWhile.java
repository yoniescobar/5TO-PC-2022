
package tablamultiplicadowhile;

import java.util.Scanner;

public class TablaMultiplicaDoWhile {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); //entrada -- objeto
       int i=1,numero;
       
        System.out.print("Ingrese un número de Tabla: ");
        numero = entrada.nextInt();
        
        do{
            System.out.println(numero+" X "+i+" = "+(i*numero));
            i++;
        }while(i<=10);
        
       
    }
    
}
