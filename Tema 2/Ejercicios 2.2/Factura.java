/* 
* Factura.java
*
* PFC
*/

public class Factura {
    public static void main(String[] args) {
        final double IVA = 1.21;
        double base = 1500.20;
        int total;
        total = (int) (base * IVA);
        System.out.println("El precio total en int es: " + total);
        double total1 = base * IVA;
        System.out.println("El precio total en double es: " + total1);


    }

}
