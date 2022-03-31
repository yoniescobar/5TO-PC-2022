
package sumatoriarangonumeros;

import java.util.Scanner;

public class SumatoriaRangoNumeros {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int j,inicio,fin,acum=0;
       
        System.out.print("Ingrese el inicio del rango de Número: ");
        inicio = entrada.nextInt();
        System.out.print("Ingrese el fin del rango de Número: ");
        fin = entrada.nextInt();
        
        for(j=inicio;j<=fin;j++){
        
            System.out.println(j);
            acum = acum + j;
        }
        
        System.out.println("La suma es: "+acum);
        
        
    }
    
}
