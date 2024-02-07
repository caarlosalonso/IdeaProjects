import java.util.Scanner;

public class StringOcho {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*
        8- Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y
        viceversa. La comprobación de la letra mayúscula, debes hacerla con una función que recibirá un
        carácter y devolverá un booleano.
        */

        String nombreCompleto ="CaRlOs AlOnSo CuBiLlO";

        for(int i=0;i<nombreCompleto.length();i++) {
            char posicion = posicion(nombreCompleto, i);
        if (esMayuscula(nombreCompleto,posicion)){
            System.out.println(String.valueOf(posicion).toLowerCase());
        }else{
            System.out.println(String.valueOf(posicion).toUpperCase());
        }
        }

    }
    public static boolean esMayuscula(String nombreCompleto, char posicion){

        return String.valueOf(posicion).equals(String.valueOf(posicion).toUpperCase());
    }
    public static char posicion(String nombreCompleto, int i) {
        return nombreCompleto.charAt(i);
    }
}

