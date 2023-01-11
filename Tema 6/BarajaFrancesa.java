/**
* PFC
*
* BarajaFrancesa.java
*
* Coge una carta aleatoria de la baraja francesa (A,2,3,4,5,6,7,8,9,10,J,Q,K)
*/

public class BarajaFrancesa {
  public static void main(String[] args) {
    int n = (int) (Math.random()*13)+1;
    String carta;
    switch(n){
      case 1:
        carta = "A";
        break;
      
      case 11:
        carta = "J";
        break;

      case 12:
        carta = "Q";
        break;

      case 13:
        carta = "K";
        break;

      default:
        carta = String.valueOf(n);

    }
    System.out.println(carta);

  }

}
