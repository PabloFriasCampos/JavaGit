import java.util.Scanner;
/**
 * PFC
 * 
 * Ele.java
 * 
 * Dibuja una L de asteriscos de la altura deseada
 */

public class Ele {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la L: ");
    int altura = s.nextInt();
    for(int i=0;i<altura;i++){
      System.out.println("*");

    }
    for(int i=0;i<(altura/2+1);i++){
      System.out.print("* ");

    }

  }

}
