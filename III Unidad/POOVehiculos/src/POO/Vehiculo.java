
package POO;

public class Vehiculo {
    //atributos
    private String marca;
    private String modelo;
    private float  precio;
    
    //metodo constructor

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    //obtengo el metodo get de Precio

    public float getPrecio() {
        return precio;
    }
    
    //Mostra Datos
    public String mostrarDatos(){
    
     return "Marca: "+marca+"\n Modelo: "+modelo+"\nPrecio: "+precio+"\n";
    }
    
    
}
