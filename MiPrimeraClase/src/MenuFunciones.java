import java.util.ArrayList;
import java.util.Scanner;

public class MenuFunciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Coche> listaCoches = new ArrayList<>();

        //Creamos varios objetos coche
        Coche coche1 = new Coche("1111AAA", "Rojo", "Lambo Diablo", 70000);
        Coche coche2 = new Coche("2222BBB", "Azul", "Ferrari Roma", 120000);
        Coche coche3 = new Coche("3333CCC", "Verde", "Maserati mc20", 150000);


        //Añadimos los coches al ArrayList
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);


        int opcion;
        do {
            System.out.println("1-Mostrar todos los coches\n" +
                    "2-Buscar y mostrar coches\n" +
                    "3-Añadir coches\n" +
                    "4-Borrar coches\n" +
                    "5-Salir");

            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    mostrarCoches(listaCoches);
                    break;
                case 2:
                    buscarCoches(listaCoches);
                    break;
                case 3:
                    anadirCoches(listaCoches);
                    break;
                case 4:
                    borrarCoches(listaCoches);
                    break;
                case 5:
                    break;
            }
        }while(opcion!=5);
    }
    public static void mostrarCoches(ArrayList<Coche> listaCoches) {

        for(int i = 0; i < listaCoches.size(); i++) {
            System.out.println(listaCoches.get(i));
        }
        System.out.println("*******");
    }
    public static void buscarCoches(ArrayList<Coche> listaCoches) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la matricula del coche que buscas: ");
        String matricula = teclado.nextLine();

        //Creamos un coche auxiliar solo con la matricula para buscar en el ArrayList
        Coche cocheAux = new Coche(matricula);

        //Sacamos la posición en la que se encuentra el coche original con referencia al auxiliar.
        int posicion = listaCoches.indexOf(cocheAux);

        //Si el número es =-1 entonces no está en la lista
       if(posicion!=-1){
           System.out.println("El coche se encuentra en la lista");
           Coche cocheEncontrado = listaCoches.get(posicion);
           System.out.println(cocheEncontrado);
       }else{
               System.out.println("El coche no esta en la lista.");
           }

        System.out.println("*******");
    }

    public static void anadirCoches(ArrayList<Coche>listaCoches) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("******** Alta de coches *********");

        System.out.println("Introduce la matricula del coche: ");
        String matricula = teclado.nextLine();

        //Creamos un coche con esa matricula
        Coche cocheAux = new Coche(matricula);

        //Comprobamos si está en la lista
        if (listaCoches.contains(cocheAux)) {
            System.out.println("La matricula indicada ya está en la lista");
        } else { //Si no está en la lista mostramos un mensaje
            System.out.println("Introduce el modelo del coche(o ENTER si lo desconoce): ");
            String modelo = teclado.nextLine();
            if(modelo.equals("")) modelo=null; //Si se introduce ENTER, cambiamos por null

            System.out.println("Introduce el color del coche: ");
            String color = teclado.nextLine();

            System.out.println("Introduce el precio del coche(o -1 si lo desconoce): ");
            Integer precio = teclado.nextInt();
            if(precio==-1) precio=null; //Si se introduce -1, cambiamos por null

            //Creamos un nuevo objeto coche con los datos introducidos, y se añade a la lista
            Coche nuevoCoche = new Coche(matricula, color, modelo, precio);
            listaCoches.add(nuevoCoche);
            System.out.println("Se ha añadido el coche con matricula " + matricula);
        }
    }

    public static void borrarCoches(ArrayList<Coche>listaCoches) {
        System.out.println("******** Eliminar un coche *********");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la matricula que buscas ");
        String matricula = teclado.nextLine();

        //Creamos un coche con esa matricula
        Coche cocheAux = new Coche(matricula);

        //Comprobamos si está en la lista
        if(listaCoches.contains(cocheAux)) {
            listaCoches.remove(cocheAux); //Como está en la lista, lo borramos
            System.out.println("Se ha borrado el coche con matricula" + matricula);
        }else{ //Si no está en la lista mostramos un mensaje
            System.out.println("La matricula no está en nuestra lista");
        }
    }
}