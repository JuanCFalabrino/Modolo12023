
package cargarunamatrizdinamica;

import java.util.Scanner;


public class Cargarunamatrizdinamica {
 
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        
        Scanner consola = new Scanner(System.in);
        
     //cargar matriz dinamica con usuario  
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
            System.out.print("Introduzca un numero a la matriz[" + x + "," + y + "]  ");
            matriz[x][y] = consola.nextInt();
        }
        }
    // mostrar matriz         
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
            System.out.println ("[" + x + "," + y + "] = " + matriz[x][y]);
            }
        }
        
              
    }
    
}
