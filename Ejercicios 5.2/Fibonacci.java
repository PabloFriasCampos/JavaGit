import java.util.Scanner;
/**
 * PFC
 * 
 * Fibonacci.java
 * 
 * Calcula los n primeros números de la secuencia de fibonacci
 */

public class Fibonacci {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Cuantos números de la secuencia de Fibonacci desea mostrar: ");
    int n = s.nextInt();
    int n1,n2,aux;
    n1 = 0;
    n2 = 1;
    System.out.println("0\n1");
    for(int i=0;i<n-2;i++){
      aux = n1;
      n1 = n2;
      n2 = aux + n1;
      System.out.println(n2);

    }

  }

}
