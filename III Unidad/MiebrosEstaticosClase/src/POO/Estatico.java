
package POO;

public class Estatico {
    private static String frase = "Primera frase";
    
    
    public static void main(String[] args) {
        Estatico obj1 = new Estatico();
        Estatico obj2 = new Estatico();
       //  Estatico obj3 = new Estatico();
        
        obj2.frase="Segunda Frase";
        
        System.out.println(obj1.frase);
        System.out.println(obj2.frase);
        
         //cuando es una clase estatica se puede instanciar desde el misobjeto
         System.out.println(Estatico.frase);
      
    }
}
