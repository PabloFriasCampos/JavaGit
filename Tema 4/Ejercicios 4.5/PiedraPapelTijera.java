import java.util.Scanner;
/**
 * PFC 
 * 
 * PiedraPapelTijera.java
 * 
 * Juego de Piedra, Papel o Tijera entre 2 jugadores
 */

public class PiedraPapelTijera {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String j1 = s.next();
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
    String j2 = s.next();
    j1.toLowerCase();
    switch(j1){
      case "piedra":
        if(j2.equalsIgnoreCase("piedra")){
          System.out.println("Empate");

        }
        if(j2.equalsIgnoreCase("papel")){
          System.out.println("Gana el jugador 2");

        }
        if(j2.equalsIgnoreCase("tijera")){
          System.out.println("Gana el jugador 1");

        }
        break;

      case "papel":
        if(j2.equalsIgnoreCase("piedra")){
          System.out.println("Gana el jugador 1");

        }
        if(j2.equalsIgnoreCase("papel")){
          System.out.println("Empate");

        }
        if(j2.equalsIgnoreCase("tijera")){
          System.out.println("Gana el jugador 2");

        }
        break;

        case "tijera":
          if(j2.equalsIgnoreCase("piedra")){
            System.out.println("Gana el jugador 2");

          }
          if(j2.equalsIgnoreCase("papel")){
            System.out.println("Gana el jugador 1");

          }
          if(j2.equalsIgnoreCase("tijera")){
            System.out.println("Empate");

          }
          break;

        default:
          System.out.println("Opcion errónea.");

    }
    
  }

}
