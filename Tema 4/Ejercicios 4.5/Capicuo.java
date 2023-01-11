import java.util.Scanner;
/**
 * PFC 
 * 
 * Capicuo.java
 * 
 * Comprueba si un numero introducido es capicuo (Máximo 5 cifras)
 */

public class Capicuo{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean capicuo = false;
    System.out.print("Introduce el número (Máximo 5 cifras): ");
    int n = s.nextInt();
    if(n < 10){
      capicuo = true;

    }
    else if(n < 100){
      if((n%10) == (n/10)){
        capicuo = true;

      }

    }
    else if(n < 1000){
      if((n%10) == (n/100)){
        capicuo = true;

      }

    }
    else if(n < 10000){
      boolean semi1 = false;
      boolean semi2 = false;
      if((n%10) == (n/1000)){
        semi1 = true;
        
      }
      if((n/10)%10 == (n/100)%10){
        semi2 = true;

      }
      if(semi1 && semi2){
        capicuo = true;

      }
      

    }
    else if(n < 100000){
      boolean semi1 = false;
      boolean semi2 = false;
      if((n%10) == (n/10000)){
        semi1 = true;
        
      }
      if((n/10)%10 == (n/1000)%10){
        semi2 = true;

      }
      if(semi1 && semi2){
        capicuo = true;

      }
      

    }else{
      System.out.println("Número no válido.");
      
    }
    if(capicuo){
      System.out.println("El número introducido ES capicúo.");

    }else{
      System.out.println("El número introducido NO es capicúo.");

    }


  }

}