import java.util.Scanner;
/**
 * PFC
 * 
 * Operaciones.java
 * 
 * Muestra la suma, resta, multiplicacion y division de dos numeros dados
 */

public class Operaciones {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce ambos numeros para operar con ellos: ");
        double numero1, numero2;
        numero1 = s.nextDouble();
        numero2 = s.nextDouble();
        System.out.printf("La suma de %.2f y %.2f es %.2f\n", numero1, numero2, (numero1+numero2));
        System.out.printf("La resta de %.2f y %.2f es %.2f\n", numero1, numero2, (numero1-numero2));
        System.out.printf("La multiplicacion de %.2f y %.2f es %.2f\n", numero1, numero2, (numero1*numero2));
        System.out.printf("La division de %.2f y %.2f es %.2f\n", numero1, numero2, (numero1/numero2));
        s.close();

    }

}
