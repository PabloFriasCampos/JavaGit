import java.util.Scanner;
/**
 * PFC
 * 
 * Digitos.java
 * 
 * Muestra cuantos digitos son pares y cuantos impares de un numero dado
 */

public class Digitos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el número entero positivo: ");
    long n = s.nextLong();
    long aux = n;
    int pares = 0;
    int impares = 0;
    while(n>0){
      if((n%10)%2==0){
        pares++;

      }else{
        impares++;

      }
      n = n / 10;

    }
    System.out.println("El " + aux + " contiene " + pares + " dígitos pares y " + impares + " dígitos impares.");

  }

}
