
package Paquete1;

public class Estatico {
    
    private static String frase = "Primera Frase";
    
    public static int sumar(int n1,int n2){
        return n1+n2;
    }
    public static void main(String[] args) {
        Estatico  ob1 = new Estatico();
        System.out.println(ob1.frase);
        
        System.out.println(Estatico.frase);
        System.out.println("La suma es: "+Estatico.sumar(20,5));
    }
}
