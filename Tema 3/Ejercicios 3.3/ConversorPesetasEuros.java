import java.util.Scanner;
/**
 * PFC
 * 
 * ConversorPesetasEuros.java
 * 
 * Convierte un numero de pesetas dado en euros y muestra el resultado
 */

public class ConversorPesetasEuros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double conversion = 166.3860;
        System.out.print("Por favor, introduce la cantidad de pesetas que desea convertir a euros: ");
        double euros;
        int pesetas;
        pesetas = s.nextInt();
        euros = pesetas / conversion;
        System.out.printf(pesetas + " pesetas equivalen a %.2f euros", euros);
        s.close();

    }

}
