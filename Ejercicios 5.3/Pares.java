import java.util.Scanner;
/**
 * PFC
 * 
 * Pares.java
 * 
 * Obtiene los numeros pares de un numero dado y calcula la suma de ellos
 */

public class Pares {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String pares = "";
    int suma = 0;
    System.out.print("Introduzca el número: ");
    long n = s.nextLong();
    while(n>9){
      if((n%10)%2==0){
        suma+=n%10;
        pares = n%10 + pares;

      }
      n = n/10;

    }
    if(n%2==0){
      suma+=n%10;
      pares = n%10 + pares;

    }
    System.out.println("Numeros pares: " + pares);
    System.out.println("La suma de los pares es: " + suma);

  }

}
