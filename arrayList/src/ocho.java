import java.util.ArrayList;
import java.util.Scanner;

public class ocho {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> listaAmigos = new ArrayList<String>();

        System.out.println("La lista de 5 amigos: ");
        listaAmigos.add("Carlos");
        listaAmigos.add("David");
        listaAmigos.add("Miguel");
        listaAmigos.add("Aitor");
        listaAmigos.add("Agustin");
        System.out.println(listaAmigos);

        System.out.println("Introduce un nombre por pantalla para comprobar si esta en la lista: ");

        String nombre = teclado.nextLine();
        System.out.println(listaAmigos.contains(nombre));

        System.out.println(listaAmigos.indexOf(nombre));

        System.out.println("Introduce el nombre del amigo que quieres añadir");
        String nombreAnadir = teclado.nextLine();

        if (listaAmigos.contains(nombreAnadir)){
            System.out.println("Ya aparece en la lista");
        }else{listaAmigos.add(nombreAnadir);}
        System.out.println(listaAmigos);

        System.out.println("Introduce un nombre a eliminar:");
        String nombreEliminar = teclado.nextLine();

        listaAmigos.remove(nombreEliminar);
        System.out.println(listaAmigos);

    }
}
