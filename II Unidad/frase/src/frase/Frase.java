
package frase;

import java.util.Scanner;

public class Frase {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String frase;
        
        System.out.print("Ingrese un frase: ");
        frase = entrada.nextLine();
        
        int a=0,e=0,i=0,o=0,u=0;
        
        for(int j=0;j<frase.length();j++){
            if(frase.charAt(j)=='a'){ //charArt va corriendo el vector de letra en letra
              a++;
            }
            if(frase.charAt(j)=='e'){ //charArt va corriendo el vector de letra en letra
              e++;
            }
            if(frase.charAt(j)=='i'){ //charArt va corriendo el vector de letra en letra
              i++;
            }
            if(frase.charAt(j)=='o'){ //charArt va corriendo el vector de letra en letra
              o++;
            }
            if(frase.charAt(j)=='u'){ //charArt va corriendo el vector de letra en letra
              u++;
            }
        }
        
        System.out.println("frase: "+frase);
        System.out.println("Vocal a: "+a);
        System.out.println("Vocal e: "+e);
        System.out.println("Vocal i: "+i);
        System.out.println("Vocal o: "+o);
        System.out.println("Vocal u: "+u);
        
    }
    
}
