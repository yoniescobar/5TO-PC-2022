
package piedrapapeltijera;

import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       String jugadorA,jugadorB;
       
        System.out.print("JujadorA: Ingrese piedra, papel o tijera: ");
        jugadorA = entrada.nextLine(); //piedra
        System.out.print("JujadorB: Ingrese piedra, papel o tijera: ");
        jugadorB = entrada.nextLine(); //tijera
        
        if((jugadorA.equals("piedra"))&&(jugadorB.equals("tijera")) || 
           (jugadorA.equals("tijera"))&&(jugadorB.equals("papel"))  ||
           (jugadorA.equals("papel"))&&(jugadorB.equals("piedra"))){
            
            System.out.println("El jugador A - Gano");
        
        }else if((jugadorA.equals("piedra"))&&(jugadorB.equals("piedra")) ||
                 (jugadorA.equals("tijera"))&&(jugadorB.equals("tijera")) ||
                 (jugadorA.equals("papel"))&&(jugadorB.equals("papel"))){
           
            System.out.println("Hay un Empate!!! ");
        }else{
           System.out.println("El jugador B - Gano");
        }
       
       
       
    }
    
}
