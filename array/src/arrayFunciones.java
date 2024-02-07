import java.util.Arrays;
import java.util.Scanner;

public class arrayFunciones {
    public static void main(String[] args) {

        int [] array = {1,2,3,5,6,7,8,9};

        System.out.println("Array en vertical");
        arrayVertical(array);

        System.out.println("Array en horizontal");
        arrayHorizontal(array);
        System.out.println();

        System.out.println("Array en horizontal con comas");
        arrayHorizontalComas(array);

        System.out.println("Array con un valor dado");

        // Cambiamos el array
        cambiarArray(array);

        //Mostramos el array cambiado
        for(int numero:array){
            System.out.println(numero + " ");
        }

        System.out.println("Otra forma de cambiar el valor de un array");
        int valor=5;
        rellenarArray(array,valor);

        System.out.println("Devolver una copia del array");
        System.out.println(Arrays.toString(devolverArray(array)));

        System.out.println("Devoler una copia del array entre X e Y");
        System.out.println(Arrays.toString(devolverEntreArray(array)));

        System.out.println("Desordenar Arrays");
        desordenarArrays(array);

    }
    public static void arrayVertical(int[] array){
        for(int numero : array){
            System.out.println(numero);
        }
    }

    public static void arrayHorizontal(int[] array){
        for(int numero : array){
            System.out.print(numero+ " ");
        }
    }

    public static void arrayHorizontalComas(int[] array){
        for(int numero : array){
            System.out.print(numero+ ", ");
        }
        // \b significa backspace y se utiliza en este caso para borrar la coma que nos sobra en el bucle(1,2,3,).
        System.out.println("\b\b");
    }

    //Con el numero entre [] seleccionamos la posicion del array y posteriormente le damos un nuevo valor.
    public static void cambiarArray(int[] numeros){
        numeros[0] = 3;
        numeros[1] = 3;
        numeros[2] = 3;
        numeros[3] = 3;
        numeros[4] = 3;
        numeros[5] = 3;
        numeros[6] = 3;
        numeros[7] = 3;
    }
    //Otra forma de cambiar el valor de un array.
    public static void rellenarArray(int[] array,int valor) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] = valor);
        }
    }
    //Devolver una copia del array
    public static int[] devolverArray(int[] array) {
        int[] nuevoArray = new int[array.length];
        for (int i = 0; i < array.length; i++) nuevoArray[i] = array[i];
        return nuevoArray;
    }
    //Devolver un trozo (indicando inicio y fin de la zona a extraer)
    public static int[] devolverEntreArray(int[] array) {

        int inicio, fin;
        Scanner teclado = new Scanner(System.in);
        boolean salirBucle = false;
        System.out.println("[+] La longitud del array es de: " + array.length + "\n[+] Dame un inicio y un fin entre 0 y " + (array.length - 1) + "\n[+] Recuerda que el inicio no puede ser igual o mayor que el fin");
        do {
            System.out.println();
            System.out.print("[?] Dame un inicio -> ");
            inicio = teclado.nextInt();
            System.out.print("[?] Dame un fin -> ");
            fin = teclado.nextInt();
            if (inicio < fin && inicio >= 0 && fin < array.length) salirBucle = true; //se cumplen los requisitos, se sale del bucle
            else System.out.println("[!] Los valores proporcionados no cumplen los requisitos previos");
        } while (!salirBucle);
        int longitud = fin-inicio;
        int[] nuevoArray = new int[longitud];
        for (int i = inicio; i < fin; i++) nuevoArray[i-longitud] = array[i];
        return nuevoArray;
    }
    public static void desordenarArrays (int [] array) {
        int random,randomPos,randomPosDos,auxiliar;

        for (int o = 0; o < 10; o++) { //se repite 10 veces este proceso
            for (int i = 0; i < array.length; i++) { // itera tantas veces como posiciones tiene el array
                random = (int) (Math.random() * 2);
                if (random == 1) { //si un número aleatorio cuyo valor es 1 o 0 sale 1, se generan 2 posiciones, el valor de la primera se almacena en un auxiliar, la primera almacena el valor de la segunda y la segunda el valor de la auxiliar que era el anterior de la primera
                    randomPos = (int) (Math.random() * array.length);
                    randomPosDos = (int) (Math.random() * array.length);
                    auxiliar = array [randomPos];
                    array [randomPos] = array [randomPosDos];
                    array [randomPosDos] = auxiliar;
                    System.out.println(Arrays.toString(array));

                }
            }
        }
    }

}

