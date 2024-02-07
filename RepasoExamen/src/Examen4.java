import java.util.Random;
import java.util.Scanner;

public class Examen4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Programa el juego "Piedra-Papel-Tijera" Donde va a competir el usuario contra la máquina.
        //4.1 El programa te preguntará que elijas un número del 1 al 3, siendo 1-Piedra, 2-Papel, 3-Tijera. A continuación
        //el programa genera un número aleatorio entre 1 y 3, que será su elección. Por último el programa debe mostrar
        //un mensaje indicando quien ha ganado.
        //4.2 Completa el ejercicio anterior añadiendo una pregunta al final para continuar jugando, si el usuario
        //introduce el número 1.

        int eleccionJugador=0,eleccionBot=0, menuJugador, menuBot, jugar, ganaJugador=0, ganaBot=0;

do {
    do {
        System.out.println("Elige un número entre 1 y 3");
        System.out.println("Siendo: 1-Piedra, 2-Papel, 3-Tijera: ");

        menuJugador = teclado.nextInt();
        switch (menuJugador) {
            case 1:
                System.out.println("Ha elegido piedra");
                eleccionJugador = 1;
                break;
            case 2:
                System.out.println("Ha elegido papel");
                eleccionJugador = 2;
                break;
            case 3:
                System.out.println("Ha elegido tijera");
                eleccionJugador = 3;
                break;
        }
    } while (menuJugador < 1 || menuJugador > 3);
    System.out.println(eleccionJugador);

    Random random = new Random();
    int numeroRandom = random.nextInt(3) + 1;

    menuBot = numeroRandom;
    switch (menuBot) {
        case 1:
            System.out.println("Ha elegido piedra");
            eleccionBot = 1;
            break;
        case 2:
            System.out.println("Ha elegido papel");
            eleccionBot = 2;
            break;
        case 3:
            System.out.println("Ha elegido tijera");
            eleccionBot = 3;
            break;
    }
    System.out.println(eleccionBot);

    if (eleccionJugador == 3 && eleccionBot == 2 || eleccionJugador == 2 && eleccionBot == 1 || eleccionJugador == 1 && eleccionBot == 3) {
        System.out.println("Ha ganado el jugador");
        ganaJugador++;
    } else if (eleccionJugador == eleccionBot) {
        System.out.println("Habeis empatado");
    } else {
        System.out.println("Ha ganado el bot");
        ganaBot++;
    }
    System.out.println("El jugador ha ganado " + ganaJugador + " veces.");
    System.out.println("El bot ha ganado " + ganaBot + " veces.");
    System.out.println("Introduce 1 para seguir jugando: ");
    jugar = teclado.nextInt();
}while(jugar==1);
    }
}
