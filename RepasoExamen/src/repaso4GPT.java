import java.util.Scanner;

public class repaso4GPT {

    public static void main(String[] args) {
        // Pedir una cadena por pantalla
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena de palabras:");
        String entrada = scanner.nextLine();

        // Procesar la cadena
        String resultado = procesarCadena(entrada);

        // Mostrar el resultado
        System.out.println("Resultado procesado: " + resultado);
    }

    public static String procesarCadena(String cadena) {
        // Dividir la cadena en palabras
        String[] palabras = cadena.split("\\s+");

        // Crear un StringBuilder para construir la cadena procesada
        StringBuilder resultado = new StringBuilder();

        // Procesar cada palabra
        for (int i = 0; i < palabras.length; i++) {
            // Convertir la primera letra a mayúscula y el resto a minúscula
            String palabraProcesada = palabras[i].substring(0, 1).toUpperCase() +
                    palabras[i].substring(1).toLowerCase();

            // Agregar la palabra procesada al resultado
            resultado.append(palabraProcesada);

            // Agregar un espacio si no es la última palabra
            if (i < palabras.length - 1) {
                resultado.append(" ");
            }
        }

        return resultado.toString();
    }
}
