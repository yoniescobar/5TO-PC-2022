
package Paquete1;

public class Empleado {
    //Atributos
    String dpi;
    String nombre;
    float sueldo;
    int edad;
    //construtor -- Metodo que inicializa mis variables

    public Empleado(String dpi, String nombre, float sueldo, int edad) {
        this.dpi = dpi;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.edad = edad;
    }
    
    //sobrecaga metodos

    public Empleado(String dpi, String nombre) {
        this.dpi = dpi;
        this.nombre = nombre;
    }
    
    
    //metodo para mostra datos
    public String mostrarDatosEmpleados(){
        
        return "\nDpi: "+dpi+"\nNombre: "+nombre+"\nSueldo: "+sueldo+"\nEdad: "+edad;
    }
    
    public String mostrarDatosEmpleados(float bono){
        
        return "\nDpi: "+dpi+"\nNombre: "+nombre+"\nBono: "+bono;
    }
    
    
}
