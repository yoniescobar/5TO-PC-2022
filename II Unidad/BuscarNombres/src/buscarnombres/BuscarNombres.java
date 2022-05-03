
package buscarnombres;

import java.util.Scanner;

public class BuscarNombres {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      int nElmentos;
      String[] estudiante; //declarando vacio
      String nomBuscar;
      
      System.out.print("# Estudiantes a Ingresar: ");
        nElmentos = entrada.nextInt();
        estudiante = new String[nElmentos]; //asignando el tamaño del vector
        
        System.out.println("Ingrese el nombre de Estudiante: ");
        for (int i = 0; i < estudiante.length; i++) {
             entrada.nextLine(); //aqui limiamos el buffer
            System.out.print((i+1)+"-Nombre Estudiante: ");
             estudiante[i] = entrada.nextLine();
           
        }
        
        System.out.print("\n\nIngrese el nombre a buscar: ");
        nomBuscar = entrada.nextLine();
        
        //recorrer el vector
        int posicion=0;
        Boolean estado = false;
        
        for (int i = 0; i < estudiante.length; i++) {
            if(estudiante[i].equals(nomBuscar)){// buscando una cadena . metodo equals
                estado = true;
                posicion= posicion+i;
                break;
            }
        }
        
        if(estado==true){
            System.out.println("se ha encontrado al estudiante:  "+nomBuscar+" en la pos["+(posicion+1)+"]");
        }else{
            System.out.println("No esta en el listado");
        }
      
        
        
    }
    
}
