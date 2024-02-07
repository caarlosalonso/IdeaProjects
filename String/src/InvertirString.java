import java.util.Scanner;

public class InvertirString {
    public static void main(String[] args) throws  InterruptedException{
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        System.out.println("Voy a mostrar los caracteres: ");

        //Este código se utiliza para mostrar todos los carácteres invertidos de un string
        for (int posicion=frase.length()-1; posicion >= 0; posicion--){
            System.out.print(frase.charAt(posicion));

        }


    }
}
