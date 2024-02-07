import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion;
        String opcionRegex="\\D";

        do {
            System.out.println("Elige una de las opciones: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("opcion 1");
                    break;
                case 2:
                    System.out.println("opcion 2");
                    break;
                case 3:
                    System.out.println("opcion 3");
                    break;

            }
        }while();

    }
}