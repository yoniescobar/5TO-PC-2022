
package programaventana1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProgramaVentana1 {

  
    public static void main(String[] args) {
     // Scanner entrada = new Scanner(System.in);
     
     String nombre;   //variable
     int edad;  
     //entrada datos
        nombre = JOptionPane.showInputDialog(null, "Ingres nombre: ");
        edad   =Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad: "));
        
     //salida datos
        JOptionPane.showMessageDialog(null,"Tu nombre es: "+nombre+"\nTu edad es: "+edad);
        
    }
    
}
