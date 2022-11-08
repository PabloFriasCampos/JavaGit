/**
* Lectura de datos desde teclado
* LeeNumerosDecimales.java
* PFC
* Ejemplo copiado
*/
public class LeeNumerosDecimales {
    public static void main(String[] args) {
        String linea; //Declaracion variable tipo String
        System.out.print("Por favor, introduce un número: "); // Imprime por pantalla
        linea = System.console().readLine(); //Leo por pantalla la variable linea
        double primerNumero; //Declaracion variable tipo double
        primerNumero = Double.parseDouble( linea ); //La variable linea es interpretada como un double
        System.out.print("introduce otro, por favor: "); //Imprime por pantalla
        linea = System.console().readLine(); //Leo por pantalla la variable linea
        double segundoNumero; //Declaracion variable tipo double
        segundoNumero = Double.parseDouble( linea ); //La variable linea es interpretada como un double
        double total; //Declaracion variable tipo double
        total = (2 * primerNumero) + segundoNumero; //Calculo el total
        System.out.print("El primer número introducido es " + primerNumero); //Muestro por pantalla
        System.out.println(" y el segundo es " + segundoNumero); //Muestro por pantalla
        System.out.print("El doble del primer número más el segundo es "); //Muestro por pantalla
        System.out.print(total); //Muestro por pantalla
    }
}
