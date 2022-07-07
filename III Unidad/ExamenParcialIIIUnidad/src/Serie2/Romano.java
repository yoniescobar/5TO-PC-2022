
package Serie2;

public class Romano {
    
    void convertirRomano(int numero){ // 2   3    5
        //aqui va el algoritmo para convertir a romano
        
        int unidades,decenas,centenas, millares;
        
        unidades=numero%10; numero/=10;
        decenas=numero%10; numero/=10;
        centenas = numero%10; numero/=10;
        millares = numero%10; numero/=10;
        
        System.out.println("En Número Romano es: ");
        switch(millares){
            case 1: System.out.print("M"); break;
            case 2: System.out.print("MM"); break;
            case 3: System.out.print("MMM"); break;
        }
        switch(centenas){
            case 1: System.out.print("C"); break;
            case 2: System.out.print("CC"); break;
            case 3: System.out.print("CCC"); break;
            case 4: System.out.print("CD"); break;
            case 5: System.out.print("D"); break;
            case 6: System.out.print("DC"); break;
            case 7: System.out.print("DCC"); break;
            case 8: System.out.print("DCCC"); break;
            case 9: System.out.print("CM"); break;
        }
         switch(decenas){
            case 1: System.out.print("X"); break;
            case 2: System.out.print("XX"); break;
            case 3: System.out.print("XXX"); break;
            case 4: System.out.print("XL"); break;
            case 5: System.out.print("L"); break;
            case 6: System.out.print("LX"); break;
            case 7: System.out.print("LXX"); break;
            case 8: System.out.print("LXXX"); break;
            case 9: System.out.print("XC"); break;
        }
         
         switch(unidades){
            case 1: System.out.print("I"); break;
            case 2: System.out.print("II"); break;
            case 3: System.out.print("III"); break;
            case 4: System.out.print("IV"); break;
            case 5: System.out.print("V"); break;
            case 6: System.out.print("VI"); break;
            case 7: System.out.print("VII"); break;
            case 8: System.out.print("VIII"); break;
            case 9: System.out.print("IX"); break;
        }
        
        
    }
}
