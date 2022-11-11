import java.util.Scanner;
/**
 * PFC
 * 
 * ConversorKb.java
 * 
 * Muestra la cantidad de Mb que equivalen a unos Kb dados
 */

public class ConversorKb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la cantidad de Kb: ");
        int kb = s.nextInt();
        System.out.print(kb + " Kb equivalen a " + (kb/1024) + " Mb");
        s.close();

    }

}