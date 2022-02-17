
package decuentocompraif;

import javax.swing.JOptionPane;

public class DecuentoCompraIF {

    public static void main(String[] args) {
      
      float precioCompra,descuento=0.0f,precioTotal;   //Variables
   
     //Leer Datos
   precioCompra = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el Precio de Compra: "));
        
     //proceso
       if(precioCompra>300){
        descuento = precioCompra*0.20f; 
       }
       
       precioTotal = precioCompra - descuento;
       
        JOptionPane.showMessageDialog(null,"\n Mostra Datos: "+
                                            "\n Precio de Compra:"+precioCompra+
                                            "\n Descuento: "+descuento+
                                            "\n Total a Pagar: "+precioTotal);
      
    }
    
}
