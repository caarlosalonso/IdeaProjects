import java.util.Scanner;

public class BuscaCaracter {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        System.out.println("Introduce un caracter: ");
        char caracter = teclado.next().charAt(0);

       int contador = 0;
        for (int posicion=0; posicion<frase.length();posicion++) {
            if (frase.charAt(posicion) == caracter) {
                contador++;
            }
        }

        System.out.println("Se ha repetido " + contador + " veces");

    }
}
