
package proyectomatrices;

import java.util.Scanner;

public class ProyectoMatrices {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int opcion;
       int n; //n tamaño de matriz
       
       do{
      
           System.out.println(" =====M E N U  P R I N C I P A L====== ");
           System.out.println("1. Forma A ");
           System.out.println("2. Forma B ");
           System.out.println("3. Forma C ");
           System.out.println("4. Forma D ");
           System.out.println("5. Salir \n");
           System.out.print("Ingrese una Opción Válida: ");
           opcion = entrada.nextInt();
           
           switch(opcion ){
               case 1: System.out.println("\n ========Forma A =============");
                        System.out.print("-Digite el tamaño de la Matriz: ");
                        n = entrada.nextInt();
                        //aqui va la logica de la diagonal  diagonal1
                        
                        System.out.println("++++++++++++++++++++++++++++++++++++++++");
                        break;
               case 2: System.out.println("\n ========Forma B =============");
                        System.out.print("-Digite el tamaño de la Matriz: ");
                        n = entrada.nextInt();
                        //aqui va la logica de la diagonal
                         System.out.println("++++++++++++++++++++++++++++++++++++++++");
                        break;
               case 3: System.out.println("\n ========Forma C =============");
                        System.out.print("-Digite el tamaño de la Matriz: ");
                        n = entrada.nextInt();
                        //aqui va la logica de la diagonal
                         System.out.println("++++++++++++++++++++++++++++++++++++++++");
                        break;
                case 4: System.out.println("\n ========Forma D =============");
                        System.out.print("-Digite el tamaño de la Matriz: ");
                        n = entrada.nextInt();
                        //aqui va la logica de la diagonal
                         System.out.println("++++++++++++++++++++++++++++++++++++++++");
                        break;
                        
                case 5: System.out.println("\n ========Hasta pronto....! =============");
                       
                        break;
                default: System.out.println("Opción No valida... intente nuevamente..");
           }
       
       }while(opcion!=5);
       
    
       
    }
    
}
