import java.util.Scanner;
/**
 * PFC
 * 
 * Digitos.java
 * 
 * Muestra cuántos dígitos tiene un número dado
 */

public class Digitos{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el número: ");
    int n = s.nextInt();
    int digitos = 0;
    while(n>10){
      n = n/10;
      digitos++;

    }
    digitos++;

    System.out.println("El número introducido tiene " + digitos + " dígitos.");

  }

}