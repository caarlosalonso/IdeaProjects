import java.util.Scanner;

public class PosString {
    public static void main(String[] args) throws  InterruptedException{
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String str1 = teclado.nextLine();

        System.out.println("Introduce la siguiente palabra: ");
        String str2 = teclado.nextLine();

        //Este código se utiliza para mostrar la letra que quieras buscar.
        //El +1 se utiliza porque empieza en 0.
        int pos=str1.indexOf(str2)+1;
        System.out.println("posición de la frase " + str2 + ": " + pos);
        
    }
}