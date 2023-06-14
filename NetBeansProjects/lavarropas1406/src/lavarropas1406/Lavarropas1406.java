
package lavarropas1406;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Libreria.Funciones;

public class Lavarropas1406 {

    public static void main(String[] args) {
       ImageIcon inicio = new ImageIcon("src/imagenes/lavar.png");
       ImageIcon color =  new ImageIcon("src/imagenes/color66.png");
       ImageIcon peso =  new ImageIcon("src/imagenes/peso.png");
       
       
        JOptionPane.showMessageDialog(null, 
                "Bienvenido a tu Lavarropas",
                "DREAN Modelo -  ORDER 66",
                JOptionPane.INFORMATION_MESSAGE,
                inicio);
        
        int tipoderopa = JOptionPane.showOptionDialog(null,
               "Por favor seleccione el tipo de ropa que va a lavar",
               "Tipo de Ropa",
               JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE,color,
               new Object []{"Color", "Blanca" },"Color");        
        
        String peso2 = (String) JOptionPane.showInputDialog (null,
                "Ingrese en entero un peso aproximado de la ropa ingresada",
                "Peso de la ropa",
                JOptionPane.QUESTION_MESSAGE,
                peso,
                null,
                "");
                
        int  kilos = Integer.parseInt(peso2);   
        
        Funciones MSG = new Funciones(kilos,tipoderopa);
       
        MSG.ciclofinalizado();
              
        
        
    }
    
}
