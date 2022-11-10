/**
 * PFC
 * 
 * Operaciones.java
 * 
 * Mostrar por pantalla calculos con numeros dados
 * 
 */

public class Operaciones{
    public static void main(String[] args) {
        String linea;
        System.out.print("Por favor, introduce un número: "); //Leer primer numero
        linea = System.console().readLine(); 
        double primerNumero; 
        primerNumero = Double.parseDouble( linea ); 
        System.out.print("introduce otro, por favor: "); //Leer segundo numero
        linea = System.console().readLine(); 
        double segundoNumero; 
        segundoNumero = Double.parseDouble( linea ); 
        System.out.print("El primer número introducido es " + primerNumero); 
        System.out.println(" y el segundo es " + segundoNumero); 
        double total; 
        total = primerNumero + segundoNumero; //Suma
        System.out.print("La suma de ambos numeros es: ");
        System.out.println(total);
        total = primerNumero - segundoNumero; //Resta
        System.out.print("La resta de ambos numeros es: ");
        System.out.println(total);
        total = primerNumero * segundoNumero; //Multiplicacion
        System.out.printf("La multiplicacion de ambos numeros es: %.2f \n", total);
        total = primerNumero / segundoNumero; // Division
        System.out.printf("La division de ambos numeros es: %.2f", total);

    }

}