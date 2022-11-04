/*
 * PFC
 * 
 * ConversorEurosPesetas.java
 * 
 */

public class ConversorEurosPesetas {
    public static void main(String[] args) {
        double pesetas = 123010.90;
        final double conversion = 166.3860;

        System.out.printf(pesetas + " pesetas equivalen a %.2f euros" , (pesetas/conversion));

    }

}
