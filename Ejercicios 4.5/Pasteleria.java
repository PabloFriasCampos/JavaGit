import java.util.Scanner;
/**
 * PFC 
 * 
 * Pateleria.java
 * 
 * Calcula el precio de una tarta dadas sus características
 */

public class Pasteleria {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double base = 0;
    double total = 0;
    boolean nata,nombre;
    String chocolate = "";
    nata = false;
    nombre = false;
    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    String sabor = s.next();
    sabor.toLowerCase();
    if(sabor.equals("chocolate")){
      System.out.print("¿Que tipo de chocolate quiere? (blanco o negro): ");
      chocolate = s.next();
      chocolate.toLowerCase();

    }
    System.out.print("¿Quiere nata? (si o no): ");
    String eleccion = s.next();
    if(eleccion.equalsIgnoreCase("si")){
      nata = true;

    }
    System.out.print("¿Quiere ponerle un nombre? (si o no): ");
    eleccion = s.next();
    if(eleccion.equalsIgnoreCase("si")){
      nombre = true;

    }

    switch(sabor){
      case "manzana":
        base = 18;
        System.out.println("Tarta de manzana: " + base);
        break;

      case "fresa":
        base = 16;
        System.out.println("Tarta de fresa: " + base);
        break;

      case "chocolate":
        if(chocolate.equals("negro")){
          base = 14;
          System.out.println("Tarta de chocolate negro: " + base);

        }
        if(chocolate.equals("blanco")){
          base = 15;
          System.out.println("Tarta de chocolate blanco: " + base);

        }
        break;

      default:
        System.out.println("Sabor erróneo.");

    }
    total = base;

    if(nata){
      System.out.println("Con nata: 2,50");
      total = total + 2.5;

    }
    if(nombre){
      System.out.println("Con nombre: 2,75");
      total = total + 2.75;

    }
    System.out.println("Total: " + total);

  }

}
