
package split;

import java.util.Scanner;

public class Split {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
      
      int cm,dm,um,c,d,u,num,total1,total2;
      
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
        
        total1 = cm+dm+um;
        total2 = c + d + u;
        
        if(total1==total2){
            System.out.println("Es Esplit");
        }else{
            System.out.println("No es Esplit");
        }
        
        
        
    }
    
}
