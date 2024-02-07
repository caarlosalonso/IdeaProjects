import java.util.Scanner;

public class StringCinco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*5- Pide una cadena y un carácter por teclado (comprueba que sea una letra minúscula) y muestra
        cuantas veces aparece el carácter en la cadena. La comprobación de la letra minúscula, debes
        hacerla con una función que recibirá un carácter y devolverá un booleano.*/

        String nombreCompleto = "Carlos Alonso Cubillo";
        char caracter;
        boolean minuscula;

        do {
            System.out.println("Introduce el caracter a buscar: ");
            caracter = teclado.next().charAt(0);

            minuscula=esMinuscula(caracter);
            if (minuscula == false){
                System.out.println("El caracter debe ser minuscula: ");
            }
        }while (minuscula==false);

        int contador=0;
        for(int posicion=0; posicion<nombreCompleto.length()-1; posicion++){
            if(nombreCompleto.charAt(posicion) == caracter){
                contador++;
            }
        }
        System.out.println("El caracter aparece un total de: " + contador + " veces.");

    }
    public static boolean esMinuscula(char caracter){
        if((caracter >= 'a' && caracter <= 'z') ||(caracter == 'ñ')){
            return true;
        }else{
            return false;
        }
    }
}
