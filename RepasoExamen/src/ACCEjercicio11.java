import java.util.Random;
import java.util.Scanner;

public class ACCEjercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nrandom1, nrandom2, nrandom3;
        char pregunta;

        do {
            nrandom1 = dameAleatorio();
            nrandom2 = dameAleatorio();
            nrandom3 = dameAleatorio();

            System.out.println("Tu jugada es: " + nrandom1+ nrandom2 + nrandom3);
            
            if((nrandom1 == nrandom2) && (nrandom2 == nrandom3)){
                System.out.println("Has ganado");
            } else if ((nrandom1 == nrandom2) || (nrandom1 == nrandom3) || (nrandom2==nrandom3)) {
                System.out.println("Empate, vuelve a jugar");
            }else{
                System.out.println("Has perdido");
            }

            System.out.println("Quieres seguir jugando? S/N: ");
            pregunta = teclado.next().charAt(0);

        }while(pregunta != 'n' && pregunta != 'N');

    }
    public static int dameAleatorio(){
        Random random = new Random();
        int nrandom;
        return nrandom = random.nextInt(3) + 1;
    }
}
