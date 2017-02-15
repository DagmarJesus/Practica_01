package programacionvisual1;
import java.util.Scanner;
public class BankAccount {
    private String[] nombre;
    private Integer cuenta;
    private Double balanceo;
    
public void setNombre(String[] r){
    nombre=r;
}    
public String[] getname(){
    return nombre;
}
public void setCuenta(Integer j){
    cuenta=j;
}    
public Integer getCuenta(){
    return cuenta;
}
public void setBalanceO(Double l){
    balanceo=l;
}    
public Double getBalanceO(){
    return balanceo;
}
public Double deduccion(Double hj){
    return hj-4.00;
}
public void planteacion(){
    System.out.println("La cuota se reducira al mes $4");
     
}
public BankAccount(String a,Integer b, Double c){
     
}   
 public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     System.out.println("Cual es tu nombre? ");
     String nombrecito=teclado.next();
     System.out.println("Cuenta del Cliente");
     int cuentita=teclado.nextInt();
     System.out.println("Ultimo Balance");
     double balances=teclado.nextDouble();
     System.out.println("The balance is :"+Metodito.deduccion() );
     Metodo.planteacion();
 }
     
}