
package programacionvisual1;
import java.util.Scanner;
public class Interest {
     public static Float jijitl(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese su primera cantidad de inverison");
        Float inversion=teclado.nextFloat();
        return inversion;
    }
    public static Float aps(Float h){
        Float j=h+((5*h)/100);
        return j;
    }
    public static void main(String[]args){
        Float inv=jijitl();
        Float resultado=aps(inv);
        System.out.println("Al cabo de un año tendrás "+resultado);
        
    }
    
   
}