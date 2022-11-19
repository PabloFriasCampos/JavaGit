import java.util.Scanner;
/**
* MenuAreas.java
* 
* Menu con switch
*
* PFC
* 
*/

public class MenuAreas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(" CÁLCULO DE ÁREAS");
    System.out.println(" ----------------");
    System.out.println(" 1. Triángulo");
    System.out.println(" 2. Rombo");
    System.out.println(" 3. Romboide");
    System.out.println(" 4. Trapecio");
    System.out.print("\n Elija una opción (1-4): ");
    int opcion = s.nextInt();
    switch (opcion) {
      case 1:
        double base;
        double altura;
        System.out.print("\nIntroduzca la base del triángulo en cm: ");
        base = s.nextDouble();
        System.out.print("Introduzca la altura del triángulo en cm: ");
        altura = s.nextDouble();
        System.out.println("El área del triángulo es " + ((base * altura) / 2) + " cm2");
        break;
      case 2:
        double diagonalMayor;
        double diagonalMenor;
        System.out.print("\nIntroduzca la diagonal mayor del rombo en cm: ");
        diagonalMayor = s.nextDouble();
        System.out.print("Introduzca la diagonal menor del rombo en cm: ");
        diagonalMenor = s.nextDouble();
        System.out.println("El área del rombo es " + ((diagonalMayor * diagonalMenor) / 2) + " cm2");
        break;
      case 3:
        double baseR;
        double alturaR;
        System.out.print("\nIntroduzca la base del romboide en cm: ");
        baseR = s.nextDouble();
        System.out.print("Introduzca la altura del romboide en cm: ");
        alturaR = s.nextDouble();
        System.out.println("El área del romboide es " + (baseR * alturaR) + " cm2");
        break;
      case 4:
        double baseMayor;
        double baseMenor;
        double alturaT;
        System.out.print("\nIntroduzca la base mayor del trapecio en cm: ");
        baseMayor = s.nextDouble();
        System.out.print("\nIntroduzca la base menor del trapecio en cm: ");
        baseMenor = s.nextDouble();
        System.out.print("\nIntroduzca la altura del trapecio en cm: ");
        alturaT = s.nextDouble();
        System.out.println("El area del trapecio es " + (baseMayor * baseMenor * alturaT)/2 + " cm2");
        break;
      default:
        System.out.print("\nLo siento, la opción elegida no es correcta.");
    }
  }
}
