import java.util.Scanner;
/**
 * PFC
 * 
 * ListaNumeros.java
 * 
 * Lee una lista de 10 números y determina cuantos son positivos y cuantos negaticos (0 es positivo)
 */

public class ListaNumeros {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n;
    int positivos = 0;
    int negativos = 0;
    for(int i=0;i<10;i++){
      System.out.print("Introduce el número " + (i+1) + ": ");
      n = s.nextInt();
      if(n>=0){
        positivos++;

      }else{
        negativos++;

      }

    }
    System.out.println("Se han leido " + positivos + " números positivos y " + negativos + " números negativos");
  
  }

}
