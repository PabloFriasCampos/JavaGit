import java.util.Scanner;
/**
 * PFC
 * 
 * Hora.java
 * 
 * Programa que muestra una expresion segun la hora que se introduce
 */

public class Hora {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("¿Que hora es? ");
    int hora = s.nextInt();

    if((hora>=6) && (hora<=12)){
      System.out.println("Buenos Dias!");

    }if((hora>=13) && (hora<=20)){
      System.out.println("Buenas Tardes!");

    }if(((hora>=21) && (hora<=24)) || ((hora>=1) && (hora<=5))){
      System.out.println("Buenas Noches!");

    }

  }

}
