
package arreglovrsarraylist;

import java.util.ArrayList; //es para el manejo de vectroDinamico
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner; //ingreso de datos

public class ArregloVrsArrayList {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Ejemplo con Arreglo");
        int[] arreglo1 = new int[4]; //define de una vez el tamaño del arreglo
        
        arreglo1[0] = 12;
        arreglo1[1] = 34;
        arreglo1[2] = 89; //cambiar a 90
        arreglo1[3] = 100;
        
        //cmabiar valor del arreglo1[2] = 90
        arreglo1[2] = 90;
        
        
        
       
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println(arreglo1[i]);
        }
        
        
        System.out.println("\n\nEjemplo con ArrayList");
        ArrayList<Integer>lista1 = new ArrayList<Integer>(); //arreglo de lista es dinamico
       
         lista1.add(12);
         lista1.add(34);
         lista1.add(39);
         lista1.add(800);
         lista1.add(900);
         lista1.add(1000);
         lista1.add(10);
         lista1.add(20); //cambiar a 200
         
        
         
         //quitar el elemento 20
         lista1.remove(7);
            //cambiar valor  de 20 por 200
            lista1.add(7,2000);
            
           
          lista1.sort((o1, o2) -> {
             return 0; //To change body of generated lambdas, choose Tools | Templates.
         });
         for (int i = 0; i < lista1.size(); i++) {
             System.out.println(lista1.get(i));
        }
        
       
       
    }
    
}
