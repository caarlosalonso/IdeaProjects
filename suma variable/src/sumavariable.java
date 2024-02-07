import java.util.Scanner;

public class sumavariable {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int CantidadNumeros , contador=0 , suma , i=0;

        System.out.println("¿Cuantos numeros quieres sumar?: ");
        CantidadNumeros = teclado.nextInt();

        System.out.println("Introduce un numero: ");
        suma = teclado.nextInt();

        int almacenado = suma + i;

            contador++;

        do {
            System.out.println("Introduce un numero: ");
            suma = teclado.nextInt();

            contador++;

            almacenado = suma + almacenado;

            System.out.println("La suma de los numeros es: " +almacenado);

        }
        while (contador < CantidadNumeros);
    }
}

