package programacionvisual1;
import java.util.Scanner;
public class TestSandwich {
       public static void main(String[]args){
        String ingredientes;
        String pansito;
        Double costo=0.0;
        ingredientes= jessy();
        pansito=jessyen();
        costo=buy(ingredientes, pansito);
        System.out.println(+costo);  
    }    
    public static Double buy(String a, String b){
        Double panx=0.0;
        Double elementosx=0.0;
        Double result=0.0;
        switch(a){
            case "Pollo":
                elementosx=3.0;
                break;
            case "Jamon":
                elementosx=1.8;
                break;
            case "Queso":
                elementosx=2.5;
                break;
            case "Res":
                elementosx=4.2;
                break;
        } switch (b){
            case "Coburgo":
                panx=5.9;
                break;
            case "stottie":
                panx=3.2;
                break;
            case "Baguette":
                panx=2.0;
               break;
            case "ciabatta":
                panx=8.5;
                break;
        } result= panx+elementosx; 
        return result;
    }  public static String jessy(){
        Scanner teclado=new Scanner(System.in);
        String elementos;
        System.out.println("Sandwiches de 1.-Pollo 2.-Jamon 3.-Queso 4.-Carne");
        elementos=teclado.nextLine();
        return elementos;
    } public static String jessyen(){
        Scanner teclado=new Scanner(System.in);
        String pan;
        System.out.println("Sandwiches de 1.-Coburg 2.-stottie\n baguette\n ciabatta");
        pan=teclado.nextLine();
        return pan;
    }
}