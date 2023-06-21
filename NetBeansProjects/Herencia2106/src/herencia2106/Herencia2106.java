
package herencia2106;
import Operaciones.ChijaResta;
import Operaciones.ChijaSuma;



public class Herencia2106 {

    public static void main(String[] args) {
      
        ChijaSuma msjS = new ChijaSuma();
        msjS.PedirDatos();
        msjS.Suma();
        msjS.MostrarResultados();
        
        ChijaResta msjR = new ChijaResta();
        msjR.PedirDatos();
        msjR.Resta();
        msjR.MostrarResultados();
        
                
        
    }
    
}
