
package adopciongetset;


public class Perro {
    private String nombre="tomy";
    private String raza="Chiguagua";
    private int edad=10;
        
    public void setNombre (String valor){
        this.nombre=valor;
    
    }
    public String getNombre (){
        return nombre;
    }
     public void setRaza (String valor2){
        this.raza=valor2;
    
    }
    public String getRaza (){
        return raza;
    }
      public void setedad (int valor3){
        this.edad =valor3;
    
    }
    public int getedad(){
        return edad;
    }
    
    public void ladrar(){
        System.out.println("GUAU");
    
    }
    
    
     
        
}
