import java.util.Scanner;
/**
 * PFC
 * 
 * Ocurrencias.java
 * 
 * Lista de 100 numeros(0-20), intercambiamos un numero por otro y lo mostramos entrecomillado
 */

public class Ocurrencias {
  public static void main(String[] args) {
    int[] l = new int[100];
    Scanner s = new Scanner(System.in);
    for(int i=0;i<100;i++){
      l[i] = (int)(Math.random()*21);
      System.out.print(l[i] + " ");

    }
    System.out.print("\nIntroduce el numero a intercambiar: ");
    int intercamb = s.nextInt();
    System.out.print("Introduce el numero que lo reemplaza: ");
    int reemp = s.nextInt();
    for(int i=0;i<100;i++){
      if(l[i]==intercamb){
        l[i] = reemp;
        System.out.print("'" + l[i] + "'" + " ");

      }
      else{
        System.out.print(l[i] + " ");

      }

    }

  }

}
