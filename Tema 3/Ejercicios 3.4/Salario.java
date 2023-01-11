import java.util.Scanner;
/**
 * PFC
 * 
 * Salario.java
 * 
 * Muestra el salario semanal de un empleado segun las horas que trabaja
 */

 public class Salario{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("¿Cuantas horas has trabajado esta semana?");
        int horas = s.nextInt();
        System.out.print("Tu salario semanal es de " + (horas*12) + " euros");
        s.close();

    }

 }