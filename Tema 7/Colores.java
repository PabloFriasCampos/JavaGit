import java.util.Scanner;
/**
 * PFC
 * 
 * Colores.java
 * 
 * En un array de 8 palabras, ordena los colores primero y el resto despues
 */

public class Colores {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[] colores = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
    String[] palabras = new String[8];
    int k = 0;
    String aux;
    boolean esta = false;
    for(int i=0;i<8;i++){
      System.out.print("Introduce tu palabra: ");
      palabras[i] = s.next();

    }
    System.out.println("Array original:");
    for(int i=0;i<8;i++){
      System.out.print(palabras[i] + "  ");

    }
    for(int i=0;i<8;i++){
      for(int j=0;j<9;j++){
        if(palabras[i].equalsIgnoreCase(colores[j])){
          esta = true;

        }

      }
      if(esta){
        aux = palabras[i];
        palabras[i] = palabras[k];
        palabras[k] = aux;
        k++;
        esta = false;

      }

    }
    System.out.println("\nArray ordenado:");
    for(int i=0;i<8;i++){
      System.out.print(palabras[i] + "  ");

    }

  }

}
