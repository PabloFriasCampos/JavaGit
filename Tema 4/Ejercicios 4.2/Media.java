import java.util.Scanner;
/**
 * PFC
 * 
 * Media.java
 * 
 * Calcula la media de 3 notas
 * 
 */

public class Media {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor introduce la primera nota: ");
    double nota1 = s.nextDouble();
    if(nota1 > 0 && nota1 <10){
      System.out.print("Por favor introduce la segunda nota: ");
      double nota2 = s.nextDouble();
      if(nota2 > 0 && nota2 <10){
        System.out.print("Por favor introduce la tercera nota: ");
        double nota3 = s.nextDouble();
        if(nota3 > 0 && nota3 <10){
          System.out.printf("La media de las tres notas es %.2f", (nota1+nota2+nota3)/3);
    
        }else{
          System.out.println("La nota introducida no es correcta.");
    
        }
  
      }else{
        System.out.println("La nota introducida no es correcta.");
  
      }

    }else{
      System.out.println("La nota introducida no es correcta.");

    }

  }

}
