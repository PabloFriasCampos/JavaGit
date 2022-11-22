import java.util.Scanner;
/**
 * PFC
 * 
 * UltimaCifra.java
 * 
 * Da la ultima cifra de un numero introducido
 */

public class UltimaCifra {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número: ");
    int n = s.nextInt();
    n = n % 10;
    System.out.println("La ultima cifra del número introducido es " + n + ".");

  }

}
