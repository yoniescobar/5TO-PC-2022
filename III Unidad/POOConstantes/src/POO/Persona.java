//Constante: Es una valor que no cambia en la ejecución del código
package POO;

public class Persona {
    private final String nombre;
    private int edad;
    
    //constructor

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("El Nombre es: "+nombre);
        System.out.println("La Edad es: "+edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   
}
