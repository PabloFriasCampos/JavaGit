import java.util.Scanner;
/**
 * PFC 
 * 
 * FinDeSemana.java
 * 
 * Dado un dia, hora y minutos calcula cuanto queda para que empiece el fin de semana 
 */

public class FinDeSemana {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Voy a considerar que el fin de semana termina el Lunes a las 00:00
    System.out.println("¿Qué dia de la semana es? (1-5)");
    System.out.println("1. Lunes");
    System.out.println("2. Martes");
    System.out.println("3. Miércoles");
    System.out.println("4. Jueves");
    System.out.println("5. Viernes");
    System.out.print("Tu elección: ");
    int eleccion = s.nextInt();
    System.out.print("Qué hora es (0-23): ");
    int horas = s.nextInt();
    System.out.print("Qué minuto es (0-59): ");
    int minutos = s.nextInt();
    int totalMinutos = (24 * 60 * 4) + (15*60);
    switch(eleccion){
      case 1:
        minutos += (horas*60);
        System.out.println("Quedan " + (totalMinutos - minutos) + " minutos para que empiece el fin de semana");
        break;
      
      case 2:
        minutos += (horas*60) + (24*60);
        System.out.println("Quedan " + (totalMinutos - minutos) + " minutos para que empiece el fin de semana");
        break;

      case 3:
        minutos += (horas*60) + (24*60*2);
        System.out.println("Quedan " + (totalMinutos - minutos) + " minutos para que empiece el fin de semana");
        break;

      case 4:
        minutos += (horas*60) + (24*60*3);
        System.out.println("Quedan " + (totalMinutos - minutos) + " minutos para que empiece el fin de semana");
        break;

      case 5:
        minutos += (horas*60) + (24*60*4);
        System.out.println("Quedan " + (totalMinutos - minutos) + " minutos para que empiece el fin de semana");
        break;
      
      default:
        System.out.println("Dia incorrecto.");

    }

  }

}
