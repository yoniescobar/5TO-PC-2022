
package multiplo10;

import java.util.Scanner;

public class Multiplo10 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int n1;
      
        System.out.println("Ingrese un numero: ");
        n1 = entrada.nextInt();
      
         if(n1%10!=0){
             System.out.println("El numero"+n1+" Nooo es multiplo de 10");
            
         }else{
              System.out.println("El numero "+n1+" es multiplo de 10 ");
         }
      
    }
    
}
