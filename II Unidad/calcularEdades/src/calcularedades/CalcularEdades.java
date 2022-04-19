
package calcularedades;

import java.util.Scanner;

public class CalcularEdades {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int edad;
       float estatura,promedioEdad=0,promedioEstatura,sumaEdades=0,sumaEstaturas=0,contarMayoresEdad=0,contarEsturasMayores=0;
       
        for (int i = 1; i<=5; i++) {
            System.out.println("\nEstudiante No. "+i);
            System.out.print("Ingrese Edad: ");
            edad = entrada.nextInt();
            System.out.print("Ingrese Estatura: ");
            estatura = entrada.nextFloat();
            
            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            if(edad>=18){  //Hace un conteo de las edades que son mayores a 18
                contarMayoresEdad++;
            }
            
            if(estatura>1.75){  //Hace un conteo de las estaturas  que son mayores a 1.78
               contarEsturasMayores++;
            }
        }
       
       promedioEdad = sumaEdades /5;
       promedioEstatura = sumaEstaturas / 5;
       
        System.out.println("\n====Resultados =======");
        System.out.println("La edad Promedio es: "+promedioEdad);
        System.out.println("La estatura Promedio es: "+promedioEstatura);
        System.out.println("Cantidad de Alumnos mayores de Edad: "+ (int)contarMayoresEdad);
        System.out.println("Cantidad de Alumnos que miden mas de 1.75: "+ (int)contarEsturasMayores);
    }
    
}
