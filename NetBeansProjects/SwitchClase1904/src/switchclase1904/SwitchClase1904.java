
package switchclase1904;

import java.util.Scanner;

public class SwitchClase1904 {

    public static void main(String[] args) {
        //Variables 
        int dias;
        String mes = "";
        
        //objeto Scanner
        Scanner leerdia = new Scanner(System.in);
        Scanner leermes = new Scanner(System.in);
        
        System.out.println("------Dìas de la Semana--------");
        System.out.println("-------------------------------");
        System.out.println("------1 Lunes -----------------");
        System.out.println("------2 Martes ----------------");
        System.out.println("------3 Miercoles -------------");
        System.out.println("------4 Jueves ----------------");
        System.out.println("------5 Viernes----------------");
        System.out.println("------6 Sabado-----------------");
        System.out.println("------7 Domingo----------------");
        System.out.println("-------------------------------");
        System.out.println("-¿Que dia es hoy de la semana?-");
        dias = leerdia.nextInt();
        
        //Logica del switch
        switch (dias)
        {
            case 1:
                System.out.println("Demasiado lunes no pienses en los dìas que falta ");
            break;
            case 2:
                System.out.println("Hoy tendras un hermoso dia si no es 13  ");
            break;    
            case 3:
                System.out.println("Llegaste a la mitead, vamos que falta menos");
            break;    
            case 4:
                System.out.println("Solo un dia mas y luego no importa mas nada");
            break;    
            case 5:
                System.out.println("Despues del medio dia no importa nada màs ");
            break;    
            case 6:
                System.out.println("Disfrutalo desde las 00 a las 2355");
            break;
            case 7:
                System.out.println("Despues del mediodia se termina el encanto y aparece la sombra del lunes ");
            break;
            default:
                System.out.println("Solo hay 7 dias en la semana no pidas màs ");
            break;
                       
        }
        
        // Dias de los meses del año 
        System.out.println("---------Meses del año --------");
        System.out.println("-------------------------------");
        System.out.println("------1 Enero -----------------");
        System.out.println("------2 Febrero ----------------");
        System.out.println("------3 Marzo----- -------------");
        System.out.println("------4 Abril ------------------");
        System.out.println("------5 Mayo--------------------");
        System.out.println("------6 Junio ------------------");
        System.out.println("------7 Julio-------------------");
        System.out.println("------8 Agosto -----------------");
        System.out.println("------9 Septiembre--------------");
        System.out.println("------10 Octubre----------------");
        System.out.println("------11 Noviembre--------------");
        System.out.println("------12 Diciembre--------------");
        System.out.println("-------------------------------");
        System.out.println("-¿Que mes te interesa saber los dias que tiene ?-");
        mes = leermes.nextLine();
               
        
        switch (mes)
        {
            // grupo 28/29 dias
            case "Febrero": System.out.println("Este mes puede tener 28 o 29 dias depende el año");
            break;
            
            // grupo de 30 dias
            case "Abril":
            case "Junio":
            case "Septiembre":  
            case "Noviembre":    
                System.out.println("Este mes tiene 30 dìas ");
            break;
            //grupo de 31 dias 
            case "Enero":    
            case "Marzo":    
            case "Mayo":    
            case "Julio":
            case "Agosto":  
            case "Octubre":
            case "Diciembre":
                 System.out.println("Este mes tiene 31 dìas ");
            break;
            default:
                System.out.println("No es un mes del año ");
                break;
                
                     
        }
        
        
        
        
        
    }
    
}
