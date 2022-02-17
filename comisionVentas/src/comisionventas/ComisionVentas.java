
package comisionventas;

import java.util.Scanner;

public class ComisionVentas {

    
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         final float sueldoBase = 1000; //constante
         int ncarrosVendidos;
         float precioAuto,sueldoNeto;
         
         System.out.print("Ingrese Cantidad de Autos Vendidos: ");
         ncarrosVendidos = entrada.nextInt();
         System.out.print("Precio de Auto: ");
         precioAuto = entrada.nextFloat();
         
         sueldoNeto = sueldoBase + (ncarrosVendidos * 150f) + (precioAuto*0.05f*ncarrosVendidos);
         
         System.out.println("\n El sueldo Total del Empleado es: "+sueldoNeto);
         
    }
    
}
