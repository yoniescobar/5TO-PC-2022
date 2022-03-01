
package buclewhile;

import java.util.Scanner;

public class BucleWhile {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        int numeros;
        
        
        System.out.print("Cuantos numeros desea mostrar: ");
        numeros = entrada.nextInt(); //100
      
      while(numeros>=1){  //forma decendente
          System.out.println(numeros);
          numeros--;
      } 
      
    }
}
