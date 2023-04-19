/*
 1) Liquidación de vacaciones empleados 

    La empresa  Tatooine S.A solicita un sistema que determine los días de vacaciones a
los que tiene derecho un trabajador, tomando en cuenta las siguientes características:
Existen tres departamentos dentro de la empresa con sus respectivas claves: 


1. Departamento de Atención al cliente. (Clave 1) 
2. Departamento de Logística. (Clave 2) 
3. Gerencia. (Clave 3)


 Trabajadores con clave 1(Atención al cliente):  

    Con 1 año de servicio, reciben 6 días de vacaciones. 

    Con 2 a 6 años de servicio, reciben 14 días de vacaciones. 
    A partir de 7 años de servicio, reciben 20 días de vacaciones. 

Trabajadores con clave 2(Logística): 
     Con 1 año de servicio, reciben 7 días de vacaciones.
     Con 2 a 6 años de servicio, reciben 15 días de vacaciones. 
     A partir de 7 años de servicio, reciben 22 días de vacaciones.

 Trabajadores con clave 3(Gerencia): 
     Con 1 año de servicio, reciben 10 días de vacaciones. 
     Con 2 a 6 años de servicio, reciben 20 días de vacaciones. 
     A partir de 7 años de servicio, reciben 30 días de vacaciones.  
 */
package liquidacionvacaciones;

import java.util.Scanner;

public class LIQUIDACIONvACACIONES {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String NOMBRE =""; 
        int area=0, antiguedad=0;
                
       System.out.println("*************************************");
       System.out.println("****LIQUIDACION DE VACACIONES   *****");
       System.out.println("******* TATOOINE S.A. ***************"); 
       System.out.println("*************************************"); 
       System.out.println("*************************************"); 
       System.out.print("Ingrese el nombre del trabajador : "); 
       NOMBRE= entrada.nextLine();
       System.out.print("Cantidad de años de servicio : "); 
       antiguedad = entrada.nextInt();
       System.out.println("*************************************"); 
       System.out.println("*************************************"); 
       System.out.println("***01 - Departamento de Atención al cliente*******"); 
       System.out.println("***02 - Departamento de Logística*****************"); 
       System.out.println("***03 - GERENCIA**********************************"); 
       System.out.println("*************************************"); 
       System.out.println("*************************************"); 
       System.out.print("Ingrese un numero de area: "); 
       area = entrada.nextInt();
               
       // logica
       
       if(area ==1) {
           if(antiguedad ==1){
               System.out.println("El trabajador : " + NOMBRE + "Antiguedad " + antiguedad );
               System.out.println("Del area Atencion al cliente " );
               System.out.println("Tiene 6 dias de vaccaciones" );
               
           }else if(antiguedad >=2 && antiguedad <= 6){
               System.out.println("El trabajador : " + NOMBRE + "Antiguedad " + antiguedad );
               System.out.println("Del area Atencion al cliente " );
               System.out.println("Tiene 14 dias de vaccaciones" );
           
           }else if(antiguedad >= 7){
               System.out.println("El trabajador : " + NOMBRE + "Antiguedad " + antiguedad );
               System.out.println("Del area Atencion al cliente " );
               System.out.println("Tiene 20 dias de vaccaciones" );
               
           }
         
       }else if(area ==2) {
           if(antiguedad ==1){
               System.out.println("El trabajador : " + NOMBRE + "Antiguedad " + antiguedad );
               System.out.println("Del area Logistica " );
               System.out.println("Tiene 7 dias de vaccaciones" );
               
           }else if (antiguedad >= 2 && antiguedad <=6){
               System.out.println("El trabajador : " + NOMBRE + "Antiguedad " + antiguedad );
               System.out.println("Del area Logistica " );
               System.out.println("Tiene 15 dias de vaccaciones" );
               
           }else  if (antiguedad == 7 ) {
               System.out.println("El trabajador : " + NOMBRE + "Antiguedad " + antiguedad );
               System.out.println("Del area Logistica " );
               System.out.println("Tiene 22 dias de vaccaciones" );
           
           }
         
       }else if (area == 3) {
           if(antiguedad ==1){
               System.out.println("El trabajador : " + NOMBRE + "Antiguedad " + antiguedad );
               System.out.println("Del area Gerencia " );
               System.out.println("Tiene 10 dias de vaccaciones" );
           
           }else if (antiguedad >= 2 && antiguedad <=6){
                System.out.println("El trabajador : " + NOMBRE + "Antiguedad " + antiguedad );
               System.out.println("Del area Gerencia " );
               System.out.println("Tiene 20 dias de vaccaciones" );
           }else  if (antiguedad == 7 ) {
               System.out.println("El trabajador : " + NOMBRE + "Antiguedad " + antiguedad );
               System.out.println("Del area Gerencia " );
               System.out.println("Tiene 30 dias de vaccaciones" );
           
           
           }
       
       
       }
       
       
       
    }
    
}
