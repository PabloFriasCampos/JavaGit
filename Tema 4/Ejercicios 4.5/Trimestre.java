import java.util.Scanner;
/**
 * PFC 
 * 
 * Trimestre.java
 * 
 * A partir de la nota de 2 examenes, la recuperacion, calcula tu media en el trimestre
 */

public class Trimestre {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double nota1, nota2, media;
    System.out.print("Introduce la nota de tu primer examen: ");
    nota1 = s.nextInt();
    System.out.print("Introduce la nota de tu segundo examen: ");
    nota2 = s.nextInt();
    media = (nota1 + nota2) / 2;
    if(media >= 5){
      System.out.print("Tu nota en programación es: " + media);

    }else{
      String apto;
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (Apto / No Apto): ");
      apto = s.next();
      if(apto.equalsIgnoreCase("apto")){
        System.out.println("Tu nota en programación es: 5");

      }else{
        System.out.print("Tu nota en programación es: " + media);

      }

    }

  }
  
}
