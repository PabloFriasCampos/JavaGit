import java.util.Scanner;
/**
 * PFC
 * 
 * Columnas.java
 * 
 * Muestra el cuadrado y el cubo de 5 numeros a partir de otro introducido
 */

public class Columnas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el número: ");
    int n = s.nextInt();
    for(int i=n+1;i<n+6;i++){
      System.out.println(i + " / " + i*i + " / " + i*i*i);

    }

  }

}
