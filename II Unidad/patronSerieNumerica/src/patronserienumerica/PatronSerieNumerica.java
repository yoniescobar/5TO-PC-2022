
package patronserienumerica;

import java.util.Scanner;

public class PatronSerieNumerica {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      int[] numeros = new int[10];
      
        System.out.println("llengando el Vector");
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"- Digite el numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("\n Impresion de vector Serie ");
      
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i]+" "); //primer elemento
            System.out.print(numeros[9-i] + " "); //segundo elemento
        }
        
    }
    
}
