import java.util.InputMismatchException;
import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Crea un menú con opciones numéricas que no “explote” cuando se introducen letras por error

        int opcion = 0;
        do {
        try {
                System.out.println("Mostrando opciones: " +
                        "\n 1 - Primera opción" +
                        "\n 2 - Segunda opción" +
                        "\n 3 - Salir" +
                        "\n Elige una de las opciones: ");

                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has elegido la primera opción");
                        break;
                    case 2:
                        System.out.println("Has elegido la segunda opción");
                        break;
                    case 3:
                        break;
                }

        } catch (InputMismatchException errorDatos) {
            System.out.println("Error de formato");
            System.out.println(errorDatos.getMessage());
            opcion=0;
            teclado.nextLine();
        } finally {
            System.out.println("Fin del programa");
        }
        } while (opcion != 3);
    }
    //Excepción propia (tendria que acabar en exception)
    public class opcionFueraMenu extends ArithmeticException{
        public opcionFueraMenu (String message){
            super(message);
        }
    }
    public int pedirNumero (int opcion) throws opcionFueraMenu {
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextInt();

        if(opcion!=1){
            throw new opcionFueraMenu("Error");
        }else{
            return opcion;
        }
    }
}
