
package numeropar;

import java.util.Scanner;

public class NumeroPar {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
          int n1;
          
          System.out.println("Ingrese un numero: ");
          n1 = entrada.nextInt();
          
          if(n1%2==0){
              System.out.println("El numero es Par");
          }else{
              System.out.println("El numero es Impar");
          }
          
          
    }
    
}
