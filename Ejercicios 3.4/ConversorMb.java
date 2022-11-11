import java.util.Scanner;
/**
 * PFC
 * 
 * ConversorMb.java
 * 
 * Muestra la cantidad de Kb que equivalen a unos Mb dados
 */

public class ConversorMb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la cantidad de Mb: ");
        int mb = s.nextInt();
        System.out.print(mb + " Mb equivalen a " + (mb*1024) + " Kb");
        s.close();

    }

}
