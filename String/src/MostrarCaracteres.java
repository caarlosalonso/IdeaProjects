import java.util.Scanner;

public class MostrarCaracteres {
    public static void main(String[] args) throws  InterruptedException{
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        System.out.println("Voy a mostrar los caracteres: ");

        /* Da error por el igual, hay dos formas de solucionarlo, quitando el igual, o poniendo el -1
        for (int posicion=0; posicion <= frase.length(); posicion++){
            System.out.println(frase.charAt(posicion));
        }

        for (int posicion=0; posicion <= frase.length()-1; posicion++){
            System.out.println(frase.charAt(posicion));
        }
        */

        //Este código se utiliza para mostrar todos los carácteres de un string
        for (int posicion=0; posicion < frase.length(); posicion++){
            System.out.println(frase.charAt(posicion));
        }


    }
}