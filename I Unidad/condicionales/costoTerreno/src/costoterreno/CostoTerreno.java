/* Elabore un programa para calcular e imprimir el precio de un terreno del
cual se tienen los siguientes datos: largo, ancho y precio por metro cuadrado.
Si el terreno tienen más de 400 metros cuadrados se hace un descuento de
10%, si el terreno tiene más de 500 metros cuadrados el descuento es de 17%
y si tiene más de 1000 el descuento es de 25%.
*/
package costoterreno;

import java.util.Scanner;

public class CostoTerreno {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        float subtotalTerreno,descuento,precioTotalTerreno, largo,ancho,totalMetrosCuadrado,precioMetroCuadrado;
        
        System.out.print("Ingrese el Largo del Terreno: ");
        largo = entrada.nextFloat();
        System.out.print("Ingrese el Ancho del Terreno: ");
        ancho = entrada.nextFloat();
        System.out.print("Ingrese el Precio por metro cuadrado: ");
        precioMetroCuadrado = entrada.nextFloat();
        
        totalMetrosCuadrado = largo * ancho;
        subtotalTerreno = totalMetrosCuadrado * precioMetroCuadrado;
        
        if(totalMetrosCuadrado>1000){
          descuento= subtotalTerreno * 0.25f;
        }else if(totalMetrosCuadrado>500){
         descuento=  subtotalTerreno * 0.10f;
        }else if(totalMetrosCuadrado>400){
         descuento=  subtotalTerreno * 0.25f;
        }else{
           descuento= 0;
        }
        
        precioTotalTerreno = subtotalTerreno - descuento;
        
        System.out.println("\n\n Total Metros Cuadrados: "+totalMetrosCuadrado);
        System.out.println("El Subtotal es: " + subtotalTerreno);
        System.out.println("El descuento es: "+descuento);
        System.out.println("El Precio Total es:  "+precioTotalTerreno);
        
    }
    
}
