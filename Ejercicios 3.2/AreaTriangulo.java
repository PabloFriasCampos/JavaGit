/**
 * PFC
 * 
 * AreaTriangulo.java
 * 
 * Muestra el area de un triangulo con datos introducidos
 * 
 */
import java.lang.Math;

public class AreaTriangulo {
    public static void main(String[] args) {
        String linea;
        System.out.print("Por favor, introduce el lado del triangulo (equilatero): "); // Leer lado
        linea = System.console().readLine(); 
        double lado; 
        lado = Double.parseDouble( linea ); 
        double altura;
        altura = Math.sqrt(Math.pow(lado,2)-Math.pow(lado/2, 2)); // Calculo la altura usando pitagoras
        double total; 
        total = (lado * altura)/2; // Calcula y muestra el area
        System.out.printf("El area del triangulo de lado " + lado + " es: %.2f" , total);
    
    }

}
