import java.util.Scanner;

public class Prueba2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*
        2. (5 puntos) Escribe un programa que pida caracteres por pantalla.
        2.1. Según el carácter introducido, deberán mostrar distintos mensajes:
        - Si es un número => “Se ha introducido un número”
        - Si es una letra => “Se ha introducido una letra”
        - Si, además, es mayúscula => “Y es una letra mayúscula”
        - Si, además, es minúscula => “Y es una letra minúscula”
        - Para cualquier otro carácter => “Se ha introducido un carácter”.
            Introduce un carácter: c
            Se ha introducido una letra. Y es minúscula

        2.2.Crea una función que reciba un carácter y, según el carácter introducido, muestre por pantalla los mensajes
        del apartado anterior. Además, deberá devolver un “true”, si el carácter es una letra.

        2.3.Amplía el programa anterior, ahora se pedirá por pantalla una cadena.
        Utilizando la función de 1.2, se mostrará el mensaje que corresponda a cada carácter. Además, se recogerán
        todas las letras en una nueva cadena.
I           Introduce una cadena: Hi!
            Carácter H. Se ha introducido una letra. Y es mayúscula
            Carácter i. Se ha introducido una letra. Y es minúscula
            Carácter !. Se ha introducido un carácter
            Las letras de la cadena son Hi

        2.4.Amplía el apartado anterior para crear dos nuevas cadenas. Una con
        todas las letras en mayúscula y otra con todas las letras en minúscula.
        Después se mostrarán por pantalla.
            Introduce una cadena: Hi!
            Carácter H. Se ha introducido una letra. Y es mayúscula
            Carácter i. Se ha introducido una letra. Y es minúscula
            Carácter !. Se ha introducido un carácter
            Las letras de la cadena son Hi
            La cadena en mayúsculas es HI
            La cadena en minúsculas es hi
        */

        System.out.println("Introduce caracteres: ");
        String cadena = teclado.nextLine();

        StringBuilder nuevaCadena = new StringBuilder();

        for(int i=0;i<cadena.length();i++){
            char caracter = cadena.charAt(i);
            System.out.println("El caracter " +caracter+" ");
            if(queCaracter(caracter)){
                nuevaCadena.append(caracter);
            }
        }

        System.out.println("las letras son: "+nuevaCadena);
        String normal = nuevaCadena.toString();
        String may = normal.toUpperCase();
        String min = normal.toLowerCase();
        System.out.println("May "+ may);
        System.out.println("Min "+ min);

    }
    public static boolean queCaracter(char caracter){
        if(Character.isDigit(caracter)) {
            System.out.println("Se ha introducido un digito");
            return false;
        }else if (Character.isLetter(caracter)) {
            System.out.print("Se ha introducido una letra. ");
            if(Character.isLowerCase(caracter)){
                System.out.println("Y es minuscula");
            }else{
                System.out.println("Y es mayuscula");
            }
            return true;
        }else{
            System.out.println("Es un caracter");
            return false;
        }
    }
}

