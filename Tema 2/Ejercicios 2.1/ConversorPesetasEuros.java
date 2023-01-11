/*
 * PFC
 * 
 * ConversorPesetasEuros.java
 * 
 */

public class ConversorPesetasEuros {
    public static void main(String[] args) {
        double euros = 739.31;
        final double conversion = 166.3860;

        System.out.printf(euros + " euros equivalen a %.2f pesetas" , (euros*conversion));

    }

}
