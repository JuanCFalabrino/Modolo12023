
package random2804;

import java.util.Random;

 class Random2804 {

    public static void main(String[] args) {
      
        /*
           -Crear un Programa que genere tres números aleatorio comprendido entre 65 y 90

           - Imprimir un número aleatorio 0 a 10

           -Imprimir un numero aleatorio de 1 a 47

           -Imprimir un numero aleatorio de 1 a 47
        */
           Random cualquiera = new Random();
           int a,b,c,d,f,z;
           
           a=cualquiera.nextInt(26)+65;
           b=cualquiera.nextInt(26)+65;
           c=cualquiera.nextInt(26)+65;
           
           System.out.println(a);
           System.out.println(b);
           System.out.println(c);
           
           f=cualquiera.nextInt(11);
           System.out.println("numero Random del 0 al 10 :" +f);
           
           z=cualquiera.nextInt(47)+1;
           System.out.println("numero Random del 1 al 47 :" +z);
           
                   
        
        
        
        
        
        
        
        
    }
    
}
