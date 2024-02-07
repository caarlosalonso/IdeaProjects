import java.util.Random;
import java.util.Scanner;

public class NumerosRandom {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int nrandom;
        int numeros;

        // Genera y muestra números aleatorios 100 veces.
        for (int contador = 0; contador < 100; contador++) {
            nrandom = random();
            Thread.sleep(250);
            System.out.println(nrandom);
        }
    }

    public static int random() {
        Random random = new Random();
        int nrandom;

        // Genera números aleatorios entre 1 y 6.
        nrandom = random.nextInt(7-1) + 1;
        return nrandom;
    }
}
