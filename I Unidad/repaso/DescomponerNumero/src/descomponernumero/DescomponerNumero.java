
package descomponernumero;

import java.util.Scanner;

public class DescomponerNumero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //para ingresar informacion
    
        int numeroOriginal,num,um,decenas,centenas,unidades; //declarar variables
        
        //ingreso de datos
        System.out.print("Ingrese un numero entero: ");
        num = entrada.nextInt();
        numeroOriginal=num;
        //proceso --- llevan a cabo las operaciones
        um = num/1000;
         num %=1000;     //num= num%1000;
        centenas = num/100;
        num=num%100;
        decenas=num/10;
        num=num%10;
        unidades =num;
        
        //mostrar resultados
        System.out.println("\nUnidades de millar: "+um);
        System.out.println("Centenas: "+centenas);
        System.out.println("Decenas: "+decenas);
        System.out.println("Unidades: "+unidades);
        
        System.out.println("\n\nNumero Original: "+numeroOriginal);
        System.out.println("Numero INVERSO: "+unidades+decenas+centenas+um);
        
        
        
    }
    
}
