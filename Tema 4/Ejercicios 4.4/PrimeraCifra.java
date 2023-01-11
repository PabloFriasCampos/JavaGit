import java.util.Scanner;
/**
 * PFC
 * 
 * PrimeraCifra.java
 * 
 * Da la primera cifra de un numero introducido (Maximo 5 cifras (99999))
 */

public class PrimeraCifra {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número (Máximo 5 cifras): ");
    int n = s.nextInt();
    if(n > 999){
      n = n / 1000;
    
    }
    /*No contemplo el caso de 5 dígitos ya que entraría en dos if y se solucionaria igualmente
     * Por ejemplo: 
     * 83121 / 1000 = 83
     * 83 / 10 = 8
     */
    if(n > 99){
      n = n / 100;

    }
    if(n > 9){
      n = n / 10;

    }
    System.out.println("La primera cifra del número es " + n + ".");

  }

}
