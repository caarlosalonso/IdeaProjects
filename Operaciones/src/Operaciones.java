import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int i;
        i=1;
        System.out.println(i++);
        System.out.println(i);

        i=1;
        System.out.println(++i);
        System.out.println(i);

        int numero1, numero2, resultado;

        System.out.println("Introduce un numero: ");
        numero1 = teclado.nextInt();

        System.out.println("Introduce otro numero: ");
        numero2 = teclado.nextInt();

        resultado = numero1 + numero2;

        System.out.println("La suma de " + numero1 + "+" + numero2 + "es:" + resultado);

        resultado = numero1 - numero2;

        System.out.println("La resta de " + numero1 + "-" + numero2 + "es:" + resultado);

        resultado = numero1 * numero2;

        System.out.println("La multiplicación de " + numero1 + "*" + numero2 + "es:" + resultado);

        resultado = numero1 / numero2;

        System.out.println("La división de " + numero1 + "/" + numero2 + "es:" + resultado);

        // Display the result as a float when using printf
        System.out.printf("El resultado de %d y %d es: %.2f%n", numero1, numero2, (float) resultado);

        resultado = numero1 % numero2;

        System.out.println("El módulo de " + numero1 + " % " + numero2 + "es:" + resultado);

    }
}