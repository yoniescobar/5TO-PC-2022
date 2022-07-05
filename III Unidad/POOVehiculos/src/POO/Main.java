package POO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marcaV, modeloV;
        float precioV;
        int numerosVehiculos;

        System.out.println("Digite la cantidad de Vehiculos: ");
        numerosVehiculos = entrada.nextInt();

        //creamos un vector de objetos de vehiculos
        Vehiculo autos[] = new Vehiculo[numerosVehiculos];

        System.out.println("\n Ingresar Datos de Vehiculos");

        for (int i = 0; i < autos.length; i++) {
            System.out.println("\n Vehiculo No. " + (i + 1));
            System.out.print("Ingrese Marca: ");
            marcaV = entrada.nextLine();   entrada.nextLine();//limpiar el buffer
            System.out.print("Ingrese Modelo: ");
            modeloV = entrada.nextLine();
            System.out.print("Ingrese Precio: ");
            precioV = entrada.nextFloat();
            
            autos[i] = new Vehiculo(marcaV,modeloV,precioV);
        }

    }

}
