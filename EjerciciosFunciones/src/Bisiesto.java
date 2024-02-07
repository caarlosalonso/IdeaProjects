import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int año;

        System.out.print("Introduce un año: ");
        año = teclado.nextInt();

        boolean esBisiesto = bisiesto(año);

        if (esBisiesto == true){
            System.out.println(año + " es un año bisiesto");
        } else {
            System.out.println(año + " no es un año bisiesto");
        }

    }

    public static boolean bisiesto(int año) {

        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
           return true;
        } else {
            return false;
        }
    }
}
