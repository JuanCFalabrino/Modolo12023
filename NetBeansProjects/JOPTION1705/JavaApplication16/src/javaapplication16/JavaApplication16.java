
package javaapplication16;

import javax.swing.ImageIcon;
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
      
    //pedir numeros enteros 
    int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad  ","INPUT"));
    //mostrar numeros
    JOptionPane.showMessageDialog(null,"La edad es de  " + numero ,"DATOS DEL TIPITO",JOptionPane.WARNING_MESSAGE);
        
    
    //Mensaje con ICONO
    ImageIcon BIEN = new ImageIcon("src/Imagenes/bien.png");
    JOptionPane.showMessageDialog(null,"MUY BIEN", "Posistivo",JOptionPane.INFORMATION_MESSAGE,BIEN);
    
    
    //Ejemplo de tabular en joptionpane
    ImageIcon ALU = new ImageIcon("src/Imagenes/alumno.png");
    String nombre2 = JOptionPane.showInputDialog(null,"Ingrese su nombre ","Nombre");
    String apellido = JOptionPane.showInputDialog(null,"Ingrese su Apellido ","Apellido");
    String telefono = JOptionPane.showInputDialog(null,"Ingrese su nombre ","TELEFONO");
    
    JOptionPane.showMessageDialog(null,"\nDATOS DEL USUARIO\n" + "Nombre: " + nombre2 + "\nApellido: " + apellido + "\nTelefono: " + telefono,"Datos del Alumno",JOptionPane.INFORMATION_MESSAGE, ALU);
    }   
    
    
    
    
}
