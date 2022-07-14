
package Herencia;

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("A123", 78, "Juan Antonio", "López Cifuentes", 16);
        est1.mostrarDatos();
        
        Docente docente1 = new Docente("Matemática", 3800,"Maria Antonia", "López Pérez", 35);
        docente1.mostrarDatos();
        docente1.setSueldo(4000); //set ---> Asignar datos a un atributo privado.
        docente1.mostrarDatos();
        
        System.out.println("Mostrar Unicamente el Sueldo: "+docente1.getSueldo()); //get--> es para traer la información
    }
}
