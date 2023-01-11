import java.util.Scanner;
/**
 * PFC
 * 
 * PiramideHueca.java
 * 
 * Escribe una piramide hueca de una altura dada con un caracter dado
 */

public class PiramideHueca {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Que carácter va a dibujar la pirámide: ");
    String c = s.next();
    c+="   ";
    System.out.print("Qué altura tendrá la pirámide: ");
    int altura = s.nextInt();
    for(int i=1;i<=altura;i++){
      for(int k=0;k<altura-i;k++){
        System.out.print("  ");

      }
      for(int j=0;j<i;j++){
        if(j==0||j==i-1){
          System.out.print(c);

        }else{
          System.out.print("    ");

        }

      }
      System.out.println();

    }

  }

}
