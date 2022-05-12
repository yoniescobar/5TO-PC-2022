
package matriz2;

public class Matriz2 {

    public static void main(String[] args) {
      int matrizA[][] = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,3},
                         };
      
       // System.out.println(matrizA[2][1]); //[fila], [col]
        
        for (int i = 0; i < 3; i++) { //filas
            for (int j = 0; j < 3; j++) { //colm
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println("");
        }
        
        
              
              
              
    }
    
}
