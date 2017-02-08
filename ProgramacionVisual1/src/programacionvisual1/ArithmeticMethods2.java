/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionvisual1;
import java.util.Scanner;
/**
 *
 * @author W7
 */
public class ArithmeticMethods2 {
    private Integer entero1; 
    private Integer entero2;
    
public void setentero1(int h){
    entero1=h;
}
public int getentero1 (){
    return entero1; 
}
public void setentero2(int j){
    entero1=j;
}
public int getentero2 (){
    return entero2; 
}
public int displayNumbrePlus10(){
    return entero1+entero2+10;
}
public int displayNumbrePlus100(){
    return entero1+entero2+100;
}
public int displayNumbrePlus1000(){
    return entero1+entero2+1000;
}
    public static void main(String args[]){
        int entero1,entero2;
        Scanner s=new Scanner(System.in);
        entero1=s.nextInt();
        entero2=s.nextInt();
        
    }

}
