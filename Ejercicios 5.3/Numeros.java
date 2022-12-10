import java.util.Scanner;
/**
 * PFC
 * 
 * Numeros.java
 * 
 * Lee numeros, calcula la media de los impares y el mayor de los pares
 */

public class Numeros {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n, impares, cantidad, mayor;
    mayor = 0;
    n=0;
    impares=0;
    cantidad=0;
    do{
      if(n%2!=0){
        impares += n;
        cantidad++;

      }
      if(n%2==0 && n>mayor){
        mayor = n;

      }
      System.out.print("Introduzca el número (Negativo para salir): ");
      n = s.nextInt();

    }while(n>0);
    System.out.println("La media de los números impares introducidos es: " + (double)impares/cantidad);
    System.out.println("El mayor de los números pares es: " + mayor);

  }

}
