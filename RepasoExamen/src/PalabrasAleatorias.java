import java.util.Random;

public class PalabrasAleatorias {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroRandom;
        StringBuilder buscaPalabra = new StringBuilder("ho");

        StringBuilder palabra = new StringBuilder();

            for (int i = 0; i < 10; i++) {

                char caracterAleatorio = (char) (numeroRandom = random.nextInt(26) + 97);
                palabra.append(caracterAleatorio);
            }

        System.out.println(palabra);

           // for (int i = 0;)
    }
}
