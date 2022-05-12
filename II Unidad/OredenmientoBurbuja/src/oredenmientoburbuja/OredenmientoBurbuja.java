
package oredenmientoburbuja;

import java.util.Scanner;

public class OredenmientoBurbuja {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int nElementos;
       int[] arreglo;
       int aux;
       
        System.out.print("Ingrese el numero de Elementos: ");
        nElementos = entrada.nextInt();
       
       arreglo= new int[nElementos];
       
       
        System.out.println("llenar el Arreglo");
        
        for (int i = 0; i < nElementos; i++)
        {
            System.out.print((i+1)+"- Digite elemento: ");
            arreglo[i] = entrada.nextInt();
        }
       
        
       //proceso de ordenamiento
       
       for(int i=0;i<nElementos-1;i++)
       {
            for(int j=0;j<nElementos-1;j++)
            {
                if(arreglo[j]>arreglo[j+1])
                { //si numeroActual>numero Siguiente
                      aux =  arreglo[j]; // 5                                     //5>4
                      arreglo[j] = arreglo[j+1]; 
                      arreglo[j+1] = aux;
                }
            }
       
       }
       
       System.out.println("Arreglo Ordenado Asce");
            for (int j = 0; j < nElementos; j++) {
                System.out.println(arreglo[j]);
           }
            
      System.out.println("Arreglo Ordenado Des");
            for (int j = nElementos-1; j >=0; j--) {
                System.out.println(arreglo[j]);
           }
       
       
    }
    
}
