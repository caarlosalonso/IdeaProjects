import java.util.Scanner;

public class diez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String cadena = teclado.nextLine();
        String cadenaFinal = "";

        for (int i = cadena.length()-1; i >= 0; i--){
            char posicionActual = cadena.charAt(i);
            cadenaFinal = cadenaFinal + posicionActual;
        }
        System.out.println(cadena);
        System.out.println(cadenaFinal);

        if(cadenaFinal.equalsIgnoreCase(cadena)){
            System.out.println("Es un palíndromo");
        }else{
            System.out.println("No es un palíndromo");
        }
    }
}
