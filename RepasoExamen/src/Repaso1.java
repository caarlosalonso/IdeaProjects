import java.util.Scanner;

public class Repaso1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*
        1. Escribe un programa que pida un String por pantalla y devuelva cuantas vocales de cada tipo hay
        (cuántas aes,es, ies...).
        */

        int contadorA=0, contadorE=0, contadorI=0, contadorO=0, contadorU=0, contadorCaracter=0;

        System.out.println("Introduce un string: ");
        String cadena = teclado.nextLine();

        for(int i=0;i<cadena.length();i++){
            char letra = cadena.charAt(i);

            letra = Character.toLowerCase(letra);

            if(Character.isLetter(letra)) {
                if (letra == 'a') {
                    contadorA++;
                } else if (letra == 'e') {
                    contadorE++;
                } else if (letra == 'i') {
                    contadorI++;
                } else if (letra == 'o') {
                    contadorO++;
                } else if (letra == 'u') {
                    contadorU++;
                }
        }
    }
        System.out.println("La frase tiene: " + contadorA + " a.");
        System.out.println("La frase tiene: " + contadorE + " e.");
        System.out.println("La frase tiene: " + contadorI + " i.");
        System.out.println("La frase tiene: " + contadorO + " o.");
        System.out.println("La frase tiene: " + contadorU + " u.");
    }
}
