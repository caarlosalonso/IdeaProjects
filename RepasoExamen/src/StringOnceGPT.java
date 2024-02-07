import java.util.Scanner;

public class StringOnceGPT {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Llamar a la función para contar las palabras y mostrar el resultado
        int numeroPalabras = contarPalabras(frase);
        System.out.println("Número de palabras: " + numeroPalabras);
    }

    // Función para contar el número de palabras en una frase
    private static int contarPalabras(String frase) {
        // Dividir la cadena en palabras utilizando el espacio como delimitador
        String[] palabras = frase.split("\\s+");

        // Devolver la longitud del array, que representa el número de palabras
        return palabras.length;
    }
}
