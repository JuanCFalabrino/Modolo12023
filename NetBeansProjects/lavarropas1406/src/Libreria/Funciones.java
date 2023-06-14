
package Libreria;


public class Funciones {
    
    private int kilos =0 , llenadoCompleto= 0,TipoDeRopa = 0,LavadoCompleto = 0,SecadoCompleto =0;
   
    //contrustor 
    public Funciones (int kilos,int tipoderopa){
        this.kilos = kilos;
        this.TipoDeRopa = tipoderopa;
    }
    
    //metodos
    private void llenado(){
        if(kilos <= 12 ){
            llenadoCompleto = 1;
            System.out.println("Llenado......");
            System.out.println("Llenado Completo");             
        } else {
            System.out.println("La carga para este modelo es mucha, saque ropa por favor");
        
        }
    
    }
    private void lavado(){
        llenado();
            if (llenadoCompleto == 1){
                if(TipoDeRopa == 0){
                    System.out.println("Ropa Blanca - Lavado SUAVE ");
                    System.out.println("Lavando.....");
                    LavadoCompleto = 1;
                } else if (TipoDeRopa == 1 ) {
                    System.out.println("Ropa Color - Lavado Intenso ");
                    System.out.println("Lavando....");
                    LavadoCompleto = 1;
                }
    }
          }
        
    private void secado(){
        lavado();
        if (LavadoCompleto == 1){
            System.out.println("Secando.....");
            System.out.println("SECO");
            SecadoCompleto = 1;       
        }
        
    
    }
    public void ciclofinalizado(){
        secado();
        if (SecadoCompleto ==1) {
              System.out.println("Tu ropa esta lista para usar");
        }
              
    
    }
    
    
    
}
