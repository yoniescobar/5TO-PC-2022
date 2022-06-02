package ej1metodos;

public class Ej1Metodos {

    public static void main(String[] args) {

        // System.out.println("El area de la circuferencia es: "+calcularArea(5));
        //System.out.println("El Volumen de la circuferencia es: "+calcularVolumen(5));
        //imprimirEquivalentes(300.78f);
        //System.out.println("\n\n ---------------------------\n");
        //imprimirEquivalentes(500);
        System.out.println("El punto medio es: "+calcularPuntoMedio(3,4));  
    }

    public static double calcularArea(double radio) {
        double area = 4 * Math.PI * radio;
        return area;
    }

    public static float calcularVolumen(double radio) {
        float volumen = (float) (4 * Math.PI * Math.pow(radio, 3));

        return volumen;
    }

    public static void imprimirEquivalentes(float pies) {
        float yardas, pulgadas, cms, mts;

        yardas = pies * 3;
        pulgadas = pies * 12;
        cms = pulgadas * 2.54f;
        mts = cms / 100;

        System.out.println("El Equivalente de " + pies + " Pies");
        System.out.println("Yardas: " + yardas);
        System.out.println("Pulgads: " + pulgadas);
        System.out.println("Centimetros: " + cms);
        System.out.println("Metros: " + mts);
    }
    
    public static double calcularPuntoMedio(double x, double y){
        double puntoMedio = (x+y)/2;
        return puntoMedio;
    }
    
}
