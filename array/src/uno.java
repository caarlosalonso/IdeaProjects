import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class uno {
    public static void main(String[] args) {

        //Establece un array de tamaño 10
        int [] diezNumeros = new int[10];

        for(int i=0;i<diezNumeros.length;i++){
            System.out.println("El numero en la posicion: " +i+" es: " + numerosAleatorios());
        }


    }
    public static int numerosAleatorios(){
        Random random = new Random();
        int numero;
        return numero = random.nextInt(100);
    }
}