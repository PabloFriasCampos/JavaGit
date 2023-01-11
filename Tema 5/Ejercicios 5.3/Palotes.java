import java.util.Scanner;
/**
 * PFC
 * 
 * Palotes.java
 * 
 * Pasa un numero decimal a sistema de "Palotes"
 */

public class Palotes {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número: ");
    int n = s.nextInt();
    String cadena = "";
    String total = "";
    int num = n;
    while(n>9){
      for(int i=0;i<n%10;i++){
        cadena = " |" + cadena;

      }
      cadena = " - " + cadena; 
      total = cadena + total;
      n=n/10;
      cadena = "";

    }
    for(int i=0;i<n;i++){
      cadena = " |" + cadena;

    }
    total = cadena + total;
    System.out.println("El " + num + " en decimal es el " + total + " en sistema de palotes.");

  }

}
