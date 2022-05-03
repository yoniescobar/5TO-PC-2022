
package patronserienumericaparte2;

import java.util.Scanner;

public class PatronSerieNumericaParte2 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int[] A = new int[10];
      int[] B = new int[10];
      int[] C = new int[20];
      
        System.out.println("Llenar Vector A: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"-Digite valor: ");
            A[i] = entrada.nextInt();
        }
         System.out.println("Llenar Vector B: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"-Digite valor: ");
            B[i] = entrada.nextInt();
        }
        
       //almacenando el vector A y B en C
        int j=0;
       for (int i = 0; i < 10; i++) {
           C[j] = A[i];
           j++;
           C[j] = B[i];
           j++;
       }
       
       
        System.out.println("\nMostrando los valores del vector\n");
        for (int i = 0; i < 20; i++) {
            System.out.println(C[i]);
        }
       
       
      
    }
    
}
