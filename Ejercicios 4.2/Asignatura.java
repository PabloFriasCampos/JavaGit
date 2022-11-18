import java.util.Scanner;
/**
* Asignaturas.java
* 
* Muestra la asignatura que hay a primera hora del dia introducido
*
* PFC
* 
*/

public class Asignatura {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor introduce un numero de dia: ");
    int dia = s.nextInt();
    switch(dia){
      case 1:
        System.out.println("Los lunes a primera hora hay Sistemas Informáticos.");
        break;
      case 2:
        System.out.println("Los martes a primera hora hay Programación.");
        break;
      case 3:
        System.out.println("Los miércoles a primera hora hay Sistemas Informáticos.");
        break;
      case 4:
        System.out.println("Los jueves a primera hora hay Programación.");
        break;
      case 5:
        System.out.println("Los viernes a primera hora hay Programación.");
        break;
      case 6:
        System.out.println("Los sabados no hay clase.");
        break;
      case 7:
        System.out.println("Los domingos no hay clase.");
        break;
      default:
        System.out.println("Dia inválido.");
    }

  }

}
