/* Conversión de tipos
*
* PFC
*
* Ejemplo copiado*/
public class ConversionTipos {
    public static void main(String[] args) {
        int x = 2;
        int y = 9;
        double division;
        division = (double) y / (double) x;
        System.out.println("El resultado de la división con doble casting es: " + division);
        division = y / (double) x;
        System.out.println("El resultado de la división con casting al denominador es: " + division);
        division = y / x;
        System.out.println("El resultado de la división sin casting es: " + division);
        division = (double) (y / x);
        System.out.println("El resultado de la división con casting al total es: " + division);
    }
}
