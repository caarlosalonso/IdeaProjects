import java.util.Scanner;

public class debug {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1, numero2,resultado;
        System.out.println("Introduce el valor del primer n: ");
        numero1 = teclado.nextInt();

        System.out.println("Introduce el valor del segundo n: ");
        numero2 = teclado.nextInt();

        if (numero1 > numero2) {

            resultadoRango(numero2,numero1);

        } else {

            resultadoRango(numero1,numero2);

        }
    }

    public static void resultadoRango(int numero1, int numero2) {


        for (int i = numero1; i <= numero2; i++) {
            System.out.println(i);
        }

    }
}
