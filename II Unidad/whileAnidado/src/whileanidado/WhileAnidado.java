
package whileanidado;

import java.util.Scanner;

public class WhileAnidado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        int n,x=1,y;
        
        System.out.print("Ingrese el valor n: ");
        n = entrada.nextInt(); //4
        
    while(n>=x){
        y=1;
            while(y<=n){
                System.out.print(n);
                y++;
            }
        System.out.println("");
        n--;
    }
        
        
        /*
        while(x<=n){ // indica la cantidad de fila
           y=1;
            while(y<=x){ // imprime los valores
                System.out.print(x);
                y++;
            }
            x++;
            System.out.println("");
        }
        */
        
       
    }
    
}
