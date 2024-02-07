import java.util.ArrayList;
import java.util.Scanner;

public class EstacionamientoMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Creamos el ArrayList del Estacionamiento
        ArrayList<Estacionamiento> listaEstacionados = new ArrayList<>();

        //Variable para el menú
        int opcion;

        //Bucle que repite el menú de opciones
        do {
            System.out.println("Mostrando opciones:"
                    + "\n 1 - Entrada de coche"
                    + "\n 2 - Salida de coche"
                    + "\n 3 - Muestra los coches estacionados actualmente"
                    + "\n 4 - Muestra todos los coches que hayan estacionado"
                    + "\n 0 - Salir"
            );
            System.out.println("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    EstacionamientoFunciones.cargarDatos(listaEstacionados);
                    break;
                case 4:

                    break;
                case 0:
                    break;
            }
        } while (opcion != 0);
    }
}
