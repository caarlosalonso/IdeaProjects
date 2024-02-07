import java.util.Scanner;

public class cuatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        StringBuilder fraseEnStringBuilder = new StringBuilder("Hola a todos");

        String fraseEnString = fraseEnStringBuilder.toString();
        fraseEnString = fraseEnString.toUpperCase();

        System.out.println(fraseEnString);

        fraseEnStringBuilder = new StringBuilder(fraseEnString);
        System.out.println(fraseEnStringBuilder);


    }
}
