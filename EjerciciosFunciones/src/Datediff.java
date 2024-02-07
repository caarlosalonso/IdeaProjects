import java.util.Scanner;

public class Datediff {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int dia, mes, anno;
        int fechaI, fechaF, fechaResultado;
        int diafin, mesfin, annofin;
        int diaResultado, mesResultado, annoResultado;

        System.out.println("Introduce el día: ");
        dia = teclado.nextInt();

        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();

        System.out.println("Introduce el año: ");
        anno = teclado.nextInt();

//----------------------------------------------------------------------------------------------------------------------

        System.out.println("Introduce el día: ");
        diafin = teclado.nextInt();

        System.out.println("Introduce el mes: ");
        mesfin = teclado.nextInt();

        System.out.println("Introduce el año: ");
        annofin = teclado.nextInt();

        fechaI = fecha(mes, dia, anno);
        System.out.println(dia + "/" + mes + "/" + anno + " es una fecha correcta");

        fechaF = fecha(mesfin, diafin, annofin);
        System.out.println(diafin + "/" + mesfin + "/" + annofin + " es una fecha correcta");

        diaResultado = Math.abs(diafin - dia);
        mesResultado = Math.abs(mesfin - mes);
        annoResultado = Math.abs(annofin - anno);
        System.out.println("Hay una diferencia de: " + diaResultado + " días " + mesResultado + " meses " + annoResultado + " años");
    }

    public static int fecha(int mes, int dia, int anno) {

        int dia2 = 0, fecha = 0;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7
                || mes == 8 || mes == 10 || mes == 12) {

            dia2 = 31;

        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            dia2 = 30;

        } else if (mes == 2) {

            dia2 = 28;

        }
        if (anno >= 2001 && anno <= 2099 && dia <= dia2) {

        } else {
            System.out.println("Fecha incorrecta");
        }
        return (fecha);
    }

    }


