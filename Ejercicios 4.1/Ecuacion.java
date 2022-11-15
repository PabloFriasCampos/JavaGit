import java.util.Scanner;
/**
 * PFC
 * 
 * Ecuacion.java
 * 
 * Programa que resuelve una ecuacion de primer grado
 */

public class Ecuacion {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Por favor introduce el valor de a: ");
    double a = s.nextDouble();
    System.out.print("Por favor introduce el valor de b: ");
    double b = s.nextDouble();
    if(a==0){
      System.out.println("Esta ecuacion no tiene solucion real.");

    }else{
      System.out.println("x = " + (-b/a));

    }

  }

}
