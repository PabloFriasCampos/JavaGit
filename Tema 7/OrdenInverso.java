import java.util.Scanner;
/**
 * PFC
 * 
 * OrdenInverso.java
 * 
 * Se introducen 10 numeros y se muestran en orden inverso
 */

public class OrdenInverso {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] x = new int[10];
    for(int i=0;i<10;i++){
      System.out.print("Introduce un numero: ");
      x[i] = s.nextInt();

    }
    System.out.println("Los numeros en orden inverso: ");

    for(int i=9;i>=0;i--){
      System.out.print(x[i] + " ");

    }

  }

}
