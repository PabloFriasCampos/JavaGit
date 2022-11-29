import java.util.Scanner;
/**
 * PFC
 * 
 * CajaFuerta.java
 * 
 * 4 intentos para desbloquear una caja fuerte de 4 dígitos
 */

public class CajaFuerte {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean es = false;
    int i = 0;
    int combinacion = 1234;
    int intento;
    while(!es && (i<4)){
      System.out.print("Introduce el código (4 dígitos): ");
      intento = s.nextInt();
      if(intento==combinacion){
        es = true;
        System.out.println("La caja ha sido abierta satisfactoriamente.");

      }else{
        System.out.println("Lo siento, esa no es la combinación");

      }
      i++;

    }

  }

}
