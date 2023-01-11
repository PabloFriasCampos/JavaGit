import java.util.Scanner;
/**
 * PFC
 * 
 * ParesImpares.java
 * 
 * Obtiene los numeros pares e impares de dos numeros dados
 */

public class ParesImpares {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String pares = "";
    String impares = "";
    System.out.print("Introduce el primer número: ");
    int n1 = s.nextInt();
    System.out.print("Introduce el segundo número: ");
    int n2 = s.nextInt();
    while(n1>9){
      if((n2%10)%2==0){
        pares = n2%10 + pares; 

      }else{
        impares = n2%10 + impares;

      }
      if((n1%10)%2==0){
        pares = n1%10 + pares; 

      }else{
        impares = n1%10 + impares;

      }
      n1 = n1/10;
      n2 = n2/10;

    }
    if(n2%2==0){
      pares = n2%10 + pares;

    }else{
      impares = n2%10 + impares;

    }
    if(n1%2==0){
      pares = n1%10 + pares;

    }else{
      impares = n1%10 + impares;

    }
    System.out.println("El número formado por los dígitos pares es: " + pares);
    System.out.println("El número formado por los dígitos impares es: " + impares);

  }

}
