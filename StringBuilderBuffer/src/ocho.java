import java.util.Scanner;

public class ocho {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        StringBuilder fraseEnStringBuilder = new StringBuilder("123456789");

        //Ahora recorremos las posiciones pares para sustituirlas por la mayúscula.
        for (int posicion=fraseEnStringBuilder.length()-3;posicion>0;posicion-=3){
            char caracter = fraseEnStringBuilder.charAt(posicion);

            fraseEnStringBuilder.insert(posicion,'.');
        }
        System.out.println(fraseEnStringBuilder);
    }
}