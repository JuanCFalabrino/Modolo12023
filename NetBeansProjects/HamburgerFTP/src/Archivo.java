
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Archivo {
    File archivo;
    public void creararchivo(){
        
        
        Date fech1 = new Date();
        SimpleDateFormat sgg = new SimpleDateFormat("ddMMyyyy");
        String fech = sgg.format(fech1);
              
        
        try{
            //crear archivo
            archivo = new File(fech + ".txt");
            if(archivo.createNewFile()){
              JOptionPane.showMessageDialog(null,"El archivo fue creado con exito");
            }
        }catch(IOException e){
           System.out.println(e);
               
        }
        
      
    }
    
    public void escribirarchivo(cpedido cpedido){
        try{
            //escribir el archivo
            FileWriter escribir = new FileWriter(archivo,true);
            escribir.write(cpedido.getCpnom()+","+cpedido.getCptele()+","+cpedido.getCpbebe()+","+cpedido.getCppf()+","+cpedido.getCphb()+"\r\n");
            escribir.close();
        }catch(IOException e){
            System.out.println(e);
        }    
         
    
    }

    
    
    
    
    
}
