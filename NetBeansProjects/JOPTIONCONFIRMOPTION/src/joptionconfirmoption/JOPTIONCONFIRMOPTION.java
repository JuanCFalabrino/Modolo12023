
package joptionconfirmoption;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOPTIONCONFIRMOPTION {

 
    public static void main(String[] args) {
      
      //INPUT COnfirm yes/no
      int resp =JOptionPane.showConfirmDialog(null, " Usasa mucho el JOPtion?");
         if(JOptionPane.OK_OPTION == resp){
           System.out.println("Perfecto");
         } else {
             System.out.println(" No Perfecto");
         
         }
      //input de OPCIONES 
      ImageIcon Icon = new ImageIcon("img/bien.png"); 
      int seleccion = JOptionPane.showOptionDialog(null, 
            "Seleccione Una Opciòn ",
            "Seleccion Multiple",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon,
            new Object[]{"Juan","Pedro","Pablo","Adam"},"Juan");
      
      switch(seleccion){
             case 0: JOptionPane.showMessageDialog(null,"Selecciono a JUAN");
              break;
              
             case 1: JOptionPane.showMessageDialog(null,"Selecciono a Pedro");
              break;
              
             case 2: JOptionPane.showMessageDialog(null,"Selecciono a Pablo");
              break;
              
             case 3: JOptionPane.showMessageDialog(null,"Selecciono a Adam");
              break;
             
             default:
              
      
      }
              
              
           
      
      
      
      
      
      
      
      
        
        
        
    }
    
}
