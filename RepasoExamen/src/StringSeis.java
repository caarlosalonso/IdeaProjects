import java.util.Scanner;

public class StringSeis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*
        6- Realizar un programa que, dada una cadena de caracteres por pantalla, genere otra cadena
        resultado de invertir la primera.
        */

        String nombreCompleto = "Carlos Alonso Cubillo";
        String cadenaFinal = " ";

        for(int posicion=nombreCompleto.length()-1;posicion>=0;posicion--){
            char cadenaTemporal = nombreCompleto.charAt(posicion);
            cadenaFinal = cadenaFinal + cadenaTemporal;
        }
        System.out.println(cadenaFinal);
        System.out.println(nombreCompleto);

    }
}
