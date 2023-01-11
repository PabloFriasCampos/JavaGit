/**
 * PFC
 * 
 * Ejercicio2.java
 * 
 * Array de 10 posiciones (char), se inicializan algunas y se observa que ocurre con el resto
 */

public class Ejercicio2 {
  public static void main(String[] args) {
    char[] simbolo = new char[10];
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    for(int i=0;i<10;i++){
      System.out.println("El valor de la posicion [" + i + "] es " + simbolo[i]);

    }
    //Los elementos no iniciados se inicializan a ' ' automaticamente

  }

}
