import java.util.Scanner;
/**
 * PFC
 * 
 * Cuestionario.java
 * 
 * Un cuestionario de 10 preguntas que te muestra tu nota
 */

public class Cuestionario {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int nota = 0;
    String seleccion;
    System.out.println("\nRESPONDA ÚNICAMENTE USANDO LA LETRA CORRECTA");
    System.out.println("\n1. El código de java debe ser guardado en formato:");
    System.out.println("a) .zip");
    System.out.println("b) .cpp");
    System.out.println("c) .java");
    System.out.print("Tu respuesta: ");
    seleccion = s.next();
    if(seleccion.equalsIgnoreCase("c")){
      nota++;

    }
    System.out.println("\n2. ¿De cuantos espacios es la sangría según el estándar de google?:");
    System.out.println("a) Tres");
    System.out.println("b) Dos");
    System.out.println("c) Cuatro");
    System.out.print("Tu respuesta: ");
    seleccion = s.next();
    if(seleccion.equalsIgnoreCase("b")){
      nota++;

    }
    System.out.println("\n3. La etiqueta para escribir en negrita en html es:");
    System.out.println("a) <bold>");
    System.out.println("b) <bb>");
    System.out.println("c) <b>");
    System.out.print("Tu respuesta: ");
    seleccion = s.next();
    if(seleccion.equalsIgnoreCase("c")){
      nota++;

    }
    System.out.println("\n4. El código `title` en html:");
    System.out.println("a) Pone el nombre del documento en la barra del título");
    System.out.println("b) Pone el texto en el pie de página");
    System.out.println("c) Pone el nombre a la barra de herramientas");
    System.out.print("Tu respuesta: ");
    seleccion = s.next();
    if(seleccion.equalsIgnoreCase("a")){
      nota++;

    }
    System.out.println("\n5. El código 'a' sirve para:");
    System.out.println("a) Descargar una imagen");
    System.out.println("b) Crear un enlace");
    System.out.println("c) Crear un directorio");
    System.out.print("Tu respuesta: ");
    seleccion = s.next();
    if(seleccion.equalsIgnoreCase("b")){
      nota++;

    }
    System.out.println("\n6. Que clase importada es capaz de leer de teclado en Java:");
    System.out.println("a) Console.In()");
    System.out.println("b) ReadLine");
    System.out.println("c) Scanner");
    System.out.print("Tu respuesta: ");
    seleccion = s.next();
    if(seleccion.equalsIgnoreCase("c")){
      nota++;

    }
    System.out.println("\n7. Que tipo de dato debemos usar para almacenar 't':");
    System.out.println("a) Boolean");
    System.out.println("b) char");
    System.out.println("c) String");
    System.out.print("Tu respuesta: ");
    seleccion = s.next();
    if(seleccion.equalsIgnoreCase("b")){
      nota++;

    }
    System.out.println("\n8. Con que instruccion podemos hacer una salida por pantalla formateada:");
    System.out.println("a) System.out.print");
    System.out.println("b) System.out.println");
    System.out.println("c) System.out.printf");
    System.out.print("Tu respuesta: ");
    seleccion = s.next();
    if(seleccion.equalsIgnoreCase("c")){
      nota++;

    }
    System.out.println("\n9. Para guardar un número entero el mejor tipo de dato es:");
    System.out.println("a) int");
    System.out.println("b) double");
    System.out.println("c) float");
    System.out.print("Tu respuesta: ");
    seleccion = s.next();
    if(seleccion.equalsIgnoreCase("a")){
      nota++;

    }
    System.out.println("\n10. Como se llama a las cualidades de las entidades en Bases de Datos:");
    System.out.println("a) Atributos");
    System.out.println("b) Variables");
    System.out.println("c) Características");
    System.out.print("Tu respuesta: ");
    seleccion = s.next();
    if(seleccion.equalsIgnoreCase("a")){
      nota++;

    }

    System.out.println("\nHas sacado un " + nota + ".");

  }

}
