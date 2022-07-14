
package Herencia;

public class Docente extends Persona{
    private String especialidad;
    private double sueldo;

    public Docente(String especialidad, double sueldo, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
     public void mostrarDatos(){
      System.out.println("\nNombre: "+getNombre()+"\nApellidos: "+getApellido()+
              "\nEdad: "+getEdad()+
              "\nEspecialidad "+especialidad+
              "\nSueldo Q. "+sueldo
              );
  } 
    
    
}
