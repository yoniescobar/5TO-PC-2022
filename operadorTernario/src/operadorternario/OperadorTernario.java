
package operadorternario;

import javax.swing.JOptionPane;

public class OperadorTernario {

    public static void main(String[] args) {
       int numero;
       String mensaje;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero: "));
 
       mensaje =(numero%2==0)? "Es par": "Es impar"; //operador Ternario
    
       /* utilizando el if
                if(numero%2==0){
                  mensaje = "Es par";
                }else{
                    mensaje = "Impar";
                }   */
       
         JOptionPane.showMessageDialog(null,"El numero: " +mensaje);
    
    }
    
}
