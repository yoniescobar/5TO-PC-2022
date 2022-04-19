
package menudowhile;

import javax.swing.JOptionPane;

public class MenuDoWhile {

    public static void main(String[] args) {
     
        int opcion;
        
        do{// aqui inicia el ciclo do while
            opcion =Integer.parseInt(JOptionPane.showInputDialog("M E N U    P R I N C I P A L\n "
                    + " 1. Opcion Suma\n"
                    + " 2. Opcion Resta\n"
                    + " 3. Opcion Producto\n"
                    + " 4. Opcion Division\n"
                    + " 5. Sallir: \n"
                    + "Ingrese un Opcion Valida: \n"));
            
            switch(opcion){
                case 1:
                    JOptionPane.showMessageDialog(null," Bienvinidos a la Opcion de Suma");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null," Bienvinidos a la Opcion de Resta");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null," Bienvinidos a la Opcion de Producto");
                    break;
               case 4:
                    JOptionPane.showMessageDialog(null," Bienvinidos a la Opcion de División");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null," Hasta vista Baby..");
                    break;
                default: JOptionPane.showMessageDialog(null," Ingrese una opción valida del 1 al 5..");
                
             }
            
        }while(opcion!=5); //aqui finaliza el cico do while
        
    }
    
}
