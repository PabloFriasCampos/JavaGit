/**
 * PFC
 * 
 * OrdenPares.java
 * 
 * 20 numeros aleatorios, ordenamos el array con los pares al inicio del array
 */

public class OrdenPares {
  public static void main(String[] args) {
    int[] n = new int[20];
    for(int i=0;i<20;i++){
      n[i] = (int) (Math.random()*101);

    }
    System.out.println("Array sin ordenar");
    for(int i=0;i<20;i++){
      System.out.print(n[i] + " ");

    }
    int j=0;
    int aux = 0;
    for(int i=0;i<20;i++){
      if(n[i]%2==0){
        aux = n[j];
        n[j] = n[i];
        n[i] = aux;
        j++;

      }

    }
    System.out.println("\nArray ordenado");
    for(int i=0;i<20;i++){
      System.out.print(n[i] + " ");

    }

  }

}
