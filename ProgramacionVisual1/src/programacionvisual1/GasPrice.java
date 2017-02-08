package programacionvisual1;
import java.util.Scanner;
public class GasPrice {
     public static void Precio(double l) {
        double h = (3.5 * l) / 100;
        double j = (4 * l) / 100;
        System.out.println("El precio por barril es de " + l + " entonces el precio por galón va estar entre " + h + " y " + j);
    }
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el valor del barril");
        int precioporBarril=teclado.nextInt();
        Precio(precioporBarril);
    } 
}