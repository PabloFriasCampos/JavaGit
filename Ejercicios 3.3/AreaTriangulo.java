import java.util.Scanner;
/**
 * PFC
 * 
 * AreaTriangulo.java
 * 
 * Muestra el area de un triangulo dada su base y altura
 */

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la base y la altura del triangulo: ");
        double base, altura;
        base = s.nextDouble();
        altura = s.nextDouble();
        System.out.printf("El area del triangulo de base %.2f y altura %.2f es %.2f", base, altura, (base*altura)/2);
        s.close();

    }

}
