
package leyendodatos1204;

import java.util.Scanner;



public class LeyendoDatos1204 {
    
  
 
    public static void main(String[] args) {
        
        //variables
        int num;
        int dos;
        int nac;
        String nombre;
        String apellido;
        
        //crear objeto Sacanner
        Scanner lector = new Scanner(System.in);
        
        //ejercicio pedir un dato 
        //pedir numero en pantalla
        //System.out.print("ingrese un numero : ");
        //Lo que pedis en pantalla guardalo en la variable num
        //num = lector.nextInt();
        //operacion 
        //dos = num * 2;
        //imprimir el resultado en pantalla
        //System.out.println("El resultado es : " + dos);
        
       //ejercicio pedir mas datos del usuario
       //pedir datos
       System.out.print("Ingrese su nombre: ");
       nombre = lector.nextLine();
       System.out.print("Ingrese su apellido: ");
       apellido = lector.nextLine();
       System.out.print("Ingrese el año de su nacimeinto: ");
       nac = lector.nextInt();
       
       System.out.println("Bienvenido " + nombre + "   " + apellido );
        
    }
    
}
