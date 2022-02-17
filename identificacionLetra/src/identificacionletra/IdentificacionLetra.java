
package identificacionletra;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class IdentificacionLetra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra;
        
        System.out.println("Ingrese un letra: ");
        letra = entrada.nextLine().charAt(0);
        
        letra = JOptionPane.showInputDialog(null,"Ingrese una Letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){ //si letra que ingreso es mayuscula
            JOptionPane.showMessageDialog(null,"Es una Letra mayuscula");
        }else{
            JOptionPane.showMessageDialog(null,"Es una Letra minuscula");
        }
    }
    
}
