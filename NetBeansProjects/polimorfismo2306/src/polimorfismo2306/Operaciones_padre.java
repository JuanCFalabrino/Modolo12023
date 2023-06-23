
package polimorfismo2306;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public abstract class Operaciones_padre {
    protected int valor1,valor2,valor3,resultados;
    ImageIcon intro = new ImageIcon("src/imagen/intro.png");
    ImageIcon icon = new ImageIcon("src/imagen/intro2.png");
    
      public void intro(){
        
            //Metodo para pedir valores
            JOptionPane.showMessageDialog(null,
                "Podra realizar las operaciones de suma y resta con Polimorfismo",
                "Bienvenidos a Calculin",
                JOptionPane.INFORMATION_MESSAGE,intro);
              }
      
      public void pedir_datos(){
             String v1 = (String) JOptionPane.showInputDialog(null, 
                    "Ingrese el primer valor",
                    "Calculin suma y resta",
                    JOptionPane.QUESTION_MESSAGE,
                    icon,
                    null,
                    "");
      
             String v2 = (String) JOptionPane.showInputDialog(null, 
                    "Ingrese el segundo valor",
                    "Calculin suma y resta",
                    JOptionPane.QUESTION_MESSAGE,
                    icon,
                    null,
                    "");
             
             valor1 = Integer.parseInt(v1);
             valor2 = Integer.parseInt(v2);
       }
    
      public abstract void Operaciones();
      
      
      public void mostrar(){
         JOptionPane.showMessageDialog(null,
                "El resultado de la operacion fue : " + resultados,
                "Resultados de la Operaciòn ",
                JOptionPane.INFORMATION_MESSAGE,intro);
              }
            
      
      }
    
    
    
