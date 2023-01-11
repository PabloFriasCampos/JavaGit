import java.util.Scanner;
/**
 * PFC
 * 
 * Ejemplo uso de Arrays
 */

public class ArrayEjemplo01{
  public static void main(String[] args) {
    int[] x = new int[10];
    Scanner s = new Scanner(System.in);
    int sumaPares = 0;
    for(int i=0;i<5;i++){ // Declaramos las primeras 5 posiciones como la potencia de 2 elevado a la posicion
      x[i] = (int) Math.pow(2, i);

    }
    x[5] = 88; //Declaramos el resto de posiciones del array
    x[6] = x[2] * 10;
    // La posicion 7 no la inicializamos para demostrar que se inicializa automaticamente a 0
    x[8] = x[0] + x[1] + x[2];
    x[9] = x[8];
    //Mostramos todas las posiciones y valores
    for(int i=0;i<10;i++){
      System.out.println("El valor de la posicion [" + i + "] es " + x[i]);

    }
    //Mostramos una posicion concreta que se introduce por teclado
    System.out.print("\nQué posición desea mostrar: ");
    int pos = s.nextInt();
    System.out.println("El valor de la posicion [" + pos + "] es " + x[pos]);
    //Mostramos las posiciones pares y calculamos la suma de sus valores
    System.out.println("\nLas posiciones pares: ");
    for(int i=0;i<10;i++){
      if(i%2==0){
        System.out.println("El valor de la posicion [" + i + "] es " + x[i]);
        sumaPares += x[i];

      }

    }
    System.out.println("La suma del valor de las posiciones pares es: " + sumaPares); //Mostramos la suma de los valores en las posiciones pares

  }

}