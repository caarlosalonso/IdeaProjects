import javax.crypto.spec.PSource;
import java.util.Scanner;

public class ElfoDedosGordos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //4.1 Crea un programa que solicite un nombre por pantalla y elimina tod0 lo que no sean letras.

        char caracter;

        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        StringBuilder nuevaCadena = new StringBuilder();
        StringBuilder cadenaSinDigito = new StringBuilder();

        for(int i=0;i<nombre.length();i++){
            caracter = nombre.charAt(i);
            cadenaSinDigito = new StringBuilder(String.valueOf(Character.isLetter(caracter)));
            nuevaCadena = cadenaSinDigito.append(caracter);
        }
        System.out.println(nuevaCadena);

    }
}
