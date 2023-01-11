/**
* ConversorInverso.java
* PFC
*/
public class ConversorInverso {
    public static void main(String[] args) {
        final double conversion = 166.3860;
        String linea;
        System.out.print("Por favor, introduce la cantidad de pesetas que desea convertir a euros: ");
        linea = System.console().readLine(); 
        int pesetas; 
        pesetas = Integer.parseInt( linea ); 
        double euros = (double) (pesetas / conversion);
        System.out.printf(pesetas + " pesetas equivalen a %.2f euros", euros);

    }

}