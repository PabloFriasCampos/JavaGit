import java.util.Scanner;
import java.lang.Math;
/**
 * PFC
 * 
 * VolumenCono.java
 * 
 * Muestra el volumen de un cono dado su radio y su altura
 */

public class VolumenCono {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el radio y la altura del cono: ");
        double radio, altura;
        radio = s.nextDouble();
        altura = s.nextDouble();
        System.out.printf("El volumen del cono de radio %.2f y altura %.2f es %.2f", radio, altura, (Math.PI*Math.pow(radio, 2)*altura)/3);
        s.close();

    }

}
