
package cifrasnumeros;

import javax.swing.JOptionPane;

public class CifrasNumeros {

    public static void main(String[] args) {
       int numero;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero: "));
       
       
       if(numero<10){
           JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene 1 cifra");
       }else if(numero<100){
           JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene 2 cifras");
       }else if(numero<1000){
           JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene 3 cifras");
       }else if(numero<10000){
           JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene 4 cifras");
       }else if(numero<100000){
           JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene 5 cifras");
       }else{
           JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene más de 5 cifras");
       }
       
       
       
       
       
    }
    
}
