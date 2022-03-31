
package añobiciesto;
import java.util.Scanner;

public class AñoBiciesto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int anio;
        
        System.out.print("Ingrese un año: ");
        anio = entrada.nextInt();
        
        if( (anio % 4==0) && ((anio % 100!=0 )) || (anio % 400 ==0)  ){
            System.out.println("El año : "+anio+" es Bisiesto");
        }else{
            System.out.println("El año : "+anio+" NO es Bisiesto");
        }
        
    }
    
}
