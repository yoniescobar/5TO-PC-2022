/*La moneda de Guatemala, el Quetzal, tiene las siguientes denominaciones 
de billetes: 200, 100, 50, 20, 10, 5 y 1. 
Escriba un algoritmo en el que, dada una cantidad, muestre la distribución
de billetes de mayor denominación en la que podría representar dicha cantidad
(vea el ejemplo). Utilice solamente cantidades enteras.

*/
package programabilletes;

import java.util.Scanner;

public class ProgramaBilletes {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int cantidad,b200,b100,b50,b20,b10,b5,b1;
       
        System.out.println("Ingres un cantidad: ");
       cantidad = entrada.nextInt();
       
       b200 = cantidad /200;
       cantidad %=200;
       b100 = cantidad /100;
       cantidad %=100;
       b50 = cantidad /50;
       cantidad %=50;
       b20 = cantidad /20;
       cantidad %=20;
       b10 = cantidad /10;
       cantidad %=10;
       b5 = cantidad /5;
       cantidad %=5;
       b1 = cantidad;
       
        System.out.println("\nBilletes de Q. 200.00: "+b200);
        System.out.println("Billetes de Q. 100.00: "+b100);
        System.out.println("Billetes de Q. 50.00: "+b50);
        System.out.println("Billetes de Q. 20.00: "+b20);
        System.out.println("Billetes de Q. 10.00: "+b10);
        System.out.println("Billetes de Q. 5.00: "+b5);
        System.out.println("Billetes de Q. 1.00: "+b1);
       
       
    }
    
}
