import java.util.Scanner;

public class Repaso4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Escribe un programa que pida un String por pantalla, compuesto por varias palabras. El programa eliminará los
        //espacios repetidos (dejará un único espacio entre palabras). Además, la primera letra de cada palabra,
        //la pondrá en mayúscula y el resto en minúscula.

        //System.out.println("Introduce una frase: ");
        //String cadena = teclado.nextLine();

        String cadena = "     cARlos    AlOnso          CubILlo     ";

        String fraseSinEspacios = eliminiaEspacios(cadena);
        System.out.println(fraseSinEspacios);

        StringBuilder fraseFinal = new StringBuilder(fraseSinEspacios);

        for(int i=0;i<fraseFinal.length();i++){

            char caracter = fraseFinal.charAt(i);

            if(i==0){
                //Cambia el primer caracter por mayuscula
                fraseFinal.replace(i,i+1, String.valueOf(Character.toUpperCase(caracter)));
                System.out.println(fraseFinal);
            }
            if(caracter==' '){
                char caracterSiguiente = fraseFinal.charAt(i+1);
                fraseFinal.replace(i+1,i+2, String.valueOf(Character.toUpperCase(caracterSiguiente)));
                System.out.println(fraseFinal);
            }

        }

    }
    public static String eliminiaEspacios (String cadena){

        cadena = cadena.trim();

        String nuevaCadena = "";

        do {
            nuevaCadena = cadena;
            cadena = cadena.replaceAll("  ", " ");
        }while(cadena.length() != nuevaCadena.length());

        return nuevaCadena.toLowerCase();
    }

}
