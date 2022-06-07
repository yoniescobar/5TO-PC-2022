
package poovehiculo;

public class PooVehiculo {

    public static void main(String[] args) {
      
        Vehiculo v1 = new Vehiculo();
        v1.color="rojo";
        v1.marca="Toyota";
        v1.precio=75890;
        
        System.out.println("--------Vehiculo 1 -------------");
        System.out.println("Color: "+v1.color);
        System.out.println("Marca: "+v1.marca);
        System.out.println("Precio: "+v1.precio);
        
        
          Vehiculo v2 = new Vehiculo();
        v2.color="Blanco";
        v2.marca="Mercedes Bentz";
        v2.precio=75890;
        
        System.out.println("--------Vehiculo 2 -------------");
        System.out.println("Color: "+v2.color);
        System.out.println("Marca: "+v2.marca);
        System.out.println("Precio: "+v2.precio);
           
        Persona p1 = new Persona();
        p1.dpi="123456789";
        p1.nombre="Jermy Arriola";
        p1.estatura= 1.70;
        
        System.out.println("--------------Datos de Persona 1------------");
        System.out.println("Dpi: "+p1.dpi);
        System.out.println("Nombre: "+p1.nombre);
        System.out.println("Estuta: "+p1.estatura);
        
        
        Persona p2 = new Persona();
        p2.dpi="978654321";
        p2.nombre="Ceily Samanta";
        p2.estatura= 1.65;
        
        System.out.println("--------------Datos de Persona 2------------");
        System.out.println("Dpi: "+p2.dpi);
        System.out.println("Nombre: "+p2.nombre);
        System.out.println("Estuta: "+p2.estatura);
        
        
    }
    
}
