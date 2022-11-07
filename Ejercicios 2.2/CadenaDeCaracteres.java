/* 
* CadenaDeCaracteres.java
*
* PFC
*/

public class CadenaDeCaracteres {
    public static void main(String[] args) {
        char letra1 = 'A';
        char letra2 = 'R';
        char letra3 = 'R';
        char letra4 = 'O';
        char letra5 = 'Z';
        String cadena = letra1 + "" + letra2 + "" + letra3 + "" + letra4 + "" + letra5;
        System.out.println("La cadena resultante es " + cadena);
        //He usado "" entre cada concatenación para que no tome como valor el int asociado al codigo ASCII de los caracteres;

    }

}
