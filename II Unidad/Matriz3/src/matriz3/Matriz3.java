
package matriz3;

import java.util.Scanner;

public class Matriz3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int fila,col;
        int matrizB[][]; //matriz vacia
        
        System.out.print("Ingrese Filas: ");
        fila = entrada.nextInt();
        System.out.print("Ingrese Columnas: ");
        col= entrada.nextInt();
        
        matrizB = new int[fila][col];
        
        System.out.println("Ingrese lo datos en la Matriz");
        
        for (int i = 0; i < fila; i++) { //recorre filas
            for (int j = 0; j < col; j++) { //recorre columnas
                System.out.print("Ingrese el valor en la posicion ["+i+"]["+j+"]:");
                matrizB[i][j]= entrada.nextInt();
            }
        }
        
        System.out.println("\n\n Mostrando los Datos");
        
        for (int i = 0; i < fila; i++) { //recorre filas
            for (int j = 0; j < col; j++) { //recorre columnas
                System.out.print(matrizB[i][j]+"\t");  
            }
            System.out.println("");
        }
        
        
        
    }
    
}
