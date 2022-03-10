/*
  Intercambiar dos numeros.
 */
package intercambionumeros;

import java.util.Scanner;

public class IntercambioNumeros {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
      
       String jugadorA,jugadorB;
       
        System.out.print("Jugador A- Ingrese piedra,papel o tijera: ");
        jugadorA = entrada.nextLine();
        System.out.print("Jugador B- Ingrese piedra,papel o tijera: ");
        jugadorB = entrada.nextLine();
        /*
       if(jugadorA.equals("piedra")){
           if(jugadorB.equals("piedra")){
               System.out.println("Hay un Empate");
           }else if(jugadorB.equals("papel")){
               System.out.println("Gana Jugador B");
           }else{
               System.out.println("Gana Jugador A");
           }
       }else if(jugadorA.equals("papel")){
           if(jugadorB.equals("piedra")){
               System.out.println("Gana el Jugador A");
           }else if(jugadorB.equals("papel")){
               System.out.println("Hay un Empate");
           }else{
               System.out.println("Gana el Jugador B");
           }
       }else if(jugadorA.equals("tijera")){
           if(jugadorB.equals("piedra")){
               System.out.println("Gano el Jugador B");
           }else if(jugadorB.equals("papel")){
               System.out.println("Gano el Jugador A");
           }else{
               System.out.println("Hay un empate");
           }
       }
       */
        //opcion en todos los casos que gane jugador A
        if((jugadorA.equals("piedra")&& jugadorB.equals("tijera"))|| 
           (jugadorA.equals("tijera")&& jugadorB.equals("papel")) ||    
           (jugadorA.equals("papel") && jugadorB.equals("piedra"))){ 
        
            System.out.println("Gana Jugador A");
        }else if((jugadorA.equals("tijera")&& jugadorB.equals("piedra"))|| 
           (jugadorA.equals("papel")&& jugadorB.equals("tijera")) ||    
           (jugadorA.equals("piedra") && jugadorB.equals("papel"))){
            System.out.println("Gana Jugador B");
        
        }else{
            System.out.println("Hay un empate");
        }
        
    }
}
