import java.util.Scanner;
/**
 * PFC
 * 
 * SumaCien.java
 * 
 * Suma los 100 siguientes números a uno introducido
 */

public class SumaCien {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número(>=0): ");
    int n = s.nextInt();
    int total = 0;
    if(n>=0){
      for(int i=n+1;i<n+101;i++){
        total +=i;
        
      }
      System.out.println("La suma de los 100 números siguientes a " + n + " es: " + total);

    }else{
      System.out.println("Número incorrecto.");

    }

  }

}
