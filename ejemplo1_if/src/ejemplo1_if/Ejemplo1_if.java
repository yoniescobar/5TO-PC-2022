
package ejemplo1_if;

public class Ejemplo1_if {

    
    public static void main(String[] args) {
       int numero1 = 20;
       
       int numero2 = 20;
       
             if(numero1 == numero2){
                 System.out.println("Ambos numeros son iguales");
             }else if(numero2>numero1){
                  System.out.println("El numero2: "+numero2+" Es mayor a al numero 1: "+numero1);
             }else{
                  System.out.println("El numero1: "+numero1+" Es mayor a al numero 2: "+numero2);
             }
    }
    
}
