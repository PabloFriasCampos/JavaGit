import java.util.Scanner;
/**
 * PFC
 * 
 * Piramide.java
 * 
 * Pinta una piramide de 3 niveles con el caracter y la orientacion seleccionada
 */

public class Piramide {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Indica que caracter deseas para la pirámide (Un solo carácter): ");
      String c;
      c = s.next();
      System.out.println("Indica que orientación deseas (Donde apunta):");
      System.out.println("------------------------------");
      System.out.println("1. Arriba");
      System.out.println("2. Izquierda");
      System.out.println("3. Abajo");
      System.out.println("4. Derecha");
      System.out.print("Elección: ");
      int eleccion = s.nextInt();
      c += " ";
      System.out.println("----------Pirámide----------\n");
      switch(eleccion){
        case 1:
          System.out.println("    " + c);
          System.out.println("  " + c + c + c);
          System.out.println(c + c + c + c + c);
          break;
          
        case 2:
          System.out.println("    " + c);
          System.out.println("  " + c + c);
          System.out.println(c + c + c);
          System.out.println("  " + c + c);
          System.out.println("    " + c);
          break;

        case 3:
          System.out.println(c + c + c + c + c);
          System.out.println("  " + c + c + c);
          System.out.println("    " + c);
          break;

        case 4:
          System.out.println(c + "    ");
          System.out.println(c + c + "  ");
          System.out.println(c + c + c);
          System.out.println(c + c + "  ");
          System.out.println(c + "    ");
          break;

        default:
        System.out.println("Elección no válida");

      }
      
    }

}
