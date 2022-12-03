import java.util.Scanner;
/**
 * PFC
 * 
 * Potencia.java
 * 
 * Muestra el valor de una potencia dado su base y su exponente
 */

public class Potencia {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean negativo = false;
    System.out.print("Introduce la base de la potencia: ");
    int base = s.nextInt();
    System.out.print("Introduce el exponente: ");
    int exponente = s.nextInt();
    int total = base;
    if(exponente==0){
      total = 1;

    }
    if(exponente<0){
      negativo = true;
      exponente = -exponente;

    }
    for(int i = 1;i<exponente;i++){
      total*=base;

    }
    if(negativo){
      System.out.println("El valor de la potencia es: 1/" + total);

    }else{
      System.out.println("El valor de la potencia es: " + total);

    }
    

  }

}
