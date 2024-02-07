import java.util.Scanner;

public class nueve {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String cadena = teclado.nextLine();

        //Se convierte la cadena principal a minusculas para compararla con la subcadena
        cadena = cadena.toLowerCase();

        System.out.println("Introduce una subcadena: ");
        String subcadena = teclado.nextLine();

        //Se convierte la subcadena a minusculas
        subcadena = subcadena.toLowerCase();

        boolean contieneSubcadena = cadena.contains(subcadena);
        System.out.println("La cadena contiene subcadena " + contieneSubcadena);

    }
}
