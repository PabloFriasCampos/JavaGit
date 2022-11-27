import java.util.Scanner;
/**
 * PFC 
 * 
 * Nomina.java
 * 
 * Genera una nómina según las condiciones de un empleado
 */

public class Nomina {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("1 - Programador Junior");
    System.out.println("2 - Programador Senior");
    System.out.println("3 - jefe de Proyecto");
    System.out.print("Introduzca el cargo del empleado (1-3): ");
    int cargo = s.nextInt();  
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int dias = s.nextInt();
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estado = s.nextInt();
    double sueldo = 0;
    System.out.println("-------------------------------------");

    switch(cargo){
      case 1: 
        sueldo += 950;
        System.out.println("Sueldo base: " + sueldo);
        break;

      case 2: 
        sueldo += 1200;
        System.out.println("Sueldo base: " + sueldo);
        break;

      case 3: 
        sueldo += 1600;
        System.out.println("Sueldo base: " + sueldo);
        break;

      default:
        System.out.println("Cargo incorrecto.");

    }

    System.out.println("Dietas (" + dias + " viajes): " + dias*30);
    System.out.println("-------------------------------------");
    System.out.println("Sueldo bruto: " + (sueldo + dias*30));
    double irpf = 0;
    switch(estado){
      case 1:
        irpf = (sueldo + dias*30)*0.25;
        System.out.println("Retención IRPF (25%): " + irpf);
        break;

      case 2:
        irpf = (sueldo + dias*30)*0.20;
        System.out.println("Retención IRPF (20%): " + irpf);
        break;

      default:
        System.out.println("Estado erróneo.");

    }
    System.out.println("-------------------------------------");
    System.out.println("Sueldo neto: " + ((sueldo + dias*30) - irpf));

  }
  
}
