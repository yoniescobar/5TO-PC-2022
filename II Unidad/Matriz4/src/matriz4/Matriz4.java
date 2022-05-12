/*Matriz que llene con datos aleatorios entre 50 - 100*/
package matriz4;

import java.util.Random;
import java.util.Scanner;

public class Matriz4 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        int fila,col;
        int matrizB[][]; //matriz vacia
        int numero,suma=0,sumarD1=0,sumarD2=0;
        
        
       do{
        
        System.out.print("Ingrese Filas: ");
        fila = entrada.nextInt();
        System.out.print("Ingrese Columnas: ");
        col= entrada.nextInt();
       
           System.out.println("\n- Las filas y columnas son distintas intente nuevamente!...");
        
       }while(fila!=col);
        
        
        
        matrizB = new int[fila][col];
       
        Random aleatorio = new Random(); // 1. llamando a la clase random

        //llenando Matriz
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                numero = 1+aleatorio.nextInt((10+1)-1); //De esta manera los numeros se generaran en un rango del 100 al 200.
                matrizB[i][j] = numero;  //rango de 50 - 100   50+aleatorio.nextInt((100+1)-50); 
            }
        }
        
                                      //2. sumar los valores de matriz
          for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
               
               suma = suma + matrizB[i][j];
            }
        }                            
        
                                       //3. sumar valores de la primera Diagonal
          for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
               
                 if(i==j ){
                     sumarD1 = sumarD1 + matrizB[i][j];
                 }
                  if((i+j)==matrizB.length-1){
                     sumarD2 = sumarD2 + matrizB[i][j];
                 }
                 
                 
            }
        }
          
          
          
        System.out.println("Mostrando los valores de  la Matriz B ");
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
               
                System.out.print(matrizB[i][j]+"\t");                
            }
            System.out.println("");
        }
        
        System.out.println("La suma es: "+suma);
        System.out.println("Diagonal D1: "+sumarD1);
        System.out.println("Diagonal D2: "+sumarD2);
        
        System.out.println("\nSuma de Filas: ");
        int sumaFilas;
        for (int i = 0; i < fila; i++) {
            sumaFilas=0;
            for (int j = 0; j < col; j++) {
               
                sumaFilas =  sumaFilas+ matrizB[i][j];                
            }
            System.out.println("Fila ["+i+"]: "+sumaFilas);
            
        }
        System.out.println("\nSuma de Columnas de matriz: ");
        int sumaColumnas;
        for (int j = 0; j < col; j++) { //recorre Columnas
            sumaColumnas=0;
            for (int i = 0; i < fila; i++) { //reccorre filas
               
               sumaColumnas =  sumaColumnas+ matrizB[i][j];                
            }
            System.out.println("Columna ["+j+"]: "+sumaColumnas);
            
        }
        
    }
    
}
