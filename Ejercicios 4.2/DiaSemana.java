import java.util.Scanner;
/**
* DiaSemana.java
* 
* Sentencia múltiple (switch)
*
* PFC
* 
* Ejemplo copiado
*/

public class DiaSemana {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un numero de dia: ");
    int dia = s.nextInt();
    String nombreDia;
    switch (dia) {
      case 1:
        nombreDia = "Lunes";
        break;
      case 2:
        nombreDia = "Martes";
        break;
      case 3:
        nombreDia = "Miércoles";
        break;
      case 4:
        nombreDia = "Jueves";
        break;
      case 5:
        nombreDia = "Viernes";
        break;
      case 6:
        nombreDia = "Sábado";
        break;
      case 7:
        nombreDia = "Domingo";
        break;
      default:
        nombreDia = "no existe ese dia";
    }
    System.out.println("Dia " + dia + ": " + nombreDia);
  }
}