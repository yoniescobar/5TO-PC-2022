/*Hacer un programa que simule un cajero automático con un saldo inicial 1000 Q. con el siguiente Menu
   CAJERO  5B
 1. Depositar dinero a la Cuenta
 2. Retirar dinero de la Cuenta
 3. Salir

*/
package cajero;

import javax.swing.JOptionPane;

public class Cajero {

    public static void main(String[] args) {
       final int saldoInicial = 1000;
       int opcion;
       float deposito,retiro,saldoActual;
       
       opcion = Integer.parseInt(JOptionPane.showInputDialog("CAJERO 5B \n\n"
                                                             +"1. Depositar dinero a la Cuenta\n"
                                                             +"2. Retirar dinero de la Cuenta\n"
                                                             +"3. Salir\n"));
       
       switch(opcion){
           case 1: deposito = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto a Depositar: "));
                   saldoActual = saldoInicial+deposito;
                   JOptionPane.showMessageDialog(null,"Saldo Actual : "+saldoActual);
                   break;
                   
           case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto a Retirar: "));
                 
                  if(retiro>saldoInicial){
                       JOptionPane.showMessageDialog(null," Saldo Insuficiente!!");
                  }else{
                      saldoActual = saldoInicial-retiro;
                      JOptionPane.showMessageDialog(null," Saldo Actual: "+saldoActual);
                  }
                  break;
       
       }
       
       
    }
    
}
