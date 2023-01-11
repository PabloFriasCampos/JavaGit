import java.util.Scanner;
/**
 * PFC
 * 
 * Factorial.java
 * 
 * Calcula el factorial de un numero dado y todos sus inferiores hasta 1
 */

public class Factorial {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número entero positivo: ");
    int n = s.nextInt();
    int fact = 1;
    for(int i=1;i<=n;i++){
      fact*=i;
      System.out.println(i + "! = " + fact);

    }

  }

}
