import java.util.Scanner;

public class StringNueve {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*
        9- Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se
        introducen por teclado.
        */

        String nombreCompleto = "Carlos Alonso Cubillo";

        nombreCompleto = nombreCompleto.toLowerCase();

        System.out.println("Introduce un substring: ");
        String subcadena = teclado.nextLine();

        subcadena = subcadena.toLowerCase();

        Boolean contieneSubcadena = nombreCompleto.contains(subcadena);
        System.out.println("La cadena tiene subcadena: " + contieneSubcadena);


    }
}
