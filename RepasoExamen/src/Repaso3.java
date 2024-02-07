import java.util.Scanner;

public class Repaso3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Un programador de Java se ha propuesto demostrar que cuando pide datos por pantalla, solo necesita la clase
        //String. De esta forma, se ha hecho un programa que pide una cadena y devuelve un mensaje indicando si es un
        //número entero (sin decimales), si es un double (porque ha encontrado una coma entre los números) o si es una
        //cadena de caracteres (porque tiene letras, números y signos de puntuación). ¿Cómo sería este programa?

        System.out.println("Introduce un String: ");
        String frase = teclado.nextLine();

        int entero=0,decimal=0,cadena=0;

        for(int i=0;i<frase.length();i++) {
            String caracter = String.valueOf(frase.charAt(i));

            if (caracter.contains(",")) {
                decimal++;
            } else if (!caracter.contains(",")) {
                entero++;
            } else {
                cadena++;
            }
        }
        if(decimal>0) {
            System.out.println("Es un double");
        } else if (cadena>0) {
            System.out.println("Es cadena de caracteres");
        }else{
            System.out.println("Es un numero entero");
        }
    }
}
