
package adivinarnumero;

import javax.swing.JOptionPane;

public class AdivinarNumero {

    public static void main(String[] args) {
      
        int aleatorio,numero,intentos=0;
        
        aleatorio = (int)(Math.random()*100); //genera el numero aleatorio 77
      
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            
            if(aleatorio>numero){
                System.out.println("Digite un numero Mayor");
            }else{
                System.out.println("Digite un numero Menor");
            }
            intentos++;
        }while(aleatorio!=numero);
        
        System.out.println("Felicidades haz adivinado el numero--> "+numero+" al intento: "+intentos);
        
    }
    
}
