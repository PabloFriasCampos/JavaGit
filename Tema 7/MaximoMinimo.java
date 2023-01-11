import java.util.Scanner;
/**
 * PFC
 * 
 * MaximoMinimo.java
 * 
 * 100 numeros aleatorios, mostramos el array y volvemos a mostrarlo destacando el maximo o el minimo (a eleccion)
 */

public class MaximoMinimo {
  public static void main(String[] args) {
    int[] n = new int[100];
    Scanner s = new Scanner(System.in);
    for(int i=0;i<100;i++){
      n[i] = (int) (Math.random()*501);
      System.out.print(n[i] + " ");

    }
    System.out.print("\nQuieres destacar (1 - minimo, 2 - maximo): ");
    int eleccion = s.nextInt();

    switch(eleccion){
      case 1:
        int min = n[0];
        for(int i=1;i<100;i++){
          if(n[i]<min){
            min = n[i];

          }

        }
        for(int i=0;i<100;i++){
          if(n[i]==min){
            System.out.print("**" + n[i] + "** ");

          }else{
            System.out.print(n[i] + " ");

          }

        }
        break;

      case 2:
        int max = n[0];
        for(int i=1;i<100;i++){
          if(n[i]>max){
            max = n[i];

          }

        }
        for(int i=0;i<100;i++){
          if(n[i]==max){
            System.out.print("**" + n[i] + "** ");

          }else{
            System.out.print(n[i] + " ");

          }

        }
        break;

      default:
        System.out.println("Eleccion equivocada");

    }

  }

}
