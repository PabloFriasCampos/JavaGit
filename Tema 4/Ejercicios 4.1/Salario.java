import java.util.Scanner;
/**
 * PFC
 * 
 * Salario.java
 * 
 * Programa que muestra el salario semanal teniendo en cuenta el numero de horas trabajadas y las horas extra
 */

public class Salario {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("¿Cuantas horas has trabajado esta semana? ");
    int horas = s.nextInt();
    int sueldo;
    if(horas<=40){
      sueldo = horas * 12;

    }else{
      sueldo = 40 * 12;
      horas = horas - 40;
      sueldo = sueldo + (horas * 16);

    }
    System.out.println("El sueldo que le corresponde es de " + sueldo + " euros.");

  }

}
