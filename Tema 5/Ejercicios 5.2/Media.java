import java.util.Scanner;
/**
 * PFC
 * 
 * Media.java
 * 
 * Calcula la media de los números introducidos
 */

public class Media {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n, total, cantidad;
    n=0;
    total=0;
    cantidad=-1;
    do{
      total += n;
      cantidad++;
      System.out.print("Introduzca el número (Negativo para salir): ");
      n = s.nextInt();

    }while(n>0);
    System.out.println("La media de los números introducidos es: " + total/cantidad);

  }

}
