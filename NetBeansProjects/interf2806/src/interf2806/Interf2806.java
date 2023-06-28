
package interf2806;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Interf2806 extends JFrame {
    private JLabel etiq;
    
   
    public Interf2806 (){
        //indicar con coordenadas la ubicacion del form
        setLayout(null);
        
    //Crear la etiqueta 
        //mensaje de etiqueta
        etiq = new JLabel("HOLA Etiqueta");
        //ubicaciòn x , y , ancho , alto
        etiq.setBounds(50,100,50,50);
      //etiq.setHorizontalAlignment(JLabel.CENTER);
        add (etiq);
          
    }
    
    public static void main(String[] args) {
        
        Interf2806 ford = new Interf2806();
        ford.setBackground(Color.yellow);
        //tamaño
        ford.setBounds(0,0,500,500);
        //hacer visible formulario
        ford.setVisible(true);
        
        //centrar formualio
        ford.setLocationRelativeTo(null);
        //permitir la edicion del tamaño
        ford.setResizable(false);
        //titulo
        ford.setTitle("Saludos");
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}
