import java.util.Scanner;
import java.util.regex.Pattern;

public class dos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String opcionRegex="[0-3]";

        int opcion;

        do {
            System.out.println("Mostrando opciones:"
                    + "\n 1 - Primera opción"
                    + "\n 2 - Segunda opción"
                    + "\n 3 - Tercera opción"
            );
            System.out.println("Elige una opción");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Has elegido la primera opción");
                    break;
                case 2:
                    System.out.println("Has elegido la segunda opción");
                    break;
                case 3:
                    System.out.println("Has elegido la tercera opción");
                    break;
            }

        }while(opcion<1);
    }
}
