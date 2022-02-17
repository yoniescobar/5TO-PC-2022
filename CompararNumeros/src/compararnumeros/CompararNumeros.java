
package compararnumeros;

import java.util.Scanner;

public class CompararNumeros {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        
        int n1,n2,n3;
      
        System.out.print("Ingrese un numero 1 : ");
        n1 = entrada.nextInt();
        System.out.print("Ingrese un numero 2 : ");
        n2 = entrada.nextInt();
        System.out.print("Ingrese un numero 3 : ");
        n3 = entrada.nextInt();
     
           if(n1>n2 && n1>n3){  // Mayor de los 3 numeros
               System.out.println("El mayor es n1: "+n1);
           }else if(n2>n1 && n2>n3){
               System.out.println("El mayor es n2: "+n2);
           }else{
                System.out.println("El mayor es n3: "+n3);
           }
           
             if(n1<n2 && n1<n3){  // Menor de los 3 numeros
               System.out.println("El Menor es n1: "+n1);
           }else if(n2<n1 && n2<n3){
               System.out.println("El Menor es n2: "+n2);
           }else{
                System.out.println("El Menor es n3: "+n3);
           }
           
           
      
    }
    
}
