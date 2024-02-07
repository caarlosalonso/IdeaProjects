import java.util.Scanner;

public class Examen2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Escribe un programa que pida por pantalla 10 números.
        //2.1 Deberá devolver: el número mayor, el número menor, cuantos han sido mayores de cero y cuantos han sido
        // menores de cero.
        //2.2 Modifica el programa para que en lugar de pedir siempre 10 nñumeros, se pregunte al usuario cuantos
        // quiere introducir.Después de esto devolver los resultados del apartado 2.1
        //2.3 Modifica el programa para que finalice cuando se entroduce el nñumero cero. Después de esto devolver los
        // resultados del apartado 2.1

                // Inicializar variables
                int numero=0;
                int numeroMayor = Integer.MIN_VALUE;
                int numeroMenor = Integer.MAX_VALUE;
                int mayoresDeCero = 0;
                int menoresDeCero = 0;


                    // Pedir 10 números al usuario
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Introduce el número " + (i + 1) + ": ");
                        numero = teclado.nextInt();

                        // Actualizar el número mayor
                        if (numero > numeroMayor) {
                            numeroMayor = numero;
                        }

                        // Actualizar el número menor
                        if (numero < numeroMenor) {
                            numeroMenor = numero;
                        }

                        // Contar números mayores de cero
                        if (numero > 0) {
                            mayoresDeCero++;
                        }

                        // Contar números menores de cero
                        if (numero < 0) {
                            menoresDeCero++;
                        }
                    }

                // Mostrar resultados
                System.out.println("Número mayor: " + numeroMayor);
                System.out.println("Número menor: " + numeroMenor);
                System.out.println("Cantidad de números mayores de cero: " + mayoresDeCero);
                System.out.println("Cantidad de números menores de cero: " + menoresDeCero);

            }
        }



