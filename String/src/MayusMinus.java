//8- Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y
//viceversa. La comprobación de la letra mayúscula, debes hacerla con una función que recibirá un
//carácter y devolverá un booleano.

import java.util.Scanner;

public class MayusMinus {
    public static void main(String[] args) {
        //enunciado del ejercicio
        System.out.println("8- Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y\nviceversa. La comprobación de la letra mayúscula, debes hacerla con una función que recibirá un\ncarácter y devolverá un booleano.\n");
        Scanner teclado = new Scanner(System.in);

        System.out.print("[?] Proporcioname una cadena -> ");
        String cadenaAOperar = teclado.nextLine();

        int longitudCadena = cadenaAOperar.length();
        System.out.print("[+] La cadena convertida es: \"");
        for (int i = 0; i < longitudCadena; i++) {
            //te da el caracter que está en n posición siendo n el autoincremento que hace for sobre i
            char caracterEnN = queCaracterEs(cadenaAOperar, i);
            //cuando es verdadera es mayúscula, por lo tanto, imprimo ese caracter en minúscula
            if (compararMayuscula(cadenaAOperar, caracterEnN, i)) {
                System.out.print(String.valueOf(caracterEnN).toLowerCase());
            } else {
                System.out.print(String.valueOf(caracterEnN).toUpperCase());
            }
        }
        System.out.print("\"");
    }

    public static boolean compararMayuscula(String cadenaAOperar, char caracterEnN, int i) {
        //devuelve verdadero cuando charcaterEnN es igual a CharacterEnN en mayuscula, es decir es mayuscula
        return String.valueOf(caracterEnN).equals(String.valueOf(caracterEnN).toUpperCase());
    }

    public static char queCaracterEs(String cadenaAoperar, int i) {
        return cadenaAoperar.charAt(i);
    }
}