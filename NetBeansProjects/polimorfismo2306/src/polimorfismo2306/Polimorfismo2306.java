
package polimorfismo2306;

public class Polimorfismo2306 {

 
    public static void main(String[] args) {
        
        Operaciones_padre MSJ1 = new suma_hija();
        MSJ1.intro();
        MSJ1.pedir_datos();
        MSJ1.Operaciones();
        MSJ1.mostrar();
        Operaciones_padre MSJ2 = new resta_hija();
        MSJ2.intro();
        MSJ2.pedir_datos();
        MSJ2.Operaciones();
        MSJ2.mostrar();
              
        
        
        
        
    }
    
}
