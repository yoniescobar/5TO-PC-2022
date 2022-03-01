
package ifoptionpane;

import javax.swing.JOptionPane;

public class IfOptionPane {

    
    public static void main(String[] args) {
       //variables
        String nombre; //cadena
        int edad;      //entero
        float peso;    //decimal
        double estatura; //decimal
        //ingreso
       
        nombre = JOptionPane.showInputDialog("Ingrese nombre del Cliente: "); //cadena
        
        edad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad ")); //(numero) conversion de datos
        
        peso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Peso: "));
        
        estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Estatura: "));
        
        
        //salida mostrar
         JOptionPane.showMessageDialog(null,"Tu nomobre es: "+nombre+
                                             "\nTu Edad es:"+edad+
                                             "\nTu Pesos es:"+peso+
                                             "\nTu Estatuta es: "+estatura,"Sistema CEI",3);
    }
    
}
