import java.util.Scanner;
/**
 * PFC
 * 
 * MinimoMaximo.java
 * 
 * Se introducen 10 numeros por teclado y se muestran indicando cual es el minimo y el maximo
 */

public class MinimoMaximo {
  public static void main(String[] args) {
    int[] x = new int[10];
    Scanner s = new Scanner(System.in);
    int max, min;
    max = 0;
    min = 0;

    for(int i=0;i<10;i++){
      System.out.print("Introduce el numero: ");
      x[i] = s.nextInt();
      if(x[i]>x[max]){
        max = i;

      }
      if(x[i]<min){
        min = i;

      }

    }
    for(int i=0;i<10;i++){
      System.out.print(x[i]);
      if(i==max){
        System.out.print(" - Maximo");

      }
      if(i==min){
        System.out.print(" - Minimo");

      }
      System.out.println();

    }

  }

}
