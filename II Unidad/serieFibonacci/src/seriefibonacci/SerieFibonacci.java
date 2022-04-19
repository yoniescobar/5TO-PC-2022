
package seriefibonacci;
import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int a=0,b=1,c,n;
       
        System.out.print("Digite un numero: ");
        n = entrada.nextInt(); //7
        
        for(int i=0;i<=n;i++){ //7
            System.out.println(a); //0
            c = a + b; // 1 + 1 = 2
            a = b; //2
            b = c; //
            
        }
        
       
    }
    
}
