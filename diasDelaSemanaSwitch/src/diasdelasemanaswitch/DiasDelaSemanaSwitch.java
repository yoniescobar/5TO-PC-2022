
package diasdelasemanaswitch;

import javax.swing.JOptionPane;

public class DiasDelaSemanaSwitch {
    public static void main(String[] args) {
       
    int numDia;
        
    numDia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero del 1 al 7: "));
       
    switch(numDia){
        case 1: JOptionPane.showMessageDialog(null,"Lunes");
                break;
        case 2: JOptionPane.showMessageDialog(null,"Martes");
                break;
        case 3: JOptionPane.showMessageDialog(null,"Miércoles");
                break;
        case 4: JOptionPane.showMessageDialog(null,"Jueves");
                break;
        case 5: JOptionPane.showMessageDialog(null,"Viernes");
                break;
        case 6: JOptionPane.showMessageDialog(null,"Sábado");
                break;
        case 7: JOptionPane.showMessageDialog(null,"Domingo");
                break;
        default: JOptionPane.showMessageDialog(null,"Disculpe no esta en el rango del 1 al 7 ");
    
    }
    
       
    }
    
}
