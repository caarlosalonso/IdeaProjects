import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int base, exponente, resultado;

        //Introduce los valores principales de la función, repitiendo en bucle en caso de que el exponente sea menor de 0.
        System.out.print("Introduce la base:");
        base = teclado.nextInt();

        do {
            System.out.print("Introduce el exponente:");
            exponente = teclado.nextInt();
        } while (exponente <= 0);

        //Esta es la última parte, que recoge el return para mostrar el resultado.
        //resultado = potencia(base, exponente);
        System.out.println(potencia(base,exponente));
        //System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + resultado);

    }
    //Hace la operación para averiguar la potencia.
    public static int potencia(int base, int exponente) {
        int potencia=1;
        for (int contador = 1; contador <= exponente; contador++) {
            potencia *= base;
        }
        //Devuelve el valor potencia a la primera parte para mostrar el resultado.
        return potencia;
    }

}