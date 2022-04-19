
package evaluarnumerodowhile;

import java.util.Scanner;

class EvaluarNumeroDowhile {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        int numero;
      
        do{
            System.out.print("Ingrese un numero: ");
            numero = entrada.nextInt();
            
            if(numero==0){
                System.out.println("Haz salido de la opcion...");
            }else if(numero%2!=0){
                 System.out.println("El "+numero+" Es Impar");
                
            }else{
               System.out.println("El "+numero+" Es par");
            }

        }while(numero!=0); //el ciclo termina hasta que se ingrese un cero
      
    }
    
}
