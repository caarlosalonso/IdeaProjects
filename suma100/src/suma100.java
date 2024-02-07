import java.util.Scanner;

public class suma100 {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        int CantidadNumeros , contador=0 , i=0;
        //int suma;

        // Numeros aleatorios comprendidos entre 0 y 100
        int suma = (int)(Math.random() * 101);

            System.out.println("¿Cuantos numeros quieres sumar?: ");
            CantidadNumeros = teclado.nextInt();

            //System.out.println("Introduce un numero: ");
              //suma = teclado.nextInt();

        int almacenado = suma + i;

        do {
            //System.out.println("Introduce un numero: ");
            //suma = teclado.nextInt();

            contador++;

            almacenado = suma + almacenado;

            System.out.println("La suma de los numeros es: " +almacenado);

            //Para el bucle durante 0.5 segundos
            Thread.sleep(500);
        }
        while (contador < CantidadNumeros);
    }
}

