
import java.util.Scanner;

//5- Leer una cadena de caracteres y ordenar sus letras en orden alfabético.
public class cinco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("dime una palabra");
        StringBuilder cadena = new StringBuilder(teclado.nextLine());

        StringBuilder cadenaOriginal = new StringBuilder(cadena);
        StringBuilder cadenaMinuscula = new StringBuilder(cadena.toString().toLowerCase());


        StringBuilder ordenAlfabetico = new StringBuilder("");

        for (int contador = 0;ordenAlfabetico.length() < cadenaOriginal.length();contador++){
            int lowestNum = lowestNum(cadenaMinuscula);
            ordenAlfabetico = ordenAlfabetico.append(cadena.charAt(lowestNum));
            cadenaMinuscula = cadenaMinuscula.deleteCharAt(lowestNum);
            cadena = cadena.deleteCharAt(lowestNum);
        }
        System.out.println(ordenAlfabetico);

    }
    public static int lowestNum (StringBuilder cadenaMinuscula){
        int menor = 0;
        char menorS = 'Ñ';
        for (int contador = 0;contador != cadenaMinuscula.length();contador++){
            char caracterActual = cadenaMinuscula.charAt(contador);
            if (caracterActual<menorS){
                menorS = caracterActual;
            }
        }
        menor = cadenaMinuscula.indexOf(Character.toString(menorS));
        return menor;
    }
}
