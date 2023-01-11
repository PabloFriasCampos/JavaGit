import java.util.Scanner;
/**
 * PFC 
 * 
 * Bandera.java
 * 
 * Calcula el precio de una bandera segun su superficie y condiciones
 */

public class Bandera {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura de la bandera en cm: ");
    double altura = s.nextDouble();
    System.out.print("Introduce el ancho de la bandera en cm: ");
    double ancho = s.nextDouble();
    System.out.print("¿Quieres el escudo bordado? (s/n): ");
    String eleccion = s.next();
    double total = (altura*ancho)/100;
    System.out.println("Gracias. Aqui tiene el desglose de su compra");
    System.out.println("Bandera de " + altura*ancho + "cm2: " + total);
    if(eleccion.equalsIgnoreCase("s")){
      System.out.println("Con escudo: 2,50");
      total+=2.5;

    }else{
      System.out.println("Sin escudo: 0,00");

    }

    System.out.println("Gastos de envío: 3,25");
    total+=3.25;
    System.out.println("Total: " + total);

  }

}
