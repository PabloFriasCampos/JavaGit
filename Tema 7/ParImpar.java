import java.util.Scanner;
/**
 * PFC
 * 
 * ParImpar.java
 * 
 * Pide l8 numeros y muestra junto a ellos si es un numero par o impar
 */

public class ParImpar {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] n = new int[8];
    for(int i=0;i<8;i++){
      System.out.print("Introduce el numero: ");
      n[i] = s.nextInt();

    }
    for(int i=0;i<8;i++){
      if(n[i]%2==0){
        System.out.println(n[i] + " - Par");

      }else{
        System.out.println(n[i] + " - Impar");

      }

    }

  }

}
