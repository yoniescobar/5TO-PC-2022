
package poo1;

public class Poo1 {
    public static void main(String[] args) {
      Perro p1 = new Perro();
      p1.nombre="Rambo";
      p1.raza="Pitbull";
      p1.altura=60.5;
      
        System.out.println("------Imprimir datos del Perro 1");
        System.out.println("Nombre: "+p1.nombre);
        System.out.println("Raza: "+p1.raza);
        System.out.println("Altura: "+p1.altura);
        p1.ladrar();
        

    } 
}
