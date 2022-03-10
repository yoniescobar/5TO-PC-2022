
package cinconumeros;


public class CincoNumeros {

    public static void main(String[] args) {
       int a=0,b=0,c=0,d=0,e=0,f=0,n1,n2,n3,n4,n5;
       
     
       n1=5;
       n2=4;
       n3=3;
       n4=2;
       n5=1;
       
      if((n1>n2 && n2>n3)&&(n3>n4 && n4>n5)){
         a=n1;
         if((n2>n3&&n2>n4 && n2>n5)){
          b=n2;
         }else if((n3>n2)&&(n3>n4)&&(n3>n5)){
          c=n3;
         }
         
         
          System.out.println(a);
          System.out.println(b);
          System.out.println(c);
          System.out.println(d);
          System.out.println(e);
          System.out.println(f);
         
         
      }
       
       
       
       
       
    }
    
}
