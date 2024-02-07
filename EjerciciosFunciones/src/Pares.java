import java.util.Scanner;

public class Pares {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int numero, resultado, divisor, pares;

        System.out.println("Introduce un número");
        numero = teclado.nextInt();

        boolean esParNumero = pares(numero);
        if (esParNumero == true){

            System.out.println(numero + " es un número par");

        } else {

            System.out.println(numero + " es un número impar");
        }
    }

    public static boolean pares(int numero){
            int divisor = 2;
            int resultado;

            resultado = numero % divisor;

        if (resultado == 0) {

            //System.out.println(numero + " es un número par");
            return true;

        } else {

            //System.out.println(numero + " es un número impar");
                    return false;

        }

        }



    }


