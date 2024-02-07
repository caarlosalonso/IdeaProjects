import java.util.Random;

public class buscador {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroRandom;

        StringBuilder palabra = new StringBuilder();

        for (int i = 0; i<10;i++) {
            char caracterAleatorio = (char) (numeroRandom = random.nextInt(26) + 97);
            palabra.append(caracterAleatorio);
        }
        System.out.println("Palabra aleatoria: "+ palabra);
        int vocales=0;
        int consonantes=0;

        for(int i=0;i< palabra.length();i++){
            char caracter = palabra.charAt(i);
            if(caracter=='a'|| caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u'){
                vocales++;
            }
        }
        System.out.println("Vocales: " + vocales);
        consonantes=palabra.length()-vocales;
        System.out.println("Consonantes: " + consonantes);
    }
}
