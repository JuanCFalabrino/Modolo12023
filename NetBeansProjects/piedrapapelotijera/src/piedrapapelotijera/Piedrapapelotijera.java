
package piedrapapelotijera;

import java.util.Random;
import java.util.Scanner;


public class Piedrapapelotijera {

    
    
    public static void main(String[] args) {
       
        //Obejetos y Variables
        Scanner leer = new Scanner(System.in);
        String resp1="";
        String resp2="";
        int numerorandom;
        String jugador1="R2D2";
        String jugador2="";
        Random RD =new Random();
        //numero random
        numerorandom = RD.nextInt(3)+1;
        
        //Inicio del Juego
        System.out.println("-----------------------------------");
        System.out.println("Bienvenidos a Piedra Papel o Tijera");
        System.out.println("-----------------------------------");
        //pedir al tipito nombre
        System.out.print("Ingrese su nombre : ");
        jugador1 =leer.next();
        // dar inicio al juego
        System.out.println("-----INICIO DEL JUEGO------");
        System.out.println("---La P es Piedra ---------");
        System.out.println("---La L es Papel  ---------");
        System.out.println("---La T es Tijera ---------");
        
        //pedir al jugador que ingrese la opcion
        System.out.print("\nINTRODUCIR LA OPCION P/L/T\n"+ jugador1+ ":");
        resp1=leer.next();
        
        //numero en letras
        
        switch(numerorandom){
            case 1:resp2="P";
               break;
            case 2:resp2="T";
               break;
            case 3:resp2="L";
                break;          
          }
        
        System.out.println("\nLa OPCION DE R2D fue :" +resp2 );
        
        //logica del juego
        
        if(resp1.equals("P") && resp2.equals("P")){
            System.out.println("\nEMPATE!!!\n");
        }
        
         if(resp1.equals("P") && resp2.equals("L")){
            System.out.println("\nGANADOR\n"+ jugador2 + "\n");
        }
        
         if(resp1.equals("P") && resp2.equals("T")){
            System.out.println("\nGANADOR\n"+ jugador1 + "\n");
        }
        
          if(resp1.equals("L") && resp2.equals("L")){
           System.out.println("\nEMPATE!!!\n");
        }
            if(resp1.equals("L") && resp2.equals("P")){
           System.out.println("\nGANADOR\n"+ jugador1 + "\n");
        }
           if(resp1.equals("L") && resp2.equals("T")){
           System.out.println("\nGANADOR\n"+ jugador2 + "\n");
        }
             if(resp1.equals("T") && resp2.equals("T")){
             System.out.println("\nEMPATE!!!\n");
        }
             if(resp1.equals("T") && resp2.equals("P")){
            System.out.println("\nGANADOR\n"+ jugador2 + "\n");
        }
            if(resp1.equals("T") && resp2.equals("L")){
            System.out.println("\nGANADOR\n"+ jugador1 + "\n");
        }
        
        System.out.println("GRACIAS POR PARTICIPAR");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
