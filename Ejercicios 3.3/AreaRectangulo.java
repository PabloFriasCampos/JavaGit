import java.util.Scanner;
/**
 * PFC
 * 
 * AreaRectangulo.java
 * 
 * Muestra el area de un rectangulo dada su base y altura
 */

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la base y la altura del recctangulo: ");
        double base, altura;
        base = s.nextDouble();
        altura = s.nextDouble();
        System.out.printf("El area del rectangulo de base %.2f y altura %.2f es %.2f", base, altura, (base*altura));
        s.close();

    }

}