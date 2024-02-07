import java.util.Scanner;

public class siete {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        StringBuilder fraseEnStringBuilder = new StringBuilder("Hola a todos");

        //Pasamos la frase a minúsculas para luego poner los pares en mayúscula.
        fraseEnStringBuilder = new StringBuilder(fraseEnStringBuilder.toString().toLowerCase());

        //Ahora recorremos las posiciones pares para sustituirlas por la mayúscula.
        for (int posicion=0;posicion<fraseEnStringBuilder.length();posicion+=2){
            char caracter = fraseEnStringBuilder.charAt(posicion);
            char caracterEnMayuscula = Character.toUpperCase(caracter);

            fraseEnStringBuilder.replace(posicion,posicion+1, String.valueOf(caracterEnMayuscula));
        }
        System.out.println(fraseEnStringBuilder);
    }
}