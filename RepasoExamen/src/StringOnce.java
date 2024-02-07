import java.util.Scanner;
public class StringOnce {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;

        System.out.println("Introduce una serie de palabras separada por espacios: ");
        // Con el "Trim" ya elimino los espacios al inicio o al final de la cadena.
        cadena = teclado.nextLine().trim();

        String nuevaCadena = "";

        // Reemplazamos dos espacios por uno dentro de un bucle, le damos el valor de cadena a nuevCadena al principio
        // del bucle para que cada vez que itere se compare con su version más actualizada
        do {
            nuevaCadena=cadena;
            cadena = cadena.replaceAll(("  "), (" "));
            //nuevaCadena.append(cadena);
        }while(cadena.length()!=nuevaCadena.length());
        System.out.println(nuevaCadena);
    }
}