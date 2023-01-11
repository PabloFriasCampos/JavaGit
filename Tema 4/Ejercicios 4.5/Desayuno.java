import java.util.Scanner;
/**
 * PFC 
 * 
 * Desayuno.java
 * 
 * Calcula el precio de un desayuno según lo consumido
 */

public class Desayuno {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String pitufo = "";
    double total = 0;
    System.out.print("¿Que ha tomado de comer? (palmera, donut o pitufo): ");
    String comida = s.next();
    comida.toLowerCase();
    if(comida.equals("pitufo")){
      System.out.print("¿Con que se ha tomado el pitufo? (aceite o tortilla): ");
      pitufo = s.next();

    }
    System.out.print("¿Que ha tomado de beber? (zumo o cafe): ");
    String bebida = s.next();
    bebida.toLowerCase();

    switch(comida){
      case "palmera":
        System.out.println("Palmera: 1,40");
        total = 1.4;
        break;

      case "donut":
        System.out.println("Donut: 1,00");
        total += 1;
        break;

      case "pitufo":
        if(pitufo.equalsIgnoreCase("aceite")){
          System.out.println("Pitufo con aceite: 1,20");
          total += 1.2;

        }
        if(pitufo.equalsIgnoreCase("tortilla")){
          System.out.println("Pitufo con tortilla: 1,60");
          total += 1.6;

        }
        break;

        default:
          System.out.println("Comida errónea.");

    }

    switch(bebida){
      case "zumo":
        System.out.println("Zumo: 1,50");
        total+=1.5;
        break;

      case "cafe":
        System.out.println("Cafe: 1,20");
        total = total + 1.2;
        break;

      default:
        System.out.println("Bebida errónea.");

    }
    System.out.println("Total desayuno: " + total);
    
  }

}
