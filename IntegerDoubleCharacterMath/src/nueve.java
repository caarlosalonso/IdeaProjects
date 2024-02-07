import java.util.Scanner;

public class nueve {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String cadena = teclado.nextLine();

        System.out.println(cadena.length());

        char caracter=0;
        while(caracter <= cadena.length()) {
            caracter = cadena.charAt(0);
            
        }

        Character.isDigit(caracter);
        System.out.printf("Es dígito: %b\n", Character.isDigit(caracter));

        /*
        boolean contieneSubcadena = cadena.contains();
        System.out.println("La cadena contiene subcadena " + contieneSubcadena);

        char caracter = 0;
        while (caracter >= cadena.length()) {
            caracter = cadena.charAt(cadena.length());
        */


    }
}