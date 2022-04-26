
package piramides;
import java.util.Scanner;

public class Piramides {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      int n;
      
        System.out.print("Digite el valor de n: ");
        n= entrada.nextInt(); //9
        
       //caso 6
                          
        for (int i = 0; i < n; i++) { //indica las filas de piramide
                            //0<2
            for (int j = 0; j<i; j++) { //para los espacios
                System.out.print(" ");
            }
            
            for (int k = n-1-i; k >=0; k--) { // valores
                System.out.print(n-i+" ");
            }
           
            System.out.println("");
        }
        
        
        
        
        
        
        /* caso 1
        for (int i = 0; i < n; i++) { //define el tamaño de filas
            
            for (int j = n-i ; j >0; j--) { //define los numeros des
                System.out.print(n-i);
            }
                System.out.println("");
            
        }*/
        
        
    }
    
}
