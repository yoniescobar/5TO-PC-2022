
package Herencia;

import javax.swing.JOptionPane;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    //constructor es un metedo para inicializar nuestras variables

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarMensaje(){
        
        JOptionPane.showMessageDialog(null,"Soy la clase padre");
    }
    
    
  
    
    
    
}
