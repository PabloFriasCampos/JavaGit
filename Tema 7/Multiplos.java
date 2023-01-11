import java.util.Scanner;
/**
 * PFC
 * 
 * Multiplos.java
 * 
 * En un array de 20 numeros aleatorios, se resaltan los multiplos de 5 o de 7 a eleccion
 */

public class Multiplos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] n = new int[20];
    for(int i=0;i<20;i++){
      n[i] = (int) (Math.random()*401);
      System.out.print(n[i] + " ");

    }
    System.out.print("\nQuiere resaltar (1 - Multiplos de 5, 2 - Multiplos de 7): ");
    int eleccion = s.nextInt();
    
    switch(eleccion){
      case 1:
        for(int i=0;i<20;i++){
          if(n[i]%5==0){
            System.out.print("[" + n[i] + "] ");

          }else{
            System.out.print(n[i] + " ");

          }

        }
        break;
      
      case 2:
        for(int i=0;i<20;i++){
          if(n[i]%7==0){
            System.out.print("[" + n[i] + "] ");

          }else{
            System.out.print(n[i] + " ");

          }

        }
        break;

      default:

    }

  }

}
