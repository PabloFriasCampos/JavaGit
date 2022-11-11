import java.util.Scanner;
/**
 * PFC
 * 
 * Nota.java
 * 
 * Muestra la nota necesaria en el segundo control para alcanzar una nota deseada teniendo en cuenta el primer control
 */

public class Nota {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double examen1 = s.nextDouble();
        System.out.print("Introduce la nota final deseada: ");
        double nota = s.nextDouble();
        double examen2 = ((nota - (examen1*0.4))/0.6);
        System.out.printf("Para tener un %.2f en el trimestre necesitas sacar un %.2f en el segundo examen", nota, examen2);
        s.close();
        
    }

}
