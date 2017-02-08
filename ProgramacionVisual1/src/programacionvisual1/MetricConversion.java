package programacionvisual1;
import java.util.Scanner;
public class MetricConversion {
    public static void pulgadacent(int a){
        Double centimetro=a*2.54;
        System.out.println("Hay "+centimetro+" centímetros en "+a+" pulgadas");
    } public static void galalit(int a){
        Double lirot=a*3.7854;
        System.out.println("Hay "+lirot+" litros en "+a+" galones");
    } public static void main(String[]args){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduzca un valor entero");
        int numero=teclado.nextInt();
        pulgadacent(numero);
        galalit(numero);
    }
}