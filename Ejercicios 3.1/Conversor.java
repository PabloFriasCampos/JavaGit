/**
* Conversor.java
* PFC
*/
public class Conversor {
    public static void main(String[] args) {
        final double conversion = 166.3860;
        String linea;
        System.out.print("Por favor, introduce la cantidad de euros que desea convertir a pesetas: ");
        linea = System.console().readLine(); 
        double euros; 
        euros = Double.parseDouble( linea ); 
        int pesetas = (int) (euros * conversion);
        System.out.println(euros + " euros equivalen a " + pesetas + " pesetas");

    }

}
