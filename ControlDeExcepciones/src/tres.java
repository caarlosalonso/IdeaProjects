import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Genera un ejemplo similar al del Divisor, pero buscando el error
        //“ArrayIndexOutOfBoundsException” (acceso a una posición prohibida de un array)

        int[] arrayPrueba = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayPrueba[i] = i;
        }
        try {
            int posicion = teclado.nextInt();
            System.out.println(arrayPrueba[posicion]);
        } catch (ArrayIndexOutOfBoundsException errorDeDatos) {
            System.out.println("Te has equivocado, has escrito el número: " +
                    errorDeDatos.getMessage() + "debes introducir un entre 0 y 99");
        } catch (Exception error){
            System.out.println("Se ha producido un error");
            System.out.println(error.getMessage());
        }finally{
            System.out.println("hemos llegado al final");
        }
    }
}


