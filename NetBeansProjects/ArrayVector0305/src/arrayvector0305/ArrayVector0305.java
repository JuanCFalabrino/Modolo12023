
package arrayvector0305;

import java.util.Scanner;


public class ArrayVector0305 {

  
    public static void main(String[] args) {
    
    /*
        Crear un vector de cinco posiciones, posteriormente guardar un número en cada una de las posiciones 
        del vector, finalmente imprimir en pantalla cada una de las posiciones para verificar que se hayan 
        guardado los numeros de manera correcta.
    */
     
    //Crear Vector Estatico
    int numero[] = new int[5];
    //Cargar vector
    numero[0]=5;
    numero[1]=220;
    numero[2]=8;
    numero[3]=450;
    numero[4]=22;
    //Recorrer el vector
    System.out.print( "Vector en la posiion 0 vale :" + numero[0]+ " ");
    System.out.print( "Vector en la posiion 1 vale :" + numero[1]+ " ");
    System.out.print( "Vector en la posiion 2 vale :" + numero[2]+ " ");
    System.out.print( "Vector en la posiion 3 vale :" + numero[3]+ " ");
    System.out.println( "Vector en la posiion 4 vale :" + numero[4]+ " ");
    
    //Vector Dinamico
     //Creae vector 
     int digitos [] = new int[5];
     //cargar vector 
     for (int i=0;i<digitos.length;i++)
     {
         digitos [i] = i+10;
     
     }
     //recorrer vector y mostrarlo
      for (int i=0;i<digitos.length;i++)
     {
         System.out.println( "Vector en la posiciòn " + i + " vale : " + digitos[i]);
     
     }
      
     //Ejercicio Libreria 
     //crrear vectores y cargarle informacion
     String utiles [] = {"Lapicera","Cuaderno","Cartuchera","Mochila"}; 
     double precios[] = {40.5,139.99,560.50,1399.99}; 
     
     //Mostrar listado de utiles
     System.out.println("-----------------------------------------------");
     System.out.println("------Bienvenido a Libreria LA GOMA LOCA-------");
     System.out.println("------       Listado de OFERTAS         -------");
     System.out.println("-----------------------------------------------");
     
     for (int i=0;i<utiles.length;i++){
       System.out.println("---- " + utiles[i] + " $" + precios[i] + "----");
     }
         
     System.out.println("-----------------------------------------------"); 
    
    //Buscador de vector
      //Variables y objeto
        String nom="";
        Scanner leer = new Scanner(System.in);
      //crear vector 
        String [] nombres = new String [5];
      //Carga de vector
        nombres [0] = "Juan";
        nombres [1] = "Pedro";
        nombres [2] = "Guido";
        nombres [3] = "Pablo";
        nombres [4] = "Roberto"; 
      //Ingrese nombre para buscar en el vector 
        System.out.println("Ingrese un nombre para buscar en el vector : ");
        nom = leer.next();
        
        for(int n=0;n<nombres.length;n++){
           if(nom.equals(nombres[n])){
               System.out.println("El dato esta en mi vector y es el numero " +n);
            }else {
               System.out.println("El dato ingresado no esta en el vector " );
           }  
                
            
        }
        
        
    
    
    
    
    }
    
}
