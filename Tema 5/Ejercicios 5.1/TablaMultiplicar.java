import java.util.Scanner;
/**
 * PFC
 * 
 * TablaMultiplicar.java
 * 
 * Muestra la tabla de multiplicar de un número introducido
 */

public class TablaMultiplicar {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Mostrar la tabla del: ");
    int n = s.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(n + " * " + i + " = " + n*i);

    }

  }

}
