
package compararnumeros;

public class CompararNumeros {

    public static void main(String[] args) {
       
        int n1=1000,n2=80,n3=630,mayor=0,medio=0,menor=0;
        
        if((n1>n2)&&(n1>n3)){
            mayor = n1;
            if(n2>n3){
                medio=n2;
                menor=n3;
            }else if(n3>n2){
                medio =n3;
                menor=n2;
            }
        }
        
         if((n2>n1)&&(n2>n3)){
            mayor = n2;
            if(n1>n3){
                medio=n1;
                menor=n3;
            }else if(n3>n1){
                medio =n3;
                menor=n1;
            }
        }
         
         if((n3>n1)&&(n3>n2)){
            mayor = n3;
            if(n1>n2){
                medio=n1;
                menor=n2;
            }else if(n2>n1){
                medio =n2;
                menor=n1;
            }
        }
        
        System.out.println("Forma Ascendente: "+menor+" - "+medio+" - "+mayor);
        System.out.println("Forma Descendente: "+mayor+" - "+medio+" - "+menor);
        
        
    }
    
}
