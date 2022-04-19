
package promediotemperatura;

import java.util.Scanner;

public class PromedioTemperatura {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int temperatura,mayor=0,menor=999999,suma=0,promedio;
       int x=0;
       for(int i=0;i<24;i=i+4 ){ //inicia el ciclo
           x++;
           System.out.print("Ingrese la temperatura "+x+": ");
           temperatura = entrada.nextInt();

          
           if(temperatura>mayor){ //calcular temperatura mayor
               mayor = temperatura; 
           }
               //12<23
           if(temperatura<menor){ //calcular temperatura Menor
               menor = temperatura; //12
               
           }
           
           suma = suma + temperatura;
           
       }//finaliza el ciclo
       
       promedio = suma /6;
       
        System.out.println("\n Temperatura Mayor: "+mayor+"°");
        System.out.println("Temperatura Menor: "+menor+"°");
        System.out.println("La media de la temperatura es: "+promedio+"°");
        
       
       
       
    }
    
}
