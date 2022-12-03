import java.util.Scanner;
/**
 * PFC
 * 
 * MostrarPotencias.java
 * 
 * Muestra el valor de cada potencia hasta llegar al exponente introducido
 */

public class MostrarPotencias {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la base de la potencia: ");
    int base = s.nextInt();
    System.out.print("Introduce el exponente(>0): ");
    int exponente = s.nextInt();
    int total = base;
    System.out.println(base + " elevado a 1: " + total);
    for(int i = 1;i<exponente;i++){
      total*=base;
      System.out.println(base + " elevado a " + (i+1) + ": " + total);

    }

  }

}
