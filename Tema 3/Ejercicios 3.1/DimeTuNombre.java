/**
* Lectura de datos desde teclado
* DimeTuNombre.java
* PFC
* Ejemplo copiado
*/
public class DimeTuNombre {
    public static void main(String[] args) {
        String nombre, apellido1, apellido2;
        System.out.print("Por favor, dime cómo te llamas: ");
        nombre = System.console().readLine();
        System.out.print("Por favor, dime tu primer apellido: ");
        apellido1 = System.console().readLine();
        System.out.print("Por favor, dime tu segundo apellido: ");
        apellido2 = System.console().readLine();
        System.out.println("Hola " + nombre + " " + apellido1 + " " + apellido2 + ", ¡encantado de conocerte!");
    }
}