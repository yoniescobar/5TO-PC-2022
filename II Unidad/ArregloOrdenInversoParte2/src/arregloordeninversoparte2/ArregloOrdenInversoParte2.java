
package arregloordeninversoparte2;

import java.util.Scanner;

public class ArregloOrdenInversoParte2 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int nElementos,contarPares=0,contarImpares=0,mayor=0,menor=99999999,suma=0,promedio;
       int contarPositivos=0,contarNegativos=0;
       
        System.out.print("Digite el numero de elementos: ");
        nElementos = entrada.nextInt();
        
       int[] numeros = new int[nElementos];
       
        System.out.println("Guardano lo datos del arreglo");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+" - Digite el numero: ");
            numeros[i] = entrada.nextInt();
             suma = suma + numeros[i];
             if(numeros[i]>0){ //contar numeros positivos del arreglo
              contarPositivos++;
             }
             
             if(numeros[i]<0){ //contar numeros negativos del arreglo
               contarNegativos++;
             }
             
             if(numeros[i]%2==0){ //contar numeros pares del arreglo
                 contarPares++;
             }
             
             if(numeros[i]%2!=0){ //contar numeros impares del arreglo
                 contarImpares++;
             }
             
            
        }
       
        System.out.println(" Los elementos del arreglo en orden inverso son: ");
        for (int j = nElementos-1 ; j >=0 ; j--) {
            System.out.println(numeros[j]);
        }
        System.out.println("\n");
        
        promedio = suma/nElementos;
        System.out.println("La suma es :   "+suma);
        System.out.println("El promedio:   "+promedio);
        System.out.println("Cant. Pares:   "+contarPares);
        System.out.println("Cant. Impares: "+contarImpares);
        System.out.println("Cant. Positivos: "+contarPositivos);
        System.out.println("Cant. Negativos: "+contarNegativos);
       
    }
    
}
