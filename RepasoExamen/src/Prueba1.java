import java.util.Random;
import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*
        1. (5 puntos) Programa “Máquina Tragaperras”. El programa se divide en varias partes:

        1.1.La máquina muestra tres números aleatorios, entre 1 y 3, y pregunta si
        quieres seguir jugando. El programa termina cuando se introduce N o n (mayúscula o minúscula).

        1.2.Crea una función que genere un número entero aleatorio, entre 1 y 3. Esta función no recibirá ningún
        parámetro. Se deberá utilizar en el apartado anterior.

        1.3.Según las combinaciones puede pasar:
            a) Si los tres números son distintos => Muestra el mensaje: “Has perdido”
            b) Si hay dos números iguales => Muestra el mensaje: “Empate, vuelve a jugar”
            c) Si los tres números son iguales => Muestra el mensaje: “Has ganado”
        */

        int numeroRandom1, numeroRandom2, numeroRandom3;
        char pregunta;

        do {
            numeroRandom1 = dameRandom();
            numeroRandom2 = dameRandom();
            numeroRandom3 = dameRandom();

            System.out.println("Tu jugada es: " + numeroRandom1 +" "+ numeroRandom2 +" "+ numeroRandom3);

            if(numeroRandom1==numeroRandom2 && numeroRandom2==numeroRandom3){
                System.out.println("Has ganado");
            } else if (numeroRandom1==numeroRandom2 || numeroRandom2 == numeroRandom3 || numeroRandom1 == numeroRandom3) {
                System.out.println("Has empatado, sigue jugando");
            }else{
                System.out.println("Has perdido");
            }

            System.out.println("Quieres seguir jugando?(S/N): ");
            pregunta = teclado.next().charAt(0);
        }while(pregunta != 'n' && pregunta != 'N');
    }
    public static int dameRandom(){
        Random random = new Random();
        int numeroRandom;
        return numeroRandom=random.nextInt(3) + 1;
    }
}
