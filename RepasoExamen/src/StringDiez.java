import java.util.Scanner;

public class StringDiez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        String cadenaFinal = "";

        for(int i = frase.length()-1;i>=0;i--){
            char fraseInvertida = frase.charAt(i);
            cadenaFinal = cadenaFinal + fraseInvertida;
        }

        System.out.println(frase);
        System.out.println(cadenaFinal);

        if(cadenaFinal.equalsIgnoreCase(frase)){
            System.out.println(frase + " es un palindromo.");
        }else{
            System.out.println(frase + " no es un palindromo.");
        }
    }
}
