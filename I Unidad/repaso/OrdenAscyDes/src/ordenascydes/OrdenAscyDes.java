/*Realizar un programa que ingres 3 numero enteros entero y que lo ordene Asce.  y desc.*/
package ordenascydes;

import java.util.Scanner;

public class OrdenAscyDes {
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        
        int n1,n2,n3,mayor=0,menor=0,medio=0;
        
        System.out.print("Ingrese n1: ");
        n1 = entrada.nextInt();
        System.out.print("Ingrese n2: ");
        n2 = entrada.nextInt();
        System.out.print("Ingrese n3: ");
        n3 = entrada.nextInt();
        
        
        if((n1>n2)&&(n2>n3)){
            System.out.println("Orden: "+n1 +" - "+n2 +"n3"+n3);
         
        }else if((n1>n3)&&(n3>n2)){
          System.out.println("Orden: "+n1 +" - "+n3 +"n3"+n2);
          
        }else if((n2>n1)&&(n1>n2)){
          System.out.println("Orden: "+n2 +" - "+n1+"n3"+n3);
        
        }else if((n2>n3)&&(n3>n1)){
          System.out.println("Orden: "+n2 +" - "+n3+"n3"+n1);
        
        }
        
        
        
        
        
        
        
    }
    
}
