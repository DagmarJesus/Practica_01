/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionvisual1;
import java.util.Scanner;
public class PaintCalculator {
       public static void main(String[]args){
        Scanner teclado=new Scanner(System.in); 
        Double precio;
        System.out.println("Longitud: ");
        Float longitud= teclado.nextFloat();
        System.out.println("Anchura: ");
        Float anchura= teclado.nextFloat();
        System.out.println("Altura: ");
        Float altura= teclado.nextFloat();
        precio=AreaPr(longitud, anchura, altura);
        System.out.println("El costo de tu espacio es "+precio+"dolares");
    }
    public static Double AreaPr(Float A, Float B, Float C){
        Float AREA=(C*B)+(A*C);
        Float galones=Wgalon(AREA);
        System.out.println("Necesitas"+galones+" Galones");
        Double precio=(Math.ceil(galones))*32;
        return precio;
    }
    public static Float Wgalon(Float x){
        Float cantidad=x/350;
        return cantidad;
    }
 
}