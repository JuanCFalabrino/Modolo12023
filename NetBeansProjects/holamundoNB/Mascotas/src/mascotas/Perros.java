
package mascotas;

import java.util.Scanner;

public class Perros {
  //Definir atributos
  String nombre,raza,color;
  int edad;
  //crear objeto
  Scanner leer = new Scanner(System.in);
  
  //metodos 
  public void pedir(){
      System.out.print("Ingrese el Nombre del Perro: ");
      nombre= leer.nextLine();
      System.out.print("Ingrese la raza del Perro: ");
      raza= leer.nextLine();
      System.out.print("Ingrese el color del Perro: ");
      color= leer.nextLine();        
  }
  
  public void ladrad(){
      System.out.println("Gua Gua Gua ");
  }
  
  public void correr(){
      System.out.println("Velocidad 40 km ");
  }
  
  public void ficha(){
      System.out.println("==========================");
      System.out.println("===== Veterinaria CFP ====");
      System.out.println("==========================");
      System.out.println("== Nombre mascota: " +nombre+ "==");
      System.out.println("== Raza mascota: " +raza+ "==");
      System.out.println("== Color mascota: " +color+ "==");
      System.out.println("============================");
  }
  
  
  
  
    
    
    
    
}
