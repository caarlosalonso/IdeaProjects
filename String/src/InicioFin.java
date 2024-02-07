import java.util.Scanner;

public class InicioFin {
    public static void main(String[] args) throws  InterruptedException{
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        System.out.println("Voy a mostrar el primer y último carácter: ");

        //Este código se utiliza para mostrar el primer y ultimo caract de un string

            System.out.println(frase.charAt(0));
            System.out.println(frase.charAt(frase.length() -1));



    }
}
