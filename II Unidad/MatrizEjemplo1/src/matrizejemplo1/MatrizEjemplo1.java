
package matrizejemplo1;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrizEjemplo1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matrizA[][] = {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
                           }; 
        
        
        
        
        
        for (int i = 0; i < 3; i++) { //recorre las filas
            for (int j = 0; j < 3; j++) { //recorre las columnas
                System.out.print(matrizA[i][j] + "   ");
            }
            System.out.println("");
        }
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(5); lista.add(7); lista.add(33);
        
        lista.sort((o1, o2) -> o1.compareTo(o2));
        
        for(int i : lista) {
            System.out.println(i);
        }
        
    }
    
}
