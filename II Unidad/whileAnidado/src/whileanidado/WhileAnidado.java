
package whileanidado;

import java.util.Scanner;

public class WhileAnidado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        int n,x,y;
        
        System.out.print("Ingrese el valor n: ");
        n = entrada.nextInt(); //4
        
        x=1;
        
        while(x<=n){ // indica la cantidad de fila
           y=1;
            while(y<=x){ // imprime los valores
                System.out.print(y);
                y++;
            }
            x++;
            System.out.println("");
        }
        
        
    }
    
}
