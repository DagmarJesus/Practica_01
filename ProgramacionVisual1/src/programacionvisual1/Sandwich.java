package programacionvisual1;
public class Sandwich {
    private String ing;
    private String pan;
    private Double costo;
    public String getPan(){
        return pan; 
    }
    public void setPan(String A){
        this.pan=A;
    }
    public Double getPrecio(){
        return costo; 
    }
    public void setPrecio(Double f){
        this.costo=f;
    }
    public String getIngrediente(){
        return ing; 
    }
    public void setIngredientes(String s){
        this.ing=s;
    }
}