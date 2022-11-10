/**
 * PFC
 * 
 * Factura.java
 * 
 * Muestra el precio aplicando el IVA a una base dada
 * 
 */

public class Factura {
    public static void main(String[] args) {
        final double IVA = 1.21;
        String linea;
        System.out.print("Introduce el precio sin IVA: "); // Leemos el precio base
        linea = System.console().readLine();
        double base;
        base = Double.parseDouble(linea);
        double total;
        total = (base * IVA); // Calculamos y mostramos el precio total
        System.out.printf("El precio total es: %.2f" , total);


    }

}
