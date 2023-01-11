import java.util.Scanner;
/**
 * PFC
 * 
 * Multiplicacion.java
 * 
 * Muestra el resultado de la multiplicacion de 2 numeros dados
 */

 public class Multiplicacion{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Porfavor introduce dos numeros para calcular su multiplicacion: "); //Leemos por teclado los 2 numeros con Scanner
        double numero1, numero2;
        numero1 = s.nextDouble();
        numero2 = s.nextDouble();
        double resultado = numero1 * numero2;
        System.out.printf("El resultado de multiplicar %.2f y %.2f es %.2f", numero1, numero2, resultado);
        s.close();

    }

 }