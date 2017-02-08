package programacionvisual1;
public class Student {
     private String iden;
    private Integer cred;
    private Integer points;
     public void setCredh(Integer crede){
        this.cred=crede;
    }
     public Integer getPuntitos(){
        return points; 
    }
    public void setPoints(Integer puntos){
        this.points=puntos;
    }
   public Integer Promedio(){
       return points/cred;
   }
     public String getIden(){
        return iden; 
    }
    public void setIden(String numerito){
        this.iden=numerito;
    }
     public Integer getCredh(){
        return cred; 
    }
   
}