
package modulo;

import java.util.Scanner;

public class Modulo {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      int cm,dm,um,c,d,u,num;
      
       System.out.print("Ingrese un cantidad: ");
       num = entrada.nextInt();
   
        
        
        cm = num/100000;
        num%=100000;  //num=num%100000;
        dm = num/10000;
        num%=10000;
        um = num/1000;
        num%=1000;
        c = num/100;
        num%=100;
        d = num/10;
        num%=10;
        u = num;
        
        System.out.println("Centenas de Millar: "+cm);
        System.out.println("Decenas de Millar: "+dm);
        System.out.println("Unidades de Millar: "+um);
        System.out.println("Centenas: "+c);
        System.out.println("Decenas: "+d);
        System.out.println("Unidades: "+u);
      
    }
    
}
