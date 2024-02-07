import java.util.Scanner;

public class PosCaracter {
    public static void main(String[] args) throws  InterruptedException{
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        System.out.print("Introduce la letra que quieras buscar: ");
        String letra = teclado.nextLine();

        //Este código se utiliza para mostrar la letra que quieras buscar.
        //El +1 se utiliza porque empieza en 0.
        int pos=frase.indexOf(letra)+1;
        System.out.println("posición de la letra " + letra + ": " + pos);

    }
}