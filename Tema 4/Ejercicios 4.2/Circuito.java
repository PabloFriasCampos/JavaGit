import java.util.Scanner;

/**
 * PFC
 * 
 * Circuito.java
 * 
 * Ciudades: Málaga -> Granada -> Murcia -> Alicante -> Valencia
 * 1. Málaga
 * 2. Casabermeja
 * 3. Villanueva del Rosario
 * 4. Villanueva del Trabuco
 * 5. Granada
 * 6. Guadix
 * 7. Baza
 * 8. Lorca
 * 9. Murcia
 * 10. Albatera
 * 11. Crevillente
 * 12. Elche
 * 13. Alicante
 * 14. Alcoy
 * 15. Albaida
 * 16. Alberique
 * 17. Valencia
 * 
 */

public class Circuito{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("\nRUTA");
    System.out.println("\n--------------------------------------------------------------");
    System.out.println("Málaga ----> Granada ----> Murcia ----> Alicante ----> Valencia");
    System.out.println("1. Málaga");
    System.out.println("2. Casabermeja");
    System.out.println("3. Villanueva del Rosario");
    System.out.println("4. Villanueva del Trabuco");
    System.out.println("5. Granada");
    System.out.println("6. Guadix");
    System.out.println("7. Baza");
    System.out.println("8. Lorca");
    System.out.println("9. Murcia");
    System.out.println("10. Albatera");
    System.out.println("11. Crevillente");
    System.out.println("12. Elche");
    System.out.println("13. Alicante");
    System.out.println("14. Alcoy");
    System.out.println("15. Albaida");
    System.out.println("16. Alberique");
    System.out.println("17. Valencia");
    System.out.print("Escoge un punto de partida (1 - 16): ");
    int partida = s.nextInt();
    String ruta = "Tu ruta es: ";
    switch(partida){
      case 1:
        ruta += "Málaga -> ";
      case 2:
        ruta += "Casabermeja -> ";
      case 3:
        ruta += "Villanueva del Rosario -> ";
      case 4:
        ruta += "Villanueva del Trabuco -> ";
      case 5:
        ruta += "Granada -> ";
      case 6:
        ruta += "Guadix -> ";
      case 7:
        ruta += "Baza -> ";
      case 8:
        ruta += "Lorca -> ";
      case 9:
        ruta += "Murcia -> ";
      case 10:
        ruta += "Albatera -> ";
      case 11:
        ruta += "Crevillente -> ";
      case 12:
        ruta += "Elche -> ";
      case 13:
        ruta += "Alicante -> ";
      case 14:
        ruta += "Alcoy -> ";
      case 15:
        ruta += "Albaida -> ";
      case 16:
        ruta += "Alberique -> ";
        ruta += "Valencia";
        break;
      default:
        System.out.println("Punto de partida no válido.");

    }
    System.out.println(ruta);

  }

}