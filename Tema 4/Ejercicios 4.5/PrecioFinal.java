import java.util.Scanner;
/**
 * PFC 
 * 
 * PrecioFinal.java
 * 
 * Calcula el precio final de un producto dado su precio base, el iva y codigo de descuento
 */

public class PrecioFinal {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la base imponible: ");
    double base = s.nextDouble();
    System.out.print("Introduzca el IVA (general, reducido o superreducido): ");
    String eleccion = s.next();
    eleccion.toLowerCase();
    double iva;
    switch(eleccion){
      case "general":
        iva = 21;
        break;

      case "reducido":
        iva = 10;
        break;

      case "superreducido":
        iva = 4;
        break;

      default: 
        System.out.println("IVA incorrecto.");
        iva = 0;

    }

  System.out.print("Introduzca el código promocional (nopro, mitad, menos5 o porc5): ");
  String codigo = s.next();
  System.out.println("Base imponible: " + base);
  System.out.println("IVA (" + iva + "%): " + (base * (iva/100)));
  System.out.println("Precio con IVA: " + (base + (base * (iva/100))));

  if(codigo.equalsIgnoreCase("mitad")){
    System.out.println("Cod.Promo. (" + codigo + "): -" + (base + (base * (iva/100)))/2 );
    System.out.println("TOTAL: " + ( (base + (base * (iva/100))) / 2));

  }
  if(codigo.equalsIgnoreCase("menos5")){
    System.out.println("Cod.Promo. (" + codigo + "): " + "-5");
    System.out.println("TOTAL: " + ( (base + (base * (iva/100))) - 5));
    
  }
  if(codigo.equalsIgnoreCase("porc5")){
    System.out.println("Cod.Promo. (" + codigo + "): " + " -" + ((base + (base * (iva/100))) * 0.05));
    System.out.println("TOTAL: " + ( (base + (base * (iva/100))) - ((base * (iva/100)) * 0.05)));
    
  }
  
  }

}
