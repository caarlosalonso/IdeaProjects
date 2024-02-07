import java.util.Random;
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        char pregunta;

        //Jugador

        int carta1 = dameCarta();
        System.out.print("Tus cartas son: " + carta1 + " ");
        int carta2 = dameCarta();
        System.out.println(carta2 + " ");

        int suma = carta1 + carta2;
        System.out.println("Su valor sumado es: " + suma);

        if(suma>21){
            System.out.println("Te has pasado de 21. Has perdido");
        }else{
            do {
                System.out.println("Quieres perdir otra carta?(S/N): ");
                pregunta = teclado.next().charAt(0);

                int carta = dameCarta();
                System.out.println(carta);

                System.out.println(suma+=carta);

            }while(pregunta!='n' && pregunta != 'N');
        }

    }
    public static int dameCarta(){
        Random random = new Random();
        int carta;

        return carta=random.nextInt(12)+1;
    }
}
