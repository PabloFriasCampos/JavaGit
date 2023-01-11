import java.util.Scanner;
import java.lang.Math;
/**
 * PFC
 * 
 * Ecuacion2.java
 * 
 * Calcula una ecuacion de segundo grado introduciendo los datos correspondientes
 * 
 */

public class Ecuacion2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("ax² + bx + c = 0");
    System.out.print("Introduce el valor de a: ");
    double a = s.nextDouble();
    System.out.print("Introduce el valor de b: ");
    double b = s.nextDouble();
    System.out.print("Introduce el valor de c: ");
    double c = s.nextDouble();
    if((Math.pow(b, 2)-(4*a*c)) < 0){
      System.out.println("No existen soluciones reales.");

    }else{
      double sol1, sol2;
      sol1 = ((-b + (Math.pow(b, 2)-(4*a*c)))/2*a);
      sol2 = ((-b - (Math.pow(b, 2)-(4*a*c)))/2*a);
      System.out.println("Las soluciones son: ");
      System.out.printf("x = %.2f       x = %.2f", sol1, sol2);

    }

  }

}
