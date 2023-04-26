
package metodosssl;

import java.util.Scanner;

public class MetodosSSL {

   
    public static void main(String[] args) {
        //variables y objeto
        int cantidaddecaracteres,desde,hasta;
        String nombre,apellido,apellidocortado;
        Scanner leer = new Scanner(System.in);
        Scanner leernumeros = new Scanner(System.in);
        //pedir informacion 
        System.out.print("Ingrese su nombre : ");
        nombre = leer.next();
        
        //Metodo length
        cantidaddecaracteres = nombre.length();
        //mostrar cvaracteres
        System.out.println("Usted ingreso la palabra  " + nombre );
        System.out.println("La cantidad de caracteres que tiene es " + cantidaddecaracteres);
        
        //pedir apellido
        System.out.print("Ingrese su apellido: ");
        apellido = leer.next();
        System.out.print("Ingrese el desde donde se debe cortar el string :");
        desde = leernumeros.nextInt();
        System.out.print("Ingrese el hasta donde se debe cortar el string :");
        hasta = leernumeros.nextInt();
        
        
        //Metodo Substring
        apellidocortado = apellido.substring(desde,hasta);
        System.out.println("Su palabra cortada quedo : " + apellidocortado);
        
        
        
    }
    
}
