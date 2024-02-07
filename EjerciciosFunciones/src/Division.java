import java.util.Scanner;

public class Division {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int dividendo, divisor;
        double division;

        //Introduce dividendo y divisor.
        System.out.print("Introduce un número: ");
        dividendo = teclado.nextInt();

        System.out.print("Introduce un número: ");
        divisor = teclado.nextInt();

        //Muestra el resultado.
        division = division(dividendo, divisor);
        System.out.println("El resultado de la división es: " + division);
    }

    public static double division(int dividendo, int divisor){
        Scanner teclado = new Scanner(System.in);
        int division;

        while (divisor == 0) {
            System.out.print("Introduce otro número, pq el divisor no puede ser cero: ");
            divisor = teclado.nextInt();

        }

        //Realiza la operacion.
       double resultado = (double)dividendo / divisor;

        return resultado;
    }
}