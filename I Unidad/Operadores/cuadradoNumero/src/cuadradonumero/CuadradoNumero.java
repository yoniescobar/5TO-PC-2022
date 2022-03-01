
package cuadradonumero;

import java.util.Scanner;

public class CuadradoNumero {

    
    public static void main(String[] args) {
       Scanner entrada =new Scanner(System.in);
       double a,b,res;
       
        System.out.println("Ingrese el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b = entrada.nextDouble();
        
        res = Math.pow(a, 2) + (2*a*b)+Math.pow(b, 2);
        
        System.out.println("La respuesta es: "+res);
 
    }
}
