/**
* Lectura de datos desde teclado
* LeeNumeros.java
* PFC
* Ejemplo copiado
*/
public class LeeNumeros {
    public static void main(String[] args) {
        String linea; //Declaracion variable tipo String
        System.out.print("Por favor, introduce un número: "); // Imprime por pantalla
        linea = System.console().readLine(); //Leo por pantalla la variable linea
        int primerNumero; //Declaracion variable tipo int
        primerNumero = Integer.parseInt( linea ); //La variable linea es interpretada como un int
        System.out.print("introduce otro, por favor: "); //Imprime por pantalla
        linea = System.console().readLine(); //Leo por pantalla la variable linea
        int segundoNumero; //Declaracion variable tipo int
        segundoNumero = Integer.parseInt( linea ); //La variable linea es interpretada como un int
        int total; //Declaracion variable tipo int
        total = (2 * primerNumero) + segundoNumero; //Calculo el total
        System.out.print("El primer número introducido es " + primerNumero); //Muestro por pantalla
        System.out.println(" y el segundo es " + segundoNumero); //Muestro por pantalla
        System.out.print("El doble del primer número más el segundo es "); //Muestro por pantalla
        System.out.print(total); //Muestro por pantalla
    }
}

