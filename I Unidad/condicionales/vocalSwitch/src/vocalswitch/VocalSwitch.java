
package vocalswitch;

import javax.swing.JOptionPane;

public class VocalSwitch {
    public static void main(String[] args) {
      
        char letra;
        
        letra = JOptionPane.showInputDialog("Ingrese una letra minuscula: ").charAt(0);
        
        switch(letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                JOptionPane.showMessageDialog(null,"haz ingresado una vocal: "+letra);
            break;
            default: 
                JOptionPane.showMessageDialog(null,"haz ingresado una consonante: "+letra);
        }
        
    }
    
}
