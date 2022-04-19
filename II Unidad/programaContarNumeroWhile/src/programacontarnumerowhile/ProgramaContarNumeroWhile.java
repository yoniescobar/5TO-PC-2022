
package programacontarnumerowhile;

import java.util.Scanner;

public class ProgramaContarNumeroWhile {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int numero,numPares=0,numImpares=0,sumaPositivo=0,sumaNegativo=0;
       
        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();
        
        while(numero!=0){ //empieza el while
            
            if(numero%2==0){ //verifica si es para o impar
                numPares++;
            }else{
                numImpares++;
            }
            
             if(numero>0){ //verifica si es positivo o negativo y sumar valores
                sumaPositivo += numero;
            }else{
                sumaNegativo = sumaNegativo + numero;
            }
            
            
            System.out.print("Ingrese otro número: ");
            numero = entrada.nextInt();
        }//termina el while
       
        System.out.println("\n\n=======Resultados ========= ");
        System.out.println("Cantidad de Pares: "+numPares);
        System.out.println("Cantidad de Impares: "+numImpares);
        System.out.println("La suma Positivos: "+sumaPositivo);
        System.out.println("La suma Negativos: "+sumaNegativo);
        
    }
    
}
