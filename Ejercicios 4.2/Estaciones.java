import java.util.Scanner;
/**
* Estaciones.java
* 
* Sentencia múltiple (switch) englobando mas de un caso
*
* PFC
* 
*/

public class Estaciones {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un numero de mes: ");
    int mes = s.nextInt();
    String nombreEstacion;
    switch (mes) {
      case 1:
      case 2:
      case 3:
        nombreEstacion = "Invierno (Enero, Febrero, Marzo)";
        break;
      case 4:
      case 5:
      case 6:
        nombreEstacion = "Primavera (Abril, Mayo, Junio)";
        break;
      case 7:
      case 8:
      case 9:
        nombreEstacion = "Verano (Julio, Agosto, Septiembre)";
        break;
      case 10:
      case 11:
      case 12:
        nombreEstacion = "Otoño (Octubre, Noviembre, Diciembre)";
        break;
      default:
        nombreEstacion = "(Mes no válido)";
    }
    System.out.println("El mes " + mes + " pertenece a " + nombreEstacion);
  }

}
