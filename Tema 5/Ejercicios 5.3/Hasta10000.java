import java.util.Scanner;
/**
 * PFC
 * 
 * Hasta10000.java
 * 
 * Lee numeros hasta que su suma de mas de 10000 y muestra el valor total de la suma y su media
 */


public class Hasta10000 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int suma, n, cantidad;
    suma=0;
    cantidad=0;
    while(suma<10000){
      System.out.print("Introduce el número: ");
      n = s.nextInt();
      suma += n;
      cantidad++;

    }
    System.out.println("El total es: " + suma);
    System.out.println("Se han leido " + cantidad + " números");
    System.out.println("La media es " + (double)suma/cantidad);

  }
  
}
