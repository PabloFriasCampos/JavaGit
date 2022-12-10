import java.util.Scanner;
/**
 * PFC
 * 
 * Ele.java
 * 
 * Dibuja una U de asteriscos de la altura deseada
 */

public class U {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la U: ");
    int altura = s.nextInt();
    for(int i=0;i<altura-1;i++){
      System.out.print("* ");
      for(int j=0;j<altura-2;j++){
        System.out.print("  ");

      }
      System.out.println("*");

    }
    System.out.print("  ");
    for(int i=0;i<altura-2;i++){
      System.out.print("* ");

    }

  }

}
