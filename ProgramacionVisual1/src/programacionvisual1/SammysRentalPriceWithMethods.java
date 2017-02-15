package programacionvisual1;
import  java.util.Scanner;
public class SammysRentalPriceWithMethods {
    public static void main(String[]args){
        int T=Tiempo();
        Mute();
        costo(T);
    }
     public static void costo(int z){
        int horas=z/60;
        z=z%60;
        double Precio=215.00;
        double resultado=horas*Precio + (Precio/40)*z;
        System.out.println("Costo por hora "+Precio+"dolares");
        System.out.println("Tiempo de la renta"+horas+" horas"+z+" minutos");
        System.out.println("Tu costo total sera de "+resultado);
         
    }
    public static int Tiempo(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("El tiempo que necesitas para rentar (minutos): ");
        int f=teclado.nextInt();
        return f;
    }
    public static void Mute(){
        System.out.println("Las mejores playas");
    }
}