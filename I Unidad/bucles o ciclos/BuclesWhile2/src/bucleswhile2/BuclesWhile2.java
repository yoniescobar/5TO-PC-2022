
package bucleswhile2;

import java.util.Scanner;

public class BuclesWhile2 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int i=5, num,contadorPares;
        
        System.out.print("Cuantos numeros desea mostrar: ");
        num = entrada.nextInt();
        
     
        while(i<=num){ //forma acendente
            System.out.print(i+"  ");
            i+=5;  // i = i + 2
        }
  
    }
    
}
