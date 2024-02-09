import java.util.ArrayList;
import java.util.Scanner;

public class funciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> listaAmigos = new ArrayList<String>();

        //La lista de 5 amigos:
        listaAmigos.add("Carlos");
        listaAmigos.add("David");
        listaAmigos.add("Miguel");
        listaAmigos.add("Aitor");
        listaAmigos.add("Agustin");

        int opcion;
        do {
            System.out.println("1-Mostrar lista de amigos\n" +
                    "2-Buscar amigos\n" +
                    "3-Añadir amigos\n" +
                    "4-Borrar amigos\n");

            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:
                    mostrarEnVertical(listaAmigos);
                    break;

                case 2:
                    buscar(listaAmigos);
                    break;

                case 3:
                    anadir(listaAmigos);
                    break;

                case 4:
                    borrar(listaAmigos);
                    break;

                case 10:
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }
        }while(opcion!=10);
    }
    public static void mostrarEnVertical(ArrayList<String> listaAmigos) {

        for (int i = 0; i < listaAmigos.size(); i++) {
            System.out.println(listaAmigos.get(i));
        }
        System.out.println("*******");
    }

    public static void buscar(ArrayList<String> listaAmigos) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre que buscas: ");
        String buscado = teclado.nextLine();
        if (listaAmigos.contains(buscado)) {
            System.out.println(buscado + " es tu amigo.");
            System.out.println("Se encuentra en la posición: " + listaAmigos.indexOf(buscado));
        } else {
            System.out.println("No es tu amigo.");
        }
        System.out.println("*******");
    }

    public static void anadir(ArrayList<String> listaAmigos) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre a añadir: ");
        String nombreAnadir = teclado.nextLine();
        if (listaAmigos.contains(nombreAnadir)) {
            System.out.println(nombreAnadir + " ya es tu amigo.");
        } else {
            listaAmigos.add(nombreAnadir);
            System.out.println(listaAmigos);
        }
    }

    public static void borrar(ArrayList<String> listaAmigos) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre a borrar: ");
        String nombreBorrar = teclado.nextLine();
        if (listaAmigos.contains(nombreBorrar)) {
            listaAmigos.remove(nombreBorrar);
            System.out.println(listaAmigos);
        } else {
            System.out.println(nombreBorrar + " no es tú amigo.");
        }
    }

    public static void intercambiar (ArrayList<String>listaAmigos){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los dos nombres a intercambiar: ");
        System.out.println("Amigo 1: ");
        String intercambio1 = teclado.nextLine();
        System.out.println("Amigo 2: ");
        String intercambio2 = teclado.nextLine();
        if(listaAmigos.contains(intercambio1)&&listaAmigos.contains(intercambio2)){
            listaAmigos.indexOf(intercambio1);
            listaAmigos.indexOf(intercambio2);
            //listaAmigos.set(listaAmigos.indexOf(intercambio1),listaAmigos.indexOf(intercambio2));
        }
    }
}
