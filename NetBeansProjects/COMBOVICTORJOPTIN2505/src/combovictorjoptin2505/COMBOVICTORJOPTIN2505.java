
package combovictorjoptin2505;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class COMBOVICTORJOPTIN2505 {

  
    public static void main(String[] args) {
       ImageIcon color =new ImageIcon("src/Imagenes/color.png");
       
        String [] colores = {"","rojo","negro","amarillo","azul"};
        
        String opcion = (String) JOptionPane.showInputDialog(null,"Seleccione un color ", "Hay que Elegir",JOptionPane.QUESTION_MESSAGE,color,colores,colores[0]);
        
        System.out.println("El color seleccionado es :  " + opcion);
        
        
        
        
        
        
        
        
        
    }
    
}
