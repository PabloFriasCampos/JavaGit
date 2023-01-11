import java.util.Scanner;
/**
 * PFC
 * 
 * MediaNoche.java
 * 
 * Muestra cuantos segundos quedan para media noche
 */

public class MediaNoche {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la hora(0-23): ");
    int hora = s.nextInt();
    System.out.print("Introduce los minutos(0-59): ");
    int minutos = s.nextInt();
    int totalSegundos = ((23 - hora)*3600 + (60 - minutos)*60);
    System.out.print("Quedan " + totalSegundos + " segundos para media noche (00:00).");

  }

}
