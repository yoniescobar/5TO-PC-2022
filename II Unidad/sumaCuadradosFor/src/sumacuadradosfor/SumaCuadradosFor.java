
package sumacuadradosfor;

public class SumaCuadradosFor {

    public static void main(String[] args) {
       int i,cuadrado,suma=0;
       
       System.out.println("Numero\tCuadrado");
       
       for(i=1;i<=10;i++){
           cuadrado = (int)(Math.pow(i, 2));
           suma = suma + cuadrado;
           System.out.println(i+"\t"+cuadrado);
       }
       
        System.out.println("La suma de sus cuadrados es: "+suma);
    }
    
}
