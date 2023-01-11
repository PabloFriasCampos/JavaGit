/**
* PFC
*
* Dados.java
*
* Muestra la tirada de 3 dados y la suma de los 3 numeros
*/

public class Dados {
  public static void main(String[] args) {
    int d1,d2,d3;
    d1 = (int) (Math.random()*6)+1;
    d2 = (int) (Math.random()*6)+1;
    d3 = (int) (Math.random()*6)+1;
    System.out.println("Dado 1 -> " + d1);
    System.out.println("Dado 2 -> " + d2);
    System.out.println("Dado 3 -> " + d3);
    System.out.println("Suma de los 3 -> " + (d1+d2+d3));

  }

}
