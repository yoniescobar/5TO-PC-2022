
package cuadronumerowhile;

import javax.swing.JOptionPane;

public class CuadroNumeroWhile {

    public static void main(String[] args) {
      int numero,cuadrado;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
      
      while(numero>0){
         cuadrado = (int)Math.pow(numero, 2);
         JOptionPane.showMessageDialog(null,"El cuadrdo del Número  "+numero+ " es :"+cuadrado);
         numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro  numero: "));
      }
      
      
      
    }
    
}
