import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean minuscula;
        char caracter;

        System.out.println("Introduce una frase:");
        String cadena = teclado.nextLine();

        do{
        System.out.println("Introduce un caracter: ");
        caracter = teclado.next().charAt(0);

        minuscula = esminuscula(caracter);
        if(minuscula == false){
            System.out.println("El caracter no es minuscula");
            }
        }while(minuscula == false);

        // El valor inicial de posicion, es la primera posicion donde aparece el primer caracter.
        int posicion = cadena.indexOf(caracter);

        System.out.println("Ahora veremos en que posiciones de la cadena aparece el caracter: "+caracter);
        // Mientras sea diferente de -1, porque cuando ya no quedan más letras que encontrar, devuelve -1.
        do {
            if (posicion != -1) {
                System.out.println("El caracter "+caracter+" aperece en la posicion: "+posicion);
            }
            posicion = cadena.indexOf(caracter, posicion+1);
        } while (posicion != -1);

        int contador = 0;
        for(int i = 0; i<cadena.length();i++){
            if (cadena.charAt(i) == caracter){
                contador++;
            }
        }
        System.out.println("El caracter " + caracter + " ha aparecido en la cadena un total de: " + contador + " veces.");



    }
    public static boolean esminuscula(char caracter){
        if ((caracter >= 'a' && caracter <= 'z')
        || (caracter == 'ñ')){
            return true;
        }else{
            return false;
        }
    }
}
