import java.util.Scanner;
/**
 * PFC
 * 
 * ConversorEurosPesetas.java
 * 
 * Convierte un numero de euros dado en pesetas y muestra el resultado
 */

public class ConversorEurosPesetas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double conversion = 166.3860;
        System.out.print("Por favor, introduce la cantidad de euros que desea convertir a pesetas: ");
        double euros;
        int pesetas;
        euros = s.nextDouble();
        pesetas = (int) (euros * conversion);
        System.out.printf("%.2f pesetas equivalen a " + pesetas + " pesetas", euros);
        s.close();

    }

}

