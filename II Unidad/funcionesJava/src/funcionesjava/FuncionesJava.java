
package funcionesjava;

public class FuncionesJava {

    public static void main(String[] args) {
    
        int r1 = sumar(8,2);
        System.out.println(r1);
        
        int r2 = restar(8,2);
        System.out.println(r2);
        
        
    }
  
    public static int sumar(int a, int b){
        return a+b;
    }
    
    public static int restar(int a, int b){
        return a-b;
    }
    
    public static int multiplicar(int a, int b){
        return a*b;
    }
    
    public static int dividir(int a, int b){
        return a/b;
    }
    
}
