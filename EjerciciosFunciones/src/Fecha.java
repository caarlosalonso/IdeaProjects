import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int dia, mes, año, fechas;

        System.out.println("Introduce el día: ");
        dia = teclado.nextInt();

        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();

        System.out.println("Introduce el año: ");
        año = teclado.nextInt();

        fechas = fecha(mes, dia, año);
        System.out.println(dia + "/" + mes + "/" + año + " es una fecha correcta");
    }

    public static int fecha(int mes, int dia, int año) {
        Scanner teclado = new Scanner(System.in);

        int dia2 = 0, fecha = 0;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7
                || mes == 8 || mes == 10 || mes == 12) {

            dia2 = 31;

        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            dia2 = 30;

        } else if (mes == 2) {

            dia2 = 28;

        }if (año >=2001 && año <= 2099 && dia <= dia2){

        }else {
            System.out.println("Fecha incorrecta");
        }
        return fecha;

    }
}