
package Objetos;

import javax.swing.JOptionPane;

public class Persona {
   
    private String nombre;
    private int edad;

    public String getNombre() { //obtner
        return nombre;
    }

    public void setNombre(String nombre) { //asignar
        this.nombre = nombre;
    }

    public int getEdad() {
        JOptionPane.showConfirmDialog(null,"La Edad no Es valida");
        
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}
