//Ingresar 3 digito en binario ejemplo: 110       en decimal 6
package conversionbinaria;

import java.util.Scanner;

public class ConversionBinaria {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
      
      int c,d,u,num,decimal;
      
       System.out.print("Ingrese un numero Binario de 3 digitos: ");
       num = entrada.nextInt();
       
       c = num/100;
       num%=100;
       d = num/10;
       num%=10;
       u = num;
       
       decimal = c*4+d*2+u*1;
       
        System.out.println("El numero en decimal es: "+decimal);
        
       
      
      
    }
    
}
