/**
 * PFC
 * 
 * AreaRectangulo.java
 * 
 * Muestra el area de un rectangulo con datos introducidos
 * 
 */

public class AreaRectangulo {
    public static void main(String[] args) {
        String linea;
        System.out.print("Por favor, introduce la base: "); // Leer base
        linea = System.console().readLine(); 
        double base; 
        base = Double.parseDouble( linea ); 
        System.out.print("Introduce la altura, por favor: "); // Leer altura
        linea = System.console().readLine(); 
        double altura; 
        altura = Double.parseDouble( linea );
        System.out.print("La base introducida es " + base); 
        System.out.println(" y la altura es " + altura); 
        double total; 
        total = base * altura; // Calcula y muestra el area
        System.out.print("El area del rectangulo es: ");
        System.out.println(total);

    }

}
