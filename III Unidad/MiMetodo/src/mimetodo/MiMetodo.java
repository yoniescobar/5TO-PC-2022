
package mimetodo;

public class MiMetodo {

    public static void saludar(String nombre, int edad){
        System.out.println("Hola tu nombre es: "+nombre+" y tu edad es: "+edad);
   
    } 
    public static int sumarNumeros(int n1, int n2){
        int sumar = n1+n2;
        return sumar;
    }
    public static void main(String[] args) {
       saludar("Yoni Escobar",18);
       saludar("Arcely",16);
       System.out.println(" la suma es: "+sumarNumeros(20,100));  
    }
    
}
