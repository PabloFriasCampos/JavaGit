import java.util.Scanner;
/**
 * PFC
 * 
 * Primo.java
 * 
 * Muestra si un número introducido es o no primo
 */

public class Primo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean esPrimo = true;
    System.out.print("Introduce el número: ");
    int n = s.nextInt();
    for(int i=2;i<n;i++){
      if(n%i==0){
        esPrimo = false;

      }

    }
    if(esPrimo){
      System.out.println(n + " es un número primo.");

    }else{
      System.out.println(n + " NO es un número primo.");
      
    }

  }

}
