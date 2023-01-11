import java.util.Scanner;
/**
 * PFC
 * 
 * Rota.java
 * 
 * Se introducen 15 y rota los elementos del array a una posicion mas
 */

public class Rota {
  public static void main(String[] args) {
    int[] x = new int[15];
    int aux;
    Scanner s = new Scanner(System.in);
    for(int i=0;i<15;i++){
      System.out.print("Introduce el numero: ");
      x[i] = s.nextInt();

    }
    aux = x[14];
    for(int i=14;i>0;i--){
      x[i] = x[i-1];

    }
    x[0] = aux;
    for(int i=0;i<15;i++){
      System.out.println(x[i]);

    }

  }

}
