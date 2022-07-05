//Encapsulamiento y metodos accesso set=Asignar   y Get=Recuperar Datos
package Objetos;

public class Main {
    public static void main(String[] args) {
        Persona p1 =new Persona();
        p1.setNombre("Jose Antonio Morales");
        p1.setEdad(1000);
        
        System.out.println(p1.getNombre());
        System.out.println(p1.getEdad());
        
    }
}
