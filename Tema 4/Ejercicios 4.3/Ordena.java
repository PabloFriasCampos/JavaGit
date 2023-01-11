import java.util.Scanner;
/**
 * PFC
 * 
 * Ordena.java
 * 
 * Ordena de menor a mayor 3 numeros introducidos
 */

public class Ordena {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el primer numero: ");
    int n1 = s.nextInt();
    System.out.print("Introduce el segundo numero: ");
    int n2 = s.nextInt();
    System.out.print("Introduce el tercer numero: ");
    int n3 = s.nextInt();
    int aux;
    if(n1 > n2){
      aux = n1;
      n1 = n2;
      n2 = aux;

    }
    if(n2 > n3){
      aux = n2;
      n2 = n3;
      n3 = aux;

    }
    if(n1 > n2){
      aux = n1;
      n1 = n2;
      n2 = aux;

    }

    System.out.println(n1 + " " + n2 + " " + n3);

  }

}
