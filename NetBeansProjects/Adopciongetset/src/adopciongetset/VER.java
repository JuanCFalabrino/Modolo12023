
package adopciongetset;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class VER {
     Perro animal = new Perro();
    public void ver(){
     ImageIcon animales = new ImageIcon("src/imagenes/animales.png");
      JOptionPane.showMessageDialog(null, 
                " Bienvenido Venterinaria El Wookie  " + 
                "\n Nombre del perro antes de la adopción  :" + animal.getNombre() +
                "\n Raza antes de la adopción              :" + animal.getRaza() +
                "\n Edad antes de la adopción              :" + animal.getedad() ,
                "Veterinaria El Wookie",
                JOptionPane.INFORMATION_MESSAGE,
                animales);
    
    }
    public void veradoptado(){
       ImageIcon animales = new ImageIcon("src/imagenes/animales2.png");
        animal.setNombre("Simon");
        animal.setRaza("Callejero");
        animal.setedad(20);
        
          JOptionPane.showMessageDialog(null, 
                " Bienvenido Venterinaria El Wookie  " + 
                "\n Nombre del perro antes de la adopción  :" + animal.getNombre() +
                "\n Raza antes de la adopción              :" + animal.getRaza() +
                "\n Edad antes de la adopción              :" + animal.getedad() ,
                "Veterinaria El Wookie",
                JOptionPane.INFORMATION_MESSAGE,
                animales);
    
    }
    
    
}
