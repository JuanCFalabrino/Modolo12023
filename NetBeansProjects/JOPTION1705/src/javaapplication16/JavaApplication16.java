
package javaapplication16;

import javax.swing.JOptionPane;


public class JavaApplication16 {

 
    public static void main(String[] args) {
        
    String nombre ;
    
       
    //Mensaje JOPTION
    JOptionPane.showMessageDialog(null,"Este es un mensaje de Informacion","Mensaje de Informacion",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"Este es un mensaje de Alerta","Mensaje de Alerta",JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog(null,"Este es un mensaje de Error","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
    JOptionPane.showMessageDialog(null,"Este es un mensaje de pregunta","Mensaje de Pregunta",JOptionPane.QUESTION_MESSAGE);

    //input de JOPTION
    nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre ","INPUT",JOptionPane.QUESTION_MESSAGE);
    //mostrar nombre del tupito
    JOptionPane.showMessageDialog(null,"El nombre del tipito es " + nombre ,"DATOS DEL TIPITO",JOptionPane.WARNING_MESSAGE);
        
        
    }
    
}
