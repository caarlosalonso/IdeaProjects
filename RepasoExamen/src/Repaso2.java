import java.util.Scanner;

public class Repaso2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Escribe un programa que pida un String por pantalla y devuelva cuantas letras hay, cuantos números
        // y cuantos símbolos(espacios, comas, puntos,...)

        char caracterActual=0;
        int cuentaLetras=0,cuentaNumeros=0,cuentaCaracteres=0;

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        //Con un bucle for recorremos cada caracter de la cadena inicial convertida a minusculas, y con los if
        //comprobamos que caracter es, y dependiendo del caracter se suma un contador, cualquier caracter
        //que no sea letra o digito, se contabilizará como caracter especial.
        for(int i=0; i<frase.length();i++) {
            caracterActual = frase.toLowerCase().charAt(i);
            if(Character.isLetter(caracterActual)){
                cuentaLetras++;
            } else if (Character.isDigit(caracterActual)) {
                cuentaNumeros++;
            }else{
                cuentaCaracteres++;
            }
        }
        System.out.println("Letras: " + cuentaLetras);
        System.out.println("Numeros: " + cuentaNumeros);
        System.out.println("Caracteres: " + cuentaCaracteres);
    }
}
