import java.util.Scanner;
/**
 * PFC
 * 
 * Horoscopo.java
 * 
 * Muestra tu horoscopo a partir de tu fecha de nacimiento
 */

public class Horoscopo{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el mes de tu nacimiento(1-12): ");
    int mes = s.nextInt();
    System.out.print("Introduce el dia de tu nacimiento: ");
    int dia = s.nextInt();
    switch(mes){
      case 4:
        if(dia > 19){
          System.out.println("Eres TAURO!");
  
        }else{
          System.out.println("Eres ARIES!");
  
        }
        break;
      case 5:
        if(dia > 20){
          System.out.println("Eres GEMINIS!");
  
        }else{
          System.out.println("Eres TAURO!");
  
        }
        break;
      case 6:
        if(dia > 20){
          System.out.println("Eres CANCER!");
  
        }else{
          System.out.println("Eres GEMINIS!");
  
        }
        break;
      case 7:
        if(dia > 22){
          System.out.println("Eres LEO!");
  
        }else{
          System.out.println("Eres CANCER!");
  
        }
        break;
      case 8:
        if(dia > 22){
          System.out.println("Eres VIRGO!");
  
        }else{
          System.out.println("Eres LEO!");
  
        }
        break;
      case 9:
        if(dia > 22){
          System.out.println("Eres LIBRA!");
  
        }else{
          System.out.println("Eres VIRGO!");
  
        }
        break;
      case 10:
        if(dia > 22){
          System.out.println("Eres ESCORPIO!");
  
        }else{
          System.out.println("Eres LIBRA!");
  
        }
        break;
      case 11:
        if(dia > 21){
          System.out.println("Eres SAGITARIO!");
  
        }else{
          System.out.println("Eres ESCORPIO!");
  
        }
        break;
      case 12:
        if(dia > 21){
          System.out.println("Eres CAPRICORNIO!");
  
        }else{
          System.out.println("Eres SAGITARIO!");
  
        }
        break;
      case 1:
        if(dia > 20){
          System.out.println("Eres ACUARIO!");
  
        }else{
          System.out.println("Eres CAPRICORNIO!");
  
        }
        break;
      case 2:
        if(dia > 19){
          System.out.println("Eres PISCIS!");
  
        }else{
          System.out.println("Eres ACUARIO!");
  
        }
        break;
      case 3:
        if(dia > 20){
          System.out.println("Eres ARIES!");
  
        }else{
          System.out.println("Eres PISCIS!");
  
        }
      
      default: 
        System.out.println("Mes erroneo.");

    }

  }

}