
package Serie2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Romano op1 = new Romano();
        int numero;
    
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero decimal Positivo"));
        op1.convertirRomano(numero);
        
        
        
    }
 
}
