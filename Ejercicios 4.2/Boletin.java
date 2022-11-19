import java.util.Scanner;
/**
 * PFC
 * 
 * Boletin.java
 * 
 * Calcula la media de 3 notas y indica que aparece en el boletin
 * 
 */

public class Boletin {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor introduce la primera nota: ");
    double nota1 = s.nextDouble();
    if(nota1 >= 0 && nota1 <= 10){
      System.out.print("Por favor introduce la segunda nota: ");
      double nota2 = s.nextDouble();
      if(nota2 >= 0 && nota2 <= 10){
        System.out.print("Por favor introduce la tercera nota: ");
        double nota3 = s.nextDouble();
        if(nota3 >= 0 && nota3 <= 10){
          double notaFinal = (nota1+nota2+nota3)/3;
          System.out.printf("La media de las tres notas es %.2f.", notaFinal);
          if(notaFinal < 5){
            System.out.println(" Insuficiente.");

          }
          if(notaFinal >= 5 && notaFinal < 6){
            System.out.println(" Suficiente.");

          }
          if(notaFinal >= 6 && notaFinal < 7){
            System.out.println(" Bien.");

          }
          if(notaFinal >= 7 && notaFinal < 9){
            System.out.println(" Notable.");

          }if(notaFinal >=9){
            System.out.println(" Sobresaliente.");

          }

    
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
