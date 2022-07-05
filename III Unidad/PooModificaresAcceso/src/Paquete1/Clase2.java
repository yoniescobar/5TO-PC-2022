
package Paquete1;

import javax.swing.JOptionPane;

public class Clase2 {
    public static void main(String[] args) {
        Clase1 obj1 = new Clase1();
        
        obj1.setEdad(-12); //asignado
        obj1.setNombre("Yoni Escobar"); //asignar
        
        int edad = obj1.getEdad();
        if(edad<0){
            JOptionPane.showConfirmDialog(null,"Edad Incorrecta");
        }
        
        
        System.out.println("Tu Edad es: "+obj1.getEdad());
        System.out.println("Tu Nombre es: "+obj1.getNombre());
        
    }
}
