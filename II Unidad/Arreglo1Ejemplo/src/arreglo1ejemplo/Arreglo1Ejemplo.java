
package arreglo1ejemplo;

public class Arreglo1Ejemplo {

    public static void main(String[] args) {
      
       /* int[] nota = new int[4];
        
       nota[0] = 78;
       nota[1] = 50;
       nota[2] = 75;
       nota[3] = 100;
       */
       int[] nota ={78,50,75,100,78,45,89,45,12,10,96,85};
       
       
       
         for (int i = 0; i <nota.length ; i++) { //length es un metodo que cuenta la cantidad de elementos de un vector
             System.out.println("Nota del alumno "+(i+1)+": "+nota[i]); 
        }
     
      
    }
    
}
