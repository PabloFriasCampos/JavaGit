import java.util.Scanner;
/**
 * PFC
 * 
 * ParDiv5.java
 * 
 * Dado un numero te dice si es par y si es divisible entre 5
 */

public class ParDiv5{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el numero: ");
    int n = s.nextInt();
    if(n%2 == 0){
      System.out.println("El número introducido es par.");

    }else{
      System.out.println("El número introducido es impar.");

    }
    if(n%5 == 0){
      System.out.println("El número introducido es divisible entre 5.");

    }else{
      System.out.println("El número introducido no es divisible entre 5.");

    }

  }

}