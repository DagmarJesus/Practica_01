package programacionvisual1;
import java.util.Scanner;
public class Percentages2 {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dame un número");
        Double numero1=teclado.nextDouble();
        System.out.println("Dame otro número");
        Double numero2=teclado.nextDouble();
        Porcentajecomputador(numero1, numero2);
        Porcentajecomputador(numero2, numero1); 
}
    public static void Porcentajecomputador(Double a, Double b){
        Double porcent=(b*100)/a;
        System.out.println(b+" es el "+porcent+"% de "+a);
    }
    
}