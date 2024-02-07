import java.util.Scanner;

public class Dias {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int mes, resultado;

        System.out.println("Introduce un mes en formato numérico: ");
        mes = teclado.nextInt();

        resultado = dias(mes);
        System.out.println("El mes tiene " + resultado + " días");
    }

    public static int dias(int mes) {
        Scanner teclado = new Scanner(System.in);

        int resultado = 0;

        while (mes < 1 || mes > 12){
            System.out.println("Introduce un mes en formato numérico (1-12): ");
            mes = teclado.nextInt();
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7
                || mes == 8 || mes == 10 || mes == 12) {


            resultado = 31;

        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            resultado = 30;

        } else if (mes == 2) {

            resultado = 28;
        }
        return resultado;
    }
}
