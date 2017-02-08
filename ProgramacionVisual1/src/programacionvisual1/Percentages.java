
package programacionvisual1;
public class Percentages {
  public static void porcentajecomputadora(double numero1, double numero2) {
        double porcentaje = (numero2 * 100) / numero1;
        System.out.println(numero2 + " es el " + porcentaje + " porcentaje de " + numero1);
  }  
  public static void main(String args[]){
        double entero1=2.0, entero2= 5.0 ;
        porcentajecomputadora (entero1, entero2);
       porcentajecomputadora (entero2, entero1);
    }
}

    
