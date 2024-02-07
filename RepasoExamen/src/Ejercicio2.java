import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      //  System.out.println("Introduce un caracter ");
      //  char caracter = teclado.next().charAt(0);

        System.out.println("Dame una cadena");
        String cadena = teclado.nextLine();
        StringBuilder nuevaCadena = new StringBuilder();
        for(int posicion=0;posicion<cadena.length();posicion++){
            char caracter = cadena.charAt(posicion);
            System.out.print("El caracter "+caracter+" ");
            if (queCaracter(caracter)){
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


    public static boolean queCaracter (char caracter){

        if (Character.isDigit(caracter)){
            System.out.println("Se ha introducido un numero");
            return false;
        }else if (Character.isLetter(caracter)){
            System.out.print("Se ha introducido una letra ");
            if(Character.isLowerCase(caracter)){
                System.out.println("Es minuscula");
            }else {
                System.out.println("Es mayuscula");
            }
            return true;
        }else{
            System.out.println("Es caracter");
            return false;
        }


    }
}
