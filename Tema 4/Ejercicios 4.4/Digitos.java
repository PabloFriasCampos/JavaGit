import java.util.Scanner;
import java.lang.Math;
/**
 * PFC
 * 
 * Digitos.java
 * 
 * Cuantos dígitos tiene el número introducido (Maximo 5 cifras (99999))
 */

public class Digitos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número (Máximo 5 dígitos): ");
    int n = s.nextInt();
    n = Math.abs(n);
    if(n > 9999){
      System.out.println("El número introducido tiene 5 dígitos");

    }
    else if(n > 999){
      System.out.println("El número introducido tiene 4 dígitos");

    }
    else if(n > 99){
      System.out.println("El número introducido tiene 3 dígitos");

    }
    else if(n > 9){
      System.out.println("El número introducido tiene 2 dígitos");

    }else{
      System.out.println("El número introducido tiene 1 dígito");

    }

  }

}
