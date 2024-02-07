public class CocheMain {
    public static void main(String[] args) {

        //Creamos varios objetos coche
        Coche coche1 = new Coche("1111RRR", "Rojo", "Lambo Diablo", 70000);
        Coche coche2 = new Coche("2222QQQ", "Azul", "Ferrari Roma", 120000);
        Coche coche3 = new Coche("3333MMM", "Verde", "Maserati mc20", 150000);

        //Mostramos la informaciond e cada uno (usamos el metodo toString)
        System.out.println("Mostramos todos los coches de la coleccion:");
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);

        //Actualizamos el precio de uno de ellos y lo mostramos (usamos actualizarPrecio)
        System.out.println("\nAumentamos el valor del Ferrari:");
        coche2.actualizarPrecio(+12000);
        System.out.println(coche2);

        //Cambiamos el color de otro coche y lo mostramos (usamos setColor)
        System.out.println("\nPintamos de rosa el Lambo:");
        coche1.setColor("Rosa");
        System.out.println(coche1);

        //Comparamos si dos coches son iguales (usamos equals)
        System.out.println("\nSon el mismo coche el Lambo y el Maserati:");
        System.out.println(coche1.equals(coche3));

        //Creamos otro coche con la matricula del Ferrari y vemos si son iguales
        Coche coche4 = new Coche("2222QQQ", "Amarillo", "Ford Capri", 22000);
        System.out.println("\nSon el mismo coche el Ferrari y el Ford:");
        System.out.println(coche2.equals(coche4));

        //Nuevo coche
        Coche coche5 = new Coche("5555TTT", "Fiat 500");
        System.out.println(coche5);

        //Nuevo coche, solo matricula
        Coche coche6 = new Coche("6666YYY");
        System.out.println(coche6);
    }
}
