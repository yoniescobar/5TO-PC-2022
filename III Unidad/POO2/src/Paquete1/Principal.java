//Metodo constructor ---> Sobre Carga de Metodos->Modificadores Acceso
package Paquete1;

public class Principal {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("12345","Jose Antonio Morales",9500,30);
        System.out.println(emp1.mostrarDatosEmpleados());
        
        Empleado emp2 = new Empleado("689564","Ericka López",5500,25);
        System.out.println("\n-----Datos Empleado 2-------");
        System.out.println(emp2.mostrarDatosEmpleados());
        
        Empleado emp3 = new Empleado("852963","Juan Carlos");
         System.out.println("\n-----Datos Empleado 3-------");
        System.out.println(emp3.mostrarDatosEmpleados(500));
        
    }
}
