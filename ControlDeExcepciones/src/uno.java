import java.util.InputMismatchException;
import java.util.Scanner;

public class uno {
    //Copiar el ejemplo de los errores de la división. Probar la gestión de excepciones con diferentes
    //parámetros. Quitar los manejadores de excepciones y comparar el funcionamiento
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            try {
                int numero1 = teclado.nextInt();
                int numero2 = teclado.nextInt();

                int div = dividir(numero1, numero2);
                System.out.println("Div=" + div);

            } catch (ArithmeticException e) {

                System.out.println("Error aritmético");

            } catch (InputMismatchException e) {

                System.out.println(e.getMessage());
                System.out.println("Error de formato");
                System.out.println(e.getMessage());

            } finally {

                System.out.println("Fin del programa");
            }
        }
        public static int dividir(int num, int den) {

            return num / den;

        }
}
