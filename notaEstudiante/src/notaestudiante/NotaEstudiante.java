
package notaestudiante;

import java.util.Scanner;

public class NotaEstudiante {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      float participacion,parcial,tareas,examenFinal,notaFinal;
      
        System.out.println("Ingrese la nota de parcipación: ");
        participacion = entrada.nextFloat();
        System.out.print("Ingrese la nota del Parcial: ");
        parcial = entrada.nextFloat();
        System.out.print("Ingrese la nota de Tareas: ");
        tareas = entrada.nextFloat();
        System.out.print("Ingrese la nota de Examen Final: ");
        examenFinal = entrada.nextFloat();
      
        participacion*= 0.10f;  //participacion = participacion * 0.10f;
        parcial*= 0.15f;
        tareas*=0.35f;
        examenFinal*=0.40f;
        
        notaFinal = participacion + parcial + tareas + examenFinal;
        
        System.out.println("El porcentaje del Alumno es: "+notaFinal+"%");
        
        
    }
    
}
