import java.util.Scanner;
/**
 * PFC 
 * 
 * Entradas.java
 * 
 * Calcula el precio de entradas de cine según el dia de la semana
 */

public class Entradas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Venta de entradas de Cine");
    System.out.print("Número de entradas: ");
    int entradas = s.nextInt();
    System.out.print("Dia de la semana: ");
    String eleccion = s.next();
    eleccion.toLowerCase();
    boolean tarjeta = false;
    System.out.print("¿Tiene tarjeta del cine? (s/n): ");
    String tarj = s.next();
    double base = 0;
    double total = 0;
    if(tarj.equalsIgnoreCase("s")){
      tarjeta = true;

    }
    System.out.println("Gracias por su compra.");
    System.out.println("Numero de entradas: " + entradas);

    switch(eleccion){
      case "lunes":
        base = 8;
        System.out.println("Precio por entradas individuales: " + base);
        total = entradas * base;
        break;

      case "martes":
        base = 8;
        System.out.println("Precio por entradas individuales: " + base);
        total = entradas * base;
        break;

      case "miercoles":
        base = 5;
        System.out.println("Precio por entradas individuales: " + base);
        total = entradas * base;
        break;

      case "jueves":
        base = 8;
        int parejas = entradas/2;
        System.out.println("Numero de entradas de pareja: " + parejas);
        System.out.println("Precio por entradas de pareja: 11");
        total = (parejas * 11) + (entradas-parejas*2)*base;
        break;

      case "viernes":
        base = 8;
        System.out.println("Precio por entradas individuales: " + base);
        total = entradas * base;
        break;

      case "sabado":
        base = 8;
        System.out.println("Precio por entradas individuales: " + base);
        total = entradas * base;
        break;

      case "domingo":
        base = 8;
        System.out.println("Precio por entradas individuales: " + base);
        total = entradas * base;
        break;

      default:
        System.out.println("Dia incorrecto.");

    }
    System.out.println("Total: " + total);
    if(tarjeta){
      System.out.println("Descuento: " + total*0.1);
      total = total * 0.9;

    }else{
      System.out.println("No hay descuento.");

    }
    System.out.println("A pagar: " + total);

  }

}
