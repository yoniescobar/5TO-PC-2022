
package cicloanidadofor;

import java.util.Scanner;

public class CicloanidadoFor {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      int altura = 5;
      
        for (int i = 1; i <= altura; i++) { //for Externo
           
            for (int j = 1; j <= i; j++) { //for Interno
                System.out.print("*");
            }
            System.out.println("");
        }
      
      
    }
    
}
