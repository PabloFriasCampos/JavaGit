/**
 * PFC
 * 
 * CuadradoCubo.java
 * 
 * Se tiene una lista de 20 numeros aleatorios entre 0 y 100, en otra sus cuadrados y en otra sus cubos
 */

public class CuadradoCubo {
  public static void main(String[] args) {
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    for(int i=0;i<20;i++){
      numero[i] = (int) (Math.random() * 101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = numero[i] * numero[i] * numero[i];

    }
    System.out.println("Nº  Cuadrado  Cubo");
    for(int i=0;i<20;i++){
      System.out.printf("%d %7d %8d\n", numero[i], cuadrado[i], cubo[i]);

    }

  }

}
