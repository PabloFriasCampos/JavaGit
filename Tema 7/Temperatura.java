import java.util.Scanner;
/**
 * PFC
 * 
 * Temperatura.java
 * 
 * Pide la temperatura media de cada mes del año y muestra un gráfico de barras
 */

public class Temperatura {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] t = new int[12];
    for(int i=0;i<12;i++){
      System.out.print("Temperatura del mes " + (i+1) + ": ");
      t[i] = s.nextInt();

    }
    System.out.println("-----GRÁFICO-----\n");
    for(int i=0;i<12;i++){
      System.out.printf("Mes %2d: ", (i+1));
      for(int j=0;j<t[i];j++){
        System.out.print("* ");

      }
      System.out.println();

    }

  }

}
