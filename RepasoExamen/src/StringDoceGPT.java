import java.util.Scanner;

public class StringDoceGPT {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombreCompleto = "Carlos Alonso Cubillo";
        String iniciales = "";

        // Find the initial of the first word
        iniciales += nombreCompleto.charAt(0);

        // Iterate over the rest of the characters to find initials after spaces
        for (int i = 0; i < nombreCompleto.length() - 1; i++) {
            if (nombreCompleto.charAt(i) == ' ') {
                iniciales += nombreCompleto.charAt(i + 1);
            }
        }

        System.out.println(iniciales);
    }
}
