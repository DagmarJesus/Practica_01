package programacionvisual1;
import java.util.Scanner;
public class Insurance { 
    public static int Prima(int A, int B) {
        Integer imp = (((A - B) / 10) + 15) * 20;
        return imp;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el año en el que estamos");
        int añoactual= teclado.nextInt();
        System.out.println("Introduzca su año de nacimiento");
        int añonacimiento= teclado.nextInt();
        int imp = Prima(añoactual, añonacimiento);
        System.out.println("El importe total es: " + imp);
    }

}