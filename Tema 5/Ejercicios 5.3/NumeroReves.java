import java.util.Scanner;
/**
 * PFC
 * 
 * NumeroReves.java
 * 
 * Lee un numero y lo muestra dado la vuelta
 */

public class NumeroReves {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n;
    String num = "";
    System.out.print("Introduzca el numero: ");
    n = s.nextInt();
    while(n>9){
      num += (n%10);
      n = n/10; 

    }
    num += n;
    System.out.println("El numero dado la vuelta es: " + num);

  }

}
