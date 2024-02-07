import java.util.Scanner;

public class ACCEjercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Creamos la linea que pida al usuario el caracter que quieran utilizar como envoltorio.
        System.out.println("Introduce el caracter que quieres utilizar como envoltorio: ");
        String envoltorio = teclado.nextLine();

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        //Hacemos sout de la funcion
        System.out.println(tapa(frase,envoltorio));

        //Creamos un salto de línea y añadimos un '*' delante y detrás de la frase.
        System.out.println(envoltorio +" " + frase + "  " + envoltorio);

        //Hacemos sout de la funcion
        System.out.println(tapa(frase,envoltorio));

    }
    //Creamos una funcion llamada tapa que crea el envoltorio de arriba o de abajo(dependiendo de donde hagas el sout)
    public static String tapa(String frase, String envoltorio){

        for(int i=-1;i<frase.length();i++) {
            System.out.print(envoltorio + " ");
        }
        return envoltorio;
    }
}

