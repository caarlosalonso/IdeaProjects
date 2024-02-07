import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Lista Fruta");
        ArrayList<String> listaFruta = new ArrayList<String>();

        System.out.println("->Añade cuatro frutas.");
        listaFruta.add("Manzana");
        listaFruta.add("Pera");
        listaFruta.add("Naranja");
        listaFruta.add("Platano");
        System.out.println(listaFruta);
        System.out.println();

        System.out.println("->Añade otra fruta en la posición 1.");
        listaFruta.add(1,"Sandia");
        System.out.println(listaFruta);
        System.out.println();

        System.out.println("->Muestra por pantalla el tamaño de la lista.");
        System.out.println(listaFruta.size());
        System.out.println();

        System.out.println("->Extrae la posición 1 y muestrala por pantalla.");
        System.out.println(listaFruta.get(1));
        System.out.println();

        System.out.println("->Cambia el nombre de la fruta en la posición 2.");
        listaFruta.set(2,"Mandarina");
        System.out.println(listaFruta);
        System.out.println();

        System.out.println("->Elimina la fruta de la posición 1.");
        listaFruta.remove(1);
        System.out.println(listaFruta);
        System.out.println();

        System.out.println("->Elimina una fruta indicando el nombre.");
        listaFruta.remove("Platano");
        System.out.println(listaFruta);
        System.out.println();

        System.out.println("->Comprueba si 'Manzana' está en la lista.");
        System.out.println(listaFruta.contains("Manzana"));
        System.out.println();

        System.out.println("->Ordena la lista alfabéticamente.");
        System.out.println();

        System.out.println("->Vacía la lista por completo.");
        listaFruta.clear();
        System.out.println(listaFruta);

        System.out.println("-----------------------------------------------");

        System.out.println("Lista Numeros");
        ArrayList<String> listaNumeros = new ArrayList<String>();

        System.out.println("->Añade cuatro números.");
        listaNumeros.add("0");
        listaNumeros.add("1");
        listaNumeros.add("2");
        listaNumeros.add("3");
        System.out.println(listaNumeros);
        System.out.println();

        System.out.println("->Añade otro número en la posición 1.");
        listaNumeros.add(1,"4");
        System.out.println(listaNumeros);
        System.out.println();

        System.out.println("->Muestra por pantalla el tamaño de la lista.");
        System.out.println(listaNumeros.size());
        System.out.println();

        System.out.println("->Extrae la posición 1 y muestrala por pantalla.");
        System.out.println(listaNumeros.get(1));
        System.out.println();







    }


}