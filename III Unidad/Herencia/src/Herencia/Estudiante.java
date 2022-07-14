
package Herencia;

public class Estudiante extends Persona{ //Aqui estoy heredando los atributos y metodos
    private String codigoPersonal;
    private int noFinal;
    
     //constructor es un metedo para inicializar nuestras variables

    public Estudiante(String codigoPersonal, int noFinal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codigoPersonal = codigoPersonal;
        this.noFinal = noFinal;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public int getNoFinal() {
        return noFinal;
    }

  public void mostrarDatos(){
      System.out.println("\nNombre: "+getNombre()+"\nApellidos: "+getApellido()+
              "\nEdad: "+getEdad()+
              "\nCodigo Personal: "+codigoPersonal+
              "\nNota: "+noFinal
              );
  } 
    
    
}
