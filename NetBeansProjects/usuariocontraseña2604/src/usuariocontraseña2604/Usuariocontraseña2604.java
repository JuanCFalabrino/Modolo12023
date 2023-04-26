
package usuariocontraseña2604;

import java.util.Scanner;


public class Usuariocontraseña2604 {

    /**
     Solicitar usuario y contraseña hasta que sean correctos.

           Usuario: sapo
          Password: pepe

     */
    public static void main(String[] args) {
       // variables y objetos
       String usuario="pepe";
       int contador=0;
       Scanner leer = new Scanner(System.in);
       
       System.out.print("Ingresa tu nombre de Usuario :");
       usuario = leer.nextLine();
       
       while(contador<=3){
       if(usuario.equals("pepe")){
       System.out.println("Inicio de Sesion correcto");
       
       }else {
       System.out.println("Inicio de Sesion Incorrecto");
       }
       
       contador++; 
       }
             
    }
    
}
