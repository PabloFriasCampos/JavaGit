import java.util.Scanner;
/**
 * PFC
 * 
 * ConversorEurosPesetas.java
 * 
 * Convierte un numero de euros dado en pesetas y muestra el resultado
 */

public class Factura {
    public static void main(String[] args) {
        final double IVA = 1.21;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el precio base de la factura: ");
        double base = s.nextDouble();
        System.out.printf("El precio total aplicando el IVA es de %.2f", base*IVA);
        s.close();

    }

}
