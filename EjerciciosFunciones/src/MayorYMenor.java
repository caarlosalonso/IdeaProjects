import java.util.Scanner;

public class MayorYMenor {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int numero1, numero2, mayor;

        System.out.print("Introduce un número: ");
        numero1 = teclado.nextInt();

        do {
            System.out.print("Introduce otro número: ");
            numero2 = teclado.nextInt();
        } while (numero2 == numero1);

        mayor = mayormenor(numero1, numero2);
        System.out.println("El mayor de los dos número es: " + mayor);

    }

        public static int mayormenor(int numero1, int numero2){

            if (numero1 > numero2) {

                return numero1;

            } else {

                return numero2;

            }
        }


}