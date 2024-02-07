import java.util.Scanner;

public class StringSiete {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*
        7- Pide una cadena y dos caracteres por teclado (valida que sean letras minúsculas), sustituye la
        aparición del primer carácter en la cadena por el segundo carácter.
        */

        String nombreCompleto = "Carlos Alonso Cubillo";
        char primerCaracter;
        char segundoCaracter;
        boolean minuscula;

        do {
            System.out.println("Introduce un caracter: ");
            primerCaracter = teclado.next().charAt(0);

            System.out.println("Introduce otro caracter: ");
            segundoCaracter = teclado.next().charAt(0);

           minuscula=esMinuscula2(primerCaracter,segundoCaracter);
           if(minuscula==false){
               System.out.println("Los caracteres deben ser minusculas");
           }
        }while (minuscula==false);


        System.out.println( nombreCompleto.replace(primerCaracter,segundoCaracter));

    }
    public static boolean esMinuscula2(char primerCaracter,char segundoCaracter){

        if((primerCaracter>='a' && primerCaracter<='z') && (segundoCaracter>='a' && segundoCaracter<='z')){
            return true;
        }else{
            return false;
        }
    }


}
