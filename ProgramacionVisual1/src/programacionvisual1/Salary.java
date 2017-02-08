package programacionvisual1;
import java.util.Scanner;
public class Salary {
     public static Double Pagoextras(Float x, Float y, Float z){
        Double paguito=(y*x)+(z*(x*1.5));
        return paguito;
     } public static void main (String[]args){
        Scanner teclado= new Scanner (System.in);
        System.out.println("Cuanto te pagan por trabajar una hora?");
        Float paghora= teclado.nextFloat();
        System.out.println("Cuantas horas trabajaste esta semana?");
        Float horasri=teclado.nextFloat();
        System.out.println("Cuantas horas extras trabajaste en la semana?");
        Float horasemanal=teclado.nextFloat();
        Double total=Pagoextras(paghora, horasri, horasemanal);
        System.out.println("Esta semana cobrarás en total: "+total);
    }
}
